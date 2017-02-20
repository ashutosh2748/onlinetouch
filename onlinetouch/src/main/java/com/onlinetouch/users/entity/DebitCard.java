package com.onlinetouch.users.entity;

import javax.persistence.Entity;

import com.onlinetouch.users.enumtype.CardType;

@Entity
public class DebitCard extends Card {
	DebitCard(){
		super(CardType.DEBIT);
	}
}
