package org.project.dao;

import java.util.List;

import org.project.entity.IndustryEntity;

public interface IndustryDao {

	List<IndustryEntity> findAll();
	IndustryEntity findById(Long id);
	IndustryEntity save(IndustryEntity industry);
	IndustryEntity update(Long id, IndustryEntity industry);
	void delete(Long id);
}
