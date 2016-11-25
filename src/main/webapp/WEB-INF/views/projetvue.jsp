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
	href="<%=request.getContextPath()%>/resources/fonts/glyphicons-halflings-regular.svg" />
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/resources/fonts/glyphicons-halflings-regular.eot" />
</head>
<body>
	<div class="container" id="">
		<input type="hidden" id="code_p"
			value=<%=session.getAttribute("codeP")%>> <input
			type="hidden" id="df"> <input type="hidden" id="decal">
		<div class="" id="">
			<%@ include file="menu.jsp"%>
		</div>


		<div class="row" id="">
			<div class="col-lg-offset-2 col-xs-12 col-sm-12 col-md-12 col-lg-8"
				id="c_frame_video">
				<div class="embed-responsive embed-responsive-16by9" id="" style="">
					<iframe title="" class="embed-responsive-item"
						src="http://www.youtube.com/embed/" frameborder="0"
						allowfullscreen id="frame_video" width="" height=""></iframe>
				</div>

			</div>
		</div>


		<div class="row" id="">
			<div class="col-xs-12 col-sm-12 col-md-2 col-lg-3" id="">
				<div class="row" id="">
					<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12" id="">

						<img alt="Image du projet" id="image"
							class="img-thumbnail img-responsive center-block" src="">
					</div>
					<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12 connecte" id="">
						<input type="button" name="" value="Participer" placeholder=""
							class="btn btn-default form-control" id="participer_projet">

					</div>
				</div>
			</div>

			<div class="col-xs-12 col-sm-12 col-md-10 col-lg-9" id="">
				<div class="row" id="">
					<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12" id="">
						<p id="titre"></p>
					</div>
					<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12" id="">
						<p id="categorie"></p>
					</div>
					<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12" id="">
						<p id="slogan"></p>
					</div>
					<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12" id="">
						<p id="description"></p>
					</div>
					<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12" id="">
						<p id="test_progress"></p>
						<p id="collecte"></p>
						<p id="nbre_lenders"></p>
						<p id="mont_attendu"></p>
					</div>
					<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12" id="">
						<p id="progress"></p>
					</div>
					<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12" id="">
						<p id="temps_restant"></p>
					</div>
				</div>
			</div>
		</div>

		<div class="row" id="menu_projet_vue" style="background-color: #FBAF3F">
			<!-- Presentation detaillée -->
			<div class="col-xs-12 col-sm-4 col-md-4 col-lg-4"
				id="menu_presentation" style="background-color:">
				<h5 class=" control-label text-center">Présentation détaillée</h5>
			</div>
			<!-- Commentaires -->
			<div class="col-xs-12 col-sm-4 col-md-4 col-lg-4"
				id="menu_commentaires" style="background-color:">
				<h5 class=" control-label text-center">Commentaires</h5>
			</div>
			<!-- Contributeurs -->
			<div class="col-xs-12 col-sm-4 col-md-4 col-lg-4"
				id="menu_contributions" style="background-color:">
				<h5 class=" control-label text-center">Conditions sur le projet</h5>
			</div>
		</div>
		<div class="row " id="" style="background-color:">
			<div
				class="description_détalliée col-xs-12 col-sm-12 col-md-12 col-lg-12"
				id="contenu_pésentation" style="background-color:"></div>

			<div class=" liste_commentaires " id="" style="background-color:">
				<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12"
					id="contenu_commentaires" style="background-color:"></div>

				<div
					class="col-md-offset-1 col-lg-offset-1 col-xs-12 col-sm-12 col-md-11 col-lg-11"
					id="ecrire_commentaires" style="background-color:">
					<form action="" name="">
						<div class="" id="" style="">
							<textarea name="presentation" rows="8" cols=""
								class="form-control"
								placeholder="Veuillez entrer votre commentaire ici"
								id="mon_commentaire"></textarea>
						</div>
						<div class=" row " id="" style="">
							<div
								class="col-sm-offset-6 col-md-offset-6 col-lg-offset-6 col-sm-3 col-md-3 col-lg-3"
								id="" style="">
								<input type="reset" name="" value="Annuler"
									class="mon_boutton form-control" style="color: red"
									id="annule_commente">
							</div>
							<div class="col-sm-3 col-md-3 col-lg-3" id="" style="">
								<button type="button" class="btn btn-default form-control"
									id="ok_commente" style="font-size:">
									<span class="glyphicon glyphicon-send  " style="color:white"></span> Commenter
								</button>
							</div>
						</div>
					</form>
				</div>
			</div>


			<div class="liste_contributions" id="" style="background-color:">
				<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12"
					id="contenu_contributions" style="background-color:"></div>
				<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12" id="">
					<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12" id="">
						<p id="taux"></p>
					</div>
					<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12" id="">
						<p id="date_remboursement"></p>
					</div>
					<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12" id="">
						<p id="types_conn"></p>
					</div>
				</div>




			</div>





			<div class="row" id=""></div>
			<div class="row" id="">
				<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12" id=""></div>
			</div>

			<div class="row" id="">
				<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12" id=""
					style="background-color:">


					<!-- Bloc contenant l'image, le titre,le slogan, la description, la catégorie du projet -->
					<div class="row" id="">
						<div
							class="col-md-offset-0 col-lg-offset-0 col-xs-12 col-sm-12 col-md-12 col-lg-12"
							id="" style="background-color:">


							<div class="row" id="" style="background-color: white">

								<div class="col-xs-12 col-sm-12 col-md-9 col-lg-10" id=""
									style="background-color:">
									<div class="row" id="">
										<!-- Colonne contenant le type du projet-->

										<div
											class="col-xs-12 col-sm-12 col-md-12 col-lg-12 text-center"
											id="type_projet" style="background-color:"></div>
									</div>
								</div>
							</div>
						</div>
					</div>

				</div>
			</div>
		</div>








		<!-- PAGE MODAL DE SELECTION DE L'IMAGE -->
		<div class="modal fade" id="modal_contribution">
			<div class="modal-dialog" style="background-color: #595959">
				<div class="modal-content">
					<div class="modal-header" style="background-color: #FBAF3F">

						<button type="button" class="close" data-dismiss="modal" id="">&times;</button>
						<h4>Veuillez entrer le montant de votre participation pour le
							projet</h4>
					</div>
					<div class="modal-body" id=''
						style="background-color:; height: 100%">

						<form action="" name="">
							<input type="number" name="" value=""
								placeholder="Montant de la participation" class=""
								id="mon_montant"> <input type="button" name=""
								value="Contribuer" placeholder="" class="" id="jcontribu">
						</form>
					</div>
					<div class="modal-footer" style="background-color: #FBAF3F">
						<button id="c_modal" class="btn btn-default" data-dismiss="modal">Fermer</button>
					</div>
				</div>
			</div>
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