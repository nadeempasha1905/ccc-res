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
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @author Administrator
 *
 */

@Controller
@RequestMapping("/query")
public class MainController {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	Gson gson = new GsonBuilder().enableComplexMapKeySerialization().serializeNulls().setPrettyPrinting()
			.setVersion(1.0).create();

	private final Logger log = LoggerFactory.getLogger(this.getClass());

	public MainController() {
		super();
	}
	
	@RequestMapping(value = "/loadcategories", method = RequestMethod.GET)
	public @ResponseBody String getloadcategories() {
		
		String sql = "select * from category order by categoryid ";
		try {
			List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
			return gson.toJson(rows);
		} catch (RuntimeException e) {
			throw e;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	@RequestMapping(value = "/loadsubcategories", method = RequestMethod.GET)
	public @ResponseBody String getloadsubcategories(
			@RequestParam(value = "categoryid", required = true) Integer categoryid
			) {
		
		String sql =  " select * from subcategory where categoryid = "+categoryid+" and"
					+ " status =  true "
					+ " order by displayorder ";
		try {
			List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
			return gson.toJson(rows);
		} catch (RuntimeException e) {
			throw e;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	@RequestMapping(value = "/registerquickcomplaint", method = RequestMethod.GET)
	public @ResponseBody String registerquickcomplaint(
			@RequestParam(value = "categoryid", required = true) Integer categoryid,
			@RequestParam(value = "subcategoryid", required = true) Integer subcategoryid,
			@RequestParam(value = "mobileno", required = true) String mobileno,
			@RequestParam(value = "accountno", required = true) String accountno,
			@RequestParam(value = "description", required = true) String description,
			@RequestParam(value = "todaysdate", required = true) String todaysdate
			) {
		
		String status = "" ;
		
		
		JSONObject json = new JSONObject();
		
		String sql =  " INSERT INTO quick_complaints(qc_account_id,qc_mobile_number,qc_email_id,"
					+ " qc_complaint_category,qc_complaint_subcategory,qc_complaint_description,qc_requested_date) "
					+ " values "
					+ " ('"+accountno+"','"+mobileno+"',null,"+categoryid+","+subcategoryid+",'"+description+"',now()) ";
		try {
			/*List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);*/
			
			System.out.println(sql);
			
			int result = jdbcTemplate.update(sql);
			
			if(result > 0){
				status = "success"; 
				json.put("status", true);
				json.put("message", "Your complaint registered successfully !!!");
			}else{
				status = "error";
				json.put("status", false);
				json.put("message", "Cannot Register Complaint. Please contact customer executive !!!");
			}
			
			return gson.toJson(json);
		} catch (RuntimeException e) {
			throw e;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	@RequestMapping(value = "/getquickcomplaints", method = RequestMethod.GET)
	public @ResponseBody String getquickcomplaints() {
		
		String sql = "   select a.*,b.subcategoryname,c.categoryname "
				   + "   from quick_complaints a,subcategory b , category c "
				   + "   where a.qc_assigned_status = false "
				   + "   and b.subcategoryid =  a.qc_complaint_subcategory "
				   + "   and c.categoryid = a.qc_complaint_category "
				   + "   order by qc_requested_date asc  ";
		try {
			List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
			return gson.toJson(rows);
		} catch (RuntimeException e) {
			throw e;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	@RequestMapping(value = "/getelectricitycompanylist", method = RequestMethod.GET)
	public @ResponseBody String getelectricitycompanylist() {
		
		String sql = " select ld_id,ld_code,ld_name,ld_type "
			       + " from location_details "
				   + " where ld_type = 'EC' ";
		try {
			List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
			return gson.toJson(rows);
		} catch (RuntimeException e) {
			throw e;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	@RequestMapping(value = "/getzonelist", method = RequestMethod.GET)
	public @ResponseBody String getzonelist() {
		
		String sql = " select ld_id,ld_code,ld_name,ld_type "
			       + " from location_details "
				   + " where ld_type = 'ZN' ";
		try {
			List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
			return gson.toJson(rows);
		} catch (RuntimeException e) {
			throw e;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	@RequestMapping(value = "/getcirclelist", method = RequestMethod.GET)
	public @ResponseBody String getcirclelist() {
		
		String sql = " select ld_id,ld_code,ld_name,ld_type "
			       + " from location_details "
				   + " where ld_type = 'CR' ";
		try {
			List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
			return gson.toJson(rows);
		} catch (RuntimeException e) {
			throw e;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	@RequestMapping(value = "/getdivisionlist", method = RequestMethod.GET)
	public @ResponseBody String getdivisionlist() {
		
		String sql = " select ld_id,ld_code,ld_name,ld_type "
			       + " from location_details "
				   + " where ld_type = 'DN' ";
		try {
			List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
			return gson.toJson(rows);
		} catch (RuntimeException e) {
			throw e;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	@RequestMapping(value = "/getsubdivisionlist", method = RequestMethod.GET)
	public @ResponseBody String getsubdivisionlist() {
		
		String sql = " select ld_id,ld_code,ld_name,ld_type "
			       + " from location_details "
				   + " where ld_type = 'SD' ";
		try {
			List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
			return gson.toJson(rows);
		} catch (RuntimeException e) {
			throw e;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	@RequestMapping(value = "/getomsectionlist", method = RequestMethod.GET)
	public @ResponseBody String getomsectionlist(
			@RequestParam(value = "locationcode", required = true) String locationcode
			) {
		
		String sql = " select ld_id,ld_code,ld_name,ld_type "
			       + " from location_details "
				   + " where ld_code ilike '"+locationcode+"%' and "
				   + " ld_type = 'OM' ";
		try {
			List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
			return gson.toJson(rows);
		} catch (RuntimeException e) {
			throw e;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
/*	@RequestMapping(value = "/getassignedtolist", method = RequestMethod.GET)
	public @ResponseBody String getassignedtolist() {
		
		String sql = " select ld_id,ld_code,ld_name,ld_type "
			       + " from location_details "
				   + " where ld_type = 'SD' ";
		try {
			List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
			return gson.toJson(rows);
		} catch (RuntimeException e) {
			throw e;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}*/
	

	@RequestMapping(value = "/getcomplaintdetails", method = RequestMethod.GET)
	public @ResponseBody String getcomplaintdetails(
			@RequestParam(value = "mobileno", required = true) String mobileno,
			@RequestParam(value = "accountid", required = true) String accountid
			) {
		String sql = " select q.*,c.* "
				   + " from quick_complaints q "
				   + " left outer join "
				   + " (select c.*,true recsts from consumer_master c) c "
				   + " on "
				   + " (c.cm_account_id = q.qc_account_id or c.cm_mobile_number = q.qc_mobile_number) "
				   + " where  q.qc_account_id ='"+accountid+"' or q.qc_mobile_number='"+mobileno+"' ";
		try {
			System.out.println(sql);
			List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
			return gson.toJson(rows);
		} catch (RuntimeException e) {
			throw e;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	@RequestMapping(value = "/getofficersdetails", method = RequestMethod.GET)
	public @ResponseBody String getofficersdetails(
			@RequestParam(value = "locationcode", required = true) String locationcode
			) {
		
		String sql = " select * from officer_details "
				   + " where od_locatoin_code ilike '"+locationcode+"%' ";
		try {
			List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
			return gson.toJson(rows);
		} catch (RuntimeException e) {
			throw e;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	@RequestMapping(value = "/loadcomplaintmodes", method = RequestMethod.GET)
	public @ResponseBody String loadcomplaintmodes() {
		
		String sql = "select * from complaintmode ";
		try {
			List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
			return gson.toJson(rows);
		} catch (RuntimeException e) {
			throw e;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	@RequestMapping(value = "/loadcomplaintstatus", method = RequestMethod.GET)
	public @ResponseBody String loadcomplaintstatus() {
		
		String sql = "select * from status where active = true ";
		try {
			List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
			return gson.toJson(rows);
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
			return gson.toJson(rows);
		} catch (RuntimeException e) {
			throw e;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	@RequestMapping(value = "/loadcomplaintpriority", method = RequestMethod.GET)
	public @ResponseBody String loadcomplaintpriority() {
		
		String sql = "select * from priority where prioritystatus = true ";
		try {
			List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
			return gson.toJson(rows);
		} catch (RuntimeException e) {
			throw e;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	@RequestMapping(value = "/registercomplaint", method = RequestMethod.GET)
	public @ResponseBody String registercomplaint(
			@RequestParam(value = "mobilenumber", required = true) String mobilenumber,
			@RequestParam(value = "accountnumber", required = true) String accountnumber,
			@RequestParam(value = "rrnumber", required = true) String rrnumber,
			@RequestParam(value = "consumername", required = true) String consumername,
			@RequestParam(value = "emailid", required = true) String emailid,
			@RequestParam(value = "consumeraddress", required = true) String consumeraddress,
			@RequestParam(value = "consumerdescription", required = true) String consumerdescription,
			@RequestParam(value = "subdivision", required = true) String subdivision,
			@RequestParam(value = "comaplintcategory", required = true) Integer comaplintcategory,
			@RequestParam(value = "omsection", required = true) String omsection,
			@RequestParam(value = "complaintsubcategory", required = true) Integer complaintsubcategory,
			@RequestParam(value = "assignedto", required = true) String assignedto,
			@RequestParam(value = "complaintmode", required = true) Integer complaintmode,
			@RequestParam(value = "complaintstatus", required = true) Integer complaintstatus,
			@RequestParam(value = "complaintpriority", required = true) Integer complaintpriority,
			@RequestParam(value = "latitude", required = true) String latitude,
			@RequestParam(value = "longitude", required = true) String longitude,
			@RequestParam(value = "recsts", required = true) String recsts,
			@RequestParam(value = "qc_pkid", required = true) Integer qc_pkid,
			@RequestParam(value = "userid", required = true) String userid
			
			
			) {
		
		String sql = "select * from insert_request ("+qc_pkid+",'"+mobilenumber+"','"+accountnumber+"', '"+rrnumber+"','"+consumername+"',"
				+ "'"+consumeraddress+"','"+emailid+"','"+subdivision+"','"+omsection+"',"+comaplintcategory+", "+complaintsubcategory+", "
						+ "'"+consumerdescription+"',"+complaintmode+","+complaintpriority+","+complaintstatus+","
								+ "'"+assignedto+"','"+latitude+"','"+longitude+"','true','"+userid+"') ";
		try {
			List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
			return gson.toJson(rows);
		} catch (RuntimeException e) {
			throw e;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	
	@RequestMapping(value = "/searchconsumerdetails", method = RequestMethod.GET)
	public @ResponseBody String searchconsumerdetails(
			@RequestParam(value = "mobileno", required = true) String mobileno,
			@RequestParam(value = "accountid", required = true) String accountid
			) {
		String sql = " select *  from   consumer_master "
				   + " where  "
				   + " case when '"+accountid+"'='' then true else cm_account_id ='"+accountid+"' end  and "
				   + " case when '"+mobileno+"'='' then true else cm_mobile_number='"+mobileno+"' end "
				   + "  ";
		try {
			System.out.println(sql);
			List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
			return gson.toJson(rows);
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
			return gson.toJson(rows);
		} catch (RuntimeException e) {
			throw e;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}	
	
	@RequestMapping(value = "/getdashboardreportsummary", method = RequestMethod.GET)
	public @ResponseBody String getdashboardreportsummary(
			@RequestParam(value = "location", required = true) String location,
			@RequestParam(value = "modeid", required = true) Integer modeid,
			@RequestParam(value = "fromdate", required = true) String fromdate,
			@RequestParam(value = "todate", required = true) String todate
			) {
		
		String sql = " select * from ccc_getdashboardreportsummary('"+location+"',"+modeid+",'"+fromdate+"','"+todate+"') ";
		try {
			List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
			return gson.toJson(rows);
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
			return gson.toJson(rows);
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
			return gson.toJson(rows);
		} catch (RuntimeException e) {
			throw e;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	@RequestMapping(value = "/getcommentslist", method = RequestMethod.GET)
	public @ResponseBody String getcommentslist(
			@RequestParam(value = "docketno", required = true) String docketno,
			@RequestParam(value = "requestid", required = true) Integer requestid
			) {
		
		String sql = " select * from comments where requestid = "+requestid+" and docketno = '"+docketno+"' order by  cdate desc ";
		try {
			List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
			return gson.toJson(rows);
		} catch (RuntimeException e) {
			throw e;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	@RequestMapping(value = "/getmaindashboarddetails", method = RequestMethod.GET)
	public @ResponseBody String getmaindashboarddetails(
			@RequestParam(value = "docketno", required = false) String docketno,
			@RequestParam(value = "requestid", required = false) Integer requestid
			) {
		
		String sql = " select count(*) total,sum(case when status_id in (1,2,4,6,8) then 1 else 0 end) pending, "
				   + " sum(case when status_id in (5,7) then 1 else 0 end) resolved, sum(case when status_id in (3) then 1 else 0 end) rejected "
				   + " from requests r,officer_details od "
				   + " where od.od_pkid = r.officer_id "
				   + " and (od.od_locatoin_code like '2110%' or od_pkid =null) "
				   + " and case when '2015-01-01'='' and '2018-11-30'='' then true else r.opendate::date between  '2015-01-01'::date and '2018-11-30'::date end "
				   + " and (case when '0'='0' then true else r.status_id = any(string_to_array('0', ',')::int[]) end) "
				   + " and (case when '0'='0' then true else r.mode_id = any(string_to_array('0', ',')::int[]) end) ";
		try {
			List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
			return gson.toJson(rows);
		} catch (RuntimeException e) {
			throw e;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	@RequestMapping(value = "/getdashboardcategorywisedetails", method = RequestMethod.GET)
	public @ResponseBody String getdashboardcategorywisedetails(
			@RequestParam(value = "locationcode", required = false) String locationcode,
			@RequestParam(value = "statusname", required = false) String statusname,
			@RequestParam(value = "fromdate", required = false) String fromdate,
			@RequestParam(value = "todate", required = false) String todate
			) {
		
		String sql = "select * from ccc_getdashboardcategorywisedetails('"+locationcode+"','"+statusname+"','"+fromdate+"','"+todate+"') ";
		try {
			List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
			return gson.toJson(rows);
		} catch (RuntimeException e) {
			throw e;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	@RequestMapping(value = "/getdashboarddepartmentwisedetails", method = RequestMethod.GET)
	public @ResponseBody String getdashboarddepartmentwisedetails(
			@RequestParam(value = "locationcode", required = false) String locationcode,
			@RequestParam(value = "statusname", required = false) String statusname,
			@RequestParam(value = "fromdate", required = false) String fromdate,
			@RequestParam(value = "todate", required = false) String todate
			) {
		
		String sql = "select * from ccc_getdashboarddepartmentwisedetails('"+locationcode+"','"+statusname+"','"+fromdate+"','"+todate+"') ";
		try {
			List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
			return gson.toJson(rows);
		} catch (RuntimeException e) {
			throw e;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	@RequestMapping(value = "/getdashboardmodewisedetails", method = RequestMethod.GET)
	public @ResponseBody String getdashboardmodewisedetails(
			@RequestParam(value = "locationcode", required = false) String locationcode,
			@RequestParam(value = "statusname", required = false) String statusname,
			@RequestParam(value = "fromdate", required = false) String fromdate,
			@RequestParam(value = "todate", required = false) String todate
			) {
		
		String sql = "select * from ccc_getdashboardmodewisedetails('"+locationcode+"','"+statusname+"','"+fromdate+"','"+todate+"') ";
		try {
			List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
			return gson.toJson(rows);
		} catch (RuntimeException e) {
			throw e;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	
	@RequestMapping(value = "/getdahboardcomplaintlist", method = RequestMethod.GET)
	public @ResponseBody String getdahboardcomplaintlist(
			@RequestParam(value = "locationcode", required = false) String locationcode,
			@RequestParam(value = "statusname", required = false) String statusname,
			@RequestParam(value = "fromdate", required = false) String fromdate,
			@RequestParam(value = "todate", required = false) String todate
			) {
		
		String sql = "select * from ccc_getdashboardcomplientslist('"+locationcode+"','"+fromdate+"','"+todate+"') ";
		try {
			List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
			return gson.toJson(rows);
		} catch (RuntimeException e) {
			throw e;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	@RequestMapping(value = "/getdashboardlocationwisesummary", method = RequestMethod.GET)
	public @ResponseBody String getdashboardlocationwisesummary(
			@RequestParam(value = "locationcode", required = false) String locationcode,
			@RequestParam(value = "statusname", required = false) String statusname,
			@RequestParam(value = "fromdate", required = false) String fromdate,
			@RequestParam(value = "todate", required = false) String todate
			) {
		
		String sql = "select * from ccc_getdashboardlocationwisesummary('"+locationcode+"','"+fromdate+"','"+todate+"')";
		try {
			List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
			return gson.toJson(rows);
		} catch (RuntimeException e) {
			throw e;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	

}
