package com.onlinetouch.users.entity;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import com.onlinetouch.users.enumtype.CardType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Card extends PaymentMethod {
	private CardType carType;
	private String nameOnCard;
	private String cardNumber;
	private int CVC;
	private int expiryMonth;
	private int expiryYear;
	
	Card(){}
	
	Card(CardType cardType){
		this.carType = cardType;
	}
	
	public CardType getCarType() {
		return carType;
	}

	public void setCarType(CardType carType) {
		this.carType = carType;
	}

	public String getNameOnCard() {
		return nameOnCard;
	}

	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public int getCVC() {
		return CVC;
	}

	public void setCVC(int cVC) {
		CVC = cVC;
	}

	public int getExpiryMonth() {
		return expiryMonth;
	}

	public void setExpiryMonth(int expiryMonth) {
		this.expiryMonth = expiryMonth;
	}

	public int getExpiryYear() {
		return expiryYear;
	}

	public void setExpiryYear(int expiryYear) {
		this.expiryYear = expiryYear;
	}
}
