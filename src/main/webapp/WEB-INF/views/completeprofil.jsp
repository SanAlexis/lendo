<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- Sur les mobiles, on ouvre la fenêtre à la largeur de l'écran et on règle le Zoom -->
<meta name="viewport" content="width=device-width, initialscale=1.0">
<!-- Affichage de l'icone dans la barre d'adresse du navigateur -->
<link rel="icon" type="image/png"
	href="<%=request.getContextPath()%>/resources/fonts/icon.png" />
<title>Complétez votre profil Lendo</title>
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/resources/css/bootstrap-theme.min.css" />
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/resources/fonts/glyphicons-halflings-regular.svg" />
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/resources/fonts/glyphicons-halflings-regular.eot" />
</head>
<body>
	<div class="container-ui" id="">

		<div class="row" id="">
			<%@ include file="menu.jsp"%>
		</div>
		<!-- PHOTO DE PROFIL -->

		<div class="row" id="">
			<div class="col-sm-1" id="" style="background-color:"></div>
			<div class="col-sm-7" id="" style="background-color: blue">
				<a href=""> <img alt="LOGO LENDO" class="img-responsive"
					src="<%=request.getContextPath()%>/resources/fonts/logo-tag.png"></a>
			</div>
			<div class="col-sm-1" id="" style="background-color:"></div>
			<div class="col-sm-1" id="" style="background-color:"></div>
			<div class="col-sm-1" id="" style="background-color:"></div>
			<div class="col-sm-1" id="" style="background-color:"></div>
		</div>


		<div class="row" id="">
			<div class="col-sm-1" id="" style="background-color:"></div>
			<div class="col-sm-2" id="" style="background-color:">
				<!-- MENU DE NAVIGATION VERTICAL DE LA MISE A JOUR DU PROFIL-->
				<div class="row" id="identite">
					<h4 class=" control-label col-sm-offset-1 col-sm-11">Identité</h4>
				</div>
				<div class="row" id="coordonnees">
					<h4 class="control-label col-sm-offset-1 col-sm-11">Coordonnées</h4>
				</div>
				<div class="row" id="preferences">
					<h4 class="control-label col-sm-offset-1 col-sm-11">Préférences</h4>
				</div>
				<div class="row" id="situation">
					<h4 class="control-label col-sm-offset-1 col-sm-11">Situation
						et expérience</h4>
				</div>
			</div>

			<div class="col-sm-3" id="informations" style="background-color:">
				<div class="row info_identite" id="">
					<label class="control-label col-sm-offset-1 col-sm-11" for="">Nom</label>

					<form action="" name="" method="post">

						<div class="col-sm-offset-1 col-sm-11" id="" style="">
							<input type="text" name="" value="" placeholder="Nom"
								class="form-control" id="nom"> <input type="hidden"
								name="" value="" placeholder="Nom" id="check_nom"
								class="form-control">

						</div>
						<div>
							<span class="affiche col-sm-offset-1 col-sm-11" id="affiche_nom"></span>
						</div>
						<div class="col-sm-offset-4 col-sm-4" id="" style="">
							<input type="reset" name="" value="X" class="form-control"
								style="color: red" id="annule_nom">
						</div>
						<div class="col-sm-4" id="" style="">
							<input type="button" name="" value="ok" placeholder=""
								class="btn btn-default form-control" disabled="disabled"
								id="ok_nom">
						</div>
					</form>
				</div>
				<div class="row info_identite" id="">
					<label class="control-label col-sm-offset-1 col-sm-11" for="">Prenom</label>
					<form action="" name="" method="post">

						<div class="col-sm-offset-1 col-sm-11" id="" style="">
							<input type="text" name="" value="" placeholder="Prénom"
								class="form-control" id="prenom"> <input type="hidden"
								name="" value="" placeholder="Nom" id="check_prenom"
								class="form-control">
						</div>
						<div>
							<span class="affiche col-sm-offset-1 col-sm-11"
								id="affiche_prenom"></span>
						</div>
						<div class="col-sm-offset-4 col-sm-4" id="" style="">
							<input type="reset" name="" value="X" class="form-control"
								style="color: red" id="annule_prenom">
						</div>
						<div class="col-sm-4" id="" style="">
							<input type="button" name="" value="ok" placeholder=""
								class="btn btn-default form-control" disabled="disabled"
								id="ok_prenom">
						</div>
					</form>
				</div>
				<div class="row info_identite" id="">
					<label class="control-label col-sm-offset-1 col-sm-11" for="">Date
						de naissance</label>
					<form action="" name="" method="post">

						<div class="col-sm-offset-1 col-sm-11" id="" style="">
							<input type="date" name="" value=""
								placeholder="date de naissance" class="form-control" id="date">
							<input type="hidden" name="" value="" placeholder=""
								id="check_date" class="form-control">
						</div>
						<div>
							<span class="affiche col-sm-offset-1 col-sm-11" id="affiche_date"></span>
						</div>
						<div class="col-sm-offset-4 col-sm-4" style="">
							<input type="reset" name="" value="X" class="form-control"
								style="color: red" id="annule_date">
						</div>
						<div class="col-sm-4" id="" style="">
							<input type="button" name="" value="ok" placeholder=""
								class="btn btn-default form-control" disabled="disabled"
								id="ok_date">
						</div>
					</form>
				</div>
				<div class="row info_identite" id="">
					<label class="control-label col-sm-offset-1 col-sm-11" for="">Lieu
						de naissance</label>
					<form action="" name="" method="post">

						<div class="col-sm-offset-1 col-sm-11" id="" style="">
							<input type="text" name="" value=""
								placeholder="Lieu de naissance" class="form-control" id="lieu">
							<input type="hidden" name="" value="" placeholder="Nom"
								id="check_lieu" class="form-control">
						</div>
						<div>
							<span class="affiche col-sm-offset-1 col-sm-11" id="affiche_lieu"></span>
						</div>
						<div class="col-sm-offset-4 col-sm-4" id="" style="">
							<input type="reset" name="" value="X" class="form-control"
								style="color: red" id="annule_lieu">
						</div>
						<div class="col-sm-4" id="" style="">
							<input type="button" name="" value="ok" placeholder=""
								class="btn btn-default form-control" disabled="disabled"
								id="ok_lieu">
						</div>
					</form>
				</div>

				<div class="row info_coordonnees" id="">
					<label class="control-label col-sm-offset-1 col-sm-11" for="">Adresse</label>
					<form action="" name="" method="post">

						<div class="col-sm-offset-1 col-sm-11" id="" style="">
							<input type="text" name="adresse" id="adresse" value=""
								placeholder="Adresse" class="form-control"> <input
								type="hidden" name="" value="" placeholder="Nom"
								id="check_adresse" class="form-control">
						</div>
						<div>
							<span class="affiche col-sm-offset-1 col-sm-11"
								id="affiche_adresse"></span>
						</div>
						<div class="col-sm-offset-4 col-sm-4" id="" style="">
							<input type="reset" name="" value="X" class="form-control"
								style="color: red" id="annule_adresse">
						</div>
						<div class="col-sm-4" id="" style="">
							<input type="button" name="" value="ok" placeholder=""
								class="btn btn-default form-control" disabled="disabled"
								id="ok_adresse">
						</div>
					</form>
				</div>
				<div class="row info_coordonnees" id="">
					<label class="control-label col-sm-offset-1 col-sm-11" for="">Adresse
						complémentaire</label>
					<form action="" name="" method="post">

						<div class="col-sm-offset-1 col-sm-11" id="" style="">
							<input type="text" name="" value=""
								placeholder="Adresse complémentaire" id="adresse1"
								class="form-control"> <input type="hidden" name=""
								value="" placeholder="Nom" id="check_adresse1"
								class="form-control">

						</div>
						<div>
							<span class="affiche col-sm-offset-1 col-sm-11"
								id="affiche_adresse1"></span>
						</div>
						<div class="col-sm-offset-4 col-sm-4" id="" style="">
							<input type="reset" name="" value="X" class="form-control"
								style="color: red" id="annule_adresse1">
						</div>
						<div class="col-sm-4" id="" style="">
							<input type="button" name="" value="ok" placeholder=""
								class="btn btn-default form-control" disabled="disabled"
								id="ok_adresse1">
						</div>
					</form>
				</div>
				<div class="row info_coordonnees" id="">
					<label class="control-label col-sm-offset-1 col-sm-11" for="">Code
						postal</label>
					<form action="" name="" method="post">

						<div class="col-sm-offset-1 col-sm-11" id="" style="">
							<input type="text" name="" value="" placeholder="Code postal"
								class="form-control" id="codepostal"> <input type="hidden" name=""
								value="" placeholder="Nom" id="check_codepostal"
								class="form-control">

						</div>
						<div>
							<span class="affiche col-sm-offset-1 col-sm-11" id="affiche_codepostal"></span>
						</div>
						<div class="col-sm-offset-4 col-sm-4" id="" style="">
							<input type="reset" name="" value="X" class="form-control"
								style="color: red" id="annule_codepostal">
						</div>
						<div class="col-sm-4" id="" style="">
							<input type="button" name="" value="ok" placeholder=""
								class="btn btn-default form-control" disabled="disabled"
								id="ok_codepostal">
						</div>
					</form>
				</div>


				<div class="row info_coordonnees" id="">
					<label class="control-label col-sm-offset-1 col-sm-11" for="">Numéro
						de téléphone</label>
					<form action="" name="" method="post">

						<div class="col-sm-offset-1 col-sm-11" id="" style="">
							<input type="number" name="" value="" id="telephone"
								placeholder="Numéro de téléphone" class="form-control">
							<input type="hidden" name="" value="" placeholder="Nom"
								id="check_telephone" class="form-control">

						</div>
						<div>
							<span class="affiche col-sm-offset-1 col-sm-11" id="affiche_telephone"></span>
						</div>
						<div class="col-sm-offset-4 col-sm-4" id="" style="">
							<input type="reset" name="" value="X" class="form-control"
								style="color: red" id="annule_telephone">
						</div>
						<div class="col-sm-4" id="" style="">
							<input type="button" name="" value="ok" placeholder=""
								class="btn btn-default form-control" disabled="disabled"
								id="ok_telephone">
						</div>
					</form>
				</div>
				<div class="row info_preferences" id="">
					<label class="control-label col-sm-offset-1 col-sm-11" for="">Motivations</label>
					<form action="" name="" method="post">

						<div class="col-sm-offset-1 col-sm-11" id="" style="">
							<input type="text" name="" value="" id="motivation" placeholder="Motivations"
								class="form-control"> <input type="hidden" name=""
								value="" placeholder="Nom" id="check_motivation"
								class="form-control">

						</div>
						<div>
							<span class="affiche col-sm-offset-1 col-sm-11" id="affiche_motivation"></span>
						</div>
						<div class="col-sm-offset-4 col-sm-4" id="" style="">
							<input type="reset" name="" value="X" class="form-control"
								style="color: red" id="annule_motivation">
						</div>
						<div class="col-sm-4" id="" style="">
							<input type="button" name="" value="ok" placeholder=""
								class="btn btn-default form-control" disabled="disabled"
								id="ok_motivation">
						</div>
					</form>
				</div>
				<div class="row info_preferences" id="">
					<label class="control-label col-sm-offset-1 col-sm-11" for="">Secteurs
						d'activité</label>
					<form action="" name="" method="post">

						<div class="col-sm-offset-1 col-sm-11" id="" style="">
							<input type="text" name="" value="" id="activite"
								placeholder="Secteurs d'activité" class="form-control">
							<input type="hidden" name="" value="" placeholder="Nom"
								id="check_activite" class="form-control">

						</div>
						<div>
							<span class="affiche col-sm-offset-1 col-sm-11" id="affiche_activite"></span>
						</div>
						<div class="col-sm-offset-4 col-sm-4" id="" style="">
							<input type="reset" name="" value="X" class="form-control"
								style="color: red" id="annule_activite">
						</div>
						<div class="col-sm-4" id="" style="">
							<input type="button" name="" value="ok" placeholder=""
								class="btn btn-default form-control" disabled="disabled"
								id="ok_activite">
						</div>
					</form>
				</div>
				<div class="row info_preferences" id="">
					<label class="control-label col-sm-offset-1 col-sm-11" for="">Secteur
						géographique</label>
					<form action="" name="" method="post">

						<div class="col-sm-offset-1 col-sm-11" id="" style="">
							<input type="text" name="" value="" id="secteurgeo"
								placeholder="Secteurs géographique" class="form-control">
							<input type="hidden" name="" value="" placeholder="Nom"
								id="check_secteurgeo" class="form-control">

						</div>
						<div>
							<span class="affiche col-sm-offset-1 col-sm-11" id="affiche_secteurgeo"></span>
						</div>
						<div class="col-sm-offset-4 col-sm-4" id="" style="">
							<input type="reset" name="" value="X" class="form-control"
								style="color: red" id="annule_secteurgeo">
						</div>
						<div class="col-sm-4" id="" style="">
							<input type="button" name="" value="ok" placeholder=""
								class="btn btn-default form-control" disabled="disabled"
								id="ok_secteurgeo">
						</div>
					</form>
				</div>
				<div class="row info_situation" id="">
					<label class="control-label col-sm-offset-1 col-sm-11" for="">Activité
						professionnelle</label>
					<form action="" name="" method="post">

						<div class="col-sm-offset-1 col-sm-11" id="" style="">
							<input type="text" name="" value="" id="activitepro"
								placeholder="Activité professionnelle" class="form-control">
							<input type="hidden" name="" value="" placeholder="Nom"
								id="check_activitepro" class="form-control">

						</div>
						<div>
							<span class="affiche col-sm-offset-1 col-sm-11" id="affiche_activitepro"></span>
						</div>
						<div class="col-sm-offset-4 col-sm-4" id="" style="">
							<input type="reset" name="" value="X" class="form-control"
								style="color: red" id="annule_activitepro">
						</div>
						<div class="col-sm-4" id="" style="">
							<input type="button" name="" value="ok" placeholder=""
								class="btn btn-default form-control" disabled="disabled"
								id="ok_activitepro">
						</div>
					</form>
				</div>
				<div class="row info_situation" id="">
					<label class="control-label col-sm-offset-1 col-sm-11" for="">Expérience
						dans l'investissement</label>
					<form action="" name="" method="post">

						<div class="col-sm-offset-1 col-sm-11" id="" style="">
							<input type="text" name="" value="" id="experience"
								placeholder="Expérience dans l'investissement"
								class="form-control"> <input type="hidden" name=""
								value="" placeholder="Nom" id="check_experience"
								class="form-control">

						</div>
						<div>
							<span class="affiche col-sm-offset-1 col-sm-11" id="affiche_experience"></span>
						</div>
						<div class="col-sm-offset-4 col-sm-4" id="" style="">
							<input type="reset" name="" value="X" class="form-control"
								style="color: red" id="annule_experience">
						</div>
						<div class="col-sm-4" id="" style="">
							<input type="button" name="" value="ok" placeholder=""
								class="btn btn-default form-control" disabled="disabled"
								id="ok_experience">
						</div>
					</form>
				</div>
				<div class="row info_situation" id="">
					<label class="control-label col-sm-offset-1 col-sm-11" for="">Sources
						de revenue</label>
					<form action="" name="" method="post">

						<div class="col-sm-offset-1 col-sm-11" id="" style="">
							<input type="text" name="" value="" id="revenu"
								placeholder="Sources de revenue" class="form-control"> <input
								type="hidden" name="" value="" placeholder="Nom"
								id="check_revenu" class="form-control">

						</div>
						<div>
							<span class="affiche col-sm-offset-1 col-sm-11" id="affiche_revenu"></span>
						</div>
						<div class="col-sm-offset-4 col-sm-4" id="" style="">
							<input type="reset" name="" value="X" class="form-control"
								style="color: red" id="annule_revenu">
						</div>
						<div class="col-sm-4" id="" style="">
							<input type="button" name="" value="ok" placeholder=""
								class="btn btn-default form-control" disabled="disabled"
								id="ok_revenu">
						</div>
					</form>
				</div>

			</div>
			<div class="col-sm-1" id="" style="background-color:"></div>
			<div class="col-sm-1" id="" style="background-color:"></div>
			<div class="col-sm-1" id="" style="background-color:"></div>
			<div class="col-sm-1" id="" style="background-color:"></div>
			<div class="col-sm-1" id="" style="background-color:"></div>
			<div class="col-sm-1" id="" style="background-color:"></div>
		</div>


	</div>
	<script
		src="<%=request.getContextPath()%>/resources/js/jquery-3.1.0.js"></script>
	<script
		src="<%=request.getContextPath()%>/resources/js/bootstrap.min.js"></script>
	<script src="<%=request.getContextPath()%>/resources/js/lendo.js"></script>
	<!-- <script src="<%=request.getContextPath()%>/resources/js/creerprojet.js"></script> -->
	<script src="<%=request.getContextPath()%>/resources/js/menu.js"></script>
	<script
		src="<%=request.getContextPath()%>/resources/js/completeprofil.js"></script>
</body>
</html>