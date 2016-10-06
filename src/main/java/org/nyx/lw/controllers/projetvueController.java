/**
 * 
 */
package org.nyx.lw.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.nyx.lw.metier.ILendoWalletMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class projetvueController {
	@Autowired
	private ILendoWalletMetier metier;
	
	@RequestMapping (value="/projetvue",method = RequestMethod.GET)
	public String projetvue(HttpServletRequest request, HttpServletResponse response) {
		// Récupération du code du projet
				String codeP = request.getParameter("codeP");
				if(codeP!=null && !codeP.isEmpty()){
					/*
					 * on stocke le code du rojet dans une session
					 */
					HttpSession session = request.getSession();
					session.setAttribute("codeP", codeP);

					
					/*
					 * on retourne la page de paramétrage du projet
					 *
					 */
					return "projetvue";
					
				}else{
					return "error";
				}
	}

}
