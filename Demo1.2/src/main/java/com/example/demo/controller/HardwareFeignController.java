package com.example.demo.controller;

import java.net.URISyntaxException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.HardwareVo;
import com.example.demo.service.HardwareService;

@RestController
@RequestMapping
public class HardwareFeignController {
	
	//@Autowired
	//private HardwareFeignInterface hardwarefeigninterface;
	@Autowired
	private HardwareService hardwareservice;
	
	@GetMapping("/feignhardware")
	public ResponseEntity<List<HardwareVo>> getAllHardwareVo()
	{
		//HardwareVo[] hardware = hardwarefeigninterface.getAllHardwareVo();
		return new ResponseEntity(hardwareservice.getAllHardwareVo(),HttpStatus.OK);
		
	}
	
	
	@GetMapping("/gethardware")
	public ResponseEntity<HardwareVo[]> getHardwarebyRT()
	{
		
		return new ResponseEntity(hardwareservice.getHardwarebyRT(),HttpStatus.OK);
		
	}

}
