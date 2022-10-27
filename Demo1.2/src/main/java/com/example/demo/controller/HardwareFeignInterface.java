package com.example.demo.controller;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.HardwareVo;

@FeignClient(value="feignhardwaredemo", url="http://localhost:8080/demo1/hardware/")
public interface HardwareFeignInterface {

	@GetMapping("/")
	public List<HardwareVo> getAllHardwareVo();
}
