$(function() {
	// transformecurseur('#option', 'pointer','none');
	/*
	 * on vérifie si un utilisateur est connecté
	 */
	connecte();

	/*
	 * on refait la vérification toutes les 03 secondes
	 */
	window.setInterval("connecte()", 3000);
	loadprojetcategorie1();
	
	if($("#cat").val()!="" && $("#cat").val()!="null"){
		loadprojetbycategorie($("#cat").val());
	}else{
		/*
		 *on affiche tous les projets au chargement de la page
		 */
		loadprojetallprojet();
	}
});

/*
 * Fonction permettant de récupérer les projets dans la BD en fonction de la catégorie
 */
function loadprojetbycategorie(champ) {
	//champ = variable contenant le code de la categorie
	$
			.ajax({
				type : "post",
				url : "consulterprojetbycategorie",
				cache : false,
				data : {categorie:champ},
				success : function(response) {
					//alert(response);
					var projet = eval('(' + response + ')');
					
					var a = "";
					
					for ( var id in projet) {
						var video = [];
						var image = [];
						for ( var id0 in projet[id].medias) {
							if (projet[id].medias[id0].url != null
									&& projet[id].medias[id0].url != "") {
								video.push(projet[id].medias[id0].url);
							}
							if (projet[id].medias[id0].chemin != null
									&& projet[id].medias[id0].chemin != "") {
								image.push(projet[id].medias[id0].chemin);
							}

						}
						//alert(projet[id].medias[projet[id].medias.length-1].chemin);
						a += '<div class="col-xs-12 col-sm-6 col-md-3 col-lg-2" id=""><div class="row" id=""><div class="col-xs-12 col-sm-12 col-md-12 col-lg-12" id=""><a href="decouvrir?cat='+ projet[id].categorie.codeCategorie+'">'
						+ projet[id].categorie.libelle
						+ '</a></div></div><div class="row" id=""><div class="col-xs-12 col-sm-12 col-md-12 col-lg-12" id=""><img alt="'+ projet[id].titre+'" class="img-responsive center-block" src="'
						+ image[image.length - 1]+ '"></div></div><div class="row" id=""><a href="projetvue?codeP='+projet[id].codeProjet+'"><div class="col-xs-12 col-sm-12 col-md-12 col-lg-12" id="">'
						+ projet[id].titre
						+ '</div></a></div><div class="row" id=""><div class="col-xs-12 col-sm-12 col-md-12 col-lg-12 text-justify" id="">'
						+ projet[id].description + '</div></div></div>';
					}
					$("#projets").html(a);

				},
				error : function() {
					alert('Error while request..');
				}
			});
}