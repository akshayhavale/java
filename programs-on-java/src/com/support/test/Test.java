package com.support.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {

		Map<String, AccountDetail> acctByNum = getAccounts().stream().map(Account::getAccountDetails)
				.map(AccountDetails::getAccountDetail).filter(acct -> acct.getAcctNum() != null).map(acct -> {
					if (acct.getAcctSubType().equalsIgnoreCase("Defined Benefits")) {
						acct.setAcctNum(acct.getAcctNum() + "clientId" + "header");
					} else if (acct.getAcctSubType().equalsIgnoreCase("Defined Contributions")) {
						acct.setAcctNum(acct.getAcctNum() + "header");
					}
					return acct;

				})
				.collect(Collectors.toMap(
						acct -> customHashKey(acct.getAcctNum(), acct.getAcctType(), acct.getAcctSubType()),
						acct -> acct, (acct, acct1) -> acct));

		/**
		 * Test
		 */
		acctByNum.entrySet().stream()
				.forEach(acct -> System.out.println("Key = " + acct.getKey() + "  " + " Value = " + acct.getValue()));

	}

	private static List<Account> getAccounts() {
		/*
		 * Test data 1
		 */
		List<Account> accounts = new ArrayList<>();

		AccountDetail accountDetail1 = new AccountDetail();
		accountDetail1.setAcctNum("123");
		accountDetail1.setAcctType("Equity");
		accountDetail1.setAcctSubType("subType1");

		AccountDetails accountDetails1 = new AccountDetails();
		accountDetails1.setAccountDetail(accountDetail1);

		Account account1 = new Account();
		account1.setAccountDetails(accountDetails1);

		accounts.add(account1);

		AccountDetail accountDetail2 = new AccountDetail();
		accountDetail2.setAcctNum("123");
		accountDetail2.setAcctType("Equity");
		accountDetail2.setAcctSubType("subType2");

		AccountDetails accountDetails2 = new AccountDetails();
		accountDetails2.setAccountDetail(accountDetail2);

		Account account2 = new Account();
		account2.setAccountDetails(accountDetails2);

		accounts.add(account2);

		return accounts;

	}

	private static String customHashKey(String acctNum, String acctType, String acctSubType) {
		if (acctSubType.isEmpty() || acctSubType == null) {
			return acctType != null ? new StringBuilder().append(acctNum).append(acctType).toString() : acctNum;
		} else {
			return acctType != null
					? new StringBuilder().append(acctNum).append(acctType).append(acctSubType).toString()
					: new StringBuilder().append(acctNum).append(acctSubType).toString();
		}
	}

}
