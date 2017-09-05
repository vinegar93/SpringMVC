package cn.hwd.springmvc.bean;

import javax.validation.constraints.Size;

import cn.hwd.springmvc.controller.validation.ValidationGroup;

public class User {
	
	private Integer id;  
	@Size(min=6,max=18,message="{user.name.length.errorMessage}",groups={ValidationGroup.class})//groups：定义此校验属于哪个分组，可以定义多个分组
    private String name;
	@Size(min=6,max=18,message="{user.password.length.errorMessage}")
    private String password;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(Integer id, String name, String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password
				+ "]";
	}
	
}
