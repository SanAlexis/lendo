<%@ page session="true"%>
<%@ page isELIgnored="false"%>
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
<title>Complétez votre profil Lendo</title>
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/resources/css/bootstrap-theme.min.css" />

<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/resources/css/jquery-ui.css" />
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
		<div class="row">
			<div class="col-xs-12 col-sm-2 col-md-2 col-lg-2" id="canvas_image"
				style="background-color:">
				<canvas id="image_canvas"
					style="background-color: red; height: 250px; width: 250px"></canvas>
				<canvas id="image_canvas1"
					style="background-color: blue; height: 250px; width: 250px"></canvas>
				<div class="affiche col-xs-12 col-sm-12 col-md-12 col-lg-12"
					id="affiche_image">
					<div
						class="glyphicon glyphicon-camera col-xs-12 col-sm-12 col-md-12 col-lg-12"
						id="modifier_photo"
						style="background-color: #595959; height: 25px">Modifier</div>
				</div>
				
								
				
			</div>
		</div>
		<!-- MENU 1 -->
		<div class="row" id="" style="background-color:#FBAF3F">
			<!-- DESCRIPTION SOMMAIRE -->
			<div class="col-xs-12 col-sm-2 col-md-2 col-lg-2" id="description"
				style="background-color:">
				<h5 class=" control-label text-center">Description sommaire</h5>
			</div>
			<!-- DESCRIPTION FINANCIERE -->
			<div class="col-xs-12 col-sm-2 col-md-2 col-lg-2" id="finance"
				style="background-color:">
				<h5 class=" control-label text-center">Description financière</h5>
			</div>
			<!-- DESCRIPTION DETAILLE -->
			<div class="col-xs-12 col-sm-2 col-md-2 col-lg-2" id="detail"
				style="background-color:">
				<h5 class=" control-label text-center">Description détaillée</h5>
			</div>
			<!-- LOCALISATION -->
			<div class="col-xs-12 col-sm-2 col-md-2 col-lg-2" id="localisation"
				style="background-color:">
				<h5 class=" control-label text-center">Localisation</h5>
			</div>
			<!-- IMAGE ET VIDEO -->
			<div class="col-xs-12 col-sm-2 col-md-2 col-lg-2" id="media"
				style="background-color:">
				<h5 class=" control-label text-center">Images et vidéos</h5>
			</div>
			<!-- ESPACE VIDE DE DROITE -->
			<div class="hidden-xs col-sm-2 col-md-2 col-lg-2" id=""
				style="background-color: red">
				<h4 class="text-center"></h4>
			</div>
		</div>

		<!-- Champs permettant de stocker le code du projet -->
		<input type="hidden" name="" value=<%=session.getAttribute("codeP")%>
			placeholder="Code projet" class="form-control" id="code_projet">

		<div class="row" id="">
			<div class="col-xs-12 col-sm-10 col-md-10 col-lg-10" id=""
				style="background-color:">
				<!-- FORMULAIRES DE MISE A JOUR -->
				<!-- CHAMP TITRE -->
				<div class="row info_description" id="">
					<div
						class="col-sm-offset-2 col-md-offset-2 col-lg-offset-2 col-xs-12 col-sm-10 col-md-2 col-lg-2"
						id="" style="background-color:">
						<label class="control-label">Titre du projet</label>
					</div>
					<div
						class="col-sm-offset-2 col-md-offset-0 col-lg-offset-0 col-xs-12 col-sm-8 col-md-6 col-lg-6"
						id="" style="background-color:">
						<form action="" name="">
							<div class="" id="" style="">
								<input type="text" name="" value=""
									placeholder="Titre du projet" class="form-control" id="titre">
								<input type="hidden" name="" value="" placeholder="Nom"
									id="check_titre" class="form-control">
							</div>
							<div>
								<div class="affiche col-xs-12 col-sm-12 col-md-12 col-lg-12"
									id="affiche_titre"></div>
							</div>
							<div class=" row " id="" style="">
								<div
									class="col-sm-offset-6 col-md-offset-6 col-lg-offset-6 col-sm-3 col-md-3 col-lg-3"
									id="" style="">
									<input type="reset" name="" value="X" class="form-control"
										style="color: red" id="annule_titre">
								</div>
								<div class="col-sm-3 col-md-3 col-lg-3" id="" style="">
									<input type="button" name="" value="ok" placeholder=""
										class="btn btn-default form-control" disabled="disabled"
										id="ok_titre">
								</div>
							</div>
						</form>
					</div>
				</div>
				<div class="row " id=""></div>
				<!-- CHAMP  CATEGORIE-->
				<div class="row info_description" id="">
					<div
						class="col-sm-offset-2 col-md-offset-2 col-lg-offset-2 col-xs-12 col-sm-10 col-md-2 col-lg-2"
						id="" style="background-color:">
						<label class="control-label">Cathégorie du projet</label>
					</div>
					<div
						class="col-sm-offset-2 col-md-offset-0 col-lg-offset-0 col-xs-12 col-sm-8 col-md-6 col-lg-6"
						id="" style="background-color:">
						<form action="" name="">

							<div class="" id="" style="">
								<select class="form-control" id="cathegorie">
									<option value="">Veuillez sélectionner la catégorie de
										votre projet</option>
									<option class="categorie"></option>
								</select> <input type="hidden" name="" value="" placeholder="Nom"
									id="check_cathegorie" class="form-control">
							</div>
							<div>
								<div class="affiche col-xs-12 col-sm-12 col-md-12 col-lg-12"
									id="affiche_cathegorie"></div>
							</div>
							<div class=" row " id="" style="">
								<div
									class="col-sm-offset-6 col-md-offset-6 col-lg-offset-6 col-sm-3 col-md-3 col-lg-3"
									id="" style="">
									<input type="reset" name="" value="X" class="form-control"
										style="color: red" id="annule_cathegorie">
								</div>
								<div class="col-sm-3 col-md-3 col-lg-3" id="" style="">
									<input type="button" name="" value="ok" placeholder=""
										class="btn btn-default form-control" disabled="disabled"
										id="ok_cathegorie">
								</div>
							</div>
						</form>
					</div>
				</div>

				<!-- CHAMP SLOGAN -->
				<div class="row info_description" id="">
					<div
						class="col-sm-offset-2 col-md-offset-2 col-lg-offset-2 col-xs-12 col-sm-10 col-md-2 col-lg-2"
						id="" style="background-color:">
						<label class="control-label">Slogan du projet</label>
					</div>
					<div
						class="col-sm-offset-2 col-md-offset-0 col-lg-offset-0 col-xs-12 col-sm-8 col-md-6 col-lg-6"
						id="" style="background-color:">
						<form action="" name="">

							<div class="" id="" style="">
								<input type="text" name="" value="" id="slogan"
									placeholder="Slogan du projet" class="form-control"> <input
									type="hidden" name="" value="" placeholder="Nom"
									id="check_slogan" class="form-control">
							</div>
							<div>
								<div class="affiche col-xs-12 col-sm-12 col-md-12 col-lg-12"
									id="affiche_slogan"></div>
							</div>
							<div class=" row " id="" style="">
								<div
									class="col-sm-offset-6 col-md-offset-6 col-lg-offset-6 col-sm-3 col-md-3 col-lg-3"
									id="" style="">
									<input type="reset" name="" value="X" class="form-control"
										style="color: red" id="annule_slogan">
								</div>
								<div class="col-sm-3 col-md-3 col-lg-3" id="" style="">
									<input type="button" name="" value="ok" placeholder=""
										class="btn btn-default form-control" disabled="disabled"
										id="ok_slogan">
								</div>
							</div>
						</form>
					</div>
				</div>

				<!-- CHAMP DESCRIPTION -->

				<div class="row info_description" id="">
					<div
						class="col-sm-offset-2 col-md-offset-2 col-lg-offset-2 col-xs-12 col-sm-10 col-md-2 col-lg-2"
						id="" style="background-color:">
						<label class="control-label">Description du projet</label>
					</div>
					<div
						class="col-sm-offset-2 col-md-offset-0 col-lg-offset-0 col-xs-12 col-sm-8 col-md-6 col-lg-6"
						id="" style="background-color:">
						<form action="" name="">

							<div class="" id="" style="">
								<textarea rows="8" cols="" id="description1"
									placeholder="Brève description du projet" class="form-control"
									id="presentation"></textarea>
								<input type="hidden" name="" value="" placeholder="Nom"
									id="check_description1" class="form-control">
							</div>
							<div>
								<div class="affiche col-xs-12 col-sm-12 col-md-12 col-lg-12"
									id="affiche_description1"></div>
							</div>
							<div class=" row " id="" style="">
								<div
									class="col-sm-offset-6 col-md-offset-6 col-lg-offset-6 col-sm-3 col-md-3 col-lg-3"
									id="" style="">
									<input type="reset" name="" value="X" class="form-control"
										style="color: red" id="annule_description1">
								</div>
								<div class="col-sm-3 col-md-3 col-lg-3" id="" style="">
									<input type="button" name="" value="ok" placeholder=""
										class="btn btn-default form-control" disabled="disabled"
										id="ok_description1">
								</div>
							</div>
						</form>
					</div>
				</div>


				<!-- CHAMP MONTANT DE LA CAMPAGNE -->
				<div class="row info_finance" id="">
					<div
						class="col-sm-offset-2 col-md-offset-2 col-lg-offset-2 col-xs-12 col-sm-10 col-md-2 col-lg-2"
						id="" style="background-color:">
						<label class="control-label">Montant attendu de la
							campagne</label>
					</div>
					<div
						class="col-sm-offset-2 col-md-offset-0 col-lg-offset-0 col-xs-12 col-sm-8 col-md-6 col-lg-6"
						id="" style="background-color:">
						<form action="" name="">
							<div class="input-group">
								<input type="number" class="form-control" id="montantAttendu"
									placeholder="Montant attendu de la campagne" min="01" max="31">
								<span class="input-group-addon" id="basic-addon2">F CFA</span>
							</div>
							<input type="hidden" name="" value="" placeholder="Nom"
								id="check_montantAttendu" class="form-control">
							<div>
								<div class="affiche col-xs-12 col-sm-12 col-md-12 col-lg-12"
									id="affiche_montantAttendu"></div>
							</div>
							<div class=" row " id="" style="">
								<div
									class="col-sm-offset-6 col-md-offset-6 col-lg-offset-6 col-sm-3 col-md-3 col-lg-3"
									id="" style="">
									<input type="reset" name="" value="X" class="form-control"
										style="color: red" id="annule_montantAttendu">
								</div>
								<div class="col-sm-3 col-md-3 col-lg-3" id="" style="">
									<input type="button" name="" value="ok" placeholder=""
										class="btn btn-default form-control" disabled="disabled"
										id="ok_montantAttendu">
								</div>
							</div>
						</form>
					</div>
				</div>
				<!-- CHAMP DUREE DE LA CAMPAGNE -->
				<div class="row info_finance" id="">
					<div
						class="col-sm-offset-2 col-md-offset-2 col-lg-offset-2 col-xs-12 col-sm-10 col-md-2 col-lg-2"
						id="" style="background-color:">
						<label class="control-label">Durée de la campagne</label>
					</div>
					<div
						class="col-sm-offset-2 col-md-offset-0 col-lg-offset-0 col-xs-12 col-sm-8 col-md-6 col-lg-6"
						id="" style="background-color:">
						<form action="" name="">
							<div class="input-group">
								<input type="number" class="form-control" id="dureeCampagne"
									placeholder="Durée de la campagne" min="01" max="31"> <span
									class="input-group-addon" id="basic-addon2">Jours</span>
							</div>
							<input type="hidden" name="" value="" placeholder="Nom"
								id="check_dureeCampagne" class="form-control">
							<div>
								<div class="affiche col-xs-12 col-sm-12 col-md-12 col-lg-12"
									id="affiche_dureeCampagne"></div>
							</div>
							<div class=" row " id="" style="">
								<div
									class="col-sm-offset-6 col-md-offset-6 col-lg-offset-6 col-sm-3 col-md-3 col-lg-3"
									id="" style="">
									<input type="reset" name="" value="X" class="form-control"
										style="color: red" id="annule_dureeCampagne">
								</div>
								<div class="col-sm-3 col-md-3 col-lg-3" id="" style="">
									<input type="button" name="" value="ok" placeholder=""
										class="btn btn-default form-control" disabled="disabled"
										id="ok_dureeCampagne">
								</div>
							</div>
						</form>
					</div>
				</div>


				<!-- CHAMP BUSNESS PLAN -->
				<div class="row info_detail" id="">
					<div
						class="col-sm-offset-2 col-md-offset-2 col-lg-offset-2 col-xs-12 col-sm-10 col-md-2 col-lg-2"
						id="" style="background-color:">
						<label class="control-label">Business plan</label>
					</div>
					<div
						class="col-sm-offset-2 col-md-offset-0 col-lg-offset-0 col-xs-12 col-sm-8 col-md-6 col-lg-6"
						id="" style="background-color:">
						<form action="" name="">

							<div class="" id="" style="">
								<input type="file" name="" value="" placeholder="Business plan"
									id="busnessPlan" class=""> <input type="hidden" name=""
									value="" placeholder="Nom" id="check_busnessPlan"
									class="form-control">
							</div>
							<div>
								<div class="affiche col-xs-12 col-sm-12 col-md-12 col-lg-12"
									id="affiche_busnessPlan"></div>
							</div>
							<div class=" row " id="" style="">
								<div
									class="col-sm-offset-6 col-md-offset-6 col-lg-offset-6 col-sm-3 col-md-3 col-lg-3"
									id="" style="">
									<input type="reset" name="" value="X" class="form-control"
										style="color: red" id="annule_busnessPlan">
								</div>
								<div class="col-sm-3 col-md-3 col-lg-3" id="" style="">
									<input type="button" name="" value="ok" placeholder=""
										class="btn btn-default form-control" disabled="disabled"
										id="ok_busnessPlan">
								</div>
							</div>
						</form>
					</div>
				</div>
				<!-- CHAMP DESCRIPTION DETAILLEE -->
				<div class="row info_detail" id="">
					<div
						class="col-sm-offset-2 col-md-offset-2 col-lg-offset-2 col-xs-12 col-sm-10 col-md-2 col-lg-2"
						id="" style="background-color:">
						<label class="control-label">Présentation détaillée du
							projet</label>
					</div>
					<div
						class="col-sm-offset-2 col-md-offset-0 col-lg-offset-0 col-xs-12 col-sm-8 col-md-6 col-lg-6"
						id="" style="background-color:">
						<form action="" name="">

							<div class="" id="" style="">
								<textarea name="presentation" rows="8" cols=""
									class="form-control"
									placeholder="Présentation détaillée du projet"
									id="presentation"></textarea>
								<input type="hidden" name="" value="" placeholder="Nom"
									id="check_presentation" class="form-control">
							</div>
							<div>
								<div class="affiche col-xs-12 col-sm-12 col-md-12 col-lg-12"
									id="affiche_presentation"></div>
							</div>
							<div class=" row " id="" style="">
								<div
									class="col-sm-offset-6 col-md-offset-6 col-lg-offset-6 col-sm-3 col-md-3 col-lg-3"
									id="" style="">
									<input type="reset" name="" value="X" class="form-control"
										style="color: red" id="annule_presentation">
								</div>
								<div class="col-sm-3 col-md-3 col-lg-3" id="" style="">
									<input type="button" name="" value="ok" placeholder=""
										class="btn btn-default form-control" id="ok_presentation">
								</div>
							</div>
						</form>
					</div>
				</div>
				<!-- CHAMP LOCALISATION -->
				<div class="row info_localisation" id="">
					<div
						class="col-sm-offset-2 col-md-offset-2 col-lg-offset-2 col-xs-12 col-sm-10 col-md-2 col-lg-2"
						id="" style="background-color:">
						<label class="control-label">Localisation du projet</label>
					</div>
					<div
						class="col-sm-offset-2 col-md-offset-0 col-lg-offset-0 col-xs-12 col-sm-8 col-md-6 col-lg-6"
						id="" style="background-color:">
						<form action="" name="">

							<div class="" id="" style="">
								<input type="text" name="" value="" id="ville"
									placeholder="Ville" class="form-control"> <input
									type="hidden" name="" value="" placeholder="Nom"
									id="check_ville" class="form-control">
							</div>
							<div>
								<div class="affiche col-xs-12 col-sm-12 col-md-12 col-lg-12"
									id="affiche_ville"></div>
							</div>
							<div class=" row " id="" style="">
								<div
									class="col-sm-offset-6 col-md-offset-6 col-lg-offset-6 col-sm-3 col-md-3 col-lg-3"
									id="" style="">
									<input type="reset" name="" value="X" class="form-control"
										style="color: red" id="annule_ville">
								</div>
								<div class="col-sm-3 col-md-3 col-lg-3" id="" style="">
									<input type="button" name="" value="ok" placeholder=""
										class="btn btn-default form-control" disabled="disabled"
										id="ok_ville">
								</div>
							</div>
							<div class="" id="" style="">
								<input type="text" name="" value="" id="pays" placeholder="Pays"
									class="form-control"> <input type="hidden" name=""
									value="" placeholder="Nom" id="check_pays" class="form-control">

							</div>
							<div>
								<div class="affiche col-xs-12 col-sm-12 col-md-12 col-lg-12"
									id="affiche_pays"></div>
							</div>
							<div class=" row " id="" style="">
								<div
									class="col-sm-offset-6 col-md-offset-6 col-lg-offset-6 col-sm-3 col-md-3 col-lg-3"
									id="" style="">
									<input type="reset" name="" value="X" class="form-control"
										style="color: red" id="annule_pays">
								</div>
								<div class="col-sm-3 col-md-3 col-lg-3" id="" style="">
									<input type="button" name="" value="ok" placeholder=""
										class="btn btn-default form-control" disabled="disabled"
										id="ok_pays">
								</div>
							</div>
						</form>
					</div>
				</div>


				<!-- CHAMP VIDEO DU PROJET -->
				<div class="row info_media" id="">
					<div
						class="col-sm-offset-2 col-md-offset-2 col-lg-offset-2 col-xs-12 col-sm-10 col-md-2 col-lg-2"
						id="" style="background-color:">
						<label class="control-label">URL de la vidéo de
							présentation du projet</label>
					</div>
					<div
						class="col-sm-offset-2 col-md-offset-0 col-lg-offset-0 col-xs-12 col-sm-8 col-md-6 col-lg-6"
						id="" style="background-color:">
						<form action="" name="">

							<div class="" id="" style="">
								<input type="text" name="" value="" id="video"
									placeholder="Vidéo du projet" class="form-control"> <input
									type="hidden" name="" value="" placeholder="Nom"
									id="check_video" class="form-control">
							</div>
							<div>
								<div class="affiche col-xs-12 col-sm-12 col-md-12 col-lg-12"
									id="affiche_video"></div>
							</div>
							<div class=" row " id="" style="">
								<div
									class="col-sm-offset-6 col-md-offset-6 col-lg-offset-6 col-sm-3 col-md-3 col-lg-3"
									id="" style="">
									<input type="reset" name="" value="X" class="form-control"
										style="color: red" id="annule_video">
								</div>
								<div class="col-sm-3 col-md-3 col-lg-3" id="" style="">
									<input type="button" name="" value="ok" placeholder=""
										class="btn btn-default form-control" disabled="disabled"
										id="ok_video">
								</div>
							</div>
						</form>
					</div>
					
				</div>
				<!-- IFRAME DE LA VIDEO DE PRESENTATION DU PROJET -->
				<div class="row info_media" id="">
					<div
						class="col-sm-offset-2 col-md-offset-2 col-lg-offset-2 col-xs-12 col-sm-10 col-md-2 col-lg-2"
						id="" style="background-color:">
						<label class="control-label"></label>
					</div>
					<div
						class="col-sm-offset-2 col-md-offset-0 col-lg-offset-0 col-xs-12 col-sm-8 col-md-6 col-lg-6"
						id="" style="background-color:">

							<div class="embed-responsive embed-responsive-16by9" id="" style="">
								<iframe title="" class = "embed-responsive-item"
				src="http://www.youtube.com/embed/" frameborder="0"	allowfullscreen id="frame_video" width="" height=""></iframe>
							</div>
					</div>
				</div>


				<!-- CHAMP  -->
				<div class="row" id="">
					<div
						class="col-sm-offset-2 col-md-offset-2 col-lg-offset-2 col-xs-12 col-sm-10 col-md-2 col-lg-2"
						id="" style="background-color:">
						<label class="control-label"></label>
					</div>
					<div
						class="col-sm-offset-2 col-md-offset-0 col-lg-offset-0 col-xs-12 col-sm-8 col-md-6 col-lg-6"
						id="" style="background-color:"></div>
				</div>

			</div>





<!-- PAGE MODAL DE SELECTION DE L'IMAGE -->
			<div class="modal fade" id="select_image">
				<div class="modal-dialog" style="background-color: #595959">
					<div class="modal-content">
						<div class="modal-header" style="background-color: #FBAF3F">

							<button type="button" class="close" data-dismiss="modal" id="">&times;</button>
							<h1>Sélectionnez une image</h1>
						</div>
						<div class="modal-body" id=''
							style="background-color:; height: 100%">
							
<form action="" name="">
					<input type="file" name="" value="" placeholder="Image du projet"
						class="" id="image">
						<input type="reset" name="" value="Annuler" placeholder="Annuler"
						class="" id="">
				</form>
						</div>
						<div class="modal-footer" style="background-color: #FBAF3F">
						<button class="btn btn-default" data-dismiss="modal">Fermer</button>
						</div>
					</div>
				</div>
			</div>
			
			
			
			

			<!-- PAGE MODAL DE REDIMENSIONNENEMENT ET DE MISE A JOUR DE LA PHOTO -->
			<div class="modal fade" id="infos">
				<div class="modal-dialog" style="background-color: #595959">
					<div class="modal-content">
						<div class="modal-header" style="background-color: #FBAF3F">

							<button type="button" class="close" data-dismiss="modal" id="">&times;</button>
							<h1>Paramétrez la photo de votre projet</h1>
						</div>
						<div class="modal-body" id='j'
							style="background-color:; height: 100%">
							<img src="" id="img" class="center-block"></img>

							<div id="resize"
								style="background-color:; height: 100px; width: 100px; top: -370px; left: 100px">
								<button class="btn" id="rr"
									style="background-color: transparent; height:; border-color: #595959">Rogner</button>
									<button class="btn" id="upload"
									style="background-color: transparent; height:; border-color: #595959">Upload</button>
									</div>

						</div>
						<div class="modal-footer" style="background-color: #FBAF3F">

						</div>
					</div>
				</div>
			</div>
			<!-- ESPACE VIDE DE DROITE -->
			<div class="hidden-xs col-sm-2 col-md-2 col-lg-2" id=""
				style="background-color: red">
				<h4 class="text-center"></h4>
				cccc
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
	<script
		src="<%=request.getContextPath()%>/resources/ckeditor/ckeditor.js"></script>
	<script src="<%=request.getContextPath()%>/resources/js/menu.js"></script>
	<script
		src="<%=request.getContextPath()%>/resources/js/parametrerprojet.js"></script>

</body>
</html>