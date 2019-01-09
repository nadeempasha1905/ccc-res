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
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;

public class SMSUtil {
	
	public static void main(String[] args) {
		
			//SendSMS("9844845442","HIIIIIIIIIIIIIIIIIIIII");
		
		Date objDate = new Date(); // Current System Date and time is assigned to objDate
		System.out.println(objDate);
		  String strDateFormat = "dd-MMM-yyyy hh:mm:ss a"; //Date format is Specified
		  SimpleDateFormat objSDF = new SimpleDateFormat(strDateFormat); //Date format string is passed as an argument to the Date format object
		  System.out.println(objSDF.format(objDate)); //Date formatting is applied to the current date
		
	}
	
	public static void SendSMS(String mobile, String message, String ccchostname, String cccworkingkey, String cccsender, String cccunicode){
		
		String hostname = ccchostname;
		String workingkey = cccworkingkey;
		String sender = cccsender;
		String unicode = cccunicode;
		
		URLConnection myURLConnection=null;
		URL myURL=null;
		BufferedReader reader=null;
		String encoded_message=URLEncoder.encode(message); //encoding message 
		//String mainUrl="http://promo.solutionsinfini.com/api/web2sms.php?workingkey=A63ca323fc56c0dae39479fe4b91a9a01&to=+919449445488&sender=BULKSMS&message=test&unicode=1"; //Send SMS API
		
		StringBuilder sbPostData= new StringBuilder(hostname);
		sbPostData.append("?workingkey="+workingkey);
		sbPostData.append("&sender="+sender);
		sbPostData.append("&unicode="+unicode);
		sbPostData.append("&to="+mobile);
		sbPostData.append("&message="+encoded_message);
		try{
		    myURL = new URL(sbPostData.toString());
		    myURLConnection = myURL.openConnection();
		    myURLConnection.connect();
		    reader= new BufferedReader(new InputStreamReader(myURLConnection.getInputStream()));
		    String response = reader.readLine();
		    System.out.println("response : "+response);
		    reader.close();
		} 
		catch (IOException e) { 
			e.printStackTrace();
		} 
		System.out.println(mobile+" - "+message);
	}
}	
	
	