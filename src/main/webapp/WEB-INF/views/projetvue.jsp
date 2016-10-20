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
		<input type="hidden" id="code_p"
			value=<%=session.getAttribute("codeP")%>>
		<div class="row" id="">
			<%@ include file="menu.jsp"%>
		</div>


		<div class="row" id="">
			<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12" id=""
				style="background-color:">


				<!-- Bloc contenant l'image, le titre,le slogan, la description, la catégorie du projet -->
				<div class="row" id="">
					<div
						class="col-md-offset-0 col-lg-offset-0 col-xs-12 col-sm-12 col-md-12 col-lg-12"
						id="" style="background-color:">
						<!-- IFRAME DE LA VIDEO DE PRESENTATION DU PROJET -->
						<div class="row" id="">
							<div
								class="col-lg-offset-2 col-xs-12 col-sm-12 col-md-12 col-lg-6"
								id="" style="background-color:">
								<div class="embed-responsive embed-responsive-16by9" id=""
									style="">
									<iframe title="" class="embed-responsive-item"
										src="http://www.youtube.com/embed/" frameborder="0"
										allowfullscreen id="frame_video" width="" height=""></iframe>
								</div>
							</div>
						</div>
						<!-- Ligne contenant la catégorie -->
						<div class="row" id="" style="background-color: #FBAF3F">
							<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12"
								id="categorie" style="background-color:"></div>
						</div>

						<div class="row" id="" style="background-color: #FBAF3F">
							<!-- Colonne contenant l'image du projet-->
							<div class="col-xs-12 col-sm-12 col-md-3 col-lg-2" id=""
								style="background-color:">
								<img alt="Image du projet" id="image"
									class="img-responsive center-block" src="">
							</div>

							<div class="col-xs-12 col-sm-12 col-md-9 col-lg-10" id=""
								style="background-color:">
								<div class="row" id="">
									<!-- Colonne contenant le titre du projet-->
									<div
										class="col-xs-12 col-sm-12 col-md-12 col-lg-12 text-center"
										id="titre" style="background-color:"></div>
									<!-- Colonne contenant le slogan du projet-->
									<div
										class="col-xs-12 col-sm-12 col-md-12 col-lg-12 text-center"
										id="slogan" style="background-color:"></div>
									<!-- Colonne contenant la description du projet-->
									<div
										class="col-xs-12 col-sm-12 col-md-12 col-lg-12 text-justify"
										id="description" style="background-color:"></div>

									<!-- Barre de progression-->
									<div
										class="col-xs-12 col-sm-12 col-md-12 col-lg-12 text-justify"
										id="test_progress" style="background-color:"></div>
									<div
										class="col-xs-12 col-sm-12 col-md-12 col-lg-12 text-justify"
										id="progress" style="background-color:"></div>

									<!-- Colonne contenant le temps rstant du projet-->
									<div
										class="col-xs-12 col-sm-12 col-md-12 col-lg-12 text-center"
										id="temps_restant" style="background-color:"></div>


								</div>
							</div>
						</div>
					</div>
				</div>
				<!-- Bloc contenant la description, les contributions et les commentaires -->
				<div class="row" id="">
					<div class="col-xs-12 col-sm-12 col-md-9 col-lg-9" id=""
						style="background-color:">
						<!-- Bloc contenant le menu -->
						<div class="row" id="" style="background-color: #FBAF3F">
							<!-- Presentation detaillée -->
							<div class="col-xs-12 col-sm-4 col-md-4 col-lg-4"
								id="menu_presentation" style="background-color:">
								<h5 class=" control-label text-center">Présentation
									détaillée</h5>
							</div>
							<!-- Commentaires -->
							<div class="col-xs-12 col-sm-4 col-md-4 col-lg-4"
								id="menu_commentaires" style="background-color:">
								<h5 class=" control-label text-center">Commentaires</h5>
							</div>
							<!-- Contributeurs -->
							<div class="col-xs-12 col-sm-4 col-md-4 col-lg-4"
								id="menu_contributions" style="background-color:">
								<h5 class=" control-label text-center">Contributions</h5>
							</div>
						</div>

						<!-- Bloc contenant la description détaillée-->
						<div class="row description_détalliée" id=""
							style="background-color:">
							<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12"
								id="contenu_pésentation" style="background-color:"></div>
						</div>
						<!-- Bloc contenant la liste des commentaires -->
						<div class="row liste_commentaires " id=""
							style="background-color:">
							<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12"
								id="contenu_commentaires" style="background-color:"></div>

							<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12"
								id="ecrire_commentaires" style="background-color:">
								<form action="" name="">
									<div class="" id="" style="">
										<textarea name="presentation" rows="8" cols=""
											class="form-control"
											placeholder="Présentation détaillée du projet"
											id="mon_commentaire"></textarea>
									</div>
									<div class=" row " id="" style="">
								<div
									class="col-sm-offset-6 col-md-offset-6 col-lg-offset-6 col-sm-3 col-md-3 col-lg-3"
									id="" style="">
									<input type="reset" name="" value="X" class="form-control"
										style="color: red" id="annule_commente">
								</div>
								<div class="col-sm-3 col-md-3 col-lg-3" id="" style="">
									<input type="button" name="" value="ok" placeholder=""
										class="btn btn-default form-control" id="ok_commente">
								</div>
							</div>
								</form>
							</div>
						</div>
						<!-- Bloc contenant la liste des contributions-->
						<div class="row liste_contributions" id=""
							style="background-color:">Contributions</div>
					</div>
				</div>
			</div>
		</div>



		<div class="row" id="">
			<div class="col-sm-1" id="" style="background-color: black">1</div>
			<div class="col-sm-1" id="" style="background-color:">2</div>
			<div class="col-sm-1" id="" style="background-color: blue">3</div>
			<div class="col-sm-1" id="" style="background-color: green">4</div>
			<div class="col-sm-1" id="" style="background-color: yellow">5</div>
			<div class="col-sm-1" id="" style="background-color: purple">6</div>
			<div class="col-sm-1" id="" style="background-color: indigo">7</div>
			<div class="col-sm-1" id="" style="background-color: black">8</div>
			<div class="col-sm-1" id="" style="background-color: grey">9</div>
			<div class="col-sm-1" id="" style="background-color: red">10</div>
			<div class="col-sm-1" id="" style="background-color: green">11</div>
			<div class="col-sm-1" id="" style="background-color: blue">12</div>
		</div>
	</div>
	<script
		src="<%=request.getContextPath()%>/resources/js/jquery-3.1.0.js"></script>

	<script
		src="<%=request.getContextPath()%>/resources/js/jquery-ui.min.js"></script>
	<script
		src="<%=request.getContextPath()%>/resources/js/bootstrap.min.js"></script>
	<script src="<%=request.getContextPath()%>/resources/js/lendo.js"></script>
	<script src="<%=request.getContextPath()%>/resources/js/menu.js"></script>
	<script src="<%=request.getContextPath()%>/resources/js/projetvue.js"></script>
	<script
		src="<%=request.getContextPath()%>/resources/ckeditor/ckeditor.js"></script>


</body>
</html>