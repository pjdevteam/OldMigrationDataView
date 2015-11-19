package com.accenture.oldmigrationdataview.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.accenture.oldmigrationdataview.domain.MigrationHistory;

public interface MigrationHistoryRepository extends JpaRepository<MigrationHistory, Long> {

	  // find methods
	  //移管申請#
	  public List<MigrationHistory> findByApplyNumber(Long applyNumber); 
	  //リソース#
	  public List<MigrationHistory> findByResourceNumber(Long resourceNumber);
	  //移管申請者
	  public List<MigrationHistory> findByApplyPerson(String applyPerson);
}
