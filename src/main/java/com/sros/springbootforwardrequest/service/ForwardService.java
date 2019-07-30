package com.sros.springbootforwardrequest.service;

import com.sros.springbootforwardrequest.dto.ResponseDTO;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

@Service
public class ForwardService {

	public ResponseDTO process(
			HttpServletRequest request,
			HttpMethod httpMethod, String body)
			throws URISyntaxException, IOException {

		String server = "localhost";
		int port = 8080;
		String scheme = "http";

		//get body via HttpServletRequest
		//String body = request.getReader().lines().collect(Collectors.joining(System.lineSeparator()));

		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		//set credential
		/*if (request.getHeader("client_id") != null
				&& !request.getHeader("client_id").isEmpty()) {

			headers.add("client_id", "****************");
		}
		...
		*/

		URI uri = new URI(
				scheme,
				null,
				server,
				port,
				request.getRequestURI(),
				request.getQueryString(),
				null);

		ResponseEntity<ResponseDTO> responseEntity = restTemplate.exchange(
				uri,
				httpMethod,
				new HttpEntity<>(body, headers),
				ResponseDTO.class);

		return responseEntity.getBody();
	}

}


