package com.ccc.res.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@Configuration
@EnableWebSecurity
@EnableResourceServer
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	/**
	 * Constructor disables the default security settings
	 */
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public WebSecurityConfig() {
		super(true);
	}

	// password encryptor
	@Bean
	public PasswordEncoder passwordEncoder() {
	    return new BCryptPasswordEncoder();
	}

	@Autowired
        public void globalUserDetails(final AuthenticationManagerBuilder auth) throws Exception {
           	
    	  String userByMailQuery = "SELECT email as username, password, enabled FROM users WHERE email=?;";
    	  String userByMobilenoQuery = "SELECT mobileno as username, password,enabled FROM users WHERE mobileno=?";
          String userByUsernameQuery = "SELECT username, password,enabled FROM users WHERE username=?";
                    
    	  auth.jdbcAuthentication().dataSource(jdbcTemplate.getDataSource()).passwordEncoder(passwordEncoder())
    	 .usersByUsernameQuery(userByMailQuery)
         .authoritiesByUsernameQuery("select email as username,authority from authorities where email=?");
    	 
    	  auth.jdbcAuthentication().dataSource(jdbcTemplate.getDataSource()).passwordEncoder(passwordEncoder())
    	 .usersByUsernameQuery(userByMobilenoQuery)
         .authoritiesByUsernameQuery("select mobileno as username,authority from authorities where mobileno=?");
    	 
    	  auth.jdbcAuthentication().dataSource(jdbcTemplate.getDataSource()).passwordEncoder(passwordEncoder()) 
    	 .usersByUsernameQuery(userByUsernameQuery)
         .authoritiesByUsernameQuery("select username,authority from authorities where username=?");
    	 
          // @formatter:on
    }
	
	
	 @Override
		public void configure(WebSecurity web) throws Exception {
			
		 web
		 .ignoring()
		 .antMatchers(
					"/login",
					"/fpassword",
					"/user/updatePassword*",
	                "/user/savePassword*",
	                "/query/verifysendotp",
	                "/query/verifyotp",
	                "/query/resetpassword",
	                "/updatePassword*",
	                "/query/getcaptcha",
	                "/query/verifycaptcha*",
	                "/query/loadcategories",
	                "/query/loadsubcategories",
	                "/query/registerquickcomplaint",
	                "/query/trackcomplaint"
					);
		}
	
	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.antMatcher("/ccc-res/**")
				.authorizeRequests().anyRequest().authenticated();
	}
	@Bean
	@Override
	public AuthenticationManager authenticationManagerBean() throws Exception {
		return super.authenticationManagerBean();
	}       
       

}
