package org.project.dto;

import org.project.entity.CompanyEntity;

public class CompanyDto extends CompanyEntity{

	private Long companyId;
	private String companyName;
	private String companyAddress;
	private Long industryId;
	
	public CompanyDto() {
		
	}
	
	public CompanyDto(Long companyId, String companyName, String companyAddress, Long industryId) {
		this.companyId = companyId;
		this.companyName = companyName;
		this.companyAddress = companyAddress;
		this.industryId = industryId;
	}

	// 	GETTER-SETTER
	@Override
	public Long getCompanyId() {
		return companyId;
	}
	@Override
	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}
	@Override
	public String getCompanyName() {
		return companyName;
	}
	@Override
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	@Override
	public String getCompanyAddress() {
		return companyAddress;
	}
	@Override
	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}
	@Override
	public Long getIndustryId() {
		return industryId;
	}
	@Override
	public void setIndustryId(Long industryId) {
		this.industryId = industryId;
	}
}
