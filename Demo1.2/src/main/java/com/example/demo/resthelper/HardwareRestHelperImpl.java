package com.example.demo.resthelper;

import org.springframework.web.client.RestTemplate;

import com.example.demo.model.HardwareVo;

import java.util.List;

import org.springframework.stereotype.Component;


@Component
public class HardwareRestHelperImpl implements HardwareRestHelper{

	@Override
	public RestTemplate getHardwarebyRT() {
		// TODO Auto-generated method stub
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate;
	}

	

}
