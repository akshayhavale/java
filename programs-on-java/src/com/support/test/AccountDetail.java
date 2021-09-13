package com.support.test;

public class AccountDetail {

	private String acctNum;
	private String acctType;
	private String acctSubType;

	public String getAcctNum() {
		return acctNum;
	}

	public void setAcctNum(String acctNum) {
		this.acctNum = acctNum;
	}

	public String getAcctType() {
		return acctType;
	}

	public void setAcctType(String acctType) {
		this.acctType = acctType;
	}

	public String getAcctSubType() {
		return acctSubType;
	}

	public void setAcctSubType(String acctSubType) {
		this.acctSubType = acctSubType;
	}

	@Override
	public String toString() {
		return "AccountDetail [acctNum=" + acctNum + ", acctType=" + acctType + ", acctSubType=" + acctSubType + "]";
	}

}
