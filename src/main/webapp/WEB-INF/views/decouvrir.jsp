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

		<!-- 
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
		 -->
		<div class="row" id="">
			<%@ include file="menu.jsp"%>
		</div>
		<!-- Block de chargement des catégories des projets -->
		<div class="btn-group-horizontal row" data-toggle="buttons">
			<label class="categorie"></label>
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

			<div class="row text-center" id="">
				<h1>PAGE D'EXPLORATION DE PROJET EN CONSTRUCTION</h1>

			</div>
			<iframe title="" width="500" height="390"
				src="http://www.youtube.com/embed/LY16fq8H8qQ" frameborder="0"
				allowfullscreen></iframe>

		</div>
	</div>
	<script
		src="<%=request.getContextPath()%>/resources/js/jquery-3.1.0.js"></script>
	<script
		src="<%=request.getContextPath()%>/resources/js/bootstrap.min.js"></script>
	<script src="<%=request.getContextPath()%>/resources/js/lendo.js"></script>
	<script src="<%=request.getContextPath()%>/resources/js/menu.js"></script>
	<script src="<%=request.getContextPath()%>/resources/js/decouvrir.js"></script>


</body>
</html>