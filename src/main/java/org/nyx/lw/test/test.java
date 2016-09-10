package org.nyx.lw.test;

import org.nyx.lw.entities.Categorie;
import org.nyx.lw.metier.ILendoWalletMetier;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args){
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
		ILendoWalletMetier metier=(ILendoWalletMetier)context.getBean("metier");
		metier.creerCategorie(new Categorie("categorieText"));
	}
}
