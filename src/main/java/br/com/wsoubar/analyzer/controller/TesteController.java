package br.com.wsoubar.analyzer.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TesteController {

	Logger logger = LogManager.getLogger(TesteController.class);

	public TesteController() {
	}
	
	@GetMapping("/ping")
	public Map<String, String> ping() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("nome", "Wagner");
		
		logger.trace("trace ping");
		logger.info("info ping");
		
		return map;
	}
	@GetMapping("/isAlive")
	public String isAlive() {
//		Map<String, String> map = new HashMap<String, String>();
//		map.put("nome", "Wagner");
		return "This application is alive";
	}
	
	
	
}
