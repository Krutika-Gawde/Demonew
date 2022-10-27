package com.example.demo.service;

import java.util.List;

import com.example.demo.bo.HardwareBo;
import com.example.demo.model.HardwareVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class HardwareServiceImpl implements HardwareService {

	@Autowired
	private HardwareBo hardwarebo;
	
	@Override
	public List<HardwareVo> getAllHardwareVo() {
		// TODO Auto-generated method stub
		List<HardwareVo> hardware = hardwarebo.getAllHardwareVo();
		return hardware;
	}

	@Override
	public HardwareVo[] getHardwarebyRT() {
		// TODO Auto-generated method stub
		return hardwarebo.getHardwarebyRT();
	}

}
