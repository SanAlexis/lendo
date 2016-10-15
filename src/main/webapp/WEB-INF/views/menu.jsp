		<input type="hidden" id="code_utilisateur" value=<%=  session.getAttribute( "codeU" ) %>>
		<input type="hidden" id="date" value="">
		<div class="row" id="" style="background-color: #652C90">
			<div
				class="col-xs-offset-0 col-sm-offset-1 col-xs-12 col-sm-1 col-md-1 col-lg-1"
				id="" style="background-color: ">
				<a href="index"> <img alt="ACCEUIL LENDO"
					class="img-responsive " style="width: 80px; height: 30px"
					src="<%=request.getContextPath()%>/resources/fonts/icon.png"></a>
			</div>
			<div
				class="col-sm-offset-0 col-md-offset-0 col-lg-offset-0 col-xs-12 col-sm-4 col-md-4 col-lg-4"
				id="" style="background-color: ">
				<form action="searchprojet">
						<div class=" input-group">
							<input type="text"
								class="form-control glyphicon glyphicon-search" id="search"
								placeholder="Chercher un projet"> <span
								class="input-group-btn" style="width:; height: 3px">
								<button id="btn_search"
									class="btn btn-default glyphicon glyphicon-search"
									type="button" style="width: ; height: 33px; color: #FBAF3F"></button>
							</span>
						</div>
				</form>

			</div>
			<div class=" col-sm-offset-1 col-xs-12 col-sm-1 col-md-1 col-lg-1"
				id="" style="background-color: ">
				<ul class="nav navbar-nav">
					<li class="connecte"><a href="creerprojet"
						class="glyphicon glyphicon-plus" id="nouveauprojet">Créer</a></li>

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
			</div>
			<div class="col-xs-12 col-sm-1 col-md-1 col-lg-1" id=""
				style="background-color: ">
				<ul class="nav navbar-nav">
					<li class="connecte"><a href="decouvrir" class=""
						id="parcourir"> Parcourir </a></li>

				</ul>
			</div>
			<div class="col-xs-12 col-sm-1 col-md-1 col-lg-1" id=""
				style="background-color: ">

				<ul class="nav navbar-nav connecte" id="menu_0">
					<li class="dropdown" id="avance"><a data-toggle="dropdown"
						href="#" class="glyphicon glyphicon-th"><b class="caret"></b></a>
						<ul class="dropdown-menu pull-right" id="">
							<li class="projet0"></li>
							<li class="divider"></li>
							<li><a href="completeprofil" id="profil"><img src=""
									height="25px" width="30px"></img> Mon profil</a></li>
							<li class="divider"></li>
							<li><a href="wallet">Wallet</a></li>
							<li class="divider"></li>
							<li id="deconnexion"><a href=""
								class="glyphicon glyphicon-off"> Déconnexion</a></li>
						</ul></li>
				</ul>

			</div>
			<div class="col-xs-12 col-sm-1 col-md-1 col-lg-1" id=""
				style="background-color: ">
				<ul class="nav navbar-nav connecte">
					<li class="dropdown" id="avance1"><a data-toggle="dropdown"
						href="#" class="glyphicon glyphicon-shopping-cart"><b
							class="caret"></b></a>
						<ul class="dropdown-menu pull-right">
							<li><a href="projetvue?codeP=84">Projet</a></li>
							<li><a href="projetvue?codeP=848">Projet</a></li>
						</ul></li>
				</ul>
			</div>
		</div>