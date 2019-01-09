/**
 * 
 */
package com.ccc.res.repositry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ccc.res.dto.User;


/**
 * @author Administrator
 *
 */
public interface UserRepository extends JpaRepository<User, Integer> {

	/**
	 * Find a user by username
	 *
	 * @param username the user's username
	 * @return user which contains the user with the given username or null.
	 */
	
	 public final static String USER_BY_ROLE=" select u.* "
	 		+ "from users u  inner join authorities a on u.username=a.username "
			   + " where u.username LIKE %:username% and a.authority=:role order by u.username";
	 
	 public final static String USER_BY_ROLE1=" select u.* "
		 		+ "from users u  inner join authorities a on u.username=a.username "
				   + " where a.authority=:role order by u.username";
	 
	 public final static String Verify_UserName="select u.*"
	 		   + " from users u where u.username=:username";
	 
	 public final static String Verify_Email="select u.*"
	 		   + " from users u where u.email=:email";
	 
	 public final static String Verify_Mobile="select u.*"
	 		   + " from users u where u.mobileno=:mobileno";
	 
	 public final static String USER_BY_EUM=" select * "
		 		+ "from users where username=:uid or email=:uid or mobileno=:uid ";
		
	 public List<User> findByUsernameContainingIgnoreCase(@Param("name") String name);	
		 
	 @Query(value=USER_BY_ROLE,nativeQuery = true)
	 public List<User> getUsersByRoleAndName(@Param("username") String username,@Param("role") String role);
	
	 @Query(value=Verify_UserName,nativeQuery = true)
	 public List<User> verifyUserName(@Param("username") String username);
	 
	 @Query(value=Verify_Email,nativeQuery = true)
	 public List<User> verifyEmail(@Param("email") String email);
	 
	 @Query(value=Verify_Mobile,nativeQuery = true)
	 public List<User> verifyMobileNo(@Param("mobileno") String mobileno);
	 
	 @Query(value=USER_BY_ROLE1,nativeQuery = true)
	 public List<User> getUsersByRole(@Param("role") String role);
	
	 @Query(value=USER_BY_EUM,nativeQuery = true)
	 public List<User> getByEUM(@Param("uid") String uid);         
     	 
	 User findOneByUsername(@Param("username") String username);
	 
	 public final static String getUserMaxid=" select max(cdr_id)+1 as max_cadreid from cadre ";	

		@Query(value=getUserMaxid,nativeQuery = true)
		public Long getUserMaxid();
		
		public List<User> findAllByOrderByUsername();
	
}
