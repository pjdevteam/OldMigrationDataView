package com.accenture.oldmigrationdataview.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.accenture.oldmigrationdataview.domain.SystemVersionMaster;

public interface SystemVersionMasterRepository extends JpaRepository<SystemVersionMaster, Long> {

}
