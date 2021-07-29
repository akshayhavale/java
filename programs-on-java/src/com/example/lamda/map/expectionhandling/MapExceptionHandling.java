package com.example.lamda.map.expectionhandling;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapExceptionHandling {

	public static void main(String[] args) {

		Map<String, AccountDetail> accountByNum = getAccounts().stream().filter(acct -> acct.getAccountNumber() != null)
				.collect(Collectors.toMap(acct -> acct.getAccountNumber(), acct -> acct,(acct,acct1)->{
					System.out.println("Duplicate Account Found");
					return acct1;
				}));
		
		
		accountByNum.entrySet().stream().forEach(System.out::println);

	}

	public static List<AccountDetail> getAccounts() {
		return Arrays.asList(new AccountDetail("123", "current"), new AccountDetail("123", "savings"));
	}

}

class Account {

	private List<AccountDetail> accountDetials;

	public Account(List<AccountDetail> accountDetials) {
		super();
		this.accountDetials = accountDetials;
	}

	public List<AccountDetail> getAccountDetials() {
		return accountDetials;
	}

	public void setAccountDetials(List<AccountDetail> accountDetials) {
		this.accountDetials = accountDetials;
	}

}

class AccountDetail {
	private String accountNumber;
	private String accountType;

	public AccountDetail(String accountNumber, String accountType) {
		super();
		this.accountNumber = accountNumber;
		this.accountType = accountType;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	@Override
	public String toString() {
		return "AccountDetail [accountNumber=" + accountNumber + ", accountType=" + accountType + "]";
	}
	

}