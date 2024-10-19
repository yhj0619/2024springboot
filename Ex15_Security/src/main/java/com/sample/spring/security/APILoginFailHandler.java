package com.sample.spring.security;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

import com.google.gson.Gson;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class APILoginFailHandler implements AuthenticationFailureHandler{

	@Override
	public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException exception) throws IOException, ServletException {
		// TODO Auto-generated method stub
		log.info("-----------------------");
		log.info("----login failure----");
		log.info("-----------------------" + exception);

		Gson gson = new Gson();
		
		String jsonStr = gson.toJson(Map.of("error","ERROR_LOGIN"));
		response.setContentType("application/json;charset=utf-8");
		
		PrintWriter printWriter = response.getWriter();
		printWriter.print(jsonStr);
		printWriter.close();
	}

}
