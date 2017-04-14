package com.allocations.dto;

import java.io.Serializable;

public class MyAllocationsDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String empId;
	String empName;
	String portfolio;
	String project;
	String typeLdsr;
	String ratePerHr;
	String billingHrs;
	String billing;
	String leaveHrs;
	String leakageHrs;
	String comments;
	
	/**
	 * @return the empId
	 */
	public String getEmpId() {
		return empId;
	}
	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}
	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	/**
	 * @return the portfolio
	 */
	public String getPortfolio() {
		return portfolio;
	}
	/**
	 * @param portfolio the portfolio to set
	 */
	public void setPortfolio(String portfolio) {
		this.portfolio = portfolio;
	}
	/**
	 * @return the project
	 */
	public String getProject() {
		return project;
	}
	/**
	 * @param project the project to set
	 */
	public void setProject(String project) {
		this.project = project;
	}
	/**
	 * @return the typeLdsr
	 */
	public String getTypeLdsr() {
		return typeLdsr;
	}
	/**
	 * @param typeLdsr the typeLdsr to set
	 */
	public void setTypeLdsr(String typeLdsr) {
		this.typeLdsr = typeLdsr;
	}
	/**
	 * @return the ratePerHr
	 */
	public String getRatePerHr() {
		return ratePerHr;
	}
	/**
	 * @param ratePerHr the ratePerHr to set
	 */
	public void setRatePerHr(String ratePerHr) {
		this.ratePerHr = ratePerHr;
	}
	/**
	 * @return the billingHrs
	 */
	public String getBillingHrs() {
		return billingHrs;
	}
	/**
	 * @param billingHrs the billingHrs to set
	 */
	public void setBillingHrs(String billingHrs) {
		this.billingHrs = billingHrs;
	}
	/**
	 * @return the billing
	 */
	public String getBilling() {
		return billing;
	}
	/**
	 * @param billing the billing to set
	 */
	public void setBilling(String billing) {
		this.billing = billing;
	}
	/**
	 * @return the leaveHrs
	 */
	public String getLeaveHrs() {
		return leaveHrs;
	}
	/**
	 * @param leaveHrs the leaveHrs to set
	 */
	public void setLeaveHrs(String leaveHrs) {
		this.leaveHrs = leaveHrs;
	}
	/**
	 * @return the leakageHrs
	 */
	public String getLeakageHrs() {
		return leakageHrs;
	}
	/**
	 * @param leakageHrs the leakageHrs to set
	 */
	public void setLeakageHrs(String leakageHrs) {
		this.leakageHrs = leakageHrs;
	}
	/**
	 * @return the comments
	 */
	public String getComments() {
		return comments;
	}
	/**
	 * @param comments the comments to set
	 */
	public void setComments(String comments) {
		this.comments = comments;
	}
}
