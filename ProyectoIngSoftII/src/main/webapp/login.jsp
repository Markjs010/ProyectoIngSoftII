<!DOCTYPE html>
<html>
<head>
	<title>Login Page</title>
	<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
	<div class="containerEncabezado">
		<div id="divtitulo" style="text-align: Center;">
   		<label id="tituloLogin" for="titulo">MAS QUE DANZA</label>
   		</div>
		<div style="text-align: center;">
   			<img id="imgEnc" src="img/logoH.png" alt="Logo">
   		</div>
   		<div id="divtitulo" style="text-align: Center;">
   		<label id="tituloLogin" for="titulo">MAS FAMILIA</label>
   		</div>
	</div>
	<div class="container">
		<div style="text-align: center;">
   		<img id="imgLogo" src="img/logo.png" alt="Logo Etnia"></div>
		<h1>Iniciar Sesión</h1>
		<form id="login-form" action="Login" method="post">
			<label for="username">Usuario:</label>
			<input type="text" id="username" name="username" required>
			<label for="password">Contraseña:</label>
			<input type="password" id="password" name="password" required>
			<center><button type="submit" >Ingresar</button></center>
		</form>
		
		<% if (request.getAttribute("error") != null) { %>
            <div style="color: red;"><%= request.getAttribute("error") %></div>
        <% } %>
	</div>
</body>
</html>