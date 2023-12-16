package org.project.dao.impl;

import java.util.List;
import java.util.Optional;

import org.project.dao.IndustryDao;
import org.project.entity.IndustryEntity;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class IndustryDaoImpl implements IndustryDao {

	private JdbcTemplate jdbcTemplate;
	
	public IndustryDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public List<IndustryEntity> findAll() {
		String sql = "SELECT * FROM INDUSTRY_TABLE";
		List<IndustryEntity> queryResult = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(IndustryEntity.class));
		
		if (queryResult.size() != 0) {
			return queryResult;
		} else {
			return null;
		}
	}

	@Override
	public IndustryEntity findById(Long id) {
		String sql = "SELECT * FROM INDUSTRY_TABLE WHERE industryId = ?";
		List<IndustryEntity> queryResult = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(IndustryEntity.class), id);
		Optional<IndustryEntity> findIndustry = queryResult.stream()
				.filter(industry -> id.equals(industry.getIndustryId()))
				.findFirst();
		
		return findIndustry.orElse(null);
	}

	@Override
	public IndustryEntity save(IndustryEntity industry) {
		String sql = "INSERT INTO INDUSTRY_TABLE VALUES (?, ?, ?)";
		jdbcTemplate.update(sql, industry.getIndustryId(), industry.getIndustryName(), industry.getIndustryDesc());
		return industry;
	}

	@Override
	public IndustryEntity update(Long id, IndustryEntity industry) {
		String sql  = "UPDATE INDUSTRY_TABLE SET industryName = ?, industryDesc = ? WHERE industryId = ?";
		jdbcTemplate.update(sql, industry.getIndustryName(), industry.getIndustryDesc(), id);
		return industry;
	}

	@Override
	public void delete(Long id) {
		String sql = "DELETE FROM INDUSTRY_TABLE WHERE industryId = ?";
		jdbcTemplate.update(sql, id);
	}

}
