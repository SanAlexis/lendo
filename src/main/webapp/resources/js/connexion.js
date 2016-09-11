/**
 * 
 */
$(function() {
	//on masque la barre de menu
	$('#menur_bar').hide();
	//test de connexion pour l'accès à la page de connexion
	test_connect();
	window.setInterval("test_connect()",300);
	//check();
	transformecurseur('#option', 'pointer', 'none');
	masque(".help-block");
	$('#email').on(
			'keyup click',
			function() {
				var a = $('#email').val();
				var b = testformatemail(a);
				$('#a').attr('value', b);
				check();
				if (b == 0) {

					$('#div-email').removeClass('has-success').addClass(
							'has-error').addClass('has-feedback');
					$('#glyph-email').removeClass('glyphicon-ok').addClass(
							'glyphicon-remove');
					affiche("#error-email");
				} else {
					$('#div-email').removeClass('has-error').addClass(
							'has-success').addClass('has-feedback');
					$('#glyph-email').removeClass('glyphicon-remove').addClass(
							'glyphicon-ok');
					masque("#error-email");
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
	$('#submit').on('click', function() {
		connexion();
	});

});

function check() {
	if ($('#a').val() == 1 && $('#b').val() == 1) {
		$("#submit").removeAttr("disabled");
	} else {
		$('#submit').attr('disabled', 'disabled');
	}
}
/*
 * fonction permettant d'inscrire un utilisateur
 */
function connexion() {
	var email = $('#email').val();
	var password = $('#password').val();
	var a =look("check");
	if(a){
		$.ajax({
			type : "post",
			url : "doConnexionpersit",
			cache : false,
			data : "email="+email+"&&password="+password,
			success : function(response) {
				var connexion = eval('(' + response + ')');
				/*
				 * on vérifie si la fonction a réussi (si on a un code d'utilisateur
				 */
				if(!connexion){
					/*
					 * en cas d'échec on envoi un message d'alerte in vitant l'utilisateur à réessayer
					 */
					alert("Erreur: votre connexion à Lendo n'a pas réussi. veuillez réessayer plus tard...");
				}else{
					/*
					 * en cas de succès, on redirige l'utilisateur vèrs la page d'acceuil
					 */
					document.location.href="index";
				}
				
			},
			error : function() {
				alert("Erreur votre requête n'a pas être traitée, veuillez réessayer plus tard...");
			}
		});
	}else{
		$.ajax({
			type : "post",
			url : "doConnexion",
			cache : false,
			data : "email="+email+"&&password="+password,
			success : function(response) {
				var connexion = eval('(' + response + ')');
				/*
				 * on vérifie si la fonction a réussi (si on a un code d'utilisateur
				 */
				if(!connexion){
					/*
					 * en cas d'échec on envoi un message d'alerte in vitant l'utilisateur à réessayer
					 */
					alert("Erreur: votre connexion à Lendo n'a pas réussi. veuillez réessayer plus tard...");
				}else{
					/*
					 * en cas de succès, on redirige l'utilisateur vèrs la page d'acceuil
					 */
					document.location.href="index";
				}
				
			},
			error : function() {
				alert("Erreur votre requête n'a pas être traitée, veuillez réessayer plus tard...");
			}
		});
	}
	
}