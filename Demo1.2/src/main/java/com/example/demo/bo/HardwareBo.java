package com.example.demo.bo;

import java.util.List;

import org.springframework.web.client.RestTemplate;

import com.example.demo.model.HardwareVo;



public interface HardwareBo {
	public List<HardwareVo> getAllHardwareVo();
	public HardwareVo[] getHardwarebyRT();
}
