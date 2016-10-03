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
		<div class="row text-center" id="">
			<h1>PAGE D'ACCEUIL EN CONSTRUCTION</h1>
		</div>
	</div>
	<div class="container">
<button data-toggle="modal" href="remote.html" data-target="#infos"
class="btn btn-primary">
informations
</button>
<div class="modal fade" id="infos">
<div class="modal-dialog">
<div class="modal-content">
<div class="modal-header">
<button type="button" class="close" datadismiss="modal">&times;</button>
<h1>Mon amour pour les tigres</h1>
</div>
<div class="modal-body">
<p>
Je suis passionné par les <strong>tigres</strong> depuis très
longtemps. Ce site a été construit en <em>
hommage à ces merveilleux félins...</em><br>
Je fais partie de la <abbr title="Société des Amoureux des
Tigres">SAT</abbr> qui a pour but de faire
connaître ces splendides animaux.
</p>
<p>Voici ce qu'en dit le wikipedia :</p>
<blockquote>
Le Tigre (Panthera tigris) est un mammifère carnivore de la
famille des félidés (Felidae) du genre Panthera.
Aisément reconnaissable à sa fourrure rousse rayée de noir, il est
le plus grand félin sauvage et l'un des plus
grands carnivores du monde. L'espèce est divisée en neuf sousespèces possédant des différences mineures en termes
de taille ou de comportement. Superprédateur, il chasse
principalement les cerfs et les sangliers, bien qu'il
puisse s'attaquer à des proies de taille plus importante comme les
buffles. Jusqu'au XIXe siècle, le Tigre était
réputé mangeur d'homme. La structure sociale des tigres en fait un
animal solitaire ; le mâle possède un territoire
qui englobe les domaines de plusieurs femelles et ne participe pas
à l'éducation des petits.<br>
<small class="pull-right">Wikipedia</small><br>
</blockquote>
</div></div>
</div>
</div>
</div>
	<script
		src="<%=request.getContextPath()%>/resources/js/jquery-3.1.0.js"></script>
	<script
		src="<%=request.getContextPath()%>/resources/js/bootstrap.min.js"></script>
		<script src="<%=request.getContextPath()%>/resources/js/lendo.js"></script>
		<script src="<%=request.getContextPath()%>/resources/js/menu.js"></script>
		<script src="<%=request.getContextPath()%>/resources/ckeditor/ckeditor.js"></script>

</body>
</html>