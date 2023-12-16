package org.project.dto;

import org.project.entity.IndustryEntity;

public class IndustryDto extends IndustryEntity {
	
	private Long industryId;
	private String industryName;
	private String industryDesc;
	
	public IndustryDto() {
		
	}

	public IndustryDto(Long industryId, String industryName, String industryDesc) {
		this.industryId = industryId;
		this.industryName = industryName;
		this.industryDesc = industryDesc;
	}

	// GETTER-SETTER
	@Override
	public Long getIndustryId() {
		return industryId;
	}
	@Override
	public void setIndustryId(Long industryId) {
		this.industryId = industryId;
	}
	@Override
	public String getIndustryName() {
		return industryName;
	}
	@Override
	public void setIndustryName(String industryName) {
		this.industryName = industryName;
	}
	@Override
	public String getIndustryDesc() {
		return industryDesc;
	}
	@Override
	public void setIndustryDesc(String industryDesc) {
		this.industryDesc = industryDesc;
	}
	
}
