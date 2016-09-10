package org.nyx.lw.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
	
	public String doPost(HttpServletRequest request, HttpServletResponse response){
		
		String email = request.getParameter("email");
		String user = metier.checkEmail(email);
		return user;
	}

}
