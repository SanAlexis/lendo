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
import org.nyx.lw.metier.ILendoWalletMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class decouvrirController {
	@Autowired
	private ILendoWalletMetier metier;	
	
	@RequestMapping (value="/decouvrir",method = RequestMethod.GET)
	String decouvrir(HttpServletRequest request, HttpServletResponse response)
			throws JsonGenerationException, JsonMappingException, IOException {
		// Récupération du code du projet
		String codecat = request.getParameter("cat");
		if(codecat!=null && !codecat.isEmpty()){
			/*
			 * on stocke le code de la categorie dans une session
			 */
			HttpSession session = request.getSession();
			session.setAttribute("codecat", codecat);
			
		}
		
		return "decouvrir";
	}

}
