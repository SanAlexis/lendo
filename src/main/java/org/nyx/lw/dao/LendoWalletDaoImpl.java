package org.nyx.lw.dao;

import java.util.List;

import javax.annotation.Resource;
import javax.annotation.Resources;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.nyx.lw.entities.ActiviteProfessionel;
import org.nyx.lw.entities.Categorie;
import org.nyx.lw.entities.Commentaire;
import org.nyx.lw.entities.Contribution;
import org.nyx.lw.entities.Dette;
import org.nyx.lw.entities.Don;
import org.nyx.lw.entities.LendoProjet;
import org.nyx.lw.entities.LendoUtilisateur;
import org.nyx.lw.entities.LendoWallet;
import org.nyx.lw.entities.Media;
import org.nyx.lw.entities.Motivation;
import org.nyx.lw.entities.Operateur;
import org.nyx.lw.entities.Operation;
import org.nyx.lw.entities.Projet;
import org.nyx.lw.entities.ProjetBusiness;
import org.nyx.lw.entities.ProjetFlexible;
import org.nyx.lw.entities.SecteurActivite;
import org.nyx.lw.entities.SecteurGeographique;
import org.nyx.lw.entities.TypeMedia;
import org.nyx.lw.entities.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("ILendoWalletDao")
public class LendoWalletDaoImpl implements ILendoWalletDao{
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Utilisateur editUtilisateur (Utilisateur u) {
			em.merge(u);
		  return u;
	}
	
	@Override
	public Utilisateur deleteUtilisateur (Utilisateur u) {
		List<Projet> projets=null;
		List<Commentaire> commentaires=null;
		projets=getProjetUtilisateur(u.getCodeUtilisateur());
		commentaires=getCommentaireProjet(u.getCodeUtilisateur());
		
		if ((projets != null) && (projets.size() > 0)) {
		for(Projet m:projets){
			deleteProjet(m);
		}
		}
		
		if ((commentaires != null) && (commentaires.size() > 0)) {
			for(Commentaire m:commentaires){
				deleteCommentaire(m);
			}
			}
		em.remove(em.contains(u) ? u : em.merge(u));
		return null;
	}
	
	@Override
	public Utilisateur addUtilisateur(Utilisateur u) {
		em.persist(u);
		return u;
	}
	@Override
	public Projet addProjet(Projet p) {
		em.persist(p);
		return p;
	}

	@Override
	public Commentaire addCommentaire(Commentaire c) {
		em.persist(c);
		return c;
	}

	@Override
	public Contribution addContribution(Contribution c) {
		em.persist(c);
		return c;
	}

	@Override
	public LendoWallet addLendowallet(LendoWallet lw) {
		em.persist(lw);
		return lw;
	}

	@Override
	public Media addMedia(Media m) {
		em.persist(m);
		return m;
	}
	@Override
	public Media addMediaProjet(Media m, Long codeProjet) {
		Projet p=consulterProjet(codeProjet);
		m.setProjet(p);
		em.persist(m);
		return m;
	}

	@Override
	public Motivation addMotivation(Motivation m) {
		em.persist(m);
		return m;
	}

	@Override
	public Operation addOperation(Operation op) {
		em.persist(op);
		return op;
	}

	@Override
	public TypeMedia addTypeMedia(TypeMedia tm) {
		em.persist(tm);
		return tm;
	}

	@Override
	public Categorie addCategorie(Categorie c) {
		em.persist(c);
		return c;
	}

	@Override
	public SecteurGeographique addSecteurGeo(SecteurGeographique sg) {
		em.persist(sg);
		return sg;
	}

	@Override
	public ActiviteProfessionel addActivitePro(ActiviteProfessionel ap) {
		em.persist(ap);
		return ap;
	}

	@Override
	public SecteurActivite addSecteurActivite(SecteurActivite sa) {
		em.persist(sa);
		return sa;
	}

	@Override
	public Projet consulterProjet(Long codeProjet) {
		Projet pj=em.find(Projet.class, codeProjet);
		if(pj==null) throw new RuntimeException("Projet introuvalbe");
		return pj;

	}

	@Override
	public Utilisateur consulterUtilisateur(Long codeU) {
		Utilisateur us=em.find(Utilisateur.class, codeU);
		if(us==null) throw new RuntimeException("Utilisateur introuvalbe");
		return us;
	}

	@Override
	public LendoWallet consulterCompte(Long numeroC) {
		LendoWallet lw=em.find(LendoWallet.class, numeroC);
		if(lw==null) throw new RuntimeException("Compte Lendo introuvalbe");
		return lw;
	}

	@Override
	public List<Projet> consulterProjets(String titre) {
		Query req=em.createQuery("select c from Projet c where c.titre like :x");
		req.setParameter("x", "%"+titre+"%");
		return req.getResultList();
	}


	@Override
	public List<Operation> getOperationByLendoWallet(Long numeroLendo) {
		Query req=em.createQuery("select c from Operation c where c.LendoWallet.numeroCompte=:x");
		req.setParameter("x",numeroLendo);
		return req.getResultList();
	}

	@Override
	public List<ActiviteProfessionel> getActiviteProByUtilisateur(Long codeU) {
		Query req=em.createQuery("select c from ActiviteProfessionel c where c.Utilisateur.codeUtilisateur=:x");
		req.setParameter("x",codeU);
		return req.getResultList();
	}

	@Override
	public List<Projet> getProjetByCategorie(Long codeCat) {
		Query req=em.createQuery("select c from Projet c where c.categorie.codeCategorie=:x");
		req.setParameter("x",codeCat);
		return req.getResultList();
	}

	@Override
	public List<Media> getMediaByProject(Long codeProjet) {
		Query req=em.createQuery("select c from Media c where c.projet.codeProjet=:x");
		req.setParameter("x",codeProjet);
		return req.getResultList();
	}

	@Override
	public List<Categorie> getCaterogie() {
		// TODO Auto-generated method stub
		Query req=em.createQuery("select e from Categorie e");
		return req.getResultList();
	}

	@Override
	public List<Media> addMediaToProject(Long codeM,Long codeP) {
		Media m=em.find(Media.class, codeM);
		Projet p=em.find(Projet.class, codeP);
		p.getMedias().add(m);
		return p.getMedias();
	}

	@Override
	public Operateur addOperateur(Operateur op) {
		em.persist(op);
		return op;
	}

	@Override
	public Operateur consulterOperateur(Long codeOperateur) {
		Operateur op=em.find(Operateur.class, codeOperateur);
		if(op==null) throw new RuntimeException("Operateur introuvalbe");
		return op;
	}

	@Override
	public Motivation consulterMotivation(Long codeMotivation) {
		Motivation mt=em.find(Motivation.class, codeMotivation);
		if(mt==null) throw new RuntimeException("Operateur introuvalbe");
		return mt;
	}
	
	@Override
	public ActiviteProfessionel consulterActivitePro(Long codeAct) {
		ActiviteProfessionel mt=em.find(ActiviteProfessionel.class, codeAct);
		if(mt==null) throw new RuntimeException("activite Pro introuvalbe");
		return mt;
	}


	@Override
	public Categorie consulterCategorie(Long codeCat) {
		Categorie cat=em.find(Categorie.class, codeCat);
		if(cat==null) throw new RuntimeException("Categorie introuvalbe");
		return cat;
	}

	@Override
	public SecteurActivite consulterSecteurActi(Long codeSect) {
		SecteurActivite sect=em.find(SecteurActivite.class, codeSect);
		if(sect==null) throw new RuntimeException("Secteur d'Activite introuvalbe");
		return sect;
	}

	@Override
	public SecteurGeographique consulterSecteurGeo(Long codeSect) {
		SecteurGeographique sect=em.find(SecteurGeographique.class, codeSect);
		if(sect==null) throw new RuntimeException("Secteur geographique introuvalbe");
		return sect;
	}

	@Override
	public TypeMedia consulterTypeMedia(Long codeType) {
		TypeMedia tm=em.find(TypeMedia.class, codeType);
		if(tm==null) throw new RuntimeException("Type Media introuvalbe");
		return tm;
	}

	@Override
	public LendoProjet getCompteByProjet(Long codeProjet) {
		Query req=em.createQuery("select c from LendoWallet c where c.Projet.codeProjet=:x");
		req.setParameter("x",codeProjet);
		List<LendoProjet> lps=req.getResultList();
		LendoProjet lpro=null;
		for(LendoProjet lp:lps){
			lpro=lp;
		}
		return lpro;
	}

	@Override
	public LendoUtilisateur getCompteByUtilisateur(Long codeUser) {
		Query req=em.createQuery("select c from LendoWallet c where c.Projet.codeUtilisateur=:x");
		req.setParameter("x",codeUser);
		List<LendoUtilisateur> lps=req.getResultList();
		LendoUtilisateur lpro=null;
		for(LendoUtilisateur lp:lps){
			lpro=lp;
		}
		return lpro;
	}

	@Override
	public boolean checkLogin(String userName, String userPassword) {
		System.out.println("In Check login");
		boolean userFound = false;
		Query req=em.createQuery("select u from Utilisateur u where u.email=:x and u.password=:y");
		req.setParameter("x",userName);
		req.setParameter("y",userPassword);
		
		List list = req.getResultList();

		if ((list != null) && (list.size() > 0)) {
			userFound= true;
		}
		return userFound;  
	}

	@Override
	public List<Projet> getProjetUtilisateur(Long codeU) {
		Query req=em.createQuery("select p from Projet p where p.promoteur.codeUtilisateur=:x");
		req.setParameter("x",codeU);
		return req.getResultList();
	}

	@Override
	public List<Categorie> getCategories() {
		Query req=em.createQuery("select e from Categorie e");
		return req.getResultList();
	}

	@Override
	public List<Contribution> getContributionProjetUtilisateur(Long codeU) {
		Query req=em.createQuery("select c from Contribution c where c.utilisateur.codeUtilisateur=:x");
		req.setParameter("x",codeU);
		return req.getResultList();
	}

	@Override
	public List<Motivation> getMotivations() {
		Query req=em.createQuery("select e from Motivation e");
		return req.getResultList();
	}

	@Override
	public List<SecteurActivite> getSecteurActivites() {
		Query req=em.createQuery("select e from SecteurActivite e");
		return req.getResultList();
	}

	@Override
	public List<SecteurGeographique> getSecteurGeos() {
		Query req=em.createQuery("select e from SecteurGeographique e");
		return req.getResultList();
	}

	@Override
	public List<Commentaire> getCommentaireProjet(Long codeP) {
		Query req=em.createQuery("select c from Commentaire c where c.projet.codeProjet=:x");
		req.setParameter("x",codeP);
		return req.getResultList();
	}

	@Override
	public List<Contribution> getContributionProjet(Long codeP) {
		Query req=em.createQuery("select c from Contribution c where c.projet.codeProjet=:x");
		req.setParameter("x",codeP);
		return req.getResultList();
	}

	@Override
	public Boolean isYour(Projet P, Utilisateur U) {
		// TODO Auto-generated method stub
		return (P.getPromoteur().getCodeUtilisateur()==U.getCodeUtilisateur());
	}

	@Override
	/*public Utilisateur checkUser(String email, String password) {
		System.out.println("In Check login");
		Utilisateur u=null;
		Session session = sessionFactory.openSession();
		//Query using Hibernate Query Language
		String SQL_QUERY =" from Utilisateur as o where o.userName=? and o.userPassword=?";
		Query query = session.createQuery(SQL_QUERY);
		query.setParameter(0,email);
		query.setParameter(1,password);
		List list = ((org.hibernate.Query) query).list();

		if ((list != null) && (list.size() > 0)) {
			u=(Utilisateur)list.get(0);
		}

		session.close();
		return u;
	}*/
	public Utilisateur checkUser(String email, String password) {
		System.out.println("In Check login");
		Utilisateur u=null;
		Query req=em.createQuery("select u from Utilisateur u where u.email=:x and u.password=:y");
		req.setParameter("x",email);
		req.setParameter("y",password);
		
		List list = req.getResultList();

		if ((list != null) && (list.size() > 0)) {
			u=(Utilisateur)list.get(0);
		}
		return u;
	}
	@Override
	public ProjetBusiness addProjetBusiness(ProjetBusiness pb) {
		em.persist(pb);
		return pb;
	}

	@Override
	public ProjetFlexible addProjetFlexible(ProjetFlexible pf) {
		em.persist(pf);
		return pf;
	}

	@Override
	public Projet editProjet(Projet p) {
		em.merge(p);
		return null;
	}

	@Override
	public Projet deleteProjet(Projet p) {
		// TODO Auto-generated method stub
		em.remove(em.contains(p) ? p : em.merge(p));
		return p;
	}

	@Override
	public boolean checkEmail(String email) {
		System.out.println("In Check login");
		boolean userFound = false;
		Query req=em.createQuery("select u from Utilisateur u where u.email=:x ");
		req.setParameter("x",email);
		List list = req.getResultList();

		if ((list != null) && (list.size() > 0)) {
			userFound= true;
		}
		return userFound;
	}

	@Override
	public ProjetFlexible editProjetFlexible(ProjetFlexible pf) {
		// TODO Auto-generated method stub
		em.merge(pf);
		return pf;
	}

	@Override
	public ProjetBusiness editProjetBusiness(ProjetBusiness pb) {
		// TODO Auto-generated method stub
		em.merge(pb);
		return pb;
	}

	@Override
	public boolean isDon(Contribution c) {
		boolean userFound = false;
		Query req=em.createQuery("select p from Contribution p where TYPE_CONTRIB='DO' AND p.codeContribution=:x");
		req.setParameter("x",c.getCodeContribution());
		List list = req.getResultList();
		if(!list.isEmpty()) userFound=true;
		return userFound;
	}

	@Override
	public boolean isFlexible(Projet p) {
		boolean userFound = false;
		Query req=em.createQuery("select p from Projet p where TYPE_PROJET='PF' AND p.codeProjet=:x");
		req.setParameter("x",p.getCodeProjet());
		List list = req.getResultList();
		if(!list.isEmpty()) userFound=true;
		return userFound;
	}

	@Override
	public ProjetFlexible consulterProjetFlexible(Long codeProjet) {
		ProjetFlexible pj=em.find(ProjetFlexible.class, codeProjet);
		if(pj==null) throw new RuntimeException("Projet introuvalbe");
		return pj;
	}

	@Override
	public ProjetBusiness consulterProjetBusiness(Long codeProjet) {
		ProjetBusiness pj=em.find(ProjetBusiness.class, codeProjet);
		if(pj==null) throw new RuntimeException("Projet introuvalbe");
		return pj;
	}

	@Override
	public List<Projet> getProjet() {
		Query req=em.createQuery("select p from Projet p");
		return req.getResultList();
	}

	@Override
	public boolean checkTitre(String titre) {
		boolean userFound = false;
		Query req=em.createQuery("select c from Projet c where c.titre=:x");
		req.setParameter("x", "%"+titre+"%");
		List list = req.getResultList();
		if(!list.isEmpty()) userFound=true;
		return userFound;
	}

	@Override
	public ProjetFlexible deleteProjetFlexible(ProjetFlexible pf) {
		List<Media> medias=null;
		List<Commentaire> commentaires=null;
		medias=getMediaByProject(pf.getCodeProjet());
		commentaires=getCommentaireProjet(pf.getCodeProjet());
		if ((medias != null) && (medias.size() > 0)) {
		for(Media m:medias){
			deleteMedia(m);
		}
		}
		
		if ((commentaires != null) && (commentaires.size() > 0)) {
			for(Commentaire m:commentaires){
				deleteCommentaire(m);
			}
			}
		em.remove(em.contains(pf) ? pf : em.merge(pf));
		return pf;
	}

	@Override
	public ProjetBusiness deleteProjetBusiness(ProjetBusiness pb) {
		
		List<Media> medias=null;
		List<Commentaire> commentaires=null;
		medias=getMediaByProject(pb.getCodeProjet());
		commentaires=getCommentaireProjet(pb.getCodeProjet());
		if ((medias != null) && (medias.size() > 0)) {
		for(Media m:medias){
			deleteMedia(m);
		}
		}
		
		if ((commentaires != null) && (commentaires.size() > 0)) {
			for(Commentaire m:commentaires){
				deleteCommentaire(m);
			}
			}
		
		em.remove(em.contains(pb) ? pb : em.merge(pb));
		/*Query req=em.createQuery("delete from Projet p where p.codeProjet=:x");
		req.setParameter("x", pb.getCodeProjet());
		 req.executeUpdate();*/
		return null;
	}

	@Override
	public void faireDon(Don d) {
		// TODO Auto-generated method stub
		em.persist(d);
	}

	@Override
	public void faireDette(Dette de) {
		// TODO Auto-generated method stub
		em.persist(de);
	}

	@Override
	public void deleteMedia(Media m) {
		// TODO Auto-generated method stub
		em.remove(em.contains(m) ? m : em.merge(m));
	}

	@Override
	public void deleteCommentaire(Commentaire c) {
		// TODO Auto-generated method stub
		em.remove(em.contains(c) ? c : em.merge(c));
	}

}
