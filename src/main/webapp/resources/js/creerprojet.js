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
				var b = longueur(a, 10, 90);
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
				} else {
					$('#div-montant').removeClass('has-success').addClass(
							'has-warning').addClass('has-feedback');
					$('#glyph-montant').removeClass('glyphicon-ok').addClass(
							'glyphicon-warning-sign');
					affiche("#error-montant");
				}
			});
	$('#duree').on(
			'keyup click change',
			function() {
				var a = $('#duree').val();
				var min = 10;
				var max = 90;
				var b = valeur(a, min, max);
				$('#d').attr('value', b);
				check();
				if (b == 1) {
					$('#div-duree').removeClass('has-warning').addClass(
							'has-success').addClass('has-feedback');
					$('#glyph-duree').removeClass('glyphicon-warning-sign')
							.addClass('glyphicon-ok');
					masque("#error-duree");
				} else {
					$('#div-duree').removeClass('has-success').addClass(
							'has-warning').addClass('has-feedback');
					$('#glyph-duree').removeClass('glyphicon-ok').addClass(
							'glyphicon-warning-sign');
					affiche("#error-duree");
				}
			});
	$('#taux').on(
			'keyup click change',
			function() {
				var a = $('#taux').val();
				var min = 1;
				var max = 15;
				var b = valeur(a, min, max);
				$('#e').attr('value', b);
				check();
				if (b == 1) {
					$('#div-taux').removeClass('has-warning').addClass(
							'has-success').addClass('has-feedback');
					$('#glyph-taux').removeClass('glyphicon-warning-sign')
							.addClass('glyphicon-ok');
					masque("#error-taux");
				} else {
					$('#div-taux').removeClass('has-success').addClass(
							'has-warning').addClass('has-feedback');
					$('#glyph-taux').removeClass('glyphicon-ok').addClass(
							'glyphicon-warning-sign');
					affiche("#error-taux");
				}
			});
	$('#periode').on(
			'keyup click change',
			function() {
				var a = $('#periode').val();
				var min = 1;
				var max = 15;
				var b = valeur(a, min, max);
				$('#f').attr('value', b);
				check();
				if (a != "") {
					$('#div-periode').removeClass('has-warning').addClass(
							'has-success').addClass('has-feedback');
					$('#glyph-periode').removeClass('glyphicon-warning-sign')
							.addClass('glyphicon-ok');
					masque("#error-periode");
				} else {
					$('#div-periode').removeClass('has-success').addClass(
							'has-warning').addClass('has-feedback');
					$('#glyph-periode').removeClass('glyphicon-ok').addClass(
							'glyphicon-warning-sign');
					affiche("#error-periode");
				}
			});

	$( "input[name='type_contribution']" ).on('keyup change click', function() {
		check();
		if($(':radio[name="type_contribution"]:checked').val()=="pret"){
			affiche("#div-taux0");
			affiche("#div-periode0");
		}else{
			masque("#div-taux0");
			masque("#div-periode0");
			$('#taux').attr('value', '');
			$('#periode').attr('value', '');
		}
	});
	$('#submit').on('click', function() {
		creerprojet();
	});

});

function check() {
	var remboursement = $('#periode').val();
		var date = new Date();
		var date1 = new Date(remboursement);
	if ($('#a').val() == 1 && $('#b').val() == 1 && $('#c').val() == 1 && $('#d').val() == 1) {
		if($(':radio[name="type_contribution"]:checked').val()=="don"){
			$("#submit").removeAttr("disabled");
		}
		if($(':radio[name="type_contribution"]:checked').val()=="pret"){
			if($('#e').val() == 1 && $('#periode').val() !=""  && date <date1){
				$("#submit").removeAttr("disabled");
			}else{
				$('#submit').attr('disabled', 'disabled');
			}
		}
		
	} else {
		$('#submit').attr('disabled', 'disabled');
	}
}
/*
 * fonction permettant de créer un nouveau projet
 */
function creerprojet(){
	ajax_requete_lance_desactive_fenetre();
	
	var titre = $('#titre').val();
	var cathegorie = $('#cathegorie').val();
	var montant = $('#montant').val();
	var duree = $('#duree').val();
	var type = $(':radio[name="type_contribution"]:checked').val();
	var taux = $('#taux').val();
	var periode = $('#periode').val();
	$
	.ajax({
		type : "post",
		url : "docreerprojet",
		timeout : 3000,
		cache : false,
		data :"titre="+titre+"&cathegorie="+cathegorie+"&montant="+montant+"&duree="+duree+"&type="+type+"&taux="+taux+"&periode="+periode ,
		success : function(data) {
			
			// conversion de la reponse en objet javascript
			// manipulable
			var projet = eval('(' + data + ')');
			if(projet.codeProjet=="" || projet.codeProjet==null){
				/*
				 * si le projet n'a pas été crée on ne fait rien
				 */
				ajax_requete_termine_active_fenetre();
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
