package com.codebaithak.youtube.baithak_1;

import org.springframework.stereotype.Component;

//@Component
public class StripePaymentService implements PaymentSerivice {
    @Override
    public String payment(){
        String payment = "Stripe Payment-1";
        System.out.println("Payment is done via: ");
        return payment;
    }
}
