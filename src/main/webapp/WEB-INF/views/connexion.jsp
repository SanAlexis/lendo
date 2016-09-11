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
	<div class="container" id="">
<div class="row" id="menur_bar">
			<%@ include file="menu.jsp"%>
		</div>
		<div class="row" id="">
			<div class="col-sm-4" id="" style="background-color: black"></div>
			<div class="col-sm-4" id="" style="background-color:">
				<div class="row" id="logo">
					<a href="index"> <img alt="LOGO LENDO" class="img-responsive"
						src="<%=request.getContextPath()%>/resources/fonts/logo-tag.png"></a>
				</div>
				<div class="row" id="">
					<div class="row" id="">
						<h2 class="text-center">Connectez vous à Lendo</h2>
					</div>

					<div class="row" id="">
						<h4 class="text-center">Connectez vous avec un de vos comptes</h4>
					</div>


				</div>
				<div class="row" id="">
					<div class="col-sm-6 text-center" id=""
						style="background-color: black">
						<a href="">FACEBOOK</a>
					</div>
					<div class="col-sm-6 text-center" id=""
						style="background-color: red">
						<a href="">TWITTER</a>
					</div>
				</div>
				<div class="row" id="">
					<div class="row" id="">
						<h4 class="text-center">OU</h4>
					</div>

					<div class="row" id="">
						<h4 class="text-center">Connectez vous avec votre adresse
							email</h4>
					</div>


				</div>
				<div class="row" id="form_inscription">
				<form action="" name="" method="post">
<div>
							<label class="control-label">Adresse email</label>
							<div class="form-group" id="div-email">
								<input type="email" name="email" id="email"
									class="form-control"
									placeholder="Veuillez entrer votre adresse email" />
								<span class="glyphicon  form-control-feedback" id="glyph-email"></span>

								<span class="help-block" id="error-email">Adresse email
									invalide</span>
							</div>
							<p>
								<input type="hidden"  id="a" placeholder="" class="form-control" />

							</p>
						</div>
							<div>
							<label class="control-label">Mot de passe</label>
							<div class="form-group" id="div-password">
								<input type="hidden"  id="pass" class="form-control" />
								<input type="password" name="password" id="password"
									class="form-control"
									placeholder="Veuillez entrer votre mot de passe"> <span
									class="glyphicon  form-control-feedback" id="glyph-password"></span>
								<span class="help-block" id="error-password">Votre mot de
									passe doit commencer par une lettre majiscule, contenir au
									moins 01 chiffre et avoir au minimun 08 caractères</span> <span
									class="">
									<button
										class="btn btn-default0 glyphicon glyphicon-eye-open vue"
										type="button"></button>
								</span>
								<p>
									<input type="hidden" id="b" class="form-control" placeholder="" />
								</p>
							</div>
						</div>
						<div>
							<label class="control-label"></label>
							<div class="form-group" id="div-check">
								<p>
									<input type="checkbox"  name="" value="" class=""
										id="check" />
									Garder ma session active
								</p>
							</div>
						</div>
						<div>
							<label class="control-label"></label>
							<div class="form-group">
								<input type="button" name="" value="Connexion" placeholder=""
									class="btn btn-default form-control" disabled="disabled"
									id="submit">
							</div>
						</div>
					</form>
				</div>

				<div class="row">
					<a href="inscription" id="option"><h4 class="text-center">Pas
							encore inscrit(e)? Inscrivez vous ici</h4></a>
				</div>
				<div class="col-sm-4" id="" style="background-color: blue"></div>
			</div>
		</div>
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