package org.project.dao;

import java.util.List;

import org.project.entity.CompanyEntity;

public interface CompanyDao {

	List<CompanyEntity> findAll();
	CompanyEntity findById(Long id);
	CompanyEntity save(CompanyEntity company);
	CompanyEntity update(Long id, CompanyEntity company);
	void delete(Long id);
}
