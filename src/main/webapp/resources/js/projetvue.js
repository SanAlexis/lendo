/**
 * 
 */
$(function() {
	// récupération des informations sur le projet

	$('#menu_presentation').css('background', '#652C90').css('color', 'white')
			.css('cursor', 'hand').css('border-bottom', 'solid 5px #FBAF3F');
	transformecurseur('#menu_presentation', 'pointer');
	transformecurseur('#menu_commentaires', 'pointer');
	transformecurseur('#menu_contributions', 'pointer');
	// affichage de ses éléments
	affiche(".description_détalliée");

	// masquage des autres éléments
	masque(".liste_commentaires");
	masque(".liste_contributions");

	$("#participer_projet").click(function() {
		$("#modal_contribution").modal({
			backdrop : 'static',
			keyboard : false,
			show : true
		});

	});

	$("#jcontribu").click(
			function() {
				if ($("#mon_montant").val() != "") {
					contribuer($("#mon_montant").val(), $("#code_p").val(),
							"walletcontribuerprojet", "modal_contribution");
				} else {
					alert("Veuillez entrer le montant de votre contribution");
				}

			});

	$("#menu_presentation").click(
			function() {
				$('#menu_presentation').css('background', '#652C90').css(
						'color', 'white').css('cursor', 'hand').css(
						'border-bottom', 'solid 5px #FBAF3F');
				$('#menu_commentaires').css('background', 'none').css('color',
						'black').css('border-bottom', 'none 0px #652C90');
				$('#menu_contributions').css('background', 'none').css('color',
						'black').css('border-bottom', 'none 0px #652C90');
				// affichage de ses éléments
				affiche(".description_détalliée");

				// masquage des autres éléments
				masque(".liste_commentaires");
				masque(".liste_contributions");
			});
	$("#menu_commentaires").click(
			function() {
				$('#menu_commentaires').css('background', '#652C90').css(
						'color', 'white').css('cursor', 'hand').css(
						'border-bottom', 'solid 5px #FBAF3F');
				$('#menu_presentation').css('background', 'none').css('color',
						'black').css('border-bottom', 'none 0px #652C90');
				$('#menu_contributions').css('background', 'none').css('color',
						'black').css('border-bottom', 'none 0px #652C90');
				// affichage de ses éléments
				affiche(".liste_commentaires");

				// masquage des autres éléments
				masque(".description_détalliée");
				masque(".liste_contributions");
			});
	$("#menu_contributions").click(
			function() {
				$('#menu_contributions').css('background', '#652C90').css(
						'color', 'white').css('cursor', 'hand').css(
						'border-bottom', 'solid 5px #FBAF3F');
				$('#menu_presentation').css('background', 'none').css('color',
						'black').css('border-bottom', 'none 0px #652C90');
				$('#menu_commentaires').css('background', 'none').css('color',
						'black').css('border-bottom', 'none 0px #652C90');
				// affichage de ses éléments
				affiche(".liste_contributions");

				// masquage des autres éléments
				masque(".description_détalliée");
				masque(".liste_commentaires");
			});

	commenterProjet("mon_commentaire", "annule_commente", "ok_commente", $(
			"#code_p").val(), "updateprojetsetcommentaire");
	loadprojetcomplet();
});
function commenterProjet(champ1, champ2, champ3, champ4, champ5) {
	/*
	 * champ1 = champ contenant l'id de notre commentaire champ1 = boutton pour
	 * reset le contenu du ckeditor champ3 = bouton de soumission du commentaire
	 * champ4 = code du projet champ5 = url du script qui va traiter notre
	 * requete
	 */

	$("#" + champ2).on('click', function() {
		var texte = "";
		$("#" + champ1).attr("value", "");
	});

	$("#" + champ3)
			.on(
					'click',
					function() {
						if ($("#" + champ1).val() == "") {
							/*
							 * Si l'éditeur est vide, on envoit un message
							 * d'alerte à l'utilisateur
							 */
							alert("Veuillez entrer votre commentaire");
						} else {
							ajax_requete_lance_desactive_fenetre();
							/*
							 * Si l'éditeur n'est pas vide on envoit les données
							 * auserveur
							 */
							$
									.ajax({
										type : "post",
										url : champ5,
										cache : false,
										data : {
											commentaire : $("#" + champ1).val(),
											codeu : champ4
										},
										success : function(response) {
											ajax_requete_termine_active_fenetre();
											alert("Votre commentaire a été posté avec succès avec succès");
											$("#" + champ1).Attr("value", "");
										},
										error : function() {
											alert('Error while request..');
										}
									});

						}

					});
}

function loadprojetcomplet() {
	// récupération du code du projet
	var code_projet = $('#code_p').val();
	var code_utilisateur = $('#code_utilisateur').val();
	$
			.ajax({
				type : "post",
				url : "consulterprojetcomplet",
				cache : false,
				data : 'codeP=' + code_projet,
				success : function(response) {
					// conversion de la reponse en objet javascript manipulable

					var projet = eval('(' + response + ')');
					if (!projet.codeProjet) {
						/*
						 * si aucun projet n'est trouvé, on redirige
						 * l'utilisateur vers la page d'erreur
						 */

						document.location.href = "error";
					} else {

						$('#categorie').html(
								"<a href='decouvrir?cat="
										+ projet.categorie.codeCategorie
										+ "'><h4>" + projet.categorie.libelle
										+ "</h4><a>");
						$('#titre')
								.html("<u><h3>" + projet.titre + "</h3></u>");

						$('#slogan').html(
								"<h5>Solgan: " + projet.slogan + "</h5>");
						$('#description').html(
								"<h4>" + projet.description + "</h4>");
						$('#contenu_pésentation').html(projet.presentation);

						/*
						 * contributions
						 */
						var contrib = 0;
						for ( var id in projet.contributions) {

							contrib += projet.contributions[id].montant;

						}
						var pourcentage = (contrib / projet.montantAttendu) * 100;
						$('#test_progress').html(
								'<h4>' + contrib + ' FCFA Collectés par '
										+ projet.contributions.length
										+ ' Lenders sur '
										+ projet.montantAttendu
										+ ' FCFA attendus de la campagne</h4>');

						$('#progress')
								.html(
										'<div class="progress"><div class="progress-bar" role="progressbar" aria-valuenow="0" aria-valuemin="0" aria-valuemax="100" style="min-width: 2em; width:'
												+ pourcentage
												+ '%">'
												+ pourcentage
												+ ' %</div></div>');

						/*
						 * commentaires alert(projet.commentaires.length);
						 */

						var commentaire = "";
						for ( var id in projet.commentaires) {

							commentaire += '<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12"	id="" style="background-color:"><a href="">'
									+ projet.commentaires[id].utilisateur.nom
									+ ' '
									+ projet.commentaires[id].utilisateur.prenom
									+ '</a></div><div class="col-xs-12 col-sm-12 col-md-12 col-lg-12"	id="" style="background-color:">'
									+ projet.commentaires[id].description
									+ '</div>';

						}
						$('#contenu_commentaires').html(commentaire);
						
						
						
						/*
						 * contributions alert(projet.commentaires.length);
						 */

						var contrib = "";
						for ( var id in projet.contributions) {

							contrib += '<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12"	id="" style="background-color:"><a href="">'
									+ projet.contributions[id].utilisateur.nom
									+ ' '
									+ projet.contributions[id].utilisateur.prenom
									+ '</a></div><div class="col-xs-12 col-sm-12 col-md-12 col-lg-12"	id="" style="background-color:">'
									+ projet.contributions[id].montant
									+ '</div>';

						}
						$('#contenu_contributions').html(contrib);
						
						
						/*
						 * conversion de la durée de la campagne en milliseconde
						 * et ajout de la date de début pour avoir la date de
						 * fin de la campagne
						 */
						var date_fin_campagne = projet.dureeCampagne * 24 * 60
								* 60 * 1000 + projet.dateDebutCampagne;
						var d = new Date(date_fin_campagne);
						var heure_navigateur = new Date().getTime();

						// alert(d);
						/*
						 * récupération de la date courante du serveur
						 */
						var current = $('#date').val();

						// calcul du décalage horaire entre le serveur et le
						// navigateur
						var decalage_navigateur = heure_navigateur - current;
						// alert(decalage_navigateur);

						$('#df').attr("value", date_fin_campagne);
						$('#decal').attr("value", decalage_navigateur);
						projet_temp_restant();
						window.setInterval("projet_temp_restant()", 1000);

						/*
						 * affichage de la vidéo on parcourt le tableau des
						 * vidéos et on affiche la dernière vidéo
						 */
						var video = [];
						var image = [];
						for ( var id in projet.medias) {
							if (projet.medias[id].url != null
									&& projet.medias[id].url != "") {
								video.push(projet.medias[id].url);
							}
							if (projet.medias[id].chemin != null
									&& projet.medias[id].chemin != "") {
								image.push(projet.medias[id].chemin);
							}

						}
						testVideoUrl(video[video.length - 1], "frame_video");
						$('#image').attr("src", image[image.length - 1]);
					}

				},
				error : function() {
					alert('Error while request..');
				}
			});
}

function projet_temp_restant() {
	/*
	 * date_fin_campagne = date de fin de la campagne decalage = décalage entre
	 * le navigateur et le serveur
	 */
	var current = new Date().getTime();

	/*
	 * différence entre la date de fin et la date courante et retrait du
	 * décalage
	 */
	var diff = $('#df').val() - current - $('#decal').val();
	/*
	 * nombre de jours restants
	 */
	var nbre_jour = Math.floor(diff / (24 * 60 * 60 * 1000));
	/*
	 * nombre d'heures restantes en décimal
	 */
	var diff1 = (diff / (24 * 60 * 60 * 1000) - nbre_jour) * 24;
	/*
	 * nombre d'heures restantes en entier
	 */
	var nbre_heure = Math.floor(diff1);
	/*
	 * nombre de minutes restante restantes en décimal
	 */
	var diff2 = (diff1 - nbre_heure) * 60;
	/*
	 * nombre de minutes restante restantes en entier
	 */
	var nbre_minute = Math.floor(diff2);
	/*
	 * nombre de secondes restante restantes en décimal
	 */
	var diff3 = (diff2 - nbre_minute) * 60;
	/*
	 * nombre de minutes restante restantes en entier
	 */

	var nbre_seconde = Math.floor(diff3);
	// alert(nbre_jour+" Jours "+nbre_heure+" Heures "+nbre_minute+" Minutes
	// "+nbre_seconde+ " Secondes");
	$('#temps_restant').html(
			"<h4>Temps restant: " + nbre_jour + " Jours " + nbre_heure
					+ " Heures " + nbre_minute + " Minutes " + nbre_seconde
					+ " Secondes" + "</h4>");

}

/*
 * Fonction permettant de contribuer à un projet
 */
function contribuer(champ1, champ2, champ3, champ4) {
	/*
	 * champ1 = champ contenant le montant de la contribution champ2 = champ
	 * contenant le code projet champ3 = champ contenant l'url champ4 = idée de
	 * la fenetre modale
	 */
	
	ajax_requete_lance_desactive_fenetre();
	$.ajax({
		type : "post",
		url : champ3,
		cache : false,
		data : {
			montant : champ1,
			codep : champ2
		},
		success : function(response) {
			ajax_requete_termine_active_fenetre();
			
			alert("Votre contribution a été enrégistrée avec succès");
			$("#" + champ4).modal("hide");
		},
		error : function() {
			alert('Error while request..');
		}
	});

}