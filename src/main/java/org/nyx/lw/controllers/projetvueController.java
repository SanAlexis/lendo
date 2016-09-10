/**
 * 
 */
package org.nyx.lw.controllers;

import org.nyx.lw.metier.ILendoWalletMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class projetvueController {
	@Autowired
	private ILendoWalletMetier metier;
	
	@RequestMapping (value="/projetvue")
	public String inscription() {
		return "projetvue";
	}

}
