package com.example.CheckoutPayment;

import com.stripe.Stripe;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class CheckoutPaymentApplication {


	@PostConstruct
	public void setup(){
		Stripe.apiKey = "sk_test_51NVGs1EbfNNCh3CajK5X5t9F3ucYvq8Zg1f2YgdP7Lxkz0WbzePBO43lIZ0kbbDZvlU6L2BtRPDhZkzGLVw3FeyN00L9sFeBcs";
	}
	public static void main(String[] args) {
		try {
			SpringApplication.run(CheckoutPaymentApplication.class, args);
		}catch (Exception e){
			System.out.println(e);
			e.printStackTrace();
		}

	}

}
