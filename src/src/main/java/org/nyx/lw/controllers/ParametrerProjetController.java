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
public class ParametrerProjetController {
	@Autowired
	private ILendoWalletMetier metier;
	
	@RequestMapping (value="/parametrerprojet",method = RequestMethod.GET)
	String doPost(HttpServletRequest request, HttpServletResponse response)
			throws JsonGenerationException, JsonMappingException, IOException {
		// Récupération du code du projet
		String codeP = request.getParameter("codeP");
		if(codeP.isEmpty()){
			return "error";
		}else{
			/*
			 * on stocke le code du rojet dans une session
			 */
			HttpSession session = request.getSession();
			session.setAttribute("codeP", codeP);

			
			/*
			 * on retourne la page de paramétrage du projet
			 *
			 */
			return "parametrerprojet";
		}
		
		
		

	}


}
