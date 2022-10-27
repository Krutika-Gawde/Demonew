package com.example.demo.eo;

import java.util.List;

import org.springframework.web.client.RestTemplate;

import com.example.demo.model.HardwareVo;



public interface HardwareEo {
	public List<HardwareVo> getAllHardwareVo();
	public RestTemplate getHardwarebyRT();
}
