/**
 * 
 */
$(function() {
	// récupération des informations sur le projet
	loadprojetcomplet();
});

function loadprojetcomplet(){
	//récupération du code du projet
	var code_projet=$('#code_p').val();
	var code_utilisateur=$('#code_utilisateur').val();
	$.ajax({
		type : "post",
		url : "consulterprojetcomplet",
		cache : false,
		data : 'codeP=' + code_projet+'&&codeU='+code_utilisateur,
		success : function(response) {
			//conversion de la reponse en objet javascript manipulable
			
			var projet = eval('(' + response + ')');
			if(!projet.codeProjet){
				/*
				 * si aucun projet n'est trouvé, on redirige l'utilisateur vers la page d'erreur
				 */
				
				document.location.href = "error";
			}else{
				
				//dans le cas contraire, on charge la page
			
			// chargement des champs de vérification avec les infortion sur le projet
			//$('#check_titre').attr('value', projet.titre);
			//$('#check_cathegorie').attr('value', projet.categorie);
			//$('#check_slogan').attr('value', projet.slogan);
			//$('#check_description').attr('value', projet.description);
			//$('#check_montantAttendu').attr('value', projet.montantAttendu);
			//$('#check_image').attr('value', projet.medias);
			//$('#check_ville').attr('value', projet.ville);
			//$('#check_pays').attr('value', projet.pays);
			//$('#check_dureeCampagne').attr('value', projet.dureeCampagne);
			//$('#check_video').attr('value', projet.medias);
			//$('#check_presentation').attr('value', projet.presentation);
			//$('#check_busnessPlan').attr('value', projet.busnessPlan);
				//catégorie du projet
				$('#categorie').html("<h4>"+projet.categorie.libelle+"</h4>");
				$('#titre').html("<u><h3>"+projet.titre+"</h3></u>");
				$('#image').attr("src",projet.busnessPlan);
				$('#slogan').html("<h5>Solgan: "+projet.slogan+"</h5>");
				$('#description').html("<h4>"+projet.description+"</h4>");
				$('#progress').html('<div class="progress"><div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="70" aria-valuemin="0" aria-valuemax="100" style="width: 70%">70% Collecté sur '+projet.montantAttendu+' FCFA attendus </div></div>');
				testVideoUrl("https://www.youtube.com/watch?v=-LdbZLSUj6k","frame_video");
				
				/*
				 * conversion de la durée de la campagne en milliseconde et ajout de la date de début pour avoir la date de fin de la campagne
				 */
				var date_fin_campagne = projet.dureeCampagne*24*60*60*1000+projet.dateDebutCampagne;
				var d = new Date(date_fin_campagne);
				
				//alert(d);
				/*
				 * récupération de la date courante du serveur
				 */
				var current = $('#date').val();
				/*
				 * différence entre la date de fin et la date courante
				 */
				var diff=date_fin_campagne-current;
				/*
				 * nombre de jours restants
				 */
				var nbre_jour=Math.floor(diff/(24*60*60*1000));
				/*
				 * nombre d'heures restantes en décimal
				 */
				var diff1 = (diff/(24*60*60*1000)-nbre_jour)*24;
				/*
				 * nombre d'heures restantes en entier
				 */
				var nbre_heure=Math.floor(diff1);
				/*
				 * nombre de minutes restante restantes en décimal
				 */
				var diff2 = (diff1-nbre_heure)*60;
				/*
				 * nombre de minutes restante restantes en entier
				 */
				var nbre_minute = Math.floor(diff2);
				/*
				 * nombre de secondes restante restantes en décimal
				 */
				var diff3 = (diff2-nbre_minute)*60;
				/*
				 * nombre de minutes restante restantes en entier
				 */
				var nbre_seconde = Math.floor(diff3);
				//alert(nbre_jour+" Jours "+nbre_heure+" Heures "+nbre_minute+" Minutes "+nbre_seconde+ " Secondes");
				$('#temps_restant').html("<h4>Temps restant: "+nbre_jour+" Jours "+nbre_heure+" Heures "+nbre_minute+" Minutes "+nbre_seconde+ " Secondes"+"</h4>");
			}
			

			
		},
		error : function() {
			alert('Error while request..');
		}
	});
}