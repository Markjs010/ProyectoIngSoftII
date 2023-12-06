	<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Modulo Administrador</title>
    <link rel="stylesheet" href="css/style.css">
</head>

<body>
	
	<div class="containerEncabezado" >
		<div style="text-align: left;">
   		<img id="imgEnc" src="img/logoH.png" alt="Logo">	
   		</div>
   		<div id="divtitulo" style="text-align: Center;">
   		<label id="titulo" for="titulo">MODULO DE ACCESO ADMINISTRADOR</label></div>
   		   	<div style="text-align: right;">
   			<button id="btn__cerrar" >
   				<img id="imgCerrar" src="img/cerrar.png" width="60px" height="60px" alt="Cerrar">
   			</button></div>
   	
	</div>

	<div class="containerIzq">
		<div style="text-align: center;"><button id="btn__Docentes" > Docentes </button></div>
		<div style="text-align: center;"><button id="btn__Multimedia" > Multimedia</button></div>

	</div>

    <div class="containerBig" id="Docentes">
    	<div style="text-align: center;"><button id="btn__nuevoDocente" > Nuevo + </button></div>
    	<div style="text-align: center;"><button id="btn__VolverDocente" > Volver </button></div>
		    <div class="" id="listaDocentes">
		    	<div style="text-align: center;">
		    		<h1>Planta Docente</h1>
		    		<div class="containerLittleTablas" >
		 			
					 <table id="table"">
					    <tr>
					      <th>ID</th>
					      <th>NI</th>
					      <th>Nombre</th>
					      <th>Apellido</th>
					      <th>Fecha de Contrato</th>
					      <th>Especialidad</th>
					      <th>Administrador</th>
					    </tr>
					    
					    <tr>
					      <td>1</td>
					      <td>Información2</td>
					      <td>Información3</td>
					      <td>Información3</td>
					      <td>DD/MM/AA</td>
					      <td>Información3</td>
					      <td>Información3</td>
					      
					    </tr>
					  </table>
								
		        	</div>
		         </div>
		     </div>  
	     	<div class="" id="RegisDocente">
		    	<div style="text-align: center;">
		    	<h1>Formulario de Ingreso de Docente</h1>
		    	<div class="containerLittle">
		    		<form action="">
		            	<label for="NI">NI:</label>
		            	<input type="text" id="NI" name="NI" required>
		            </form>
		    		<form action="">
		            	<label for="nombre">Nombre:</label>
		            	<input type="text" id="nombre" name="nombre" required>
		            </form>
					<form action="">
		            	<label for="apellido">Apellido:</label>
		            	<input type="text" id="apellido" name="apellido" required>
		            </form>
		            
		            <form action="/procesar-formulario" method="post">
		          		<label for="fechaContrato">Fecha de Contrato:</label>
		           		<input type="date" id="fechaContrato" name="fechaContrato" required>
		        	</form>
					<form action="">
		            	<label for="especialidad">Especialidad:</label>
		            	<input type="text" id="especialidad" name="especialidad" required>
		            </form>
					<form action="">
		            	<label for="usuario">Usuario:</label>
		            	<input type="text" id="usuario" name="usuario" required>
		            </form>
		            <form action="">
		            	<label for="usuario">Contraseña:</label>
		            	<input type="text" id="usuario" name="usuario" required>
		            </form>
		            
		          </div>
		           <center><button type="submit"> Registrar </button></center>
		           
		         </div>
    		</div>
   	</div>
    <div class="containerBig" id="Multimedia">
    	<div style="text-align: center;"><button id="btn__nuevoMultimedia" > Nuevo + </button></div>
    	<div style="text-align: center;"><button id="btn__VolverMultimedia" > Volver </button></div>
		    <div class="" id="listaMultimedia">
		    	<div style="text-align: center;">
		    		<h1>Multimedia</h1>
		    		<div class="containerLittleTablas" >
		 			
					 <table id="table"">
					    <tr>
					      <th>Información</th>
					    </tr>
					    
					    <tr>
					      <td>Información1</td>
					    </tr>
					  </table>
								
		        	</div>
		         </div>
		     </div>  
    	<div class="" id="RegisMultimedia">
	    	<div style="text-align: center;">
	    	<h1>Formulario de Registro de Indumentaria</h1>
	    	<div class="containerLittle">
	    		<form action="">
	            	<label for="informacion">Información:</label>
	            	 <textarea id="informacion" rows="8" cols="40"></textarea>
	            </form>
	        	
	 			<form action="" method="post" enctype="multipart/form-data">
	 			   <label for="Multimedia">Selecciona Multimedia:</label>
	    			<input type="file" id="Multimedia" name="Multimedia" accept="Multimedia/*">
	  			</form>					
				
	          </div>
	           <center><button type="submit"> Registrar </button></center>
	           
	         </div>
	    </div>
     </div>	
    <script src="js/scriptAdm.js"></script>
</body>
</html>