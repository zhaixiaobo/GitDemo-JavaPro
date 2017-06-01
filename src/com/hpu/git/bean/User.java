package com.hpu.git.bean;
/** 
 * @author 作者 :huahua 
 * @date 创建时间：2017年5月31日 下午10:52:59 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return
 */
public class User {

	private Integer id;
	private String userName;
	private String password;
	private int age;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + "]";
	}
	
}
