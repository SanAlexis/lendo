/**
 * 
 */
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
	/*
	 * on récupère les projets de l'utilisateur sur le serveur
	 */
	loadprojetuser();
	/*
	 * on rafraichit la liste des projets de l'utilisateur toutes les 03 minutes
	 */
	window.setInterval("loadprojetuser()", 180000);
	
	/*
	 * touche de déconnexion de l'uttilisateur
	 */
	$('#deconnexion').on('click', function() {
		deconnexion();
		connecte();
	});
});
