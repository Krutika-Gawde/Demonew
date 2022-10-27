package com.example.demo.eo;

import java.util.List;

import com.example.demo.model.HardwareVo;
import com.example.demo.resthelper.HardwareRestHelper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import org.springframework.stereotype.Component;

@Component
public class HardwareEoImpl implements HardwareEo {
@Autowired 
HardwareRestHelper hardwareresthelper ;
	@Override
	public List<HardwareVo> getAllHardwareVo() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public RestTemplate getHardwarebyRT() {
		// TODO Auto-generated method stub
		return hardwareresthelper.getHardwarebyRT();
	}
	
	

}
