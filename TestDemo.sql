CREATE DATABASE demoDB;

CREATE TABLE INDUSTRY_TABLE (
	industryId int NOT NULL PRIMARY KEY,
	industryName varchar(50) NOT NULL,
	industryDesc varchar(50)
);

CREATE TABLE COMPANY_TABLE (
	companyId int NOT NULL PRIMARY KEY,
	companyName varchar(50) NOT NULL,
	companyAddress varchar(100) NOT NULL,
	industryId int FOREIGN KEY REFERENCES INDUSTRY_TABLE(industryId) NOT NULL
);

CREATE TABLE USER_TABLE (
	userId int NOT NULL PRIMARY KEY,
	userName varchar(50) NOT NULL,
	userEmail varchar(50),
	userJob varchar(50),
	companyId int FOREIGN KEY REFERENCES COMPANY_TABLE(companyId) NOT NULL
);