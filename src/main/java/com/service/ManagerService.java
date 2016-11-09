package com.service;

import com.domain.Manager;

import java.util.List;

public interface ManagerService {
	public Manager save(Manager manager);

	public Manager findOne(Integer id);

	public List<Manager> findAll();

	public Long count();

	public void delete(Manager manager);

	public Boolean exists(Integer id);
}
