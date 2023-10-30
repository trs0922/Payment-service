package com.training.application.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;
@ToString
@Data
@Entity
@Table(name = "payment-details",schema = "payment-service")
public class PaymentEntity {
	@Id
	@Column(name = "Id")
	int id;
	
	@Column(name = "cardType")
	String cardType;
	
	@Column(name = "cardHolderName")
	String cardHolderName;
	
	@Column(name = "cardNumber")
	String cardNumber;
	
	@Column(name = "cvcNumber")
	String cvcNumber;
	
	@Column(name = "expireDate")
	String expireDate;
	
	@Column(name = "amount")
	double amount;
	
	@Column(name = "createdTime")
	Timestamp createdTime;
   
    @Column(name = "updatedTime")
	Timestamp updatedTime;
    
    @Column(name = "createdBy")
	String createdBy;
    
    @Column(name = "updatedBy")
	String updatedBy;
    
    @Column(name = "referenceNumber")
	int referenceNumber;
 }