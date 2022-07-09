package com.May10.pack2.model;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.*;
@Entity
@Table(name="User_Table")
public class User {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int UserId;
private String UserType;
private String UserName;
private String Userpassword;
public int getUserId() {
	return UserId;
}
public void setUserId(int userId) {
	UserId = userId;
}
public String getUserType() {
	return UserType;
}
public void setUserType(String userType) {
	UserType = userType;
}
public String getUserName() {
	return UserName;
}
public void setUserName(String userName) {
	UserName = userName;
}
public String getUserpassword() {
	return Userpassword;
}
public void setUserpassword(String userpassword) {
	Userpassword = userpassword;
}

}
