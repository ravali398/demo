package com.May10.pack2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

import com.May10.pack2.model.Admin;
@Repository
public interface AdminRepository extends JpaRepository<Admin,Integer> {
	@Query(value= "select u.user_name from user_table u inner join admin_table ad on ad.user_id=u.user_id where ad.admin_id=?1", nativeQuery=true)
	public String getAdminName(int adminId);
	@Query(value="select u.userpassword from user_table u inner join admin_table ad on ad.user_id=u.user_id where ad.admin_id=?1", nativeQuery=true)
	public String getAdminPassword(int adminId);


}
