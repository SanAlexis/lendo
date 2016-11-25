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
	href="<%=request.getContextPath()%>/resources/css/lendo.css" />


<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/resources/css/style.css" />

<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/resources/fonts/glyphicons-halflings-regular.svg" />
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/resources/fonts/glyphicons-halflings-regular.eot" />
<body>


	<div class="container" id="">
		<div class="" id="">
			<%@ include file="menu.jsp"%>
		</div>

		<!-- Start WOWSlider.com BODY section -->
		<!-- add to the <body> of your page -->
		<div id="wowslider-container0">
			<div class="ws_images">
				<ul>
					<li><img
						src="<%=request.getContextPath()%>/resources/fonts/images/atango.jpg"
						alt="MUSIQUE" title="DIVERTISSEMENT" id="wows0_0" /></li>
					<li><img
						src="<%=request.getContextPath()%>/resources/fonts/images/hva.jpg"
						alt="INDUSTRIE" title="INDUSTRIE" id="wows0_1" /></li>
					<li><img
						src="<%=request.getContextPath()%>/resources/fonts/images/jouets.jpg"
						alt="DIVERTISSEMENT" title="HUMANITAIRE" id="wows0_2" /></li>
					<li><img
						src="<%=request.getContextPath()%>/resources/fonts/images/montre.jpg"
						alt="TECHNOLOGIE" title="TECHNOLOGIE" id="wows0_3" /></li>
					<li><a href=""><img
							src="<%=request.getContextPath()%>/resources/fonts/images/pimenterie.jpg"
							alt="bootstrap slider" title="ALIMENTATION" id="wows0_4" /></a></li>
					<li><img
						src="<%=request.getContextPath()%>/resources/fonts/images/porcherie.jpg"
						alt="ELEVAGE" title="ELEVAGE" id="wows0_5" /></li>
				</ul>
			</div>
			<div class="ws_script" style="position: absolute; left: -99%">
				<a href=""></a> v8.7
			</div>
			<div class="ws_shadow"></div>
		</div>

		<!-- End WOWSlider.com BODY section -->


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



		<!-- Ligne contenant les projets -->
		<div class="row" id="projets"></div>


	</div>
	<script
		src="<%=request.getContextPath()%>/resources/js/jquery-3.1.0.js"></script>
	<script
		src="<%=request.getContextPath()%>/resources/js/bootstrap.min.js"></script>
	<script src="<%=request.getContextPath()%>/resources/js/lendo.js"></script>
	<script src="<%=request.getContextPath()%>/resources/js/menu.js"></script>
	<script src="<%=request.getContextPath()%>/resources/js/index.js"></script>
	<script type="text/javascript"
		src="<%=request.getContextPath()%>/resources/js/wowslider.js"></script>
	<script type="text/javascript"
		src="<%=request.getContextPath()%>/resources/js/script.js"></script>
	<script
		src="<%=request.getContextPath()%>/resources/ckeditor/ckeditor.js"></script>


</body>
</html>