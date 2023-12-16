package org.project.service;

import java.util.List;

import org.project.dto.IndustryDto;

public interface IndustrySvc {

	List<IndustryDto> getAllIndustries();
	IndustryDto getIndustryById(Long id);
	IndustryDto saveIndustry(IndustryDto industry);
	IndustryDto updateIndustry(Long id, IndustryDto industry);
	void deleteIndustry(Long id);
}
