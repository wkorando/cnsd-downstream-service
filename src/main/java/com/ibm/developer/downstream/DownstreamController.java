package com.ibm.developer.downstream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/downstream")
public class DownstreamController {
	private static final Logger LOGGER = LoggerFactory.getLogger(DownstreamController.class);
	

	@GetMapping
	public ResponseEntity<String> sendMessages() {
		LOGGER.info("Getting a downstream message");
		return ResponseEntity.ok("");
	}
}
