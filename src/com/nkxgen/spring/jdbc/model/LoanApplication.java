package com.nkxgen.spring.jdbc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LoanApplications")
public class LoanApplication {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "lnap_id")
	private int id;

	@Column(name = "lnap_cust_id")
	private int customerId;

	@Column(name = "lnap_apdate")
	private String applicationDate;

	@Column(name = "lnap_lnty_id")
	private String loanTypeId;

	@Column(name = "lnap_amount")
	private long amount;

	@Column(name = "lnap_emilimitfrom")
	private long emiLimitFrom;

	@Column(name = "lnap_emilimitto")
	private long emiLimitTo;

	@Column(name = "lnap_tenure_requested")
	private int tenureRequested;

	@Column(name = "lnap_nominee")
	private String nominee;

	@Column(name = "lnap_createdby")
	private int createdBy;

	@Column(name = "lnap_createddate")
	private String createdDate;

	@Column(name = "lnap_processedby")
	private int processedBy;

	@Column(name = "lnap_processdate")
	private String processDate;

	@Column(name = "lnap_processedstatus")
	private String processedStatus;

	@Column(name = "lnap_luudate")
	private String lastUpdatedDate;

	@Column(name = "lnap_luuser")
	private int lastUpdatedUser;

	@Column(name = "lnap_status")
	private String status;

	@Column(name = "lnap_remarks")
	private String remarks;

	@Column(name = "doc")
	private String Attachment;

	// Setters
	public void setId(int id) {
		this.id = id;
	}

	public void setCustId(int custId) {
		this.customerId = custId;
	}

	public void setApplicationDate(String applicationDate) {
		this.applicationDate = applicationDate;
	}

	public void setLoanTypeId(String loanTypeId) {
		this.loanTypeId = loanTypeId;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public void setEmiLimitFrom(long emiLimitFrom) {
		this.emiLimitFrom = emiLimitFrom;
	}

	public void setEmiLimitTo(long emiLimitTo) {
		this.emiLimitTo = emiLimitTo;
	}

	public void setTenureRequested(int tenureRequested) {
		this.tenureRequested = tenureRequested;
	}

	public void setNominee(String nominee) {
		this.nominee = nominee;
	}

	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public void setProcessedBy(int processedBy) {
		this.processedBy = processedBy;
	}

	public void setProcessDate(String processDate) {
		this.processDate = processDate;
	}

	public void setProcessedStatus(String processedStatus) {
		this.processedStatus = processedStatus;
	}

	public void setLastUpdatedDate(String lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	public void setLastUpdatedUser(int lastUpdatedUser) {
		this.lastUpdatedUser = lastUpdatedUser;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public void setAttachment(String Attachment) {
		this.Attachment = Attachment;
	}

	// Getters
	public int getId() {
		return id;
	}

	public int getCustId() {
		return customerId;
	}

	public String getApplicationDate() {
		return applicationDate;
	}

	public String getLoanTypeId() {
		return loanTypeId;
	}

	public long getAmount() {
		return amount;
	}

	public long getEmiLimitFrom() {
		return emiLimitFrom;
	}

	public long getEmiLimitTo() {
		return emiLimitTo;
	}

	public int getTenureRequested() {
		return tenureRequested;
	}

	public String getNominee() {
		return nominee;
	}

	public int getCreatedBy() {
		return createdBy;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public int getProcessedBy() {
		return processedBy;
	}

	public String getProcessDate() {
		return processDate;
	}

	public String getProcessedStatus() {
		return processedStatus;
	}

	public String getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	public int getLastUpdatedUser() {
		return lastUpdatedUser;
	}

	public String getStatus() {
		return status;
	}

	public String getRemarks() {
		return remarks;
	}

	public String getAttachment() {
		return Attachment;
	}
}
