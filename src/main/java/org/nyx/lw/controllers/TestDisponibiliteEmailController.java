package org.nyx.lw.controllers;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.nyx.lw.metier.ILendoWalletMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping (value="/testdiponibiliteemail")
public class TestDisponibiliteEmailController {
	
	@Autowired
	private ILendoWalletMetier metier;
	
	@RequestMapping (method=RequestMethod.POST)
	@ResponseBody
	
	public String doPost(HttpServletRequest request, HttpServletResponse response) throws JsonGenerationException, JsonMappingException, IOException{
		
		String email = request.getParameter("email");
		boolean user = metier.checkEmail(email);
		ObjectMapper objectMapper = new ObjectMapper();
		// transformation de l'objet java en json
		String json = objectMapper.writeValueAsString(user);
		return json;
	}

}
