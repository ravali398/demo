package com.May10.pack2.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.May10.pack2.dao.AdminDao;
import com.May10.pack2.model.Admin;
@RestController
public class AdminController {
@Autowired
AdminDao service;
	@PostMapping(path = "/createAdmin")
	public Admin createAdmin(@RequestBody Admin admin)
	{
		return service.addAdmin(admin);
	}
	@DeleteMapping(path="/deleteAdmin/{id}")
	public void deleteAdmin(@PathVariable int id) {
		service.deleteAdmin(id);
	}
}
