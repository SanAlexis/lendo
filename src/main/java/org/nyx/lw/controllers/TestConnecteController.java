/**
 * 
 */
package org.nyx.lw.controllers;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
public class TestConnecteController {
	@Autowired
	private ILendoWalletMetier metier;
	
	
	/*
	 * Fonction permettant de tester s'il y a une session en cours dans le navigateur
	 */
	@RequestMapping (value="/testconnecte",method = RequestMethod.POST)
	public @ResponseBody
	String testconnecte(HttpServletRequest request, HttpServletResponse response) throws JsonGenerationException, JsonMappingException, IOException{
	
		/*
		 * on stocke l'adresse email de l'utilisateur dans une variable de session
		 */
		HttpSession session = request.getSession();
		Object connecte= session.getAttribute("codeU");
		ObjectMapper objectMapper = new ObjectMapper();
		// transformation de l'objet java en json
		String json = objectMapper.writeValueAsString(connecte);
		return json;
	}

}
