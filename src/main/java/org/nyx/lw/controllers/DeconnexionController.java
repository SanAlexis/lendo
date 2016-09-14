/**
 * 
 */
package org.nyx.lw.controllers;

import java.io.IOException;

import javax.servlet.http.Cookie;
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
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DeconnexionController {
	@Autowired
	private ILendoWalletMetier metier;
	
	
	@RequestMapping (value="/deconnexion",method = RequestMethod.POST)
	public @ResponseBody void deconnexion(HttpServletRequest request, HttpServletResponse responsel) throws JsonGenerationException, JsonMappingException, IOException {
		
		/*
		 * on supprime la session
		 */
		HttpSession session = request.getSession();
		session.invalidate();
		//creation du cookie contenant l'adresse email
		Cookie adresse = new Cookie("_adresse_", "");
		//suppression du coockie
		adresse.setMaxAge(-25920000);
		//création du cookie contenant le mot de passe
		Cookie pass = new Cookie("_secret_p_","");
		//suppression du coockie
		pass.setMaxAge(-25920000);
		//envoi des cookies au navigateur
		responsel.addCookie(adresse);
		responsel.addCookie(pass);
		return ;

	}
	
}
