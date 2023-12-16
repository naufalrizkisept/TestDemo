package org.project.controller;

import java.util.ArrayList;
import java.util.List;

import org.project.dto.CompanyDto;
import org.project.service.CompanySvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/company")
public class CompanyController {

	@Autowired
	private final CompanySvc companySvc;
	
	public CompanyController(CompanySvc companySvc) {
		this.companySvc = companySvc;
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<CompanyDto>> getAllCompanies() {
		List<CompanyDto> companies = new ArrayList<>();
		companies = companySvc.getAllCompanies();
		
		return new ResponseEntity<>(companies, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<CompanyDto> getCompanyById(@PathVariable("id") Long id) {
		CompanyDto company = new CompanyDto();
		company = companySvc.getCompanyById(id);
		
		return (company != null) ? new ResponseEntity<>(company, HttpStatus.OK) : new ResponseEntity<>(company, HttpStatus.NOT_FOUND);
	}
	
	@PostMapping("/save")
	public ResponseEntity<CompanyDto> saveCompany(@RequestBody CompanyDto company) {
		CompanyDto newCompany = new CompanyDto();
		newCompany = companySvc.saveCompany(company);
		
		return new ResponseEntity<>(newCompany, HttpStatus.CREATED);
	}
	
	@PostMapping("/update/{id}")
	public ResponseEntity<CompanyDto> updateCompany(@PathVariable("id") Long id, @RequestBody CompanyDto company) {
		CompanyDto updatedCompany = new CompanyDto();
		updatedCompany = companySvc.updateCompany(id, company);
		
		return (updatedCompany != null) ? new ResponseEntity<>(updatedCompany, HttpStatus.OK) : new ResponseEntity<>(updatedCompany, HttpStatus.NOT_FOUND);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> deleteCompany(@PathVariable("id") Long id) {
		companySvc.deleteCompany(id);
		
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
