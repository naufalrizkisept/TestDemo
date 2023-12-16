package org.project.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "INDUSTRY_TABLE")
public class IndustryEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "industryId")
	private Long industryId;
	
	@Column(name = "industryName")
	private String industryName;
	
	@Column(name = "industryDesc")
	private String industryDesc;

	// GETTER-SETTER
	public Long getIndustryId() {
		return industryId;
	}
	public void setIndustryId(Long industryId) {
		this.industryId = industryId;
	}
	public String getIndustryName() {
		return industryName;
	}
	public void setIndustryName(String industryName) {
		this.industryName = industryName;
	}
	public String getIndustryDesc() {
		return industryDesc;
	}
	public void setIndustryDesc(String industryDesc) {
		this.industryDesc = industryDesc;
	}
	
	// FOR TESTING QUERY
	@Override
	public String toString() {
		return "IndustryEntity [industryId=" + industryId + ", industryName=" + industryName + ", industryDesc="
				+ industryDesc + "]";
	}
	
	
}
