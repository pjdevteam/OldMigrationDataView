package com.accenture.oldmigrationdataview.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accenture.oldmigrationdataview.domain.MigrationHistory;
import com.accenture.oldmigrationdataview.repository.MigrationHistoryRepository;

@Service
@Transactional
public class MigrationHistoryService {

	@Autowired
	MigrationHistoryRepository repository;
	
	public List<MigrationHistory> findAll() {
		return repository.findAll(new Sort(Sort.Direction.DESC, "applyNumber"));
	}

	public List<MigrationHistory> findByApplyNumber(Long applyNumber) {
		return repository.findByApplyNumber(applyNumber);
	}
	
	public List<MigrationHistory> findByResourceNumber(Long resourceNumber) {
		return repository.findByResourceNumber(resourceNumber);
	}
	
	public List<MigrationHistory> findByApplyPerson(String applyPerson) {
		return repository.findByApplyPerson(applyPerson);
	}
	
}
