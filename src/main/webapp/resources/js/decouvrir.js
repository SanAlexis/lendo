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
						
						var contrib_montant = 0;


						for ( var id2 in projet[id].contributions) {

							contrib_montant += projet[id].contributions[id2].montant;
							
						}
						
						
						getServerDate("date");
						var current = $('#date').val();
						var date_fin_campagne = projet[id].dureeCampagne * 24 * 60
						* 60 * 1000 + projet[id].dateDebutCampagne;
						var diff = date_fin_campagne - current;
						/*
						 * nombre de jours restants
						 */
						var nbre_jour = Math.floor(diff / (24 * 60 * 60 * 1000));
						
						var jour_restant = '<div class="row" id=""><div class="col-xs-12 col-sm-12 col-md-12 col-lg-12" id="">'+nbre_jour+' Jours restants</div></div>';
						
						var pourcentage = (contrib_montant / projet[id].montantAttendu) * 100;
						var recolte = '<div class="row" id=""><div class="col-xs-12 col-sm-12 col-md-12 col-lg-12" id=""><span class="glyphicon glyphicon-piggy-bank  " style="color:"></span>  ' + contrib_montant + ' XAF</div></div>';
						
						var lenders = '<div class="row" id=""><div class="col-xs-12 col-sm-12 col-md-12 col-lg-12" id=""><span class="glyphicon glyphicon-user  " style="color:"></span>  '
						+ projet[id].contributions.length
						+ ' Lenders</div></div>';
						
						var attente = '<div class="row" id=""><div class="col-xs-12 col-sm-12 col-md-12 col-lg-12" id=""><span class="glyphicon glyphicon-usd  " style="color:"></span> '
						+ projet[id].montantAttendu
						+ ' XAF</div></div>';

						var progress = '<div class="row" id=""><div class="col-xs-12 col-sm-12 col-md-12 col-lg-12" id=""><div class="progress"><div class="progress-bar" role="progressbar" aria-valuenow="0" aria-valuemin="0" aria-valuemax="100" style="min-width: 2em; width:; background-color: ;'
												+ pourcentage
												+ '%">'
												+ pourcentage
												+ ' %</div></div></div></div>';
						
						var date_fin_campagne = projet[id].dureeCampagne * 24 * 60 * 60 * 1000 + projet[id].dateDebutCampagne;
						var date_fin = new Date(date_fin_campagne).toLocaleDateString();
						var fin ='<div class="row" id=""><div class="col-xs-12 col-sm-12 col-md-12 col-lg-12" id="">Cloture : '+date_fin+'</div></div>';
						var localisation ='<div class="row" id=""><div class="col-xs-12 col-sm-12 col-md-12 col-lg-12" id="">'+projet[id].ville+'-'+projet[id].pays+'</div></div>';
						var catego ='<div class="row" id=""><div class="col-xs-12 col-sm-12 col-md-12 col-lg-12" id=""><a href="decouvrir?cat='+ projet[id].categorie.codeCategorie+'">'
						+ projet[id].categorie.libelle
						+ '</a></div></div>';
						var i;
						if(image.length<1){
							i=$("#alt_image").val();
						}else{
							i=image[image.length - 1];
						}
						var imag='<div class="row" id=""><div class="col-xs-12 col-sm-12 col-md-12 col-lg-12" id=""><img alt="'+ projet[id].titre+'" class="img-thumbnail img-responsive center-block" src="'
						+ i+ '"></div></div>';
						var titr='<div class="row" id=""><a href="projetvue?codeP='+projet[id].codeProjet+'"><div class="col-xs-12 col-sm-12 col-md-12 col-lg-12" id="">'
						+ projet[id].titre
						+ '</div></a></div>';
						var descript='<div class="row" id=""><div class="col-xs-12 col-sm-12 col-md-12 col-lg-12 text-justify" id="" >'
							+ projet[id].description + '</div></div>';
						//alert(projet[id].medias[projet[id].medias.length-1].chemin);
						a += '<div class="col-xs-12 col-sm-6 col-md-3 col-lg-2 cadre_projet" id=""><div class="row " id=""><div class="col-xs-12 col-sm-12 col-md-12 col-lg-12 cadre_projet2" id="" >'+catego+imag+titr+descript+recolte+lenders+attente+progress+localisation+jour_restant+fin+'</div></div></div>';
					}
					$("#projets").html(a);

				

				},
				error : function() {
					alert('Error while request..');
				}
			});
}