package com.movie.ticket.booking.system.payment.service.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/payments")
@Slf4j
public class PaymentAPI {

    @GetMapping
    public String test () {
        log.info("Entered into Payment API controller");
        return "Payment Successfull";
    }
}
