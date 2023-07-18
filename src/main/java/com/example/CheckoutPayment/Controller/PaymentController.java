package com.example.CheckoutPayment.Controller;

import com.example.CheckoutPayment.DTO.CreatePayment;
import com.example.CheckoutPayment.DTO.PaymentResponse;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;
import com.stripe.param.PaymentIntentCreateParams;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    @PostMapping("/create-payment-intent")
    public PaymentResponse paymentPost(@RequestBody CreatePayment createPayment) throws StripeException {
            PaymentIntentCreateParams params =
                    PaymentIntentCreateParams.builder()
                            .setAmount(15 * 100L)
                            .setCurrency("usd")
                            .build();
            PaymentIntent paymentIntent = PaymentIntent.create(params);
            PaymentResponse paymentResponse = new PaymentResponse(paymentIntent.getClientSecret());

            return paymentResponse;
    }

}
