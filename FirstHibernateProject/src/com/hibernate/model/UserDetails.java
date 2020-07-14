package com.hibernate.model;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="USER_DETAILS")
public class UserDetails {
//@Id@GeneratedValue(strategy=GenerationType.AUTO)
//@Column(name="USER_ID")
	//@EmbeddedId
private int userId;
@Column(name="USER_NAME")
//@Basic
//@Transient
private String userName;
//private Address address;
//@Temporal(TemporalType.DATE)
//private Date joinedDate;
//@Embedded
//private String Address;
@Lob
//private String description;
@Embedded

private Address OfficeAddress;
@Embedded
@AttributeOverrides({
@AttributeOverride(name="street",column=@Column(name="OFFICE_STREET_NAME")),
@AttributeOverride(name="city",column=@Column(name="OFFICE_CITY_NAME")),
@AttributeOverride(name="state",column=@Column(name="OFFICE_STATE_NAME")),
@AttributeOverride(name="pincode",column=@Column(name="OFFICE_PINCODE_NAME"))})
private Address homeAddress;



public Address getOfficeAddress() {
	return OfficeAddress;
}
public void setOfficeAddress(Address officeAddress) {
	OfficeAddress = officeAddress;
}
public Address getHomeAddress() {
	return homeAddress;
}
public void setHomeAddress(Address homeAddress) {
	this.homeAddress = homeAddress;
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getUserName() {
	return userName ;

}
public void setUserName(String userName) {
	this.userName = userName;
}


/*public Date getJoinedDate() {
	return joinedDate;
}
public void setJoinedDate(Date joinedDate) {
	this.joinedDate = joinedDate;
}

public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}*/


}

