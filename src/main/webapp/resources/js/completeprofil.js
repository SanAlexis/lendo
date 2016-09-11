/**
 * 
 */
$(function() {
	//test de connexion pour l'accès à la page de connexion
	test_connect1();
	window.setInterval("test_connect1()",3000);
	$('#identite').css('background', '#652C90').css('color', 'white').css(
			'cursor', 'hand').css('border-left', 'solid 5px #FBAF3F');

	$('#informations').css('border-left', 'solid 2px #652C90').css('color', '');

	// masquage des éléments
	masque(".info_coordonnees");
	masque(".info_preferences");
	masque(".info_situation");

	// tranformation du curseur de la souris
	transformecurseur('#identite', 'pointer');
	transformecurseur('#coordonnees', 'pointer');
	transformecurseur('#preferences', 'pointer');
	transformecurseur('#situation', 'pointer');
	transformecurseur('.affiche', 'pointer','none');
	/*
	 * exécution de la fonction de récupération des informations sur l'utilisateur
	 */
	loaduser();
	$("#identite").click(
			function() {
				$('#identite').css('background', '#652C90').css('color',
						'white').css('cursor', 'hand').css('border-left',
						'solid 5px #FBAF3F');
				$('#coordonnees').css('background', 'none').css('color',
						'black').css('border-left', 'none 0px #652C90');
				$('#preferences').css('background', 'none').css('color',
						'black').css('border-left', 'none 0px #652C90');
				$('#situation').css('background', 'none').css('color', 'black')
						.css('border-left', 'none 0px #652C90');

				// affichage de ses éléments
				affiche(".info_identite");

				// masquage des autres éléments
				masque(".info_coordonnees");
				masque(".info_preferences");
				masque(".info_situation");

			});

	$("#coordonnees").click(
			function() {

				$('#coordonnees').css('background', '#652C90').css('color',
						'white').css('border-left', 'solid 5px #FBAF3F');
				$('#identite').css('background', 'none').css('color', 'black')
						.css('border-left', 'none 0px #652C90');
				$('#preferences').css('background', 'none').css('color',
						'black').css('border-left', 'none 0px #652C90');
				$('#situation').css('background', 'none').css('color', 'black')
						.css('border-left', 'none 0px #652C90');
				// affichage de ses éléments
				affiche(".info_coordonnees");

				// masquage des autres éléments
				masque(".info_identite");
				masque(".info_preferences");
				masque(".info_situation");
			});
	$("#preferences").click(
			function() {

				$('#preferences').css('background', '#652C90').css('color',
						'white').css('border-left', 'solid 5px #FBAF3F');
				$('#situation').css('background', 'none').css('color', 'black')
						.css('border-left', 'none 0px #652C90');
				$('#identite').css('background', 'none').css('color', 'black')
						.css('border-left', 'none 0px #652C90');
				$('#coordonnees').css('background', 'none').css('color',
						'black').css('border-left', 'none 0px #652C90');
				// affichage de ses éléments
				affiche(".info_preferences");

				// masquage des autres éléments
				masque(".info_identite");
				masque(".info_situation");
				masque(".info_coordonnees");
			});
	$("#situation").click(
			function() {

				$('#situation').css('background', '#652C90').css('color',
						'white').css('border-left', 'solid 5px #FBAF3F');
				$('#preferences').css('background', 'none').css('color',
						'black').css('border-left', 'none 0px #652C90');
				$('#identite').css('background', 'none').css('color', 'black')
						.css('border-left', 'none 0px #652C90');
				$('#coordonnees').css('background', 'none').css('color',
						'black').css('border-left', 'none 0px #652C90');
				// affichage de ses éléments
				affiche(".info_situation");

				// masquage des autres éléments
				masque(".info_identite");
				masque(".info_preferences");
				masque(".info_coordonnees");
			});
});

function loaduser(){
	/*
	 * fonction permettant de récupérer les informations sur l'utilisateur identifié par son code
	 */
	
	//récupération du code de l'utilisateur
	var code_utilisateur = $('#code_utilisateur').val();
	$.ajax({
		type : "post",
		url : "consulterutilisateur",
		cache : false,
		data : 'codeU=' + code_utilisateur,
		success : function(response) {
			//conversion de la reponse en objet java manipulable
			
			var user = eval('(' + response + ')');
			//alert(i.nom + " "+ i.prenom);
			
			// chargement des champs de vérification avec les infortion de l'utilisateur
			$('#check_nom').attr('value', user.nom);
			$('#check_prenom').attr('value', user.prenom);
			$('#check_date').attr('value', user.dateNaissance);
			$('#check_lieu').attr('value', user.lieuNaissance);
			$('#check_adresse').attr('value', user.adresse);
			$('#check_adresse1').attr('value', user.adresse2);
			$('#check_codepostal').attr('value', user.codePostal);
			$('#check_telephone').attr('value', user.telephone);
			$('#check_motivation').attr('value', user.motivation.codeMotviation);
			$('#check_activite').attr('value', user.secteurActivite.codeSecteur);
			$('#check_secteurgeo').attr('value', user.secteurGeo.codeSecteur);
			$('#check_activitepro').attr('value', user.activitePro.codeActivite);
			$('#check_experience').attr('value', user.experience);
			$('#check_revenu').attr('value', user.sourceRevenu);
			//alert(response);
			/*
			 * nom
			 */
			checkinfo("check_nom", "nom", "", "affiche_nom", "Entrez votre nom"," Clickez pour modifier votre nom","annule_nom","ok_nom");
			updateinfo("ok_nom","updateusernom","POST","nom","code_utilisateur","nom","check_nom","affiche_nom","annule_nom","Erreur : votre nom n'a pas pu être mis à jour, veuillez reessayer plus tard");
			
			/*
			 * prenom
			 */
			checkinfo("check_prenom", "prenom", "", "affiche_prenom", "Entrez votre prenom"," Clickez pour modifier votre prenom","annule_prenom","ok_prenom");
			updateinfo("ok_prenom","updateuserprenom","POST","prenom","code_utilisateur","prenom","check_prenom","affiche_prenom","annule_prenom","Erreur : votre prénom n'a pas pu être mis à jour, veuillez reessayer plus tard");
			/*
			 * date de naissance
			 */
			checkinfo("check_date", "date", "", "affiche_date", "Entrez votre date de naissance"," Clickez pour modifier votre date de naissance","annule_date","ok_date");
			updateinfo("ok_date","updateuserdatenaissance","POST","date","code_utilisateur","date","check_date","affiche_date","annule_date","Erreur : votre date de naissance n'a pas pu être mise à jour, veuillez reessayer plus tard");
			/*
			 * lieu de naissance
			 */
			checkinfo("check_lieu", "lieu", "", "affiche_lieu", "Entrez votre lieu de naissance"," Clickez pour modifier votre lieu de naissance","annule_lieu","ok_lieu");
			updateinfo("ok_lieu","updateuserlieunaissance","POST","lieu","code_utilisateur","lieu","check_lieu","affiche_lieu","annule_lieu","Erreur : votre lieu de naissance n'a pas pu être mis à jour, veuillez reessayer plus tard");
			/*
			 * adresse
			 */
			checkinfo("check_adresse", "adresse", "", "affiche_adresse", "Entrez votre adresse"," Clickez pour modifier votre adresse","annule_adresse","ok_adresse");
			updateinfo("ok_adresse","updateuseradresse","POST","adresse","code_utilisateur","adresse","check_adresse","affiche_adresse","annule_adresse","Erreur : votre adresse n'a pas pu être mise à jour, veuillez reessayer plus tard");
			/*
			 * adresse complémentaire
			 */
			checkinfo("check_adresse1", "adresse1", "", "affiche_adresse1", "Entrez votre adresse complémentaire"," Clickez pour modifier votre adresse complémentaire","annule_adresse1","ok_adresse1");
			updateinfo("ok_adresse1","updateuseradresse1","POST","adresse1","code_utilisateur","adresse1","check_adresse1","affiche_adresse1","annule_adresse1","Erreur : votre adresse complémentaire n'a pas pu être mise à jour, veuillez reessayer plus tard");
			/*
			 * code postal
			 */
			checkinfo("check_codepostal", "codepostal", "", "affiche_codepostal", "Entrez votre code postal"," Clickez pour modifier votre code postal","annule_codepostal","ok_codepostal");
			updateinfo("ok_codepostal","updateusercodepostal","POST","codepostal","code_utilisateur","codepostal","check_codepostal","affiche_codepostal","annule_codepostal","Erreur : votre code postal n'a pas pu être mis à jour, veuillez reessayer plus tard");
			/*
			 * numéro de téléphone
			 */
			checkinfo("check_telephone", "telephone", "", "affiche_telephone", "Entrez votre numéro de téléphone"," Clickez pour modifier votre numéro de téléphone","annule_telephone","ok_telephone");
			updateinfo("ok_telephone","updateusertelephone","POST","telephone","code_utilisateur","telephone","check_telephone","affiche_telephone","annule_telephone","Erreur : votre numéro de téléphone n'a pas pu être mis à jour, veuillez reessayer plus tard");
			/*
			 * motivation
			 */
			checkinfo("check_motivation", "motivation", "", "affiche_motivation", "Entrez votre motivation"," Clickez pour modifier votre motivation","annule_motivation","ok_motivation");
			updateinfo("ok_motivation","updateusermotivation","POST","motivation","code_utilisateur","motivation","check_motivation","affiche_motivation","annule_motivation","Erreur : votre motivation n'a pas pu être mise à jour, veuillez reessayer plus tard");
			/*
			 * secteur d'activite
			 */
			checkinfo("check_activite", "activite", "", "affiche_activite", "Entrez votre secteur d'activité"," Clickez pour modifier votre secteur d'activité","annule_activite","ok_activite");
			updateinfo("ok_activite","updateuseractivite","POST","activite","code_utilisateur","activite","check_activite","affiche_activite","annule_activite","Erreur : votre secteur d'activité n'a pas pu être mise à jour, veuillez reessayer plus tard");
			/*
			 * secteur géographique
			 */
			checkinfo("check_secteurgeo", "secteurgeo", "", "affiche_secteurgeo", "Entrez votre secteur géographique"," Clickez pour modifier votre secteur géographique","annule_secteurgeo","ok_secteurgeo");
			updateinfo("ok_secteurgeo","updateusersecteurgeo","POST","secteurgeo","code_utilisateur","secteurgeo","check_secteurgeo","affiche_secteurgeo","annule_secteurgeo","Erreur : votre secteur géographique n'a pas pu être mise à jour, veuillez reessayer plus tard");
			/*
			 * activité professionnelle
			 */
			checkinfo("check_activitepro", "activitepro", "", "affiche_activitepro", "Entrez votre activité professionnelle"," Clickez pour modifier votre activité professionnelle","annule_activitepro","ok_activitepro");
			updateinfo("ok_activitepro","updateuseractivitepro","POST","activitepro","code_utilisateur","activitepro","check_activitepro","affiche_activitepro","annule_activitepro","Erreur : votre activité professionnelle n'a pas pu être mise à jour, veuillez reessayer plus tard");
			/*
			 * expérience dans l'investissement
			 */
			checkinfo("check_experience", "experience", "", "affiche_experience", "Entrez votre expérience dans l'investissement"," Clickez pour modifier votre expérience dans l'investissement","annule_experience","ok_experience");
			updateinfo("ok_experience","updateuserexperience","POST","experience","code_utilisateur","experience","check_experience","affiche_experience","annule_experience","Erreur : votre expérience dans l'investissement n'a pas pu être mise à jour, veuillez reessayer plus tard");
			/*
			 * source de revenu
			 */
			checkinfo("check_revenu", "revenu", "", "affiche_revenu", "Entrez votre source de revenu"," Clickez pour modifier source de revenu","annule_revenu","ok_revenu");
			updateinfo("ok_revenu","updateuserrevenu","POST","revenu","code_utilisateur","revenu","check_revenu","affiche_revenu","annule_revenu","Erreur : votre source de revenu n'a pas pu être mise à jour, veuillez reessayer plus tard");
			
		
			
		}
	});
}