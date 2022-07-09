package com.May10.pack2.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Book_Table")
public class Book {
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	
private Long bookId;
	@NotBlank(message = "bookName should not be blank")
private String bookName;
	@NotNull(message = "This filed shoud not be null")
private double bookPrice;
	/*
	 * 
	 * @Email
	 * String emailId;
	 * @Pattern(regxp="[789]{1}[0-9]{9}"  messge="the mobile number should corrcet")
	 * String phone;
	 * @Size(min=8,message)
	 * @max
	 * @Min
	 * abc@org.xyz.in
	 * @Pattern(regexp="[0-9]{5}", messge="the password shold be only 5 digits")
	 * @Email(message="error msg")
	 * 
	 * 
	 */
public Long getBookId() {
	return bookId;
}
public void setBookId(Long bookId) {
	this.bookId = bookId;
}
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
public double getBookPrice() {
	return bookPrice;
}
public void setBookPrice(double bookPrice) {
	this.bookPrice = bookPrice;
}


	
}
