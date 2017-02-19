package com.onlinetouch.users.entity;

import javax.persistence.Entity;
import javax.persistence.Transient;

@Entity
public class Bank extends PaymentMethod {
	private String nameOnAccount;
	private int bankRoutingNumber;//9 digit
	private String checkingAccountNumber;
	
	@Transient
	private String confirmCheckingAccountNumber;
	private String dirverLicenseNumber;
	private String state;
	public String getNameOnAccount() {
		return nameOnAccount;
	}
	public void setNameOnAccount(String nameOnAccount) {
		this.nameOnAccount = nameOnAccount;
	}
	public int getBankRoutingNumber() {
		return bankRoutingNumber;
	}
	public void setBankRoutingNumber(int bankRoutingNumber) {
		this.bankRoutingNumber = bankRoutingNumber;
	}
	public String getCheckingAccountNumber() {
		return checkingAccountNumber;
	}
	public void setCheckingAccountNumber(String checkingAccountNumber) {
		this.checkingAccountNumber = checkingAccountNumber;
	}
	public String getConfirmCheckingAccountNumber() {
		return confirmCheckingAccountNumber;
	}
	public void setConfirmCheckingAccountNumber(String confirmCheckingAccountNumber) {
		this.confirmCheckingAccountNumber = confirmCheckingAccountNumber;
	}
	public String getDirverLicenseNumber() {
		return dirverLicenseNumber;
	}
	public void setDirverLicenseNumber(String dirverLicenseNumber) {
		this.dirverLicenseNumber = dirverLicenseNumber;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}
