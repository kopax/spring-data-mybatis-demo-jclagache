package com.store;

public final class HttpPathStore {

	public static final String ROOT = "/";

	public static final String API_V1 = ROOT + "v1/";

	public static final String PING = ROOT + "ping";

	public static final String PARAM_ID = ROOT + "{id}";

	public static final String LOGIN = ROOT + "login";
	public static final String LOGIN_FROM_ERROR = LOGIN + "?error";
	public static final String LOGIN_FROM_LOGOUT = LOGIN + "?logout";
	public static final String ERROR = ROOT + "error";


	public static final String EMPLOYEES = API_V1 + "employees";
	public static final String MANAGERS = API_V1 + "managers";
	public static final String COMPANIES = ROOT + "companies";


}
