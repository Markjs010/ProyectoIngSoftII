<!DOCTYPE html>
<html>
<head>
	<title>Login Page</title>
	<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
	<div class="container">
		<div style="text-align: center;">
   		<img id="imgLogo" src="img/logo.png" alt="Logo Etnia"></div>
		<h1>Iniciar Sesión</h1>
		<form id="login-form" action="LoginServlet" method="post">
			<label for="username">Usuario:</label>
			<input type="text" id="username" name="username" required>
			<label for="password">Contraseña:</label>
			<input type="password" id="password" name="password" required>
			<center><button type="submit" >Ingresar</button></center>
		</form>
		
		<p id="error-message"></p>
	</div>
</body>
</html>