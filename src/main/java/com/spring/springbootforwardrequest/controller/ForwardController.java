package com.spring.springbootforwardrequest.controller;

import com.spring.springbootforwardrequest.dto.ResponseDTO;
import com.spring.springbootforwardrequest.service.ForwardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.lang.invoke.MethodHandles;

@RestController
public class ForwardController {

	private final static Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

	private final ForwardService forwardService;

	public ForwardController(ForwardService forwardService) {
		this.forwardService = forwardService;
	}

	@RequestMapping("/**")
	public ResponseDTO forwardRest(
			HttpServletRequest request,
			HttpMethod method,
			@RequestBody String body) {

		ResponseDTO responseDTO = new ResponseDTO();

		try {
			LOGGER.info("\n---------Request body---------\n{}", body);
			responseDTO = this.forwardService.process(request, method, body);
		} catch (Exception e) {
			e.printStackTrace();
			responseDTO.setStatus("F");
			responseDTO.setMessage("Request fail!");
		}
		return responseDTO;
	}
}
