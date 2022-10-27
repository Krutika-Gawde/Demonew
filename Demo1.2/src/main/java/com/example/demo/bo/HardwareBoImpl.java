package com.example.demo.bo;

import java.util.List;

import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.controller.HardwareFeignInterface;
import com.example.demo.eo.HardwareEo;
import com.example.demo.model.HardwareVo;
import org.springframework.stereotype.Service;
@Service
public class HardwareBoImpl implements HardwareBo {

	@Autowired
	public HardwareFeignInterface feignhardwaredemo;
	@Autowired
	public HardwareEo hardwareeo;
	
	
	
	@Override
	public List<HardwareVo> getAllHardwareVo() {
		// TODO Auto-generated method stub
		List<HardwareVo> hardware = feignhardwaredemo.getAllHardwareVo();
		return hardware;
	}

	@Override
	public HardwareVo[] getHardwarebyRT() {
		// TODO Auto-generated method stub
		RestTemplate restTemplate=hardwareeo.getHardwarebyRT();
		return restTemplate.getForObject("http://localhost:8080/demo1/hardware/", HardwareVo[].class);
	}

}
