
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
<title>Bienvenue sur Lendo, Wake Up Your Dreams</title>
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
		<!-- MENU DE LENDO -->
		<div class="" id="">
			<%@ include file="menu.jsp"%>
		</div>
		<!-- ENTETE  -->
		<div class="row" id="">
			<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12" id=""
				style="background-color:">
				<h2 class="text-center">Créez un projet</h2>
			</div>
		</div>
		<div class="row" id="">
			<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12" id=""
				style="background-color:">
				<h4 class="text-center">Créez votre projet pour bénéficier du
							soutien de la communauté</h4>
			</div>
		</div>
		<!-- FORMULAIRE DE CREATION DU PROJET  -->
		<div class="" id="form_creerprojet">
		<form action="">
		<!-- CHAMP TITRE DU PROJET -->
			<div class="row" id="">
				<div
					class="col-sm-offset-2 col-md-offset-2 col-lg-offset-2 col-xs-12 col-sm-10 col-md-2 col-lg-2"
					id="" style="background-color:">
					<label class="control-label">Titre du projet</label>
				</div>
				<div
					class="col-sm-offset-2 col-md-offset-0 col-lg-offset-0 col-xs-12 col-sm-8 col-md-6 col-lg-6"
					id="" style="background-color:">
					<div class="form-group " id="div-titre">
								<input type="text" name="titre" id="titre"
									class="form-control"
									placeholder="Veuillez entrer le titre de votre projet" />
								<span class="glyphicon form-control-feedback" id="glyph-titre"></span>
								<span class="help-block " id="error-titre">Le titre de votre
									projet doit contenir entre 10 et 90 caractères</span>
							</div>
							<p>
								<input type="hidden" name="" value="" id="a" placeholder=""
									class="form-control" />
							</p>
				</div>
			</div>
			<!-- CHAMP CATEGORIE DU PROJET -->
			<div class="row" id="">
				<div
					class="col-sm-offset-2 col-md-offset-2 col-lg-offset-2 col-xs-12 col-sm-10 col-md-2 col-lg-2"
					id="" style="background-color:">
					<label class="control-label">Cathégorie du projet</label>
				</div>
				<div
					class="col-sm-offset-2 col-md-offset-0 col-lg-offset-0 col-xs-12 col-sm-8 col-md-6 col-lg-6"
					id="" style="background-color:">
					<div class="form-group" id="div-cathegorie">

								<select class="form-control" id="cathegorie">
									<option value="">Veuillez sélectionner la catégorie de votre projet</option>
									<option class="categorie"></option>
								</select>
								<span class="glyphicon form-control-feedback" id="glyph-cathegorie"></span>
								<span class="help-block text-center" id="error-cathegorie">Vous devez
									sélectionner une catégorie pour votre projet</span>
							</div>
							<p>
								<input type="hidden"  name="" value="" id="b" placeholder=""
									class="form-control" />
							</p>
				</div>
			</div>
			<!-- CHAMP MONTANT DU PROJET -->
			<div class="row" id="">
				<div
					class="col-sm-offset-2 col-md-offset-2 col-lg-offset-2 col-xs-12 col-sm-10 col-md-2 col-lg-2"
					id="" style="background-color:">
					<label class="control-label">Montant attendu de la campagne</label>
				</div>
				<div
					class="col-sm-offset-2 col-md-offset-0 col-lg-offset-0 col-xs-12 col-sm-8 col-md-6 col-lg-6"
					id="" style="background-color:">
					<div class="form-group " id="div-montant">
								<div class="input-group">
									<input type="number" class="form-control" id="montant"
										placeholder="Montant attendu de la campagne" min="50000" max="50000000">
									<span class="input-group-addon" id="basic-addon2">F CFA</span>
								</div>
								<span class="glyphicon form-control-feedback" id="glyph-montant"></span>
								<span class="help-block text-center" id="error-montant">Le
									montant de la campagne doit être compris entre 50.000 et 50.000.000</span>
							</div>
							<p>
								<input type="hidden"  name="" value="" id="c" placeholder=""
									class="form-control" />
							</p>
				</div>
			</div>
			
			<!-- CHAMP DUREE DE LA CAMPAGNE DU PROJET -->
			<div class="row" id="">
				<div
					class="col-sm-offset-2 col-md-offset-2 col-lg-offset-2 col-xs-12 col-sm-10 col-md-2 col-lg-2"
					id="" style="background-color:">
					<label class="control-label">Durée de la campagne</label>
				</div>
				<div
					class="col-sm-offset-2 col-md-offset-0 col-lg-offset-0 col-xs-12 col-sm-8 col-md-6 col-lg-6"
					id="" style="background-color:">
					<div class="form-group " id="div-duree">
								<div class="input-group">
									<input type="number" class="form-control" id="duree"
										placeholder="Durée de la campagne" min="10" max="90">
									<span class="input-group-addon" id="basic-addon2">Jours</span>
								</div>
								<span class="glyphicon form-control-feedback" id="glyph-duree"></span>
								<span class="help-block text-center" id="error-duree">La
									durée de la campagne doit être comprise entre 10 et 90</span>
							</div>
							<p>
								<input type="hidden"  name="" value="" id="d" placeholder=""
									class="form-control" />
							</p>
				</div>
			</div>
			
			<!-- CHAMP TYPE DE CONTRIBUTION -->
			<div class="row" id="">
				<div
					class="col-sm-offset-2 col-md-offset-2 col-lg-offset-2 col-xs-6 col-sm-5 col-md-5 col-lg-5"
					id="" style="background-color:">
					<label class="control-label">Type de contribution </label>
				</div>
				<div
					class="text-right col-xs-offset-0 col-sm-offset-0 col-md-offset-0 col-lg-offset-0 col-xs-6 col-sm-3 col-md-3 col-lg-3"
					id="" style="background-color:">
					<div class="btn-group" data-toggle="buttons" id="div-check">
						<label class="btn btn-success"> <input type="radio"
							name="type_contribution" value="pret" checked="checked">PRET
						</label> <label class="btn btn-warning"> <input type="radio"
							name="type_contribution" value="don" >DON
						</label>
					</div>


				</div>
			</div>
			
			<!-- CHAMP TAUX D'INTERET -->
			<div class="row" id="div-taux0">
				<div
					class="col-sm-offset-2 col-md-offset-2 col-lg-offset-2 col-xs-12 col-sm-10 col-md-2 col-lg-2"
					id="" style="background-color:">
					<label class="control-label">Taux d'intéret</label>
				</div>
				<div
					class="col-sm-offset-2 col-md-offset-0 col-lg-offset-0 col-xs-12 col-sm-8 col-md-6 col-lg-6"
					id="" style="background-color:">
					<div class="form-group " id="div-taux">
								<div class="input-group">
									<input type="number" class="form-control" id="taux"
										placeholder="Taux d'intérèt" min="1" max="15">
									<span class="input-group-addon" id="basic-addon2"> %</span>
								</div>
								<span class="glyphicon form-control-feedback" id="glyph-taux"></span>
								<span class="help-block text-center" id="error-taux">Le
									taux d'intéret doit être compris entre 1 et 15</span>
							</div>
							<p>
								<input type="hidden"  name="" value="" id="e" placeholder=""
									class="form-control" />
							</p>
				</div>
			</div>
			
			<!-- CHAMP PERIODE INTERET -->
			<div class="row" id="div-periode0">
				<div
					class="col-sm-offset-2 col-md-offset-2 col-lg-offset-2 col-xs-12 col-sm-10 col-md-2 col-lg-2"
					id="" style="background-color:">
					<label class="control-label">Date de remboursement</label>
				</div>
				<div
					class="col-sm-offset-2 col-md-offset-0 col-lg-offset-0 col-xs-12 col-sm-8 col-md-6 col-lg-6"
					id="" style="background-color:">
					<div class="form-group " id="div-periode">
								<div class="input-group">
									<input type="date" class="form-control" id="periode"
										placeholder="Date de remboursement" min="1" max="15">
									<span class="input-group-addon" id="basic-addon2">Jours</span>
								</div>
								<span class="glyphicon form-control-feedback" id="glyph-periode"></span>
								<span class="help-block text-center" id="error-periode">Vous avez sollicité un prêt: veuillez entrer la date de remboursement</span>
							</div>
							<p>
								<input type="hidden"  name="" value="" id="f" placeholder=""
									class="form-control" />
							</p>
				</div>
			</div>
			
			<!-- CHAMP BOUTTON DE CREATION DU PROJET -->
			<div class="row" id="">
				<div
					class="col-xs-offset-0 col-sm-offset-2 col-md-offset-7 col-lg-offset-7 col-xs-12 col-sm-8 col-md-3 col-lg-3"
					id="" style="background-color:">

					<div class="form-group" >
								<input type="button" name="" value="Créer mon projet"
									placeholder="" class="btn btn-default form-control"
									disabled="disabled" id="submit">
							</div>
				</div>
			</div>
		</form>
		</div>
	</div>
	<script
		src="<%=request.getContextPath()%>/resources/js/jquery-3.1.0.js"></script>
	<script
		src="<%=request.getContextPath()%>/resources/js/bootstrap.min.js"></script>
	<script src="<%=request.getContextPath()%>/resources/js/lendo.js"></script>
	<script src="<%=request.getContextPath()%>/resources/js/menu.js"></script>
	<script src="<%=request.getContextPath()%>/resources/js/creerprojet.js"></script>

</body>
</html>