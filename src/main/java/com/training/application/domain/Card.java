package com.training.application.domain;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Data
@NoArgsConstructor
public class Card {
	String cardType;
    String cardHolderName;
    String cardNumber;
    String cvcNumber;
    String expireDate;
}
