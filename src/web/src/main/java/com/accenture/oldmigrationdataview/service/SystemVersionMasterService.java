package com.accenture.oldmigrationdataview.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accenture.oldmigrationdataview.domain.SystemVersionMaster;
import com.accenture.oldmigrationdataview.repository.SystemVersionMasterRepository;

@Service
@Transactional
public class SystemVersionMasterService {

	@Autowired
	SystemVersionMasterRepository repository;
	
	public List<SystemVersionMaster> findAll() {
		return repository.findAll(new Sort(Sort.Direction.ASC, "systemVersionCode"));
	}
	
	public SystemVersionMaster findOne(Long systemVersionCode) {
		return repository.findOne(systemVersionCode);
	}
	
}
