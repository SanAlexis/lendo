
<input type="hidden" id="code_utilisateur"
	value=<%=session.getAttribute("codeU")%>>
<input type="hidden" id="date" value="">
<input type="hidden" id="alt_image" value="">
<div class="row" id="menudusite">
<span
		class="hidden-md hidden-lg glyphicon glyphicon-align-justify"
		id="btn-menu-principal" style="cursor: pointer"></span>
	<div id="menu-principal" class="collapse out">
		<div
			class="col-xs-offset-0 col-sm-offset-0 col-xs-12 col-sm-1 col-md-1 col-lg-1"
			id="">
			<a href="index"> <img alt="ACCEUIL LENDO" class="img-responsive "
				style="width: 80px; height: 30px"
				src="<%=request.getContextPath()%>/resources/fonts/icon.png"></a>
		</div>
		<div
			class="col-sm-offset-0 col-md-offset-0 col-lg-offset-0 col-xs-12 col-sm-4 col-md-4 col-lg-4"
			id="">
			<form action="searchprojet">
				<div class=" input-group">
					<input type="text" class="form-control glyphicon glyphicon-search"
						id="search" placeholder="Cherchez un projet"> <span
						class="input-group-btn" style="width:; height: 3px">
						<button id="btn_search"
							class="btn btn-default glyphicon glyphicon-search" type="button"
							style="width: 60px; height: 33px; color: #FBAF3F; border-radius: 3px"></button>
					</span>
				</div>
			</form>

		</div>
		<div
			class=" col-sm-offset-1 col-md-offset-1 col-lg-offset-1 col-xs-12 col-sm-1 col-md-1 col-lg-1"
			id="">
			<ul class="nav navbar-nav">
				<li class="connecte"><a href="creerprojet"
					class="glyphicon glyphicon-plus" id="nouveauprojet"
					style="background-color:; color: white">Créer</a></li>

			</ul>

		</div>
		<div class="col-xs-12 col-sm-1 col-md-1 col-lg-1" id=""
			style="background-color:">
			<ul class="nav navbar-nav">
				<li class=""><a href="decouvrir" class="" id="parcourir"
					style="background-color:; color: white"> Parcourir </a></li>

			</ul>
		</div>
		<div class="col-xs-12 col-sm-1 col-md-1 col-lg-1" id=""
			style="background-color:">
			<ul class="nav navbar-nav connecte">
				<li class="dropdown" id="avance1"><a data-toggle="dropdown"
					href="#" class="glyphicon glyphicon-folder-open"
					style="background-color:; color: white"><b class="caret"></b></a>
					<ul class="dropdown-menu pull-right" id="projet0">
					</ul></li>
			</ul>
		</div>
		<div class="col-xs-12 col-sm-1 col-md-1 col-lg-1" id=""
			style="background-color:">

			<ul class="nav navbar-nav connecte" id="menu_0">
				<li class="dropdown" id="avance"><a data-toggle="dropdown"
					href="#" class="glyphicon glyphicon-th"
					style="background-color:; color: white"><b class="caret"></b></a>
					<ul class="dropdown-menu pull-right" id="">
						<li class=""></li>
						<li><a href="completeprofil" id="profil"><img src=""
								height="25px" width="30px"></img> Mon profil</a></li>
						<li class="divider"></li>
						<li><a href="wallet">Wallet</a></li>
						<li class="divider"></li>
						<li id="deconnexion"><a href=""
							class="glyphicon glyphicon-off"> Déconnexion</a></li>
					</ul></li>
			</ul>
			<ul class="nav navbar-nav deconnecte">
				<li class="dropdown" id="inscription_connexion"><a
					data-toggle="dropdown" href="#" class="glyphicon glyphicon-user"
					style="background-color:; color: white"><b class="caret"></b></a>
					<ul class="dropdown-menu">
						<li><a href="inscription" class="deconnecte">Inscription</a></li>
						<li class="divider"></li>
						<li><a href="connexion">Connexion</a></li>
					</ul></li>
			</ul>

		</div>
		<div class="col-xs-12 col-sm-1 col-md-1 col-lg-1" id=""
			style="background-color:">
			<ul class="nav navbar-nav connecte">
				<li class="dropdown" id="avance1"><a data-toggle="dropdown"
					href="#" class="glyphicon glyphicon-shopping-cart"
					style="background-color:; color: white"><b class="caret"></b></a>
					<ul class="dropdown-menu pull-right">
						<li><a href="projetvue?codeP=84">Projet</a></li>
						<li><a href="projetvue?codeP=848">Projet</a></li>
					</ul></li>
			</ul>
		</div>
		<div id="categories"></div>
	</div>
	<div class="row" style="background-color: #FBAF3F"></div>



	<!-- PAGE MODAL DE DESACTIVATION DE L4AFFICHAGE LORS d'UNE REQUETE AJAX -->
	<div class="modal fade" id="ajax_req_desactive">
		<!--
				<div class="modal-dialog" style="background-color: #595959">
					<div class="modal-content">
					</div>
				</div>
				-->
	</div>
</div>

<ul id='r_search'>
</ul>