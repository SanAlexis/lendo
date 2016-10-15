/**
 * 
 */
$(function() {
	//test de connexion pour l'accès à la page de connexion
	test_connect1();
	
	/*
	 * récupération des catégories des projets
	 */
	loadprojetcategorie();
	$( "#resize" ).css('border', 'dashed 3px #652C90');
	$( "#resize" ).resizable({
		containment : "",
        minHeight: 100,
        minWidth: 100,
        maxHeight: 400,
        maxWidth: 600
        });
	$("#resize").draggable ({
        containment : "#img"
      });
	window.setInterval("test_connect1()",3000);
	$('#description').css('background', '#652C90').css('color', 'white').css(
			'cursor', 'hand').css('border-bottom', 'solid 5px #FBAF3F');

	$('#informations').css('border-left', 'solid 2px #652C90').css('color', '');
	// affichage de ses éléments
	affiche(".info_description");

	// masquage des autres éléments
	masque(".info_media");
	masque(".info_localisation");
	masque(".info_detail");
	masque(".info_finance");
	transformecurseur('.affiche', 'pointer','none');

	// tranformation du curseur de la souris
	transformecurseur('#description', 'pointer');
	transformecurseur('#finance', 'pointer');
	transformecurseur('#localisation', 'pointer');
	transformecurseur('#detail', 'pointer');
	transformecurseur('#media', 'pointer');
	loadprojet();

	$("#description").click(
			function() {
				$('#description').css('background', '#652C90').css('color',
						'white').css('cursor', 'hand').css('border-bottom',
						'solid 5px #FBAF3F');
				$('#finance').css('background', 'none').css('color', 'black')
						.css('border-bottom', 'none 0px #652C90');
				$('#localisation').css('background', 'none').css('color',
						'black').css('border-bottom', 'none 0px #652C90');
				$('#media').css('background', 'none').css('color', 'black')
						.css('border-bottom', 'none 0px #652C90');
				$('#detail').css('background', 'none').css('color', 'black')
						.css('border-bottom', 'none 0px #652C90');

				// affichage de ses éléments
				affiche(".info_description");

				// masquage des autres éléments
				masque(".info_media");
				masque(".info_localisation");
				masque(".info_detail");
				masque(".info_finance");

			});

	$("#finance").click(
			function() {

				$('#finance').css('background', '#652C90')
						.css('color', 'white').css('cursor', 'hand').css(
								'border-bottom', 'solid 5px #FBAF3F');
				$('#description').css('background', 'none').css('color',
						'black').css('border-bottom', 'none 0px #652C90');
				$('#localisation').css('background', 'none').css('color',
						'black').css('border-bottom', 'none 0px #652C90');
				$('#media').css('background', 'none').css('color', 'black')
						.css('border-bottom', 'none 0px #652C90');
				$('#detail').css('background', 'none').css('color', 'black')
						.css('border-bottom', 'none 0px #652C90');
				// affichage de ses éléments
				affiche(".info_finance");

				// masquage des autres éléments
				masque(".info_media");
				masque(".info_localisation");
				masque(".info_detail");
				masque(".info_description");
			});
	$("#localisation").click(
			function() {

				$('#localisation').css('background', '#652C90').css('color',
						'white').css('border-bottom', 'solid 5px #FBAF3F');
				$('#finance').css('background', 'none').css('color', 'black')
						.css('border-bottom', 'none 0px #652C90');
				$('#description').css('background', 'none').css('color',
						'black').css('border-bottom', 'none 0px #652C90');
				$('#detail').css('background', 'none').css('color', 'black')
						.css('border-bottom', 'none 0px #652C90');
				$('#media').css('background', 'none').css('color', 'black')
						.css('border-bottom', 'none 0px #652C90');
				// affichage de ses éléments
				affiche(".info_localisation");

				// masquage des autres éléments
				masque(".info_media");
				masque(".info_finance");
				masque(".info_detail");
				masque(".info_description");
			});

	$("#detail").click(
			function() {

				$('#detail').css('background', '#652C90').css('color', 'white')
						.css('border-bottom', 'solid 5px #FBAF3F');
				$('#localisation').css('background', 'none').css('color',
						'black').css('border-bottom', 'none 0px #652C90');
				$('#finance').css('background', 'none').css('color', 'black')
						.css('border-bottom', 'none 0px #652C90');
				$('#description').css('background', 'none').css('color',
						'black').css('border-bottom', 'none 0px #652C90');
				$('#media').css('background', 'none').css('color', 'black')
						.css('border-bottom', 'none 0px #652C90');
				// affichage de ses éléments
				affiche(".info_detail");

				// masquage des autres éléments
				masque(".info_media");
				masque(".info_localisation");
				masque(".info_finance");
				masque(".info_description");
			});
	$("#media").click(
			function() {

				$('#media').css('background', '#652C90').css('color', 'white')
						.css('border-bottom', 'solid 5px #FBAF3F');
				$('#localisation').css('background', 'none').css('color',
						'black').css('border-bottom', 'none 0px #652C90');
				$('#finance').css('background', 'none').css('color', 'black')
						.css('border-bottom', 'none 0px #652C90');
				$('#description').css('background', 'none').css('color',
						'black').css('border-bottom', 'none 0px #652C90');
				$('#detail').css('background', 'none').css('color', 'black')
						.css('border-bottom', 'none 0px #652C90');
				// affichage de ses éléments
				affiche(".info_media");

				// masquage des autres éléments
				masque(".info_description");
				masque(".info_finance");
				masque(".info_localisation");
				masque(".info_detail");

			});
	
	$( "#image" ).on('change', function() {
		$( "#select_image" ).modal("hide");
		$( "#infos" ).modal();
		$( "#rr" ).show();
		$( "#upload" ).hide();
	afficheImage(this,0,"#img");
	resize(this);
	uploadImageProjet(this,"updateprojetimage");
	
		 
	});
	
	$( "#modifier_photo" ).hide();
	$( "#canvas_image" ).on('mouseover', function() {
		$( "#modifier_photo" ).show();
		});
	$( "#canvas_image" ).on('mouseout', function() {

		setTimeout(function() {
			$( "#modifier_photo" ).hide();
			}, 5000);
		});
	$( "#modifier_photo" ).on('click', function() {
		
		$( "#select_image" ).modal();
		});
$( "#ok_video" ).on('click', function() {
	testVideoUrl($( "#video" ).val(),"frame_video");
		
		});
});
function loadprojet(){
	//récupération du code du projet
	var code_projet=$('#code_p').val();
	var code_utilisateur=$('#code_utilisateur').val();
	$.ajax({
		type : "post",
		url : "consulterprojet",
		cache : false,
		data : 'codeP=' + code_projet+'&&codeU='+code_utilisateur,
		success : function(response) {
			//conversion de la reponse en objet javascript manipulable
			
			var projet = eval('(' + response + ')');
			if(!projet.codeProjet){
				/*
				 * si aucun projet n'est trouvé, on redirige l'utilisateur vers la page de création des projets
				 */
				
				document.location.href = "creerprojet";
			}else{
				//dans le cas contraire, on charge la page
			
			// chargement des champs de vérification avec les infortion sur le projet
			$('#check_titre').attr('value', projet.titre);
			$('#check_cathegorie').attr('value', projet.categorie);
			$('#check_slogan').attr('value', projet.slogan);
			$('#check_description').attr('value', projet.description);
			$('#check_montantAttendu').attr('value', projet.montantAttendu);
			$('#check_image').attr('value', projet.medias);
			$('#check_ville').attr('value', projet.ville);
			$('#check_pays').attr('value', projet.pays);
			$('#check_dureeCampagne').attr('value', projet.dureeCampagne);
			$('#check_video').attr('value', projet.medias);
			$('#check_presentation').attr('value', projet.presentation);
			
			
			$('#check_busnessPlan').attr('value', projet.busnessPlan);
			/*
			 * titre
			 */
			checkinfo("check_titre", "titre", "", "affiche_titre", "Entrez le titre du projet"," Clickez pour modifier le titre du projet","annule_titre","ok_titre");
			updateinfo("ok_titre","updateprojettitre","POST","titre","code_p","titre","check_titre","affiche_titre","annule_titre","Erreur : Le titre du projet n'a pas pu être mis à jour, veuillez reessayer plus tard");
			/*
			 * cathégorie
			 */
			checkinfo("check_cathegorie", "cathegorie", "", "affiche_cathegorie", "Entrez la cathégorie du projet"," Clickez pour modifier la catégorie du projet","annule_cathegorie","ok_cathegorie");
			updateinfo("ok_cathegorie","updateprojetcathegorie","POST","cathegorie","code_p","cathegorie","check_cathegorie","affiche_cathegorie","annule_cathegorie","Erreur : La catégorie du projet n'a pas pu être mise à jour, veuillez reessayer plus tard");
			/*
			 * slogan
			 */
			checkinfo("check_slogan", "slogan", "", "affiche_slogan", "Entrez  le slogan du projet"," Clickez pour modifier le slogan du projet","annule_slogan","ok_slogan");
			updateinfo("ok_slogan","updateprojetslogan","POST","slogan","code_p","slogan","check_slogan","affiche_slogan","annule_slogan","Erreur : Le slogan du projet n'a pas pu être mis à jour, veuillez reessayer plus tard");
			/*
			 * description
			 */
			checkinfo("check_description1", "description1", "", "affiche_description1", "Entrez  la description du projet"," Clickez pour modifier la description du projet","annule_description1","ok_description1");
			updateinfo("ok_description1","updateprojetdescription","POST","description1","code_p","description1","check_description1","affiche_description1","annule_description1","Erreur : La description du projet n'a pas pu être mise à jour, veuillez reessayer plus tard");
			
			/*
			 * montant campagne
			 */
			checkinfo("check_montantAttendu", "montantAttendu", "", "affiche_montantAttendu", "Entrez  le montant attendu de la campagne du projet"," Clickez pour modifier le montant attendu de la campagne du projet","annule_montantAttendu","ok_montantAttendu");
			updateinfo("ok_montantAttendu","updateprojetmontantAttendu","POST","montantAttendu","code_p","montantAttendu","check_montantAttendu","affiche_montantAttendu","annule_montantAttendu","Erreur : Le montant attendu de la campagne du projet n'a pas pu être mise à jour, veuillez reessayer plus tard");
			/*
			 * durée de la campagne
			 */
			checkinfo("check_dureeCampagne", "dureeCampagne", "", "affiche_dureeCampagne", "Entrez  la durée de la campagne du projet"," Clickez pour modifier la durée de la campagne du projet","annule_dureeCampagne","ok_dureeCampagne");
			updateinfo("ok_dureeCampagne","updateprojetdureeCampagne","POST","dureeCampagne","code_p","dureeCampagne","check_dureeCampagne","affiche_dureeCampagne","annule_dureeCampagne","Erreur : La durée de la campagne du projet n'a pas pu être mise à jour, veuillez reessayer plus tard");
			/*
			 * presentation du projet
			 */
			checkinfockeditor("check_presentation","annule_presentation","ok_presentation","presentation","updateprojetpresentation","presentation","#595959","code_p","code_p");
			//checkinfo("check_presentation", "presentation", "", "affiche_presentation", "Entrez  la présentation du projet"," Clickez pour modifier la présentation du projet","annule_presentation","ok_presentation");
			//updateinfo("ok_presentation","updateprojetpresentation","POST","presentation","code_projet","presentation","check_presentation","affiche_presentation","annule_presentation","Erreur : La présentation du projet n'a pas pu être mise à jour, veuillez reessayer plus tard");
			/*
			 * busuness plan
			 */
			checkinfo("check_busnessPlan", "busnessPlan", "", "affiche_busnessPlan", "Entrez le business plan du projet"," Clickez pour modifier le business plan du projet","annule_busnessPlan","ok_busnessPlan");
			updateinfo("ok_busnessPlan","updateprojetbusnessPlan","POST","busnessPlan","code_p","busnessPlan","check_busnessPlan","affiche_busnessPlan","annule_busnessPlan","Erreur : Le business plan du projet n'a pas pu être mis à jour, veuillez reessayer plus tard");
			/*
			 * ville du projet
			 */
			checkinfo("check_ville", "ville", "", "affiche_ville", "Entrez la ville du projet"," Clickez pour modifier la ville du projet","annule_ville","ok_ville");
			updateinfo("ok_ville","updateprojetville","POST","ville","code_p","ville","check_ville","affiche_ville","annule_ville","Erreur : La ville du projet n'a pas pu être mis à jour, veuillez reessayer plus tard");
			/*
			 * pays du projet
			 */
			checkinfo("check_pays", "pays", "", "affiche_pays", "Entrez le pays du projet"," Clickez pour modifier le pays du projet","annule_pays","ok_pays");
			updateinfo("ok_pays","updateprojetpays","POST","pays","code_p","pays","check_pays","affiche_pays","annule_pays","Erreur : Le pays du projet n'a pas pu être mis à jour, veuillez reessayer plus tard");
			/*
			 * image du projet
			 */
			//checkinfo("check_image", "image", "", "affiche_image", "Entrez l'image du projet"," Clickez pour modifier l'image du projet","annule_image","ok_image");
			//updateinfo("ok_image","updateprojetimage","POST","image","code_projet","image","check_image","affiche_image","annule_image","Erreur : L'image du projet n'a pas pu être mis à jour, veuillez reessayer plus tard");
			/*
			 * video du projet
			 */
			checkinfo("check_video", "video", "", "affiche_video", "Entrez la video du projet"," Clickez pour modifier la video du projet","annule_video","ok_video");
			updateinfo("ok_video","updateprojetvideo","POST","video","code_p","video","check_video","affiche_video","annule_video","Erreur : La video du projet n'a pas pu être mise à jour, veuillez reessayer plus tard");
			}
			

			
		},
		error : function() {
			alert('Error while request..');
		}
	});
}