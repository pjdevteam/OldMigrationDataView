package com.accenture.oldmigrationdataview.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.accenture.oldmigrationdataview.domain.User;

public interface UserRepository extends JpaRepository<User, String> {

}
