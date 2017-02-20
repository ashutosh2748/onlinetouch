package com.onlinetouch.users.entity;

import javax.persistence.Entity;

import com.onlinetouch.users.enumtype.CardType;

@Entity
public class CreditCard extends Card {
	CreditCard(){
		super(CardType.CREDIT);
	}
}
