package com.example.demo.service;

import java.util.List;



import com.example.demo.model.HardwareVo;

public interface HardwareService {
	public List<HardwareVo> getAllHardwareVo();
	public HardwareVo[] getHardwarebyRT();
}
