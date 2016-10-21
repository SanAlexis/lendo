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
		return true;
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
			return true;
		} else {
			// si le premier ou de le dernier caractère de la chaine est
			// correcte on teste la chaine
			var format = /[a-z0-9]+@+[a-z]+\.[a-z]/;
			if (format.test(str)) {
				// Si le format est valide on renvoit 1
				return false;
			} else {
				// Si le format est invalide on renvoit 0
				return true;
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
					var projet = eval('(' + response + ')');
					if (projet == "") {
						var b = '<li class="projet0"><a href="creerprojet">Vous n avez aucun projet, créez un projet ici</a></li>';
						$('.projet0').replaceWith(b);
					} else {
						// conversion de la reponse en objet javascript
						// manipulable
						
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
														url : "doConnexioncoockie",
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
						var b = "";
						// on parcourt tous les éléments du tableau
						for ( var id in categorie) {
							/*
							 * affichage des catégories et réglage de l'affichge
							 * à l'écran
							 */
							a += '<label class="btn btn-success  col-xs-6 col-sm-4 col-md-2 col-lg-2 "><input type="radio" name="categorie" class="cat" id="ca" value="'
									+ categorie[id].codeCategorie
									+ '">'
									+ categorie[id].libelle+ '</label>';
							b+='<a href="decouvrir?cat='+ categorie[id].codeCategorie+'">'+ categorie[id].libelle+'</a>';
						}
						$('#categorie').html(b);
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
function checkinfockeditor(champ1,champ2,champ3,champ4,champ5,champ6,champ7,champ8,champ9){
	// champ1 = information récupérée dans la Base de données
	// champ2 = champ boutton effacer le contenu de ckeditor
	// champ3 = champ qui contient le boutton pour mettre à jour la description détaillée du projet à partier de ckéditor
	// champ4 = champ qui va contenir le nom de la variable envoyée au serveur
	// champ5 = champ contenant l'url du script qui va traiter la requette
	// champ6 = Champ contenant le nom du textarea ou sera placé le ckéditor
	// champ7 = couleur de l'éditeur
	// champ8 = variable passé au serveur et qui contiendra le code du projet
	// cahmp9 = valeur du code du projet
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
				data : {presentation:editor.getData(),code_p:champ9},
				success : function(response) {
					$('#'+champ1).attr('value',
							editor.getData());
					alert("La description détaillée de votre projet a été mise à jour avec succès");
				},
				error : function() {
					alert('Error while request..');
				}
			});
			
		}
		
	});
}
/*
 * fonction permettant de l'ire une image et l'afficher
 */
function afficheImage(input,indice,champ) {
/*
 * champ = cham^p dans lequel sera affichée l'image
 * indice = numéro de l'image à récupérer
 */
    if (input.files && input.files[indice]) {
        var reader = new FileReader();

        reader.onload = function (e) {
            $(champ).attr('src', e.target.result);
        };

        reader.readAsDataURL(input.files[indice]);
    }
}


function resize(input,largeur,hauteur) {
	$( "#rr" ).on('click', function() {
		$( "#rr" ).hide();
		$( "#upload" ).show();
		//document.createElement('canvas');
		var canvas=document.getElementById("image_canvas");
		canvas.width = largeur;
		canvas.height = hauteur;
	    var ctx=canvas.getContext("2d");
	       //alert('offset: '+$('#resize').offset().top+'position: '+$('#resize').position().top);

			//alert('width: '+$('#resize').width()+'outerWidth: '+$('#resize').outerWidth());
			//alert('offset: '+$('#img').offset().left+'position: '+$('#img').position().left);
	        //ctx.drawImage(input.files[0],0,0,100,100,0,0,400,300);
	        var reader = new FileReader();
	        reader.onload = function (e) {
	        	var img= new Image();
	        	img.onload = function(){
	        		/*
					 * récupération de la date courante du serveur
					 */
					var current = $('#date').val();
					var date = new Date(current*1);
	        		ctx.drawImage(img,0,0,$('#img1').width(),$('#img1').height(),0,0,largeur,hauteur);
	        		ctx.fillText(date,largeur-128,hauteur-30);
	        		ctx.strokeText("Projet sur LENDO", largeur-100,hauteur-50);
	        	}
	        	img.src=e.target.result;
	        };

	        reader.readAsDataURL(input.files[0]);

	}); 
}

function uploadImageProjet(input,url0,champ) {
	//champ=variable contenant le code du projet
	$( "#upload" ).on('click', function() {
		var canvas=document.getElementById("image_canvas");
	    var ctx=canvas.getContext("2d");
	        var url = canvas.toDataURL();
	        $('#da').attr('src',url);

        	 $.ajax({
        			type : "post",
        			url : url0,
        			cache : false,
        			data : { image:url, codeu:champ },
        			contentType:"application/x-www-form-urlencoded",
        			  //processData: false,
        			 // contentType: false,
        			success : function(response) {
        				var r = eval('(' + response + ')');
        	        	 $( "#infos" ).modal("hide");
        			},
        			error : function() {
        				alert('Error while request..');
        			}
        		});

	}); 
}
/*
 * fonction permettant de récupérer une image dans un formulaire
 */
function getImage(indice){
	/*
	 * indice = position de l'image à récupérer
	 */
	imageFile = event.target.files[indice];
	var reader = new FileReader();
    reader.onload = function (event) {
    	var img= new Image();
    	img.src = event.target.result;
    };

    reader.readAsDataURL(this.imageFile);
	return imageFile;
}
/*
 * fonction permettant de convertir une image en canvas
 */
function canvas(input,indice){
	/*
	 * indice = position de l'image à convertir
	 */
	var canvas=document.createElement('canvas');
    var ctx=canvas.getContext("2d");
        var reader = new FileReader();
        reader.onload = function (e) {
        	var img= new Image();
        	img.onload = function(){
        		ctx.drawImage(img,$('#resize').position().left-15,$('#resize').position().top-15,$('#resize').width(),$('#resize').height(),0,0,300,150);
        		ctx.fillText("Lendo Projet",200,145);
        	}
        	img.src=e.target.result;
        };

        reader.readAsDataURL(input.files[indice]);
        return ctx.canvas;
	
}
/*
 * fonction permettant de convertir une image canvas en blob
 */
function canvasToBlob(canvas,image){
	/*
	 * image = image récupérée avec la fonction getImage(indice)
	 */
	var byteString = atob(canvas.toDataURL().split(",")[1]),
	ab = new ArrayBuffer(byteString.length),
	la = new Uint8Array(ab),
	i;
	for(i=0; i<byteString.length; i++){
		la[i]=byteString.charCodeAt(i);
	}
	return new Blob([ab], {type:image.type});
}
/*
 * fonction permettant d'envoyer une image au servaeur
 */
function uploadImge(blob,image,variable,url){
	/*
	 * canvas = canvas convertie en blob avec la fonction canvasToBlob()
	 * image = image récupérée avec la fonction getImage()
	 * variable = nom de la variable a envoyer au serveur
	 * url = url du serveur qui va traiter la requete
	 */
	var data = new FormData();
	data.append("blob",blob);
	data.append("blobName",image.name);
	data.append("blobType",image.type);
	$.ajax({
		type : "post",
		url : url,
		cache : false,
		data : "a="+blob,
		 // processData: false,
		 // contentType: false,
		success : function(response) {
			var r = eval('(' + response + ')');
			//alert(r);
		},
		error : function() {
			alert('Error while request..');
		}
	});
	
}
/*
 * Fonction permettant e traiter l'url de la vidéo
 */
function testVideoUrl(url,champ){
/*
 * url = url de la vidéo à tester
 * champ = champ d'affichage de la vidéo
 */	
	// Test du début de l'url
	var first = /^[https://www.youtube.com/watch?v=]{32}/;
	var second = /^[www.youtube.com/watch?v=]{24}/;
	var tird = /^[http://www.youtube.com/watch?v=]{31}/;
	var urllength = url.length;
	var frame_url = "http://www.youtube.com/embed/";
	
		if(first.test(url)){
			var url0 = url.substring(32,urllength);
			$('#'+champ).attr('src', frame_url+url0);
		}else{
			if(second.test(url)){
				var url0 = url.substring(24,urllength);
				$('#'+champ).attr('src', frame_url+url0);
		}else{
			if(tird.test(url)){
				var url0 = url.substring(31,urllength);
				$('#'+champ).attr('src', frame_url+url0);
			}else{
				alert("Veuillez entrer une URL youtube valide");
			}
		}
			
		} 
}
/*
 * fonction permettant de récupérer la date courante du serveur
 */
function getServerDate(champ){
/*
 * champ = variable dans laquelle sera stockée le résultat
 */
	 $.ajax({
			type : "post",
			url : "GetServerDate",
			cache : false ,
			  //processData: false,
			 // contentType: false,
			success : function(response) {
				var r = eval('(' + response + ')');
				$('#'+champ).attr('value',r);
				
			},
			error : function() {
				alert('Impossible de récupérer la date du serveur');
			}
		});
}
/*
 * fonction permettant de réccupérer tous les projets de la BD
 */

function loadprojetallprojet() {
	$
			.ajax({
				type : "post",
				url : "consulterprojetallprojet",
				cache : false,
				data : {},
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

function ajax_requete_lance_desactive_fenetre(){
	$("#ajax_req_desactive").modal({
		backdrop : 'static',
		keyboard : false,
		show : true
	});
}


function ajax_requete_termine_active_fenetre(){
	$("#ajax_req_desactive").modal("hide");
}