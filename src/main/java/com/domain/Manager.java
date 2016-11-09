package com.domain;

public class Manager {

	private Integer id;
	private String login;

	protected Manager() {}

	public Manager(String login) {
		setLogin(login);
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

}
