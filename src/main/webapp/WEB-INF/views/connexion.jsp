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
<title>Bienvenue sur Lendo, Connexion</title>
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/resources/css/lendo.css" />
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/resources/fonts/glyphicons-halflings-regular.svg" />
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/resources/fonts/glyphicons-halflings-regular.eot" />
</head>
<body>
	<div class="container" id="">
	<!-- MENU DE LENDO -->
		<div class="" id="menur_bar">
			<%@ include file="menu.jsp"%>
		</div>
		<!-- LOGO DE LENDO -->
		<div class="row" id="">
			<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12" id=""
				style="background-color: #FBAF3F">
				<a href="index"> <img alt="LOGO LENDO"
					class="img-responsive center-block"
					src="<%=request.getContextPath()%>/resources/fonts/logo-tag.png"></a>
			</div>
		</div>
		<!-- OPTIONS DE CONNEXION  -->
		<div class="row" id="">
			<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12" id=""
				style="background-color:">
				<h2 class="text-center">Connectez vous à Lendo</h2>
			</div>
		</div>
		<div class="row" id="">
			<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12" id=""
				style="background-color:">
				<h4 class="text-center">Connectez vous avec un de vos comptes</h4>
			</div>
		</div>
		<div class="row" id="">
			<div
				class="col-sm-offset-4 col-md-offset-4 col-lg-offset-4 col-xs-12 col-sm-2 col-md-2 col-lg-2"
				id="" style="background-color:">
				<h4 class="text-center">FACEBOOK</h4>
			</div>
			<div
				class="col-sm-offset-0 col-md-offset-0 col-lg-offset-0 col-xs-12 col-sm-2 col-md-2 col-lg-2"
				id="" style="background-color:">
				<h4 class="text-center">TWITTER</h4>
			</div>
		</div>
		<div class="row" id="">
			<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12" id=""
				style="background-color:">
				<h4 class="text-center">OU</h4>
			</div>
		</div>
		<div class="row" id="">
			<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12" id=""
				style="background-color:">
				<h4 class="text-center">Connectez vous avec votre adresse email</h4>
			</div>
		</div>
		<!-- FORMULAIRE DE CONNEXION  -->
		<form action="" name="" method="post">
			<!-- CHAMP ADRESSE EMAIL -->
			<div class="row" id="">
				<div
					class="col-sm-offset-2 col-md-offset-2 col-lg-offset-2 col-xs-12 col-sm-10 col-md-2 col-lg-2"
					id="" style="background-color:">
					<label class="control-label">Adresse email</label>
				</div>
				<div
					class="col-sm-offset-2 col-md-offset-0 col-lg-offset-0 col-xs-12 col-sm-8 col-md-6 col-lg-6"
					id="" style="background-color:">
					<div class="form-group" id="div-email">
						<input type="email" name="email" id="email" class="form-control"
							placeholder="Veuillez entrer votre adresse email" /> <span
							class="glyphicon  form-control-feedback" id="glyph-email"></span>

						<span class="help-block" id="error-email">Adresse email
							invalide</span>
					</div>
					<p>
						<input type="hidden" id="a" placeholder="" class="form-control" />

					</p>
				</div>
			</div>


			<!-- CHAMP MOT DE PASSE -->
			<div class="row" id="">
				<div
					class="col-sm-offset-2 col-md-offset-2 col-lg-offset-2 col-xs-12 col-sm-10 col-md-2 col-lg-2"
					id="" style="background-color:">
					<label class="control-label">Mot de passe</label>
				</div>
				<div
					class="col-sm-offset-2 col-md-offset-0 col-lg-offset-0 col-xs-12 col-sm-8 col-md-6 col-lg-6"
					id="" style="background-color:">
					<div class="form-group" id="div-password">
						<input type="hidden" id="pass" class="form-control" /> <input
							type="password" name="password" id="password"
							class="form-control"
							placeholder="Veuillez entrer votre mot de passe"><span
							class="col-xs-offset-11 col-sm-offset-11 col-md-offset-11 col-lg-offset-11 col-xs-1 col-sm-1 col-md-1 col-lg-1">
							<button class="btn btn-default0 glyphicon glyphicon-eye-open vue"
								type="button"></button>
						</span> <span class="glyphicon  form-control-feedback"
							id="glyph-password"></span> <span class="help-block"
							id="error-password">Votre mot de passe doit commencer par
							une lettre majiscule, contenir au moins 01 chiffre et avoir au
							minimun 08 caractères</span>
						<p>
							<input type="hidden" id="b" class="form-control" placeholder="" />
						</p>
					</div>
				</div>
			</div>
			<!-- CHAMP GARDER LA SESSION ACTIVE -->
			<div class="row" id="">
				<div
					class="col-sm-offset-2 col-md-offset-2 col-lg-offset-2 col-xs-6 col-sm-5 col-md-5 col-lg-5"
					id="" style="background-color:">
					<label class="control-label">Se souvenir de moi </label>
				</div>
				<div
					class="text-right col-xs-offset-0 col-sm-offset-0 col-md-offset-0 col-lg-offset-0 col-xs-6 col-sm-3 col-md-3 col-lg-3"
					id="" style="background-color:">
					<div class="btn-group" data-toggle="buttons" id="div-check">
						<label class="btn btn-warning"> <input type="radio"
							name="check" value="true">OUI
						</label> <label class="btn btn-success"> <input type="radio"
							name="check" value="false" checked="checked">NON
						</label>
					</div>


				</div>
			</div>
			<!-- CHAMP BOUTTON DE CONNEXION -->
			<div class="row" id="">
				<div
					class="col-xs-offset-0 col-sm-offset-2 col-md-offset-7 col-lg-offset-7 col-xs-12 col-sm-8 col-md-3 col-lg-3"
					id="" style="background-color:">

					<div class="form-group">
						<input type="button" name="" value="Connexion" placeholder=""
							class="btn btn-default form-control" disabled="disabled"
							id="submit">
					</div>
				</div>
			</div>

			<!-- CHAMP PAS ENCORE INSCRIT? -->
			<div class="row" id="">
				<div
					class="text-center col-xs-offset-0 col-sm-offset-2 col-md-offset-7 col-lg-offset-7 col-xs-12 col-sm-8 col-md-3 col-lg-3"
					id="" style="background-color:">
					<a href="inscription" id='option'><h4 class="text-center">
							<label class="control-label">Pas encore inscrit(e)?
								Inscrivez vous ici</label>
						</h4></a>

				</div>
			</div>
		</form>
	</div>
	<script
		src="<%=request.getContextPath()%>/resources/js/jquery-3.1.0.js"></script>
	<script
		src="<%=request.getContextPath()%>/resources/js/bootstrap.min.js"></script>
	<script src="<%=request.getContextPath()%>/resources/js/lendo.js"></script>
	<script src="<%=request.getContextPath()%>/resources/js/menu.js"></script>
	<script src="<%=request.getContextPath()%>/resources/js/connexion.js"></script>

</body>
</html>