package com.May10.pack2.service;
import com.May10.pack2.model.Admin;
public interface AdminService {
public Admin addAdmin(Admin admin);
public void deleteAdmin(int AdminId);
public String getAdminName(int AdminId);
public String getAdminPassword(int AdminId);
}
