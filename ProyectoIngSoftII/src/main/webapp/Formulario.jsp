<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Formulario de Ingreso de Estudiantes</title>
    <link rel="stylesheet" href="css/style.css">
</head>

<body>

	<div class="containerEncabezado">
		<div style="text-align: center;">
   		<img id="imgEnc" src="img/logo.png" alt="Logo Etnia"></div>
	</div>
	<div class="containerIzq">
		 <center><button type="submit"> Registrar Alumno </button></center>
		 <center><button type="submit"> Registrar Indumentaria</button></center>
		 <center><button type="submit"> Registrar Prestamo</button></center>
	</div>
    <div class="containerBig">
    	<div style="text-align: center;">
    	<h1>Formulario de Ingreso de Estudiantes</h1>
    	<div class="containerLittle">
    		<form action="">
            	<label for="nombre">Nombre:</label>
            	<input type="text" id="nombre" name="nombre" required>
            </form>
			<form action="">
            	<label for="apellido">Apellido:</label>
            	<input type="text" id="apellido" name="apellido" required>
            </form>
			<form action="">
            	<label for="edad">Edad:</label>
            	<input type="number" id="edad" name="edad" required>
            </form>
			<form action="">
            	<label for="carrera">Carrera:</label>
            	<input type="text" id="carrera" name="carrera" required>
            </form>
 			<form action="/procesar-formulario" method="post">
          		<label for="fechaNacimiento">Fecha de Nacimiento:</label>
           		<input type="date" id="fechaNacimiento" name="fechaNacimiento" required>
        	</form>
			<form action="/procesar-formulario" method="post">
          		<label for="fechaNacimiento">Fecha de Nacimiento:</label>
           		<input type="date" id="fechaNacimiento" name="fechaNacimiento" required>
        	</form>
			
          </div>
           <center><button type="submit"> Registrar </button></center>
           
         </div>
    </div>
</body>
</html>