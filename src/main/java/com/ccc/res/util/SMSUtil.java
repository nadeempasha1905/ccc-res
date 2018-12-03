package com.ccc.res.util;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;

//import com.indigo.model.sms;
//import com.indigo.service.smsLocalServiceUtil;

public class SMSUtil {
	
	public static void main(String[] args) {
		
		try {
			sendSMS("9844845442","HIIIIIIIIIIIIIIIIIIIII");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void sendSMS(String mobile, String message) throws IOException {
		/*String username = "msbs2000";
		String apikey = "RFb3Qa7R24zKk5YmBlfz";
		String senderid = "INDINF";
		String type="uni";//"txt";
		URLConnection myURLConnection=null;
		URL myURL=null;
		BufferedReader reader=null;
		String encoded_message=URLEncoder.encode(message); //encoding message 
		String mainUrl="http://smshorizon.co.in/api/sendsms.php?"; //Send SMS API
	
		StringBuilder sbPostData= new StringBuilder(mainUrl);
		sbPostData.append("user="+username); 
		sbPostData.append("&apikey="+apikey);
		sbPostData.append("&senderid="+senderid);
		sbPostData.append("&message="+encoded_message);
		sbPostData.append("&mobile="+mobile);
		sbPostData.append("&type="+type);*/
		
		URLConnection myURLConnection=null;
		URL myURL=null;
		BufferedReader reader=null;
		String encoded_message=URLEncoder.encode(message); //encoding message 
		//String mainUrl="http://117.239.178.202/sendsms.php?"; //Send SMS API
		String mainUrl="https://promo.solutionsinfini.com/api/v4/?api_key=A63ca323fc56c0dae39479fe4b91a9a01&method=sms&message=test&to=9844845442&sender=BULKSMS"; //Send SMS API
		
		String campaign_id = "30";
	
		StringBuilder sbPostData= new StringBuilder(mainUrl);
		sbPostData.append("&method=sms");
		sbPostData.append("&message=test");
		sbPostData.append("&to="+mobile);
		sbPostData.append("&sender=BRAND");
		//sbPostData.append("&campaign_id="+campaign_id);
		
		System.out.println(mainUrl);
		
		mainUrl = sbPostData.toString();
		try{
		    myURL = new URL(mainUrl);
		    myURLConnection = myURL.openConnection();
		    myURLConnection.connect();
		    reader= new BufferedReader(new InputStreamReader(myURLConnection.getInputStream()));
		    String response;
		    reader.close();
		} 
		catch (IOException e) { 
			e.printStackTrace();
		} 
		System.out.println(mobile+" - "+message);
	   }		
	
	}	
	
	