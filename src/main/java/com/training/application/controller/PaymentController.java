package com.training.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.training.application.domain.Payment;
import com.training.application.domain.Card;
import com.training.application.service.PaymentService;


@RestController
public class PaymentController {
	@Autowired
	PaymentService paymentService;
	
    @RequestMapping(value = "/payment-service/make-payment", method = RequestMethod.POST)
    public ResponseEntity makePayment(@RequestBody Payment payment,Card card) {
        System.out.println("am in make payment method:" + payment);
        paymentService.makePayment(payment,card);
        return null;

    }


}