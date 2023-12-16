package org.project.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.project.dao.CompanyDao;
import org.project.dto.CompanyDto;
import org.project.entity.CompanyEntity;
import org.project.service.CompanySvc;
import org.springframework.stereotype.Service;

@Service
public class CompanySvcImpl implements CompanySvc {

	private final CompanyDao companyDao;
	
	public CompanySvcImpl(CompanyDao companyDao) {
		this.companyDao = companyDao;
	}
	
	private CompanyDto convertToDto(CompanyEntity company) {
		CompanyDto dto = new CompanyDto();
		dto.setCompanyId(company.getCompanyId());
		dto.setCompanyName(company.getCompanyName());
		dto.setCompanyAddress(company.getCompanyAddress());
		dto.setIndustryId(company.getIndustryId());
		return dto;
	}
	
	@Override
	public List<CompanyDto> getAllCompanies() {
		List<CompanyDto> allCompanies = new ArrayList<>();
		allCompanies = companyDao.findAll().stream()
				.map(this::convertToDto)
				.collect(Collectors.toList());
		
		return allCompanies;
	}

	@Override
	public CompanyDto getCompanyById(Long id) {
		CompanyEntity company = companyDao.findById(id); 
		
		return (company != null) ? convertToDto(company) : null;
	}

	@Override
	public CompanyDto saveCompany(CompanyDto company) {
		CompanyEntity newCompany = new CompanyEntity();
		newCompany.setCompanyId(company.getCompanyId());
		newCompany.setCompanyName(company.getCompanyName());
		newCompany.setCompanyAddress(company.getCompanyAddress());
		newCompany.setIndustryId(company.getIndustryId());
		
		companyDao.save(newCompany);
		
		return convertToDto(newCompany);
	}

	@Override
	public CompanyDto updateCompany(Long id, CompanyDto company) {
		CompanyEntity updatedCompany = new CompanyEntity();
		updatedCompany = companyDao.findById(id);
		
		if (updatedCompany.getCompanyId().equals(company.getCompanyId())) {
			updatedCompany = companyDao.update(id, company);
		} else {
			return null;
		}
		
		return convertToDto(updatedCompany);
	}

	@Override
	public void deleteCompany(Long id) {
		companyDao.delete(id);
	}
	
	

}
