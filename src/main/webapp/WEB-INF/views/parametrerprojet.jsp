<%@ page session="true"%>
<%@ page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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


		<div class="row" id="">
			<div class="col-sm-1" id="" style="background-color:"></div>
			<div class="col-sm-2" id="" style="background-color:">
				<!-- MENU DE NAVIGATION VERTICAL DE LA MISE A JOUR DU PROFIL-->

				<div class="row" id="description">
					<h4 class=" control-label col-sm-offset-1 col-sm-11">Description
						sommaire</h4>
				</div>
				<div class="row" id="finance">
					<h4 class=" control-label col-sm-offset-1 col-sm-11">Description
						financière</h4>
				</div>
				<div class="row" id="detail">
					<h4 class=" control-label col-sm-offset-1 col-sm-11">Description
						détaillée</h4>
				</div>
				<div class="row" id="localisation">
					<h4 class=" control-label col-sm-offset-1 col-sm-11">Localisation</h4>
				</div>
				<div class="row" id="media">
					<h4 class=" control-label col-sm-offset-1 col-sm-11">Images et
						vidéos</h4>
				</div>
			</div>

			<div class="col-sm-3" id="informations" style="background-color:">
				<!-- INFORMATIONS SUR LE PROJET -->




				<div class="row info_description" id="">
					<label class="control-label col-sm-offset-1 col-sm-11" for="">Titre
						du projet</label>

					<form action="" name="" method="post">
						<!-- Champs permettant de stocker le code du projet -->
						<input type="hidden" name=""
							value=<%=session.getAttribute("codeP")%>
							placeholder="Code projet" class="form-control"
							id="code_projet">

						<div class="col-sm-offset-1 col-sm-11" id="" style="">
							<input type="text" name="" value="" placeholder="Titre du projet"
								class="form-control" id="titre"> <input type="hidden"
								name="" value="" placeholder="Nom" id="check_titre"
								class="form-control">
						</div>
						<div>
							<span class="affiche col-sm-offset-1 col-sm-11"
								id="affiche_titre"></span>
						</div>
						<div class="col-sm-offset-4 col-sm-4" id="" style="">
							<input type="reset" name="" value="X" class="form-control"
								style="color: red" id="annule_titre">
						</div>
						<div class="col-sm-4" id="" style="">
							<input type="button" name="" value="ok" placeholder=""
								class="btn btn-default form-control" disabled="disabled"
								id="ok_titre">
						</div>
					</form>
				</div>

				<div class="row info_description" id="">
					<label class="control-label col-sm-offset-1 col-sm-11" for="">Cathégorie
						du projet</label>

					<form action="" name="" method="post">

						<div class="col-sm-offset-1 col-sm-11" id="" style="">
							<select class="form-control" id="cathegorie">
								<option value="">Cathégories de projets</option>
								<option value="aaaaaaa">Culture</option>
								<option value="cccccc">Construction</option>
							</select> <input type="hidden" name="" value="" placeholder="Nom"
								id="check_cathegorie" class="form-control">
						</div>
						<div>
							<span class="affiche col-sm-offset-1 col-sm-11"
								id="affiche_cathegorie"></span>
						</div>
						<div class="col-sm-offset-4 col-sm-4" id="" style="">
							<input type="reset" name="" value="X" class="form-control"
								style="color: red" id="annule_cathegorie">
						</div>
						<div class="col-sm-4" id="" style="">
							<input type="button" name="" value="ok" placeholder=""
								class="btn btn-default form-control" disabled="disabled"
								id="ok_cathegorie">
						</div>
					</form>
				</div>


				<div class="row info_description" id="">
					<label class="control-label col-sm-offset-1 col-sm-11" for="">Slogan
						du projet</label>

					<form action="" name="" method="post">

						<div class="col-sm-offset-1 col-sm-11" id="" style="">
							<input type="text" name="" value="" id="slogan"
								placeholder="Slogan du projet" class="form-control"> <input
								type="hidden" name="" value="" placeholder="Nom"
								id="check_slogan" class="form-control">
						</div>
						<div>
							<span class="affiche col-sm-offset-1 col-sm-11"
								id="affiche_slogan"></span>
						</div>
						<div class="col-sm-offset-4 col-sm-4" id="" style="">
							<input type="reset" name="" value="X" class="form-control"
								style="color: red" id="annule_slogan">
						</div>
						<div class="col-sm-4" id="" style="">
							<input type="button" name="" value="ok" placeholder=""
								class="btn btn-default form-control" disabled="disabled"
								id="ok_slogan">
						</div>
					</form>
				</div>
				<div class="row info_finance" id="">
					<label class="control-label col-sm-offset-1 col-sm-11" for="">Montant
						attendu de la campagne</label>

					<form action="" name="" method="post">
						<div class="input-group col-sm-offset-1 col-sm-11">
							<input type="number" class="form-control" id="montantAttendu"
								placeholder="Montant attendu de la campagne" min="01" max="31">
							<span class="input-group-addon" id="basic-addon2">F CFA</span>
						</div>
						<input type="hidden" name="" value="" placeholder="Nom"
							id="check_montantAttendu" class="form-control">
						<div>
							<span class="affiche col-sm-offset-1 col-sm-11"
								id="affiche_montantAttendu"></span>
						</div>
						<div class="col-sm-offset-4 col-sm-4" id="" style="">
							<input type="reset" name="" value="X" class="form-control"
								style="color: red" id="annule_montantAttendu">
						</div>
						<div class="col-sm-4" id="" style="">
							<input type="button" name="" value="ok" placeholder=""
								class="btn btn-default form-control" disabled="disabled"
								id="ok_montantAttendu">
						</div>
					</form>
				</div>


				<div class="row info_media" id="">
					<label class="control-label col-sm-offset-1 col-sm-11" for="">Image
						du projet</label>

					<form action="" name="" method="post">

						<div class="col-sm-offset-1 col-sm-11" id="" style="">
							<input type="file" name="" value="" placeholder="Image du projet"
								class="" id="image"> <input type="hidden" name=""
								value="" placeholder="Nom" id="check_image" class="form-control">
						</div>
						<div>
							<span class="affiche col-sm-offset-1 col-sm-11"
								id="affiche_image"></span>
						</div>
						<div class="col-sm-offset-4 col-sm-4" id="" style="">
							<input type="reset" name="" value="X" class="form-control"
								style="color: red" id="annule_image">
						</div>
						<div class="col-sm-4" id="" style="">
							<input type="button" name="" value="ok" placeholder=""
								class="btn btn-default form-control" disabled="disabled"
								id="ok_image">
						</div>
					</form>
				</div>
				<div class="row info_localisation" id="">
					<label class="control-label col-sm-offset-1 col-sm-11" for="">Localisation
						du projet</label>

					<form action="" name="" method="post">

						<div class="col-sm-offset-1 col-sm-11" id="" style="">
							<input type="text" name="" value="" id="ville"
								placeholder="Ville" class="form-control"> <input
								type="hidden" name="" value="" placeholder="Nom"
								id="check_ville" class="form-control">
						</div>
						<div>
							<span class="affiche col-sm-offset-1 col-sm-11"
								id="affiche_ville"></span>
						</div>
						<div class="col-sm-offset-4 col-sm-4" id="" style="">
							<input type="reset" name="" value="X" class="form-control"
								style="color: red" id="annule_ville">
						</div>
						<div class="col-sm-4" id="" style="">
							<input type="button" name="" value="ok" placeholder=""
								class="btn btn-default form-control" disabled="disabled"
								id="ok_ville">
						</div>
						<div class="col-sm-offset-1 col-sm-11" id="" style="">
							<input type="text" name="" value="" id="pays" placeholder="Pays"
								class="form-control"> <input type="hidden" name=""
								value="" placeholder="Nom" id="check_pays" class="form-control">

						</div>
						<div>
							<span class="affiche col-sm-offset-1 col-sm-11" id="affiche_pays"></span>
						</div>
						<div class="col-sm-offset-4 col-sm-4" id="" style="">
							<input type="reset" name="" value="X" class="form-control"
								style="color: red" id="annule_pays">
						</div>
						<div class="col-sm-4" id="" style="">
							<input type="button" name="" value="ok" placeholder=""
								class="btn btn-default form-control" disabled="disabled"
								id="ok_pays">
						</div>
					</form>
				</div>

				<div class="row info_finance" id="">
					<label class="control-label col-sm-offset-1 col-sm-11" for="">Durée
						de la campagne</label>

					<form action="" name="" method="post">
						<div class="input-group col-sm-offset-1 col-sm-11">
							<input type="number" class="form-control" id="dureeCampagne"
								placeholder="Durée de la campagne" min="01" max="31"> <span
								class="input-group-addon" id="basic-addon2">Jours</span>
						</div>
						<input type="hidden" name="" value="" placeholder="Nom"
							id="check_dureeCampagne" class="form-control">
						<div>
							<span class="affiche col-sm-offset-1 col-sm-11"
								id="affiche_dureeCampagne"></span>
						</div>
						<div class="col-sm-offset-4 col-sm-4" id="" style="">
							<input type="reset" name="" value="X" class="form-control"
								style="color: red" id="annule_dureeCampagne">
						</div>
						<div class="col-sm-4" id="" style="">
							<input type="button" name="" value="ok" placeholder=""
								class="btn btn-default form-control" disabled="disabled"
								id="ok_dureeCampagne">
						</div>
					</form>
				</div>

				<div class="row info_media" id="">
					<label class="control-label col-sm-offset-1 col-sm-11" for="">URL
						de la vidéo de présentation du projet</label>

					<form action="" name="" method="post">

						<div class="col-sm-offset-1 col-sm-11" id="" style="">
							<input type="text" name="" value="" id="video"
								placeholder="Vidéo du projet" class="form-control"> <input
								type="hidden" name="" value="" placeholder="Nom"
								id="check_video" class="form-control">
						</div>
						<div>
							<span class="affiche col-sm-offset-1 col-sm-11"
								id="affiche_video"></span>
						</div>
						<div class="col-sm-offset-4 col-sm-4" id="" style="">
							<input type="reset" name="" value="X" class="form-control"
								style="color: red" id="annule_video">
						</div>
						<div class="col-sm-4" id="" style="">
							<input type="button" name="" value="ok" placeholder=""
								class="btn btn-default form-control" disabled="disabled"
								id="ok_video">
						</div>
					</form>
				</div>

				<div class="row info_detail" id="">
					<label class="control-label col-sm-offset-1 col-sm-11" for="">Présentation
						détaillée du projet</label>

					<form action="" name="" method="post">

						<div class="col-sm-offset-1 col-sm-11" id="" style="">
						
							<textarea rows="8" cols="" class="form-control" id="presentation"></textarea>
							<input type="hidden" name="" value="" placeholder="Nom"
								id="check_presentation" class="form-control">
						</div>
						<div>
							<span class="affiche col-sm-offset-1 col-sm-11"
								id="affiche_presentation"></span>
						</div>
						<div class="col-sm-offset-4 col-sm-4" id="" style="">
							<input type="reset" name="" value="X" class="form-control"
								style="color: red" id="annule_presentation">
						</div>
						<div class="col-sm-4" id="" style="">
							<input type="button" name="" value="ok" placeholder=""
								class="btn btn-default form-control" disabled="disabled"
								id="ok_presentation">
						</div>
					</form>
				</div>

				<div class="row info_detail" id="">
					<label class="control-label col-sm-offset-1 col-sm-11" for="">Business
						plan</label>

					<form action="" name="" method="post">

						<div class="col-sm-offset-1 col-sm-11" id="" style="">
							<input type="file" name="" value="" placeholder="Business plan"
								id="busnessPlan" class=""> <input type="hidden" name=""
								value="" placeholder="Nom" id="check_busnessPlan"
								class="form-control">
						</div>
						<div>
							<span class="affiche col-sm-offset-1 col-sm-11"
								id="affiche_busnessPlan"></span>
						</div>
						<div class="col-sm-offset-4 col-sm-4" id="" style="">
							<input type="reset" name="" value="X" class="form-control"
								style="color: red" id="annule_busnessPlan">
						</div>
						<div class="col-sm-4" id="" style="">
							<input type="button" name="" value="ok" placeholder=""
								class="btn btn-default form-control" disabled="disabled"
								id="ok_busnessPlan">
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
	<script src="<%=request.getContextPath()%>/resources/ckeditor/ckeditor.js"></script>
	<script src="<%=request.getContextPath()%>/resources/js/menu.js"></script>
	<script
		src="<%=request.getContextPath()%>/resources/js/parametrerprojet.js"></script>
		
</body>
</html>