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
	href="<%=request.getContextPath()%>/resources/fonts/glyphicons-halflings-regular.svg" />
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/resources/fonts/glyphicons-halflings-regular.eot" />
</head>
<body>
	<div class="container-ui" id="">

		<div class="" id="">
			<%@ include file="menu.jsp"%>
		</div>
		<!-- MENU 1 -->
		<div class="row" id="" style="background-color:#FBAF3F">
			<!-- IDENTITE -->
			<div class="col-xs-12 col-sm-2 col-md-2 col-lg-2" id="identite"
				style="background-color:">
				<h5 class=" control-label text-center">Identité</h5>
			</div>
			<!-- COORDONNEES -->
			<div class="col-xs-12 col-sm-2 col-md-2 col-lg-2" id="coordonnees"
				style="background-color:">
				<h5 class=" control-label text-center">Coordonnées</h5>
			</div>
			<!-- DESCRIPTION DETAILLE -->
			<div class="col-xs-12 col-sm-2 col-md-2 col-lg-2" id="preferences"
				style="background-color:">
				<h5 class=" control-label text-center">Préférences</h5>
			</div>
			<!-- LOCALISATION -->
			<div class="col-xs-12 col-sm-2 col-md-2 col-lg-2" id="situation"
				style="background-color:">
				<h5 class=" control-label text-center">Situation et expérience</h5>
			</div>
			<!-- ESPACE VIDE DE DROITE -->
			<div class="hidden-xs col-sm-4 col-md-4 col-lg-4" id=""
				style="background-color: red">
				<h4 class="text-center"></h4>
			</div>
		</div>

		<div class="row" id="">
			<div class="col-xs-12 col-sm-10 col-md-10 col-lg-10" id=""
				style="background-color:">
				<!-- FORMULAIRES DE MISE A JOUR -->
				<!-- CHAMP NOM -->
				<div class="row info_identite" id="">
					<div
						class="col-sm-offset-2 col-md-offset-2 col-lg-offset-2 col-xs-12 col-sm-10 col-md-2 col-lg-2"
						id="" style="background-color:">
						<label class="control-label">Nom</label>
					</div>
					<div
						class="col-sm-offset-2 col-md-offset-0 col-lg-offset-0 col-xs-12 col-sm-8 col-md-6 col-lg-6"
						id="" style="background-color:">
						<form action="" name="">
							<div class="" id="" style="">
								<input type="text" name="" value="" placeholder="Nom"
									class="form-control" id="nom"> <input type="hidden"
									name="" value="" placeholder="Nom" id="check_nom"
									class="form-control">
							</div>
							<div>
								<div class="affiche col-xs-12 col-sm-12 col-md-12 col-lg-12"
									id="affiche_nom"></div>
							</div>
							<div class=" row " id="" style="">
								<div
									class="col-sm-offset-6 col-md-offset-6 col-lg-offset-6 col-sm-3 col-md-3 col-lg-3"
									id="" style="">
									<input type="reset" name="" value="X" class="form-control"
										style="color: red" id="annule_nom">
								</div>
								<div class="col-sm-3 col-md-3 col-lg-3" id="" style="">
									<input type="button" name="" value="ok" placeholder=""
										class="btn btn-default form-control" disabled="disabled"
										id="ok_nom">
								</div>
							</div>
						</form>
					</div>
				</div>

				<!-- CHAMP PRENOM -->
				<div class="row info_identite" id="">
					<div
						class="col-sm-offset-2 col-md-offset-2 col-lg-offset-2 col-xs-12 col-sm-10 col-md-2 col-lg-2"
						id="" style="background-color:">
						<label class="control-label">Prenom</label>
					</div>
					<div
						class="col-sm-offset-2 col-md-offset-0 col-lg-offset-0 col-xs-12 col-sm-8 col-md-6 col-lg-6"
						id="" style="background-color:">
						<form action="" name="">
							<div class="" id="" style="">
								<input type="text" name="" value="" placeholder="Prénom"
									class="form-control" id="prenom"> <input type="hidden"
									name="" value="" placeholder="Nom" id="check_prenom"
									class="form-control">
							</div>
							<div>
								<div class="affiche col-xs-12 col-sm-12 col-md-12 col-lg-12"
									id="affiche_prenom"></div>
							</div>
							<div class=" row " id="" style="">
								<div
									class="col-sm-offset-6 col-md-offset-6 col-lg-offset-6 col-sm-3 col-md-3 col-lg-3"
									id="" style="">
									<input type="reset" name="" value="X" class="form-control"
										style="color: red" id="annule_prenom">
								</div>
								<div class="col-sm-3 col-md-3 col-lg-3" id="" style="">
									<input type="button" name="" value="ok" placeholder=""
										class="btn btn-default form-control" disabled="disabled"
										id="ok_prenom">
								</div>
							</div>
						</form>
					</div>
				</div>
				<!-- CHAMP DATE DE NAISSANCE -->
				<div class="row info_identite" id="">
					<div
						class="col-sm-offset-2 col-md-offset-2 col-lg-offset-2 col-xs-12 col-sm-10 col-md-2 col-lg-2"
						id="" style="background-color:">
						<label class="control-label">Date de naissance</label>
					</div>
					<div
						class="col-sm-offset-2 col-md-offset-0 col-lg-offset-0 col-xs-12 col-sm-8 col-md-6 col-lg-6"
						id="" style="background-color:">
						<form action="" name="">
							<div class="" id="" style="">
								<input type="date" name="" value=""
									placeholder="date de naissance" class="form-control" id="date">
								<input type="hidden" name="" value="" placeholder=""
									id="check_date" class="form-control">
							</div>
							<div>
								<div class="affiche col-xs-12 col-sm-12 col-md-12 col-lg-12"
									id="affiche_date"></div>
							</div>
							<div class=" row " id="" style="">
								<div
									class="col-sm-offset-6 col-md-offset-6 col-lg-offset-6 col-sm-3 col-md-3 col-lg-3"
									id="" style="">
									<input type="reset" name="" value="X" class="form-control"
										style="color: red" id="annule_date">
								</div>
								<div class="col-sm-3 col-md-3 col-lg-3" id="" style="">
									<input type="button" name="" value="ok" placeholder=""
										class="btn btn-default form-control" disabled="disabled"
										id="ok_date">
								</div>
							</div>
						</form>
					</div>
				</div>
				<!-- CHAMP LIEU DE NAISSANCE -->
				<div class="row info_identite" id="">
					<div
						class="col-sm-offset-2 col-md-offset-2 col-lg-offset-2 col-xs-12 col-sm-10 col-md-2 col-lg-2"
						id="" style="background-color:">
						<label class="control-label">Lieu de naissance</label>
					</div>
					<div
						class="col-sm-offset-2 col-md-offset-0 col-lg-offset-0 col-xs-12 col-sm-8 col-md-6 col-lg-6"
						id="" style="background-color:">
						<form action="" name="">
							<div class="" id="" style="">
								<input type="text" name="" value=""
									placeholder="Lieu de naissance" class="form-control" id="lieu">
								<input type="hidden" name="" value="" placeholder="Nom"
									id="check_lieu" class="form-control">
							</div>
							<div>
								<div class="affiche col-xs-12 col-sm-12 col-md-12 col-lg-12"
									id="affiche_lieu"></div>
							</div>
							<div class=" row " id="" style="">
								<div
									class="col-sm-offset-6 col-md-offset-6 col-lg-offset-6 col-sm-3 col-md-3 col-lg-3"
									id="" style="">
									<input type="reset" name="" value="X" class="form-control"
										style="color: red" id="annule_lieu">
								</div>
								<div class="col-sm-3 col-md-3 col-lg-3" id="" style="">
									<input type="button" name="" value="ok" placeholder=""
										class="btn btn-default form-control" disabled="disabled"
										id="ok_lieu">
								</div>
							</div>
						</form>
					</div>
				</div>
				<!-- CHAMP ADRESSE -->
				<div class="row info_coordonnees" id="">
					<div
						class="col-sm-offset-2 col-md-offset-2 col-lg-offset-2 col-xs-12 col-sm-10 col-md-2 col-lg-2"
						id="" style="background-color:">
						<label class="control-label">Adresse</label>
					</div>
					<div
						class="col-sm-offset-2 col-md-offset-0 col-lg-offset-0 col-xs-12 col-sm-8 col-md-6 col-lg-6"
						id="" style="background-color:">
						<form action="" name="">
							<div class="" id="" style="">
								<input type="text" name="adresse" id="adresse" value=""
									placeholder="Adresse" class="form-control"> <input
									type="hidden" name="" value="" placeholder="Nom"
									id="check_adresse" class="form-control">
							</div>
							<div>
								<div class="affiche col-xs-12 col-sm-12 col-md-12 col-lg-12"
									id="affiche_adresse"></div>
							</div>
							<div class=" row " id="" style="">
								<div
									class="col-sm-offset-6 col-md-offset-6 col-lg-offset-6 col-sm-3 col-md-3 col-lg-3"
									id="" style="">
									<input type="reset" name="" value="X" class="form-control"
										style="color: red" id="annule_adresse">
								</div>
								<div class="col-sm-3 col-md-3 col-lg-3" id="" style="">
									<input type="button" name="" value="ok" placeholder=""
										class="btn btn-default form-control" disabled="disabled"
										id="ok_adresse">
								</div>
							</div>
						</form>
					</div>
				</div>
				<!-- CHAMP ADRESSE COMPLEMENTAIRE -->
				<div class="row info_coordonnees" id="">
					<div
						class="col-sm-offset-2 col-md-offset-2 col-lg-offset-2 col-xs-12 col-sm-10 col-md-2 col-lg-2"
						id="" style="background-color:">
						<label class="control-label">Adresse complémentaire</label>
					</div>
					<div
						class="col-sm-offset-2 col-md-offset-0 col-lg-offset-0 col-xs-12 col-sm-8 col-md-6 col-lg-6"
						id="" style="background-color:">
						<form action="" name="">
							<div class="" id="" style="">
								<input type="text" name="" value=""
									placeholder="Adresse complémentaire" id="adresse1"
									class="form-control"> <input type="hidden" name=""
									value="" placeholder="Nom" id="check_adresse1"
									class="form-control">
							</div>
							<div>
								<div class="affiche col-xs-12 col-sm-12 col-md-12 col-lg-12"
									id="affiche_adresse1"></div>
							</div>
							<div class=" row " id="" style="">
								<div
									class="col-sm-offset-6 col-md-offset-6 col-lg-offset-6 col-sm-3 col-md-3 col-lg-3"
									id="" style="">
									<input type="reset" name="" value="X" class="form-control"
										style="color: red" id="annule_adresse1">
								</div>
								<div class="col-sm-3 col-md-3 col-lg-3" id="" style="">
									<input type="button" name="" value="ok" placeholder=""
										class="btn btn-default form-control" disabled="disabled"
										id="ok_adresse1">
								</div>
							</div>
						</form>
					</div>
				</div>
				<!-- CHAMP CODE POSTAL -->
				<div class="row info_coordonnees" id="">
					<div
						class="col-sm-offset-2 col-md-offset-2 col-lg-offset-2 col-xs-12 col-sm-10 col-md-2 col-lg-2"
						id="" style="background-color:">
						<label class="control-label">Code postal</label>
					</div>
					<div
						class="col-sm-offset-2 col-md-offset-0 col-lg-offset-0 col-xs-12 col-sm-8 col-md-6 col-lg-6"
						id="" style="background-color:">
						<form action="" name="">
							<div class="" id="" style="">
								<input type="text" name="" value="" placeholder="Code postal"
									class="form-control" id="codepostal"> <input
									type="hidden" name="" value="" placeholder="Nom"
									id="check_codepostal" class="form-control">
							</div>
							<div>
								<div class="affiche col-xs-12 col-sm-12 col-md-12 col-lg-12"
									id="affiche_codepostal"></div>
							</div>
							<div class=" row " id="" style="">
								<div
									class="col-sm-offset-6 col-md-offset-6 col-lg-offset-6 col-sm-3 col-md-3 col-lg-3"
									id="" style="">
									<input type="reset" name="" value="X" class="form-control"
										style="color: red" id="annule_codepostal">
								</div>
								<div class="col-sm-3 col-md-3 col-lg-3" id="" style="">
									<input type="button" name="" value="ok" placeholder=""
										class="btn btn-default form-control" disabled="disabled"
										id="ok_codepostal">
								</div>
							</div>
						</form>
					</div>
				</div>
				<!-- CHAMP NUMERO DE TELEPHONE -->
				<div class="row info_coordonnees" id="">
					<div
						class="col-sm-offset-2 col-md-offset-2 col-lg-offset-2 col-xs-12 col-sm-10 col-md-2 col-lg-2"
						id="" style="background-color:">
						<label class="control-label">Numéro de téléphone</label>
					</div>
					<div
						class="col-sm-offset-2 col-md-offset-0 col-lg-offset-0 col-xs-12 col-sm-8 col-md-6 col-lg-6"
						id="" style="background-color:">
						<form action="" name="">
							<div class="" id="" style="">
								<input type="number" name="" value="" id="telephone"
									placeholder="Numéro de téléphone" class="form-control">
								<input type="hidden" name="" value="" placeholder="Nom"
									id="check_telephone" class="form-control">
							</div>
							<div>
								<div class="affiche col-xs-12 col-sm-12 col-md-12 col-lg-12"
									id="affiche_telephone"></div>
							</div>
							<div class=" row " id="" style="">
								<div
									class="col-sm-offset-6 col-md-offset-6 col-lg-offset-6 col-sm-3 col-md-3 col-lg-3"
									id="" style="">
									<input type="reset" name="" value="X" class="form-control"
										style="color: red" id="annule_telephone">
								</div>
								<div class="col-sm-3 col-md-3 col-lg-3" id="" style="">
									<input type="button" name="" value="ok" placeholder=""
										class="btn btn-default form-control" disabled="disabled"
										id="ok_telephone">
								</div>
							</div>
						</form>
					</div>
				</div>
				<!-- CHAMP MOTIVATIONS -->
				<div class="row info_preferences" id="">
					<div
						class="col-sm-offset-2 col-md-offset-2 col-lg-offset-2 col-xs-12 col-sm-10 col-md-2 col-lg-2"
						id="" style="background-color:">
						<label class="control-label">Motivations</label>
					</div>
					<div
						class="col-sm-offset-2 col-md-offset-0 col-lg-offset-0 col-xs-12 col-sm-8 col-md-6 col-lg-6"
						id="" style="background-color:">
						<form action="" name="">
							<div class="" id="" style="">
								<input type="text" name="" value="" id="motivation"
									placeholder="Motivations" class="form-control"> <input
									type="hidden" name="" value="" placeholder="Nom"
									id="check_motivation" class="form-control">
							</div>
							<div>
								<div class="affiche col-xs-12 col-sm-12 col-md-12 col-lg-12"
									id="affiche_motivation"></div>
							</div>
							<div class=" row " id="" style="">
								<div
									class="col-sm-offset-6 col-md-offset-6 col-lg-offset-6 col-sm-3 col-md-3 col-lg-3"
									id="" style="">
									<input type="reset" name="" value="X" class="form-control"
										style="color: red" id="annule_motivation">
								</div>
								<div class="col-sm-3 col-md-3 col-lg-3" id="" style="">
									<input type="button" name="" value="ok" placeholder=""
										class="btn btn-default form-control" disabled="disabled"
										id="ok_motivation">
								</div>
							</div>
						</form>
					</div>
				</div>
				<!-- CHAMP SECTEUR D'ACTIVITE -->
				<div class="row info_preferences" id="">
					<div
						class="col-sm-offset-2 col-md-offset-2 col-lg-offset-2 col-xs-12 col-sm-10 col-md-2 col-lg-2"
						id="" style="background-color:">
						<label class="control-label">Secteurs d'activité</label>
					</div>
					<div
						class="col-sm-offset-2 col-md-offset-0 col-lg-offset-0 col-xs-12 col-sm-8 col-md-6 col-lg-6"
						id="" style="background-color:">
						<form action="" name="">
							<div class="" id="" style="">
								<input type="text" name="" value="" id="activite"
									placeholder="Secteurs d'activité" class="form-control">
								<input type="hidden" name="" value="" placeholder="Nom"
									id="check_activite" class="form-control">
							</div>
							<div>
								<div class="affiche col-xs-12 col-sm-12 col-md-12 col-lg-12"
									id="affiche_activite"></div>
							</div>
							<div class=" row " id="" style="">
								<div
									class="col-sm-offset-6 col-md-offset-6 col-lg-offset-6 col-sm-3 col-md-3 col-lg-3"
									id="" style="">
									<input type="reset" name="" value="X" class="form-control"
										style="color: red" id="annule_activite">
								</div>
								<div class="col-sm-3 col-md-3 col-lg-3" id="" style="">
									<input type="button" name="" value="ok" placeholder=""
										class="btn btn-default form-control" disabled="disabled"
										id="ok_activite">
								</div>
							</div>
						</form>
					</div>
				</div>
				<!-- CHAMP SECTEUR GEOGRAPHIQUE -->
				<div class="row info_preferences" id="">
					<div
						class="col-sm-offset-2 col-md-offset-2 col-lg-offset-2 col-xs-12 col-sm-10 col-md-2 col-lg-2"
						id="" style="background-color:">
						<label class="control-label">Secteur géographique</label>
					</div>
					<div
						class="col-sm-offset-2 col-md-offset-0 col-lg-offset-0 col-xs-12 col-sm-8 col-md-6 col-lg-6"
						id="" style="background-color:">
						<form action="" name="">
							<div class="" id="" style="">
								<input type="text" name="" value="" id="secteurgeo"
									placeholder="Secteurs géographique" class="form-control">
								<input type="hidden" name="" value="" placeholder="Nom"
									id="check_secteurgeo" class="form-control">
							</div>
							<div>
								<div class="affiche col-xs-12 col-sm-12 col-md-12 col-lg-12"
									id="affiche_secteurgeo"></div>
							</div>
							<div class=" row " id="" style="">
								<div
									class="col-sm-offset-6 col-md-offset-6 col-lg-offset-6 col-sm-3 col-md-3 col-lg-3"
									id="" style="">
									<input type="reset" name="" value="X" class="form-control"
										style="color: red" id="annule_secteurgeo">
								</div>
								<div class="col-sm-3 col-md-3 col-lg-3" id="" style="">
									<input type="button" name="" value="ok" placeholder=""
										class="btn btn-default form-control" disabled="disabled"
										id="ok_secteurgeo">
								</div>
							</div>
						</form>
					</div>
				</div>
				<!-- CHAMP ACTIVITE PROFESSIONNELLE -->
				<div class="row info_situation" id="">
					<div
						class="col-sm-offset-2 col-md-offset-2 col-lg-offset-2 col-xs-12 col-sm-10 col-md-2 col-lg-2"
						id="" style="background-color:">
						<label class="control-label">Activité professionnelle</label>
					</div>
					<div
						class="col-sm-offset-2 col-md-offset-0 col-lg-offset-0 col-xs-12 col-sm-8 col-md-6 col-lg-6"
						id="" style="background-color:">
						<form action="" name="">
							<div class="" id="" style="">
								<input type="text" name="" value="" id="activitepro"
									placeholder="Activité professionnelle" class="form-control">
								<input type="hidden" name="" value="" placeholder="Nom"
									id="check_activitepro" class="form-control">
							</div>
							<div>
								<div class="affiche col-xs-12 col-sm-12 col-md-12 col-lg-12"
									id="affiche_activitepro"></div>
							</div>
							<div class=" row " id="" style="">
								<div
									class="col-sm-offset-6 col-md-offset-6 col-lg-offset-6 col-sm-3 col-md-3 col-lg-3"
									id="" style="">
									<input type="reset" name="" value="X" class="form-control"
										style="color: red" id="annule_activitepro">
								</div>
								<div class="col-sm-3 col-md-3 col-lg-3" id="" style="">
									<input type="button" name="" value="ok" placeholder=""
										class="btn btn-default form-control" disabled="disabled"
										id="ok_activitepro">
								</div>
							</div>
						</form>
					</div>
				</div>
				<!-- CHAMP EXPERIENCE -->
				<div class="row info_situation" id="">
					<div
						class="col-sm-offset-2 col-md-offset-2 col-lg-offset-2 col-xs-12 col-sm-10 col-md-2 col-lg-2"
						id="" style="background-color:">
						<label class="control-label">Expérience dans
							l'investissement</label>
					</div>
					<div
						class="col-sm-offset-2 col-md-offset-0 col-lg-offset-0 col-xs-12 col-sm-8 col-md-6 col-lg-6"
						id="" style="background-color:">
						<form action="" name="">
							<div class="" id="" style="">
								<input type="text" name="" value="" id="experience"
									placeholder="Expérience dans l'investissement"
									class="form-control"> <input type="hidden" name=""
									value="" placeholder="Nom" id="check_experience"
									class="form-control">
							</div>
							<div>
								<div class="affiche col-xs-12 col-sm-12 col-md-12 col-lg-12"
									id="affiche_experience"></div>
							</div>
							<div class=" row " id="" style="">
								<div
									class="col-sm-offset-6 col-md-offset-6 col-lg-offset-6 col-sm-3 col-md-3 col-lg-3"
									id="" style="">
									<input type="reset" name="" value="X" class="form-control"
										style="color: red" id="annule_experience">
								</div>
								<div class="col-sm-3 col-md-3 col-lg-3" id="" style="">
									<input type="button" name="" value="ok" placeholder=""
										class="btn btn-default form-control" disabled="disabled"
										id="ok_experience">
								</div>
							</div>
						</form>
					</div>
				</div>
				<!-- CHAMP SOURCE DE REVENU -->
				<div class="row info_situation" id="">
					<div
						class="col-sm-offset-2 col-md-offset-2 col-lg-offset-2 col-xs-12 col-sm-10 col-md-2 col-lg-2"
						id="" style="background-color:">
						<label class="control-label">Sources de revenue</label>
					</div>
					<div
						class="col-sm-offset-2 col-md-offset-0 col-lg-offset-0 col-xs-12 col-sm-8 col-md-6 col-lg-6"
						id="" style="background-color:">
						<form action="" name="">
							<div class="" id="" style="">
								<input type="text" name="" value="" id="revenu"
									placeholder="Sources de revenue" class="form-control">
								<input type="hidden" name="" value="" placeholder="Nom"
									id="check_revenu" class="form-control">
							</div>
							<div>
								<div class="affiche col-xs-12 col-sm-12 col-md-12 col-lg-12"
									id="affiche_revenu"></div>
							</div>
							<div class=" row " id="" style="">
								<div
									class="col-sm-offset-6 col-md-offset-6 col-lg-offset-6 col-sm-3 col-md-3 col-lg-3"
									id="" style="">
									<input type="reset" name="" value="X" class="form-control"
										style="color: red" id="annule_revenu">
								</div>
								<div class="col-sm-3 col-md-3 col-lg-3" id="" style="">
									<input type="button" name="" value="ok" placeholder=""
										class="btn btn-default form-control" disabled="disabled"
										id="ok_revenu">
								</div>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script
		src="<%=request.getContextPath()%>/resources/js/jquery-3.1.0.js"></script>
	<script
		src="<%=request.getContextPath()%>/resources/js/bootstrap.min.js"></script>
	<script src="<%=request.getContextPath()%>/resources/js/lendo.js"></script>
	<!-- <script src="<%=request.getContextPath()%>/resources/js/creerprojet.js"></script> -->
	<script src="<%=request.getContextPath()%>/resources/js/menu.js"></script>
	<script
		src="<%=request.getContextPath()%>/resources/js/completeprofil.js"></script>
</body>
</html>