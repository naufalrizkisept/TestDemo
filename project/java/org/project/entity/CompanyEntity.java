package org.project.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "COMPANY_TABLE")
public class CompanyEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "companyId")
	private Long companyId;
	
	@Column(name = "companyName")
	private String companyName;
	
	@Column(name = "companyAddress")
	private String companyAddress;
	
	@Column(name = "industryId")
	private Long industryId;

	// GETTER-SETTER
	public Long getCompanyId() {
		return companyId;
	}
	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyAddress() {
		return companyAddress;
	}
	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}
	public Long getIndustryId() {
		return industryId;
	}
	public void setIndustryId(Long industryId) {
		this.industryId = industryId;
	}
	
	// FOR TESTING QUERY
	@Override
	public String toString() {
		return "CompanyEntity [companyId=" + companyId + ", companyName=" + companyName + ", companyAddress="
				+ companyAddress + ", industryId=" + industryId + "]";
	}
	
	
}
