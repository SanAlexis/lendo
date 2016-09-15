


		<div class="row" id="" style="background-color: #652C90">
			<div class="col-sm-1" id=""></div>
			<div class="col-sm-1" id="">
				<a href="index"><img alt="LOGO LENDO" class=""
					style="width: 75px; height: 35px"
					src="<%=request.getContextPath()%>/resources/fonts/icon.png"></a>
			</div>
	<div class="col-sm-4" id="">
<!-- Champs permettant de stocker le code d'un utilisateur -->
					<input type="hidden" name="" value=<%=session.getAttribute("codeU")%>
								placeholder="Code Utilisateur" class="form-control"
								id="code_utilisateur">
		<form class="nav navbar-nav" action="searchprojet">
			<div class="input-group">
				<input type="text" class="form-control glyphicon glyphicon-search "
					style="height: 30px" placeholder="Chercher un projet"> <span
					class="input-group-btn">
					
					
					
								
								
								
					<button class="btn btn-default glyphicon glyphicon-search"
						type="submit" style="width: 40px; height: 30px"></button>
				</span>
			</div>
		</form>
		
		

	</div>
	<div class="col-sm-1" id=""></div>
			<div class="col-sm-5" id="">
				<ul class="nav navbar-nav">
					<li class="connecte"><a href="completeprofil" id="profil"><img src=""
							height="25px" width="30px"></img></a></li>
				</ul>
				<ul class="nav navbar-nav">
					<li class="connecte"><a href="creerprojet" class="glyphicon glyphicon-plus"
						id="nouveauprojet"> Nouveau projet</a></li>
					<li class="connecte"><a href="decouvrir"
						class="glyphicon glyphicon-eye-open" id="parcourir"> Parcourir
					</a></li>

				</ul>
		
				<ul class="nav navbar-nav deconnecte">
					<li class="dropdown" id="inscription_connexion"><a
						data-toggle="dropdown" href="#" class="glyphicon glyphicon-user"><b
							class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a href="inscription" class="deconnecte">Inscription</a></li>
							<li class="divider"></li>
							<li><a href="connexion">Connexion</a></li>
						</ul></li>
				</ul>

				<ul class="nav navbar-nav connecte" id="menu_0">
					<li class="dropdown" id="avance"><a data-toggle="dropdown"
						href="#" class="glyphicon glyphicon-th"><b class="caret"></b></a>
						<ul class="dropdown-menu pull-right" id="">
							<li class="projet0"></li>
							<li class="divider"></li>
							<li><a href="wallet">Wallet</a></li>
							<li class="divider"></li>
							<li id="deconnexion"><a href="" class="glyphicon glyphicon-off">
									Déconnexion</a></li>
						</ul></li>
				</ul>
				<ul class="nav navbar-nav connecte">
					<li class="dropdown" id="avance1"><a data-toggle="dropdown"
						href="#" class="glyphicon glyphicon-shopping-cart"><b
							class="caret"></b></a>
						<ul class="dropdown-menu pull-right">
							<li><a href="projetvue">Projet</a></li>
							<li><a href="projetvue">Projet</a></li>
						</ul></li>
				</ul>
			</div>
			<div class="col-sm-1" id=""></div>


		</div>

