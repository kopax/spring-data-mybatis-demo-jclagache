package com.domain;

public enum Role {

	ROLE_USER(1),
	ROLE_MANAGER(2),
	ROLE_ADMIN(3),
	ROLE_CLIENT(4),
	ROLE_TRUSTED_CLIENT(5);

	private int value;

	private Role(final int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	/**
	 * From int to Role
	 *
	 * @param value
	 * @return
	 */
	public static Role getRoleFromValue(int value) {
		Role result = null;
		for (Role s : Role.values()) {
			if (s.getValue() == value) {
				result = s;
			}
		}
		if (result == null) {
			throw new IllegalArgumentException("No exist the Role with that value");
		}
		return result;
	}
}