package com.allocations.util;

public class MyAllocationConstants {

	public static final String ALLOCATION_QUERY = "SELECT EMP_ID, EMP_NAME, PORTFOLIO, PROJECT,"
			+ " TYPE_LD_SR, RATE_PER_HR, BILLING_HRS, BILLING, LEAVE_HRS,"
			+ " LEAKAGE_HRS, COMMENTS FROM MYALLOCATION.ALLOCATIONS WHERE EMPROLE = :empId ";
}
