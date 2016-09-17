/**
 * fichier contenant nos fonctions
 */

/*
 * Fonction permettant de tester la validité du format d'une adresse email
 */
function testformatemail(str) {
	// Définition des caractères non autorisés dans une adresse email
	var autorisation = /[^a-zA-Z0-9.@_-]/;

	if (autorisation.test(str)) {
		// s'il y'a un caratère non autorisé, on retourne 0 et le test s'arrête
		return 0;
	} else {
		// Tous les caractères sont autorisés, on continu le test
		// vérification du format de l'adresse email

		// premier caractère de la chaine
		var format1 = /^[-@._]{1}/;

		// dernier caractère de la chaine
		var format2 = /[_.@-]$/;
		if (format1.test(str) || format2.test(str)) {
			// si le premier ou de le dernier caractère de la chaine est
			// incorrecte on renvoit 0
			return 0;
		} else {
			// si le premier ou de le dernier caractère de la chaine est
			// correcte on teste la chaine
			var format = /[a-z0-9]+@+[a-z]+\.[a-z]/;
			if (format.test(str)) {
				// Si le format est valide on renvoit 1
				return 1;
			} else {
				// Si le format est invalide on renvoit 0
				return 0;
			}
		}

	}
}
/*
 * fonction permettant de tester la disponiblité d'une adresse email
 */

function testdisponibiliteemail(email) {
	var a = testformatemail(email);
	if (a == 1) {
		$.ajax({
			type : "post",
			url : "testdiponibiliteemail",
			cache : false,
			data : 'email=' + email,
			success : function(response) {

				return response;
			},
			error : function() {
				alert('Error while request..');
			}
		});
	} else {
		// retourne 0 si l'adresse email est invalide
		return 0;
	}

}
/*
 * Fonction permettant de masquer un element
 */
function masque(element, vitesse) {
	if (vitesse == "") {
		$(element).fadeOut("fast");
	} else {
		$(element).fadeOut(vitesse);
	}

}
/*
 * Fonction permettant d'afficher un élément
 */
function affiche(element, vitesse) {
	if (vitesse == "") {
		$(element).fadeIn("fast");
	} else {
		$(element).fadeIn(vitesse);
	}

}
/*
 * Transformer le curseur de la souris
 */
function transformecurseur(element, modele, decoration) {
	$(element).hover(function() {
		$(element).css('cursor', modele).css('text-decoration', decoration);
	});
}

/*
 * Fonction permettant de tester la validité d'un mot de passe
 */
function testpassword(str) {
	// Test du premier caractère de la chaine
	var first = /^[A-Z]{1}/;

	if (!first.test(str)) {
		// Si le premier caractère est invalide, on retourne 0
		return 0;
	} else {
		// Si le caractère est autorisé
		// on teste si le mot de passe contient un chiffre
		var chiffre = /[0-9]/;
		if (!chiffre.test(str)) {
			// Si la chaine ne contient aucun chiffre on retourne 0
			return 0;
		} else {
			// si la chaine contient au moins un chiffre
			// on teste la longueur de la chaine
			var longueur = 8;
			if (str.length < longueur) {
				// Si la longueur de la chaine n'est pas valide, on retourne 0
				return 0;
			} else {
				// dans le cas contraire on retourne 1
				return 1;
			}
		}
	}
}
/*
 * fonction permettant de tester la longueur d'une chaine de caractère
 */
function longueur(str, min, max) {

	if (min <= str.length && str.length <= max) {
		// Si la chaine de caractère est comprise entre le min et le max requis,
		// on retourne 1
		return 1;
	} else {
		// Dans le cas contraire, on retourne 0
		return 0;
	}

}
/*
 * Fonction permettant de tester la vameur d'un champ
 */
function valeur(str, min, max) {

	if (min <= str && str <= max) {
		// Si la chaine de caractère est comprise entre le min et le max requis,
		// on retourne 1
		return 1;
	} else {
		// Dans le cas contraire, on retourne 0
		return 0;
	}

}

/*
 * Fonction permettant de gérer l'affichage des information
 */
function checkinfo(champ1, champ2, champ3, champ4, champ5, champ6, champ7,
		champ8) {
	// champ1 = information récupérée dans la Base de données
	// champ2 = champ ou l'utilisateur doit saisir ses infos
	// champ4 = champ à afficher au cas où une valeur est retournée par la Base
	// de donnée
	// champ5 = champ à afficher au cas où aucune valeur n'est retournée par la
	// Base de donnée
	// champ6 = message à afficher au survol du curseur
	// champ7 = boutton annuler
	// champ8 = boutton soummettre
	// champ3 = champ qui contient l'url qui va traiter le formulaire lorqu'on
	// le soumet

	// on masque le champ de saisie de l'utilisateur
	$("#" + champ4).on('mouseenter', function() {
		// $("#"+champ4).css('text-decoration','underline');
		transformecurseur($("#" + champ4), 'pointer', 'none');
		$("#" + champ4).addClass("glyphicon glyphicon-pencil");
	});
	$("#" + champ4).on('mouseout', function() {
		// $("#"+champ4).css('text-decoration','underline');
		transformecurseur($("#" + champ4), 'pointer', 'underline');
		$("#" + champ4).removeClass("glyphicon glyphicon-pencil");
	});
	$("#" + champ2).on(
			'keyup click change',
			function() {
				if ($('#' + champ1).val() != $('#' + champ2).val()
						&& $('#' + champ2).val() != "") {
					$("#" + champ8).removeAttr("disabled");
				} else {
					$("#" + champ8).attr('disabled', 'disabled');
				}
			});
	$('#' + champ2).hide();
	$('#' + champ7).hide();
	$('#' + champ8).hide();

	$("#" + champ4).on('click', function() {
		$("#" + champ2).attr('value', $("#" + champ1).val());
		$('#' + champ2).show();
		$('#' + champ7).show();
		$('#' + champ8).show();
		// on masque le champ
		$("#" + champ4).hide();
	});

	if ($('#' + champ1).val() != "") {
		$('#' + champ7).hide();
		$('#' + champ8).hide();
		$("#" + champ4).html($('#' + champ1).val());
		$("#" + champ4).on('mouseenter', function() {
			$("#" + champ4).html(champ6);

		});
		$("#" + champ4).on('mouseout', function() {
			$("#" + champ4).html($('#' + champ1).val());

		});

		$("#" + champ7).on('click', function() {
			// on masque le champ
			$("#" + champ2).hide();

			$('#' + champ4).show();
			$('#' + champ7).hide();
			$('#' + champ8).hide();
		});
		$("#" + champ2).on(
				'keyup click',
				function() {
					if ($('#' + champ1).val() != $('#' + champ2).val()
							&& $('#' + champ2).val() != "") {
						$("#" + champ8).removeAttr("disabled");
					} else {
						$("#" + champ8).attr('disabled', 'disabled');
					}
				});
	} else {
		if ($('#' + champ1).val() != "") {
			$("#" + champ4).on('mouseout', function() {
				$("#" + champ4).html($('#' + champ1).val());

			});
		} else {

		}
		$("#" + champ4).html(champ5);
		$("#" + champ7).on('click', function() {
			// on masque le champ
			$("#" + champ2).hide();

			$('#' + champ4).show();
			$('#' + champ7).hide();
			$('#' + champ8).hide();
		});
		$("#" + champ4).on('mouseenter', function() {
			if ($('#' + champ1).val() != "") {
				$("#" + champ4).html(champ6);

			} else {
				$("#" + champ4).html(champ5);

			}

		});
		$("#" + champ4).on('mouseout', function() {

			if ($('#' + champ1).val() != "") {
				$("#" + champ4).html($('#' + champ1).val());

			} else {
				$("#" + champ4).html(champ5);

			}

		});

	}
}

function updateinfo(champ1, champ2, champ3, champ4, champ5, champ6, champ7,
		champ8, champ9, champ10, champ11, champ12, champ13) {
	// champ1= id du boutton de soumission
	// champ2= url du controller java qui va traiter la soumission
	// Champ3 = méthode de soumission (GET ou POST)
	// champ4 = nom du champ qui sera soumis au controlleur
	// champ5 = code de l'utilisateur
	// champ6 = champ contenant l'information à mettre à jour
	// champ7 = champ ou sera stockée la nouvelle valeur mise à jour
	// champ8 = champ de mise à jour de l'ancienne valeur retournée par la bd
	// champ9 = champ contentant le boutton annuler
	// champ10 = champ contentant le message d'erreur
	$("#" + champ1)
			.on(
					'click',
					function() {
						$
								.ajax({
									type : champ3,
									url : champ2,
									timeout : 3000,
									cache : false,
									data : champ4 + '=' + $('#' + champ6).val()
											+ "&&codeu="
											+ $('#' + champ5).val(),
									success : function(data) {
										var user = eval('(' + data + ')');
										$('#' + champ6).hide();
										$('#' + champ9).hide();
										$('#' + champ1).hide();
										$("#" + champ7).attr('value',
												$('#' + champ6).val());
										$("#" + champ8).html(
												$('#' + champ6).val());
										$('#' + champ8).show();
										$("#" + champ8)
												.on(
														'keyup click',
														function() {
															if ($('#' + champ7)
																	.val() != $(
																	'#'
																			+ champ6)
																	.val()
																	&& $(
																			'#'
																					+ champ6)
																			.val() != "") {
																$("#" + champ1)
																		.removeAttr(
																				"disabled");
															} else {
																$("#" + champ1)
																		.attr(
																				'disabled',
																				'disabled');
															}
														});
									},
									error : function() {
										alert(champ10);
									}
								});
					});
}

/*
 * fonction permettant de charger les projets d'un utilisateur
 */
function loadprojetuser() {
	// récupération du code de l'utilisateur
	var code_utilisateur = $('#code_utilisateur').val();
	$
			.ajax({
				type : "post",
				url : "consulterprojetutilisateur",
				cache : false,
				data : 'codeU=' + code_utilisateur,
				success : function(response) {
					if (response == "") {
						var b = '<li class="projet0"><a href="creerprojet">Vous n avez aucun projet, créez un projet ici</a></li>';
						$('.projet0').replaceWith(b);
					} else {
						// conversion de la reponse en objet javascript
						// manipulable
						var projet = eval('(' + response + ')');
						var a = "";
						// on parcourt tous les éléments du tableau
						for ( var id in projet) {

							// a+=projet[id];
							a += '<li class="projet0"><a href="parametrerprojet?codeP='
									+ projet[id].codeProjet
									+ '">'
									+ projet[id].titre + '</a></li>';
						}
						$('.projet0').replaceWith(a);
					}

				},
				error : function() {
					alert('Error while request..');
				}
			});
}

/*
 * fonction permettant de vérifier si un champ est coché et renvoi trou si c'est
 * vrai et false si c'est faux
 */
function look(champ) {
	if ($(':radio[name="check"]:checked').val()=="true") {
		return true;
	} else {
		return false;
	}
}
/*
 * fonction permettant de vérifier s'il y a des cookies sur le navigateur
 */
function testcookie() {

	$
			.ajax({
				type : "post",
				url : "testcookie",
				cache : false,
				success : function(response) {
					var cookie = eval('(' + response + ')');
					if (cookie[1].value != "" && cookie[2].value != "") {
						/*
						 * s'i y a des coockies et ils ne sont pas vide on
						 * connecte l'utilisateur
						 */
						var email = cookie[1].value;
						var password = cookie[2].value;
						// connexion de l'utilisateur

						$
								.ajax({
									type : "post",
									url : "doConnexioncoockie",
									cache : false,
									data : "email=" + email + "&&password="
											+ password,
									success : function(response) {
										var connexion = eval('(' + response
												+ ')');
										/*
										 * on vérifie si la fonction a réussi
										 * (si on a un code d'utilisateur
										 */
										if (!connexion) {
											/*
											 * en cas d'échec on envoi un
											 * message d'alerte in vitant
											 * l'utilisateur à réessayer
											 */
											alert("Erreur: votre connexion à Lendo n'a pas réussi. veuillez réessayer plus tard...");
										} else {
											/*
											 * en cas de succès, on redirige
											 * l'utilisateur vèrs la page
											 * d'acceuil
											 */

										}

									}
								});
					} else {
						/*
						 * dans le cas contraire on ne fait rien
						 */
						$('.connecte').hide();
						$('.deconnecte').show();
						$("#code_utilisateur").attr('value', 'null');

					}

				}
			});
}
/*
 * fonction permettant de vérifier s'il y a un utilisateur connecté ou s'il
 * existe des cookies sur le navigateur
 */
function connecte() {
	$
			.ajax({
				type : "post",
				url : "testconnecte",
				cache : false,
				success : function(response) {
					if (response == "null") {
						/*
						 * il n y'a aucune session en cours dans le navigateur
						 * 
						 * on vérifie s'il existe des cookies
						 */
						$
								.ajax({
									type : "post",
									url : "testcookie",
									cache : false,
									success : function(response) {
										var cookie = eval('(' + response + ')');
										if (!response || cookie[0].value == ""
												|| cookie[1].value == "") {

											/*
											 * il n'existe pas de cookies
											 * valides dans le navigateur
											 */
											$('.connecte').hide();
											$('.deconnecte').show();
											$("#code_utilisateur").attr(
													'value', 'null');
										} else {

											/*
											 * il existe des cookies valides sur
											 * dans le navivateur
											 * 
											 * on tente la connexion de
											 * l'utilisateur avec ces cookies
											 */
											/*
											 * récupération des cookies
											 */

											var email = cookie[0].value;
											var password = cookie[1].value;
											// tentative de connexion de
											// l"utilisateur
											$
													.ajax({
														type : "post",
														url : "doConnexion",
														cache : false,
														data : "email=" + email
																+ "&&password="
																+ password,
														success : function(
																response) {
															var connexion = eval('('
																	+ response
																	+ ')');
															if (!connexion) {
																/*
																 * en cas
																 * d'echec de
																 * connexion
																 */
																$('.connecte')
																		.hide();
																$('.deconnecte')
																		.show();
																$(
																		"#code_utilisateur")
																		.attr(
																				'value',
																				'null');
																/*
																 * on envoi un
																 * message
																 * d'alerte à
																 * l'utilisateur
																 */
																alert("Erreur: votre dernière session n'a pas pu être récupérée; veuillez vous reconnecter");
															} else {
																/*
																 * en cas de
																 * succès de
																 * connexion
																 */
																$('.deconnecte')
																		.hide();
																$('.connecte')
																		.show();
																$(
																		"#code_utilisateur")
																		.attr(
																				'value',
																				response);

															}

														}
													});
										}

									}
								});
					} else {
						// s'il y a une connexion en cours
						$('.deconnecte').hide();
						$('.connecte').show();
						$("#code_utilisateur").attr('value', response);
					}
				}
			});
}

/*
 * fonction permettant de déconnecter un utilisateur
 */
function deconnexion() {

	$.ajax({
		type : "post",
		url : "deconnexion",
		cache : false,
		success : function(response) {

		}
	});
}
function test_connect() {
	// si aucun utilisateur n'est connecté, on le laisse accéder à la page
	if ($("#code_utilisateur").val() == "null"
			|| $("#code_utilisateur").val() == "") {
	} else {
		// si un utilisateur est connecté, on le redirige vers la page d'acceuil
		document.location.href = "index";
	}
}
function test_connect1() {
	// si aucun utilisateur n'est connecté, on le laisse accéder à la page
	if ($("#code_utilisateur").val() == "null"
			|| $("#code_utilisateur").val() == "") {
		document.location.href = "connexion";
	} else {
		// si un utilisateur est connecté, on le redirige vers la page d'acceuil

	}
}

/*
 * fonction permettant de charger les catégories de projet pour la page de
 * création des projet
 */
function loadprojetcategorie() {
	$.ajax({
		type : "post",
		url : "consulterprojetcategorie",
		cache : false,
		data : '',
		success : function(response) {
			if (response == "") {
				var b = '<option class="categorie"></option>';
				$('.categorie').replaceWith(b);
			} else {
				// conversion de la reponse en objet javascript
				// manipulable
				var categorie = eval('(' + response + ')');
				var a = "";
				// on parcourt tous les éléments du tableau
				for ( var id in categorie) {

					// a+=projet[id];
					a += '<option value="' + categorie[id].codeCategorie + '">'
							+ categorie[id].libelle + '</option>';
				}
				$('.categorie').replaceWith(a);
			}

		},
		error : function() {
			alert('Error while request..');
		}
	});
}

/*
 * fonction permettant de charger les catégories de projet pour la page de
 * décoverte
 */
function loadprojetcategorie1() {
	$
			.ajax({
				type : "post",
				url : "consulterprojetcategorie",
				cache : false,
				data : '',
				success : function(response) {
					if (response == "") {
						var b = '';
						$('.categorie').replaceWith(b);
					} else {
						// conversion de la reponse en objet javascript
						// manipulable
						var categorie = eval('(' + response + ')');
						var a = "";
						// on parcourt tous les éléments du tableau
						for ( var id in categorie) {
							/*
							 * affichage des catégories et réglage de l'affichge
							 * à l'écran
							 */
							a += '<label class="btn btn-success visible-xs col-xs-12"><input type="radio" class="" value="'
									+ categorie[id].codeCategorie
									+ '">'
									+ categorie[id].libelle
									+ '</label><label class="btn btn-success visible-sm col-sm-3"><input type="radio" class="" value="'
									+ categorie[id].codeCategorie
									+ '">'
									+ categorie[id].libelle
									+ '</label><label class="btn btn-success visible-md col-md-3"><input type="radio" class="" value="'
									+ categorie[id].codeCategorie
									+ '">'
									+ categorie[id].libelle
									+ '</label><label class="btn btn-success visible-lg col-lg-3"><input type="radio" class="" value="'
									+ categorie[id].codeCategorie
									+ '">'
									+ categorie[id].libelle + '</label>';
						}
						$('.categorie').replaceWith(a);
					}

				},
				error : function() {
					alert('Error while request..');
				}
			});
}

/*
 * Fonction permettant de gérer l'affichage des information
 */
function checkinfocke(champ1, champ2, champ3, champ4, champ5, champ6, champ7,
		champ8) {
	// champ1 = information récupérée dans la Base de données
	// champ2 = champ ou l'utilisateur doit saisir ses infos
	// champ4 = champ à afficher au cas où une valeur est retournée par la Base
	// de donnée
	// champ5 = champ à afficher au cas où aucune valeur n'est retournée par la
	// Base de donnée
	// champ6 = message à afficher au survol du curseur
	// champ7 = boutton annuler
	// champ8 = boutton soummettre
	// champ3 = champ qui contient l'url qui va traiter le formulaire lorqu'on
	// le soumet

	// on masque le champ de saisie de l'utilisateur
	$("#" + champ4).on('mouseenter', function() {
		// $("#"+champ4).css('text-decoration','underline');
		transformecurseur($("#" + champ4), 'pointer', 'none');
		$("#" + champ4).addClass("glyphicon glyphicon-pencil");
	});
	$("#" + champ4).on('mouseout', function() {
		// $("#"+champ4).css('text-decoration','underline');
		transformecurseur($("#" + champ4), 'pointer', 'underline');
		$("#" + champ4).removeClass("glyphicon glyphicon-pencil");
	});
	$("#" + champ2).on(
			'keyup click change',
			function() {
				if ($('#' + champ1).val() != $('#' + champ2).val()
						&& $('#' + champ2).val() != "") {
					$("#" + champ8).removeAttr("disabled");
				} else {
					$("#" + champ8).attr('disabled', 'disabled');
				}
			});
	$('#' + champ2).hide();
	$('#' + champ7).hide();
	$('#' + champ8).hide();

	$("#" + champ4).on('click', function() {
		$("#" + champ2).attr('value', $("#" + champ1).val());
		$('#' + champ2).show();
		$('#' + champ7).show();
		$('#' + champ8).show();
		// on masque le champ
		$("#" + champ4).hide();
	});

	if ($('#' + champ1).val() != "") {
		$('#' + champ7).hide();
		$('#' + champ8).hide();
		$("#" + champ4).html($('#' + champ1).val());
		$("#" + champ4).on('mouseenter', function() {
			$("#" + champ4).html(champ6);

		});
		$("#" + champ4).on('mouseout', function() {
			$("#" + champ4).html($('#' + champ1).val());

		});

		$("#" + champ7).on('click', function() {
			// on masque le champ
			$("#" + champ2).hide();

			$('#' + champ4).show();
			$('#' + champ7).hide();
			$('#' + champ8).hide();
		});
		$("#" + champ2).on(
				'keyup click',
				function() {
					if ($('#' + champ1).val() != $('#' + champ2).val()
							&& $('#' + champ2).val() != "") {
						$("#" + champ8).removeAttr("disabled");
					} else {
						$("#" + champ8).attr('disabled', 'disabled');
					}
				});
	} else {
		if ($('#' + champ1).val() != "") {
			$("#" + champ4).on('mouseout', function() {
				$("#" + champ4).html($('#' + champ1).val());

			});
		} else {

		}
		$("#" + champ4).html(champ5);
		$("#" + champ7).on('click', function() {
			// on masque le champ
			$("#" + champ2).hide();

			$('#' + champ4).show();
			$('#' + champ7).hide();
			$('#' + champ8).hide();
		});
		$("#" + champ4).on('mouseenter', function() {
			if ($('#' + champ1).val() != "") {
				$("#" + champ4).html(champ6);

			} else {
				$("#" + champ4).html(champ5);

			}

		});
		$("#" + champ4).on('mouseout', function() {

			if ($('#' + champ1).val() != "") {
				$("#" + champ4).html($('#' + champ1).val());

			} else {
				$("#" + champ4).html(champ5);

			}

		});

	}
}
/*
 * Fonction permettant de gérer notre éditeur ckéditor
 */
function checkinfockeditor(champ1,champ2,champ3,champ4,champ5,champ6,champ7){
	// champ1 = information récupérée dans la Base de données
	// champ2 = champ boutton effacer le contenu de ckeditor
	// champ3 = champ qui contient le boutton pour mettre à jour la description détaillée du projet à partier de ckéditor
	// champ4 = champ qui va contenir le nom de la variable envoyée au serveur
	// champ5 = champ contenant l'url du script qui va traiter la requette
	// champ6 = Champ contenant le nom du textarea ou sera placé le ckéditor
	// champ7 = couleur de l'éditeur
	/*
	 * Chargement de l'éditeur ckéditor
	 */
	 editor=CKEDITOR.replace( champ6,
             {                                       
              forcePasteAsPlainText : true,
              width   : '100%',
              uiColor : champ7                       
              });

	if ($('#' + champ1).val() == ""){
		//si la présentation détaillée du projet est vide
		var texte;
		texte="<p><strong>VEUILLEZ ENTRER LA DESCRIPTION DETAILLER DE VOTRE PROJET</strong></p><hr /><p>&nbsp;</p>";
		editor.setData(texte);
	}else{
		/*
		 * Chargement de la présentation du projet récupérée dals la BD dans ckeditor
		 */editor.setData($('#' + champ1).val());
	}
	$("#" + champ2).on('click', function() {
		var texte;
		texte="";
		editor.setData(texte);
	});
	$("#" + champ3).on('click', function() {
		if(editor.getData()==""){
			/*
			 * Si l'éditeur est vide, on envoit un message d'alerte à l'utilisateur
			 */
			alert("Veuillez entrer la présentation détaillée de votre projet dans l'éditeur");
		}else{
			/*
			 * Si l'éditeur n'est pas vide on envoit les données auserveur
			 */
			$
			.ajax({
				type : "post",
				url : champ5,
				cache : false,
				data : champ4 + '=' + editor.getData(),
				success : function(response) {
					alert("La description détaillée de votre projet a été mise à jour avec succès");
				},
				error : function() {
					alert('Error while request..');
				}
			});
			
		}
		
	});
}

