package com.nim.solutions.ezpark.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="t_user")
public class User {
	@Id
	@GeneratedValue( strategy= GenerationType.IDENTITY) 
	private Integer id;
	
	@Column(name="login_id")
	private String loginId;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="middle_name")
	private String middleName;
	
	@Column(name="password")
	private String password;
	 
	@Column(name="birthdate")
	@Temporal(TemporalType.DATE)
	private Date birthday;
	
	@Column(name="mothers_name")
	private String mothersName;
	
	@Column(name="address")
	private String address;
	
	@Column(name="avatar")
	private Byte avatar;
	
	@ManyToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="t_user_role", referencedColumnName="role_id")
	private List<Role> roleList;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
	public List<Role> getRoleList() {
		return roleList;
	}

	public void setRoleList(List<Role> roleList) {
		this.roleList = roleList;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getMothersName() {
		return mothersName;
	}

	public void setMothersName(String mothersName) {
		this.mothersName = mothersName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Byte getAvatar() {
		return avatar;
	}

	public void setAvatar(Byte avatar) {
		this.avatar = avatar;
	}
	
}
