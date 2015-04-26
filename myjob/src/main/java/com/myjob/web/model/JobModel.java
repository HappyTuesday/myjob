package com.myjob.web.model;

import java.util.Date;

import org.codehaus.jackson.map.annotate.JsonView;

import com.myjob.entity.values.JobStatus;
import com.myjob.entity.values.Qualification;

public class JobModel {
	
	public interface BrefView{};
	
	public interface DetailView extends BrefView{};
	
	private long sid;

	private String name;

	private Date updateTime;

	private String profession;

	private Qualification qualification;

	private Double workingYears;
	
	private String description;
	
	private Integer amount;
	
	private JobStatus status;
	
	private CompanyModel company;
	
	private GeographicSiteModel workingLocation;

	@JsonView(BrefView.class)
	public long getSid() {
		return sid;
	}

	public void setSid(long sid) {
		this.sid = sid;
	}

	@JsonView(BrefView.class)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@JsonView(BrefView.class)
	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@JsonView(BrefView.class)
	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	@JsonView(BrefView.class)
	public Qualification getQualification() {
		return qualification;
	}

	public void setQualification(Qualification qualification) {
		this.qualification = qualification;
	}

	@JsonView(BrefView.class)
	public Double getWorkingYears() {
		return workingYears;
	}

	public void setWorkingYears(Double workingYears) {
		this.workingYears = workingYears;
	}

	@JsonView(BrefView.class)
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@JsonView(BrefView.class)
	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	@JsonView(BrefView.class)
	public JobStatus getStatus() {
		return status;
	}

	public void setStatus(JobStatus status) {
		this.status = status;
	}

	@JsonView(DetailView.class)
	public CompanyModel getCompany() {
		return company;
	}

	public void setCompany(CompanyModel company) {
		this.company = company;
	}

	@JsonView(BrefView.class)
	public GeographicSiteModel getWorkingLocation() {
		return workingLocation;
	}

	public void setWorkingLocation(GeographicSiteModel workingLocation) {
		this.workingLocation = workingLocation;
	}
}