<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Modulo Estudiantes</title>
    <link rel="stylesheet" href="css/style.css">
</head>

<body>
	
	<div class="containerEncabezado" >
		<div style="text-align: left;">
   		<img id="imgEnc" src="img/logoH.png" alt="Logo">	
   		</div>
   		<div id="divtitulo" style="text-align: Center;">
   		<label id="titulo" for="titulo">MODULO DE ACCESO ESTUDIANTES</label></div>
   		   	<div style="text-align: right;">
   			<button id="btn__cerrar" >
   				<img id="imgCerrar" src="img/cerrar.png" width="60px" height="60px" alt="Cerrar">
   			</button></div>
   	
	</div>

	<div class="containerIzq">
		<div style="text-align: center;"><button id="btn__verAlumno" > Información Personal </button></div>
		<div style="text-align: center;"><button id="btn__verPrestamo" > Prestamos</button></div>
	</div>

    <div class="containerBig" id="InfoPersonal">
    	<div style="text-align: center;">
    	<h1>Datos Personales</h1>
    	<div class="containerLittle">
    		<form action="">
            	<label for="NI">NI:</label>
            	
            </form>
    		<form action="">
            	<label for="nombre">Nombre:</label>
            	
            </form>
			<form action="">
            	<label for="apellido">Apellido:</label>
           
            </form>

 			<form action="/procesar-formulario" method="post">
          		<label for="fechaNacimiento">Fecha de Nacimiento:</label>
           		
        	</form>
			<form action="/procesar-formulario" method="post">
          		<label for="fechaNacimiento">Fecha de Ingreso:  </label>
           		
        	</form>
        	<form action="">
            	<label for="categoria">Categoria:</label>
            	
            </form>
        	<form action="">
            	<label for="telefono">Telefono:</label>
            
            </form>
            
            <form action="">
            	<label for="seguroM">Seguro Medico:</label>
            	
            </form>
			<form action="">
            	<label for="usuario">Usuario:</label>
           
            </form>
            <form action="">
            	<label for="usuario">Contraseña:</label>
            	
            </form>
            <form action="">
            	<label for="observaciones">Observaciones:</label>
            	 
            </form>
           
    	</div>
 	</div>   

	</div>
    <div class="containerBig" id="Ver_Prestamos">
    	<div style="text-align: center;">
    		<h1>Información de Prestamos</h1>
    		<div class="containerLittleTablas" >
 			
			 <table id="table"">
			    <tr>
			      <th>Descripción</th>
			      <th>Fecha de Prestamo</th>
			      <th>ID Indumentaria</th>
			    </tr>
			    
			    <tr>
			      <td>Información1</td>
			      <td>Información2</td>
			      <td>Información3</td>
			    </tr>
			  </table>
						
        	</div>
         </div>
    </div>
    <script src="js/scriptAlum.js"></script>
</body>
</html>