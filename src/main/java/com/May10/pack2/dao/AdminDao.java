package com.May10.pack2.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.May10.pack2.model.Admin;
import com.May10.pack2.repository.AdminRepository;
import com.May10.pack2.service.AdminService;
@Service
public class AdminDao implements AdminService{
@Autowired
private AdminRepository adminrepository;
	@Override
	public Admin addAdmin(Admin admin) {
		// TODO Auto-generated method stub
			return adminrepository.save(admin);
	}

	@Override
	public void deleteAdmin(int AdminId) {
		// TODO Auto-generated method stub
		Admin A=adminrepository.findById(AdminId).get();
	    adminrepository.delete(A);
	}

	@Override
	public String getAdminName(int AdminId) {
		// TODO Auto-generated method stub
		return adminrepository.getAdminName(AdminId);
	}

	@Override
	public String getAdminPassword(int AdminId) {
		// TODO Auto-generated method stub
		return adminrepository.getAdminPassword(AdminId);
	}

}
