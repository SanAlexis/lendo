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
import org.nyx.lw.entities.LendoProjet;
import org.nyx.lw.entities.LendoUtilisateur;
import org.nyx.lw.entities.LendoWallet;
import org.nyx.lw.entities.Media;
import org.nyx.lw.entities.Motivation;
import org.nyx.lw.entities.Operateur;
import org.nyx.lw.entities.Operation;
import org.nyx.lw.entities.Projet;
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

	protected SessionFactory sessionFactory;
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public Utilisateur editUtilisateur (Utilisateur u) {
		sessionFactory.getCurrentSession().update(u);
		return u;
	}
	
	@Override
	public Utilisateur deleteUtilisateur (Utilisateur u) {
		sessionFactory.getCurrentSession().delete(u);
		return u;
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
		return null;
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
		Query req=em.createQuery("select c from projet c where c.titre like :x");
		req.setParameter("x", "%"+titre+"%");
		return req.getResultList();
	}

	@Override
	public List<Projet> getProjetByUtilisateur(Long codeU) {
		Query req=em.createQuery("select c from projet c where c.promoteur.codeUtilisateur=:x");
		req.setParameter("x",codeU);
		return req.getResultList();
	}

	@Override
	public List<Contribution> getContributionByProjet(Long codeProjet) {
		Query req=em.createQuery("select c from contribution c where c.projet.codeProjet=:x");
		req.setParameter("x",codeProjet);
		return req.getResultList();
	}

	@Override
	public List<Commentaire> getCommentaireByProjet(Long codeProjet) {
		Query req=em.createQuery("select c from commentaire c where c.projet.codeProjet=:x");
		req.setParameter("x",codeProjet);
		return req.getResultList();
	}

	@Override
	public List<Operation> getOperationByLendoWallet(Long numeroLendo) {
		Query req=em.createQuery("select c from operation c where c.lendowallet.numeroCompte=:x");
		req.setParameter("x",numeroLendo);
		return req.getResultList();
	}

	@Override
	public List<ActiviteProfessionel> getActiviteProByUtilisateur(Long codeU) {
		Query req=em.createQuery("select c from ActiviteProfessionel c where c.utilisateur.codeUtilisateur=:x");
		req.setParameter("x",codeU);
		return req.getResultList();
	}

	@Override
	public List<Projet> getProjetByCategorie(Long codeCat) {
		Query req=em.createQuery("select c from projet c where c.categorie.codeCategorie=:x");
		req.setParameter("x",codeCat);
		return req.getResultList();
	}

	@Override
	public List<Media> getMediaByProject(Long codeProjet) {
		Query req=em.createQuery("select c from media c where c.projet.codeProjet=:x");
		req.setParameter("x",codeProjet);
		return req.getResultList();
	}

	@Override
	public List<Categorie> getCaterogie() {
		// TODO Auto-generated method stub
		return null;
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
		Query req=em.createQuery("select c from lendowallet c where c.projet.codeProjet=:x");
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
		Query req=em.createQuery("select c from lendowallet c where c.projet.codeUtilisateur=:x");
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
		Session session = sessionFactory.openSession();
		boolean userFound = false;
		//Query using Hibernate Query Language
		String SQL_QUERY =" from utilisateur as o where o.userName=? and o.userPassword=?";
		Query query = session.createQuery(SQL_QUERY);
		query.setParameter(0,userName);
		query.setParameter(1,userPassword);
		List list = ((org.hibernate.Query) query).list();

		if ((list != null) && (list.size() > 0)) {
			userFound= true;
		}

		session.close();
		return userFound;  
	}
}
