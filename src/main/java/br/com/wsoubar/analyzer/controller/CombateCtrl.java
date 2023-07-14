package br.com.wsoubar.analyzer.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("api/combate-rest")
public class CombateCtrl {

	@GetMapping(path = "/ping")
	public Map ping() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("ping", "Funcionou");
		return map;
	}
	
}
