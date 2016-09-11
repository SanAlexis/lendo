/**
 * 
 */
$(function() {
	//test de connexion pour l'accès à la page de connexion
	test_connect1();
	/*
	 * récupération des catégories des projets
	 */
	loadprojetcategorie();
	window.setInterval("test_connect1()",3000);
	transformecurseur('#option', 'pointer','none');
	masque(".help-block");
	$('#titre').on(
			'keyup click',
			function() {
				var a = $('#titre').val();
				var b = longueur(a, 10, 30);
				$('#a').attr('value', b);
				check();
				if (b == 1) {
					$('#div-titre').removeClass('has-warning').addClass(
							'has-success').addClass('has-feedback');
					$('#glyph-titre').removeClass('glyphicon-warning-sign')
							.addClass('glyphicon-ok');
					masque("#error-titre");
				} else {
					$('#div-titre').removeClass('has-success').addClass(
							'has-warning').addClass('has-feedback');
					$('#glyph-titre').removeClass('glyphicon-ok').addClass(
							'glyphicon-warning-sign');
					affiche("#error-titre");
				}
			});

	
	$('#cathegorie').on(
			'keyup click change',
			function() {
				var a = $('#cathegorie').val();
				var b = longueur(a, 1, 30);
				$('#b').attr('value', b);
				check();
				if (b == 1) {
					$('#div-cathegorie').removeClass('has-warning').addClass(
							'has-success').addClass('has-feedback');
					$('#glyph-cathegorie').removeClass('glyphicon-warning-sign')
							.addClass('glyphicon-ok');
					masque("#error-cathegorie");
				} else {
					$('#div-cathegorie').removeClass('has-success').addClass(
							'has-warning').addClass('has-feedback');
					$('#glyph-cathegorie').removeClass('glyphicon-ok').addClass(
							'glyphicon-warning-sign');
					affiche("#error-cathegorie");
				}
			});
	
	$('#montant').on(
			'keyup click change',
			function() {
				var a = $('#montant').val();
				var min = 50000;
				var max = 50000000;
				var b = valeur(a, min, max);
				$('#c').attr('value', b);
				check();
				if (b == 1) {
					$('#div-montant').removeClass('has-warning').addClass(
							'has-success').addClass('has-feedback');
					$('#glyph-montant').removeClass('glyphicon-warning-sign')
							.addClass('glyphicon-ok');
					masque("#error-montant");
					$("#error-montant").innerHTML = "";
				} else {
					$('#div-montant').removeClass('has-success').addClass(
							'has-warning').addClass('has-feedback');
					$('#glyph-montant').removeClass('glyphicon-ok').addClass(
							'glyphicon-warning-sign');
					affiche("#error-montant");
					$("#error-montant").innerHTML = "erreur";
				}
			});
	$('#submit').on('click', function() {
		creerprojet();
	});

});

function check() {
	if ($('#a').val() == 1 && $('#b').val() == 1 && $('#c').val() == 1) {
		$("#submit").removeAttr("disabled");
	} else {
		$('#submit').attr('disabled', 'disabled');
	}
}
/*
 * fonction permettant de créer un nouveau projet
 */
function creerprojet(){
	var titre = $('#titre').val();
	var cathegorie = $('#cathegorie').val();
	var montant = $('#montant').val();
	$
	.ajax({
		type : "post",
		url : "docreerprojet",
		timeout : 3000,
		cache : false,
		data :"titre="+titre+"&cathegorie="+cathegorie+"&montant="+montant ,
		success : function(data) {
			// conversion de la reponse en objet javascript
			// manipulable
			var projet = eval('(' + data + ')');
			if(projet.codeProjet=="" || projet.codeProjet==null){
				/*
				 * si le projet n'a pas été crée on ne fait rien
				 */
				alert("Votre projet n'a pas pu être créé, veuillez reessayer plus tard");
			}else{
				/*
				 * si le projet à été créé
				 * on redirige l'utilisateur vers la page de mise à jour du projet
				 */
				document.location.href="parametrerprojet?codeP="+projet.codeProjet;
			}
			
			
		},
		error : function() {
		}
	});
}
