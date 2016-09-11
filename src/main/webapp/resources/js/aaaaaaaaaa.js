/**
 * 
 */
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
			$('#check_ville').attr('value', user.lieuNaissance);
			$('#check_adresse').attr('value', user.adresse);
			$('#check_adresse1').attr('value', user.adresse2);
			$('#check_codepostal').attr('value', user.codePostal);
			$('#check_telephone').attr('value', user.telephone);
			$('#check_motivation').attr('value', user.motivation);
			$('#check_activite').attr('value', user.secteurActivite);
			$('#check_secteurgeo').attr('value', user.secteurGeo);
			$('#check_activitepro').attr('value', user.activitePro);
			$('#check_experience').attr('value', user.experience);
			$('#check_revenu').attr('value', user.sourceRevenu);
			alert(response);
			
		}
	});
}