package com.cg.ams.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Author 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="auth_id",length=20)
	private int authorId;
	@Column(name="first_name",length=20)
	private String firstName;
	@Column(name="mid_name",length=20)
	private String	middleName;
	@Column(name="last_name",length=20)
	private String lastName;
	@Column(name="phone_no",length=10)
	private String phoneNo;
	
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	@Override
	public String toString() {
		return "Account [authorId=" + authorId + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", phoneNo=" + phoneNo + "]";
	}
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Author(int authorId, String firstName, String middleName, String lastName, String phoneNo) {
		super();
		this.authorId = authorId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.phoneNo = phoneNo;
	}
	
	

}
