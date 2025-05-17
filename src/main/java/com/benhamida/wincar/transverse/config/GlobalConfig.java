package com.benhamida.wincar.transverse.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ConfigurationProperties(prefix = "global.params")
@RefreshScope
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GlobalConfig {
	
	private int x;
	
	private int y;
}
