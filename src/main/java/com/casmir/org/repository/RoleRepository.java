package com.casmir.org.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.casmir.org.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
	@Query("SELECT r FROM Role r WHERE r.name = ?1")
	public Role findByName(String name);

}
