package com.domain;

import java.util.List;

public class Manager {

	private Integer id;
	private String login;
	private List<Role> roleList;

	protected Manager() {}

	public Manager(String login, List<Role> roleList) {
		setLogin(login);
		setRoleList(roleList);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public List<Role> getRoleList() {
		return roleList;
	}

	public void setRoleList(List<Role> roleList) {
		this.roleList = roleList;
	}

}
