package com.service;


import com.domain.Manager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.persistence.ManagerMapper;

import java.util.List;

@Service("ManagerService")
public class ManagerServiceImpl implements ManagerService {

	private static final Logger logger = LoggerFactory.getLogger(ManagerService.class);

	@Autowired
	private ManagerMapper managerMapper;

	public Manager save(Manager manager) {
		if (null == manager.getId()) {
			managerMapper.save(manager);
			return manager;
		} else {
			managerMapper.update(manager);
			return manager;
		}
	}

	public Manager findOne(Integer id) {
		return managerMapper.findOne(id);
	}

	public List<Manager> findAll() {
		return managerMapper.findAll();
	}

	public Long count() {
		return managerMapper.count();
	}

	public void delete(Manager manager) {
		managerMapper.delete(manager);
	}

	public Boolean exists(Integer id) {
		return managerMapper.exists(id);
	}
}
