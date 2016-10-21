/**
 * 
 */
package org.nyx.lw.controllers;

import java.io.IOException;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.nyx.lw.entities.Commentaire;
import org.nyx.lw.entities.Dette;
import org.nyx.lw.entities.Don;
import org.nyx.lw.entities.Projet;
import org.nyx.lw.entities.Utilisateur;
import org.nyx.lw.metier.ILendoWalletMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class walletController {
	@Autowired
	private ILendoWalletMetier metier;
	
	@RequestMapping(value = "/walletcontribuerprojet",method = RequestMethod.POST)
	//@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody
	String walletcontribuerprojet(HttpServletRequest request, HttpServletResponse response)
			throws JsonGenerationException, JsonMappingException, IOException {
		// Récupération du code de l'utilisateur
		long code_projet = Long.parseLong(request.getParameter("codep"));
		double montant = Double.parseDouble(request.getParameter("montant"));
		
		Date dateversement = new Date();
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		HttpSession session = request.getSession();
		long codU=(Long) session.getAttribute("codeU");
		
		Utilisateur user = new Utilisateur();
		user.setCodeUtilisateur(codU);
		
		Projet p = new Projet();
		p.setCodeProjet(code_projet);
		
		if(metier.isFlexible(p)){
			Don contribution = new Don();
			contribution.setMontant(montant);
			contribution.setDateVersement(dateversement);
			
			Projet contribuer = metier.faireDon(p, contribution, user);
			
			// transformation de l'objet java en json
						String json = objectMapper.writeValueAsString(contribuer);
						return json;
			
		}else{
			Dette contribution = new Dette();
			contribution.setMontant(montant);
			contribution.setDateVersement(dateversement);
			
			Projet contribuer = metier.faireDette(p, contribution, user);
			
			// transformation de l'objet java en json
			String json = objectMapper.writeValueAsString(contribuer);
			return json;
		}		
	}

}
