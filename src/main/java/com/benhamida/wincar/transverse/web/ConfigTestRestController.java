package com.benhamida.wincar.transverse.web;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.benhamida.wincar.transverse.config.GlobalConfig;

@RestController
@RefreshScope
public class ConfigTestRestController {
	
	@Autowired
	private GlobalConfig globalConfig;

	@Value("${collaborateur.params.x}")
	private int collaboraterX;

	@Value("${collaborateur.params.y}")
	private int collaboraterY;

	@Value("${global.params.x}")
	private int x;

	@Value("${global.params.y}")
	private int y;

	@GetMapping("/testConfig")
	public Map<String, Integer> configTest() {

		return Map.of("collaboraterX :", collaboraterX, "collaboraterY :", collaboraterX, "x :", x, "y :", y);

	}
	
	@GetMapping("/globalConfig")
	public GlobalConfig globalConfig() {
		 return globalConfig;
		
	}

}
