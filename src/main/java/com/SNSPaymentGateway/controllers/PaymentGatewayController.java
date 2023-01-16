package com.SNSPaymentGateway.controllers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentGatewayController {

	private Logger logger = LogManager.getLogger(PaymentGatewayController.class);

	@PostMapping(value = "/new", consumes = { MediaType.TEXT_PLAIN_VALUE })
	public void newPAyment(@RequestBody String inputString) {
		logger.info("INput message recieved is ", inputString);
		System.err.println("================="+inputString);

	}

}
