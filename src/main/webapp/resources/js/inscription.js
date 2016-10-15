/**
 * 
 */
/*
 * Fonction permettant de vérifier le formulaire
 */

$(function() {
	//on masque la barre de menu
	$('#menur_bar').hide();
	//test de connexion pour l'accès à la page de connexion
	test_connect();
	window.setInterval("test_connect()",3000);
	transformecurseur('#option', 'pointer', 'none');
	masque(".help-block");
	$('#nom').on(
			'keyup click',
			function() {
				var a = $('#nom').val();
				var b = longueur(a, 1, 30);
				$('#c').attr('value', b);
				check();
				if (b == 1) {
					$('#div-nom').removeClass('has-warning').addClass(
							'has-success').addClass('has-feedback');
					$('#glyph-nom').removeClass('glyphicon-warning-sign')
							.addClass('glyphicon-ok');
					masque("#error-nom");
				} else {
					$('#div-nom').removeClass('has-success').addClass(
							'has-warning').addClass('has-feedback');
					$('#glyph-nom').removeClass('glyphicon-ok').addClass(
							'glyphicon-warning-sign');
					affiche("#error-nom");
				}
			});

	$('#email').on(
			'keyup click',
			function() {
				
				var a = $('#email').val();
				var b = testformatemail(a);
				
				if (b == 0) {
					$('#a').attr('value', b);
					check();
					$('#div-email').removeClass('has-success').addClass(
							'has-error').addClass('has-feedback');
					$('#glyph-email').removeClass('glyphicon-ok').addClass(
							'glyphicon-remove');
					affiche("#error-email");
				} else {
					$.ajax({
						type : "post",
						url : "testdiponibiliteemail",
						cache : false,
						data : 'email=' + a,
						success : function(response) {
							$('#a').attr('value', response);
							check();
							if (response == 0) {
								$('#div-email').removeClass('has-success')
										.addClass('has-error').addClass(
												'has-feedback');
								$('#glyph-email').removeClass('glyphicon-ok')
										.addClass('glyphicon-remove');
								affiche("#error-email");
							} else {
								$('#div-email').removeClass('has-error')
										.addClass('has-success').addClass(
												'has-feedback');
								$('#glyph-email').removeClass(
										'glyphicon-remove').addClass(
										'glyphicon-ok');
								masque("#error-email");
							}
						}
					});
				}
			});

	$('.vue').click(
			function() {
				check();
				if ($('#password').attr('type') == "password") {
					$('#password').attr('type', 'text');
				} else {
					$('#password').attr('type', 'password');
				}
				$('.vue').toggleClass('glyphicon-eye-close').toggleClass(
						'glyphicon-eye-open');
			});

	$('#password').on(
			'keyup click',
			function() {
				var a = $('#password').val();
				var b = testpassword(a);
				$('#b').attr('value', b);
				$('#pass').attr('value', a);
				check();
				if (b == 0) {
					$('#div-password').removeClass('has-success').addClass(
							'has-warning').addClass('has-feedback');
					$('#glyph-password').removeClass('glyphicon-ok').addClass(
							'glyphicon-warning-sign');
					affiche("#error-password");
				} else {
					$('#div-password').removeClass('has-warning').addClass(
							'has-success').addClass('has-feedback');
					$('#glyph-password').removeClass('glyphicon-warning-sign')
							.addClass('glyphicon-ok');
					masque("#error-password");
				}
			});
	$('#prenom').on('keyup click', function() {
		check();
	});
	$('#check').on('keyup click', function() {
		check();
	});
	$( "input[name='check']" ).on('keyup change click', function() {
		check();
	});
	$('#submit').on('click', function() {
		inscription();
	});

});
/*
 * fonction permettant de vérifier si tous les champs du formulaire sont
 * corrects
 */
function check() {
	if ($('#a').val() == 1 && $('#b').val() == 1 && $('#c').val() == 1
			&& $(':radio[name="check"]:checked').val()=="true") {
		$("#submit").removeAttr("disabled");
	} else {
		$('#submit').attr('disabled', 'disabled');
	}
}
/*
 * fonction permettant d'inscrire un utilisateur
 */
function inscription() {
	var nom = $('#nom').val().toUpperCase();
	var prenom = $('#prenom').val().toLowerCase();
	var email = $('#email').val();
	var password = $('#password').val();
	$
			.ajax({
				type : "post",
				url : "doinscription",
				cache : false,
				data : 'nom=' + nom + "&&prenom=" + prenom + "&&email=" + email
						+ "&&password=" + password,
				success : function(response) {
					var user = eval('(' + response + ')');
					/*
					 * on vérifie si la fonction a réussi (si on a un code d'utilisateur
					 */
					if(!user.codeUtilisateur){
						/*
						 * en cas d'échec on envoi un message d'alerte in vitant l'utilisateur à réessayer
						 */
						alert("Erreur: votre incription à Lendo n'a pas réussi. veuillez réessayer plus tard...");
					}else{
						/*
						 * en cas de succès, on redirige l'utilisateur vèrs la page de connexion
						 */
						document.location.href="connexion";
					}
					
				},
				error : function() {
					alert("Erreur votre requête n'a pas être traitée, veuillez réessayer plus tard...");
				}
			});
}