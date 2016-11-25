/**
 * 
 */
package org.nyx.lw.controllers;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.nyx.lw.entities.Projet;
import org.nyx.lw.metier.ILendoWalletMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ParametrerProjetController {
	@Autowired
	private ILendoWalletMetier metier;

	@RequestMapping(value = "/parametrerprojet", method = RequestMethod.GET)
	String doPost(HttpServletRequest request, HttpServletResponse response)
			throws JsonGenerationException, JsonMappingException, IOException {
		// Récupération du code du projet
		String codeP = request.getParameter("codeP");
		if (codeP != null && !codeP.isEmpty()) {
			HttpSession session = request.getSession();

			Long codeU = (Long) session.getAttribute("codeU");
			List<Projet> projet = new LinkedList<Projet>();
			List<Projet> p = metier.getProjetUtilisateur(codeU);
			for (int i = 0; i < p.size(); i++) {
				if (p.get(i).getCodeProjet().equals(Long.parseLong(codeP))) {
					Projet test = new Projet();
					test.setCodeProjet(p.get(i).getCodeProjet());
					projet.add(test);
				}
			}
			if(projet.size()>0){
				/*
				 * on stocke le code du rojet dans une session
				 */
				session.setAttribute("codeP", codeP);
				/*
				 * on retourne la page de paramétrage du projet
				 *
				 */
				return "parametrerprojet";
			}else{
				return "error";
			}
		} else {
			return "error";
		}
	}
}
