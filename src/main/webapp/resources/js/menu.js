/**
 * 
 */
$(function() {
	if($("#code_utilisateur").val()=="null" || $("#code_utilisateur").val()==""){
		$('.connecte')
		.hide();
$('.deconnecte')
		.show();
	}
	var element = document.createElement("ul");
	element.id="r_search";
	// transformecurseur('#option', 'pointer','none');
	/*
	 * on vérifie si un utilisateur est connecté
	 */
	connecte();
	/*
	 * récupération de la date courante du serveur
	 */
	getServerDate("date");

	/*
	 * on refait la vérification toutes les 03 secondes
	 */
	window.setInterval("connecte()", 3000);
	/*
	 * on récupère les projets de l'utilisateur sur le serveur
	 */
	loadprojetuser();
	/*
	 * on rafraichit la liste des projets de l'utilisateur toutes les 03 minutes
	 */
	//window.setInterval("loadprojetuser()", 180000);
	$('#search').on('focus', function() {
		$('#btn_search').css('background', '#FBAF3F').css('color', '#652C90');
		
	});
	$('#search').on('blur', function() {
		$('#btn_search').css('background', '#652C90').css('color', '#FBAF3F');
		
	});
	/*
	 * touche de déconnexion de l'uttilisateur
	 */
	$('#deconnexion').on('click', function() {
		deconnexion();
		connecte();
	});
	/*
	 * rechercher un projet par son titre dans la barre de recherche
	 */
	$('#search').on('keyup change click', function() {
		if($('#search').val()!=""){
			$
			.ajax({
				type : "post",
				url : "consulterprojetbytitre",
				cache : false,
				data : {titre:$('#search').val()},
				success : function(response) {
					var projet = eval('(' + response + ')');
					var a="";

					
					for ( var id in projet) {
						a+='<li><a href="projetvue?codeP='+projet[id].codeProjet+'">'+projet[id].titre+'</a></li>';

					}
					element.innerHTML = a;
					//var resultat = document.getElementById("r_search");
					
					$('body').append( element);
					document.getElementById("r_search").offsetTop= "10px";
					//alert(document.getElementById("r_search").offsetTop);
					//$('#result_search').html(a);
					//alert(response);
				},
				error : function() {
					alert('Error while request..');
				}
			});
		}
		
	});
});
