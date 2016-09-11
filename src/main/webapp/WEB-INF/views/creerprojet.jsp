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

		<div class="row" id="">
			<%@ include file="menu.jsp"%>
		</div>
		<div class="row" id="">
			<div class="col-sm-4" id="" style="background-color: black"></div>
			<div class="col-sm-4" id="" style="background-color:">

				<div class="row" id="">
					<div class="col-sm-12" id="">
						<h2 class="text-center">Créez un projet</h2>
					</div>


					<div class="col-sm-12" id="">
						<h4 class="text-center">Créez votre projet pour bénéficier du
							soutien de la communauté</h4>
					</div>



				</div>


				<div class="row" id="form_creerprojet">
				<form action="">
				<div>
							<label class="control-label ">Titre du projet</label>
							<div class="form-group " id="div-titre">
								<input type="text" name="titre" id="titre"
									class="form-control"
									placeholder="Veuillez entrer le titre de votre projet" />
								<span class="glyphicon form-control-feedback" id="glyph-titre"></span>
								<span class="help-block " id="error-titre">Le titre de votre
									projet doit contenir entre 10 et 30 caractères</span>
							</div>
							<p>
								<input type="hidden" name="" value="" id="a" placeholder=""
									class="form-control" />
							</p>
						</div>
						<div>
							<label class="control-label">Cathégorie du projet</label>
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
						<div>
							<label class="control-label">Montant attendu de la
								campagne</label>
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
						<div>
							<label class="control-label"></label>
							<div class="form-group" >
								<input type="button" name="" value="Créer mon projet"
									placeholder="" class="btn btn-default form-control"
									disabled="disabled" id="submit">
							</div>
						</div>
						
				</form>
				</div>				
			</div>
			<div class="col-sm-4" id="" style="background-color: blue"></div>
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