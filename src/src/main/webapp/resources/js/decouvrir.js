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
	loadprojetcategorie1();
});
