package com.training.application.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.application.domain.Card;
import com.training.application.domain.Payment;
import com.training.application.entity.PaymentEntity;
import com.training.application.repository.PaymentRepository;

@Service
public class PaymentService {
	@Autowired
	PaymentRepository paymentRepository;
	public void makePayment(Payment payment,Card card) {
		String cardNumber = card.getCardNumber();
		String cvcNumber = card.getCvcNumber();
		int amount = payment.getAmount();
		String expireDate = card.getExpireDate();
		if (expireDate == null || expireDate.trim().isEmpty()) {
            System.out.println("Invalid input. Please enter a non-empty date.");
            return;
        }
		SimpleDateFormat sdf = new SimpleDateFormat("mm/dd/yyyy");
		Date ed = null;
		try {
            ed = sdf.parse(expireDate);
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please enter the date in mm/dd/yyyy format.");
            return;
        }
		Date currentDate = new Date();
	    int compareDate = currentDate.compareTo(ed);
		
       
		
		if((cardNumber.matches("\\d{16}")) && (cvcNumber.matches("\\d{3}")) && amount > 0 && compareDate < 0) {
			
			System.out.println("Valid card");
			PaymentEntity paymentEntity = new PaymentEntity();
		     paymentEntity.setId(payment.getId());
		     paymentEntity.setCardType(card.getCardType());
		     paymentEntity.setCardHolderName(card.getCardHolderName());
		     paymentEntity.setCardNumber(card.getCardNumber());
		     paymentEntity.setExpireDate(card.getExpireDate());
		     paymentEntity.setAmount(payment.getAmount());
		     paymentEntity.setReferenceNumber(payment.getReferenceNumber());
		     paymentEntity.setCreatedBy(payment.getName());
		     paymentEntity.setUpdatedBy(payment.getName());
		     paymentEntity.setCreatedTime(null);
		     paymentEntity.setUpdatedTime(null);
		     
		     paymentRepository.save(paymentEntity);
		     
		     System.out.println("Payment is done");
		}else {
			System.out.println("Invalid input,Please give valid input");
			throw new InputMismatchException();
			}
	}

}
