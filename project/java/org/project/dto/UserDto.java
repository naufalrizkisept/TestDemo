package org.project.dto;

import org.project.entity.UserEntity;

public class UserDto extends UserEntity {
	
	private Long userId;
	private String userName;
	private String userEmail;
	private String userJob;
	private int companyId;
	
	public UserDto() {
		
	}
	
	public UserDto(Long userId, String userName, String userEmail, String userJob, int companyId) {
		this.userId = userId;
		this.userName = userName;
		this.userEmail = userEmail;
		this.userJob = userJob;
		this.companyId = companyId;
	}

	// GETTER-SETTER
	@Override
	public Long getUserId() {
		return userId;
	}
	@Override
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	@Override
	public String getUserName() {
		return userName;
	}
	@Override
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Override
	public String getUserEmail() {
		return userEmail;
	}
	@Override
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	@Override
	public String getUserJob() {
		return userJob;
	}
	@Override
	public void setUserJob(String userJob) {
		this.userJob = userJob;
	}
	@Override
	public int getCompanyId() {
		return companyId;
	}
	@Override
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

}
