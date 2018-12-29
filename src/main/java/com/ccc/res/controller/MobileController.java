/**
 * 
 */
package com.ccc.res.controller;

import java.util.List;
import java.util.Map;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ccc.res.util.PasswordEncoderUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @author Nadeem
 *
 */

@Controller
@RequestMapping("/mobilequery")
public class MobileController {

	@Value("${ccc.reports}")
    private String ReportsHome;
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	Gson gson = new GsonBuilder().enableComplexMapKeySerialization().serializeNulls().setPrettyPrinting()
			.setVersion(1.0).create();

	private final Logger log = LoggerFactory.getLogger(this.getClass());

	public MobileController() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@RequestMapping(value = "/mobileverifyuser", method = RequestMethod.GET)
	public @ResponseBody String mobileverifyuser(
			@RequestParam(value = "username", required = true) String username,
			@RequestParam(value = "password", required = true) String password) {
		
		System.out.println(username+"-"+password);
		String sql = "select * from user_master "
				+ " where um_user_id='"+username+"' "
				
				;//		+ "and um_password='"+PasswordEncoderUtil.encodePassword(password.trim())+"'";
		
		
		System.out.println(sql);
		try {
			SqlRowSet rows = jdbcTemplate.queryForRowSet(sql); // jdbcTemplate.queryForRowSet(sql);
			
			JSONObject json = new JSONObject();
			
			if(rows.next()) {
			
				System.out.println(rows.getString("um_password"));
				if(PasswordEncoderUtil.matchPassword(rows.getString("um_password"), password)) {
					json.put("status","success");
				}else {
					json.put("status","fail");
				}
			}
			
			return gson.toJson(json);
		} catch (RuntimeException e) {
			throw e;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	@RequestMapping(value = "/getuserinfo", method = RequestMethod.GET)
	public @ResponseBody String getuserinfo(
			@RequestParam(value = "username", required = true) String username
			) {
		
		String sql = "select * from ccc_getuserdetails('"+username+"')" ;
		try {
			List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
			JSONObject json = new JSONObject();
			json.put("status","success");
			json.put("data",rows);
			
			return gson.toJson(json);
		} catch (RuntimeException e) {
			throw e;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	@RequestMapping(value = "/loadcategories", method = RequestMethod.GET)
	public @ResponseBody String getloadcategories() {
		
		String sql = "select * from category order by categoryid ";
		try {
			List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
			JSONObject json = new JSONObject();
			json.put("status","success");
			json.put("data",rows);
			
			return gson.toJson(json);
		} catch (RuntimeException e) {
			throw e;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	@RequestMapping(value = "/getdashboardcomplaintdetais", method = RequestMethod.GET)
	public @ResponseBody String getdashboardcomplaintdetais(
			@RequestParam(value = "location", required = true) String location,
			@RequestParam(value = "categoryid", required = true) Integer categoryid,
			@RequestParam(value = "statusid", required = true) String statusid,
			@RequestParam(value = "modeid", required = true) String modeid
			) {
		
		String sql = " select * from ccc_getdashboardcomplaintdetais('"+location+"',"+categoryid+","+statusid+","+modeid+") ";
		try {
			List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
			JSONObject json = new JSONObject();
			json.put("status","success");
			json.put("data",rows);
			return gson.toJson(json);
		} catch (RuntimeException e) {
			throw e;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	
	@RequestMapping(value = "/loadcomplaintupdates", method = RequestMethod.GET)
	public @ResponseBody String loadcomplaintupdates() {
		
		String sql = "select * from complient_updates where status = true ";
		try {
			List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
			JSONObject json = new JSONObject();
			json.put("status","success");
			json.put("data",rows);
			return gson.toJson(json);
		} catch (RuntimeException e) {
			throw e;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}	
	
	
	
	@RequestMapping(value = "/loadcomplaintstatusmappings", method = RequestMethod.GET)
	public @ResponseBody String loadcomplaintstatusmappings(
			@RequestParam(value = "statusid", required = true) Integer statusid
			) {
		
		String sql = "select * from ccc_getcomplaintstatusmapping("+statusid+") ";
		try {
			List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
			JSONObject json = new JSONObject();
			json.put("status","success");
			json.put("data",rows);
			return gson.toJson(json);
		} catch (RuntimeException e) {
			throw e;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	@RequestMapping(value = "/insertcomment", method = RequestMethod.GET)
	public @ResponseBody String registercomplaint(
			@RequestParam(value = "requestid", required = true) Integer requestid,
			@RequestParam(value = "docketno", required = true) String docketno,
			@RequestParam(value = "userid", required = true) Integer userid,
			@RequestParam(value = "username", required = true) String username ,
			@RequestParam(value = "comments", required = true) String comments,
			@RequestParam(value = "statusid", required = true) Integer statusid,
			@RequestParam(value = "statusname", required = true) String statusname,
			@RequestParam(value = "relpath", required = true) String relpath,
			@RequestParam(value = "firstname", required = true) String firstname,
			@RequestParam(value = "middlename", required = true) String middlename,
			@RequestParam(value = "lastname", required = true) String lastname,
			@RequestParam(value = "updatesid", required = true) Integer updatesid,
			@RequestParam(value = "updatesname", required = true) String updatesname
			) {
		
		String sql = "select * from insert_comment("+requestid+",'"+docketno+"', "+userid+", '"+username+"','"+comments+"',"+statusid+","
				+ "'"+statusname+"',"+updatesid+","
				+ "'"+updatesname+"','"+relpath+"','"+firstname+"','"+middlename+"','"+lastname+"') " ;
		try {
			List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
			JSONObject json = new JSONObject();
			json.put("status","success");
			json.put("data",rows);
			return gson.toJson(json);
		} catch (RuntimeException e) {
			throw e;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
