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
					<div class="col-md-offset-0 col-lg-offset-0 col-xs-12 col-sm-12 col-md-12 col-lg-12" id=""
						style="background-color: ">
						<!-- IFRAME DE LA VIDEO DE PRESENTATION DU PROJET -->
						<div class="row" id="">
							<div class="col-lg-offset-2 col-xs-12 col-sm-12 col-md-12 col-lg-6"
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
						<div class="row" id="" style="background-color:#FBAF3F">
							<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12"
								id="categorie" style="background-color:"></div>
						</div>

						<div class="row" id="" style="background-color:#FBAF3F">
							<!-- Colonne contenant l'image du projet-->
							<div class="col-xs-12 col-sm-12 col-md-3 col-lg-3" id=""
								style="background-color:">
								<img alt="Image du projet" id="image"
									class="img-responsive center-block" src="">
							</div>

							<div class="col-xs-12 col-sm-12 col-md-9 col-lg-9" id=""
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


</body>
</html>