/**
 * 
 */
package org.nyx.lw.controllers;

import java.io.IOException;

import javax.servlet.http.Cookie;
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
public class TestCookieController {
	@Autowired
	private ILendoWalletMetier metier;

	/*
	 * Fonction permettant de tester s'il y a des cookies valides dans le
	 * navigateur
	 */
	@RequestMapping(value = "/testcookie", method = RequestMethod.POST)
	public @ResponseBody
	String testcookie(HttpServletRequest request, HttpServletResponse response)
			throws JsonGenerationException, JsonMappingException, IOException {

		// on récupère le tableau des cookies
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			// s'il est vide on retourne null
			ObjectMapper objectMapper = new ObjectMapper();
			if (cookies.length >= 3) {
				/*
				 * on vérifie la taille du tableau si la taille est supérieure
				 * ou égale à 3
				 */
				for (int i = 0; i < cookies.length; i++) {
					/*
					 * on parcour le tableau à la recherche du cookie de
					 * l'adresse email
					 */
					if (cookies[i].getName().equals("_adresse_")) {
						/*
						 * sin on retrouve le cookie adresse email on parcour le
						 * tableau à la recherche du cookie du mot de passe
						 */
						for (int j = 0; j < cookies.length; j++) {
							if (cookies[j].getName().equals("_secret_p_")) {
								/*
								 * si on trouve le cookie du mot de passe on
								 * renvoit l'adresse email et le mot de passe au
								 * navigateur en veu de la connexion automatique
								 * de lutilisateur
								 */
								Cookie[] result = { cookies[i], cookies[j] };
								String json = objectMapper
										.writeValueAsString(result);
								return json;
							}
						}
						return null;
					}
				}
				return null;
			}
			return null;
		}
		return null;
	}
}
