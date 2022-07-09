package com.May10.pack2.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;
import com.May10.pack2.model.User;
@Entity
@Table(name="Admin_Table")
public class Admin {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int AdminId;
@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="UserId")
private User user;
public int getAdminId() {
	return AdminId;
}
public void setAdminId(int adminId) {
	AdminId = adminId;
}
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}

}
