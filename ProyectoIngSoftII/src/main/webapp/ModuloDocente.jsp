<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Modulo Docente </title>
    <link rel="stylesheet" href="css/style.css">
</head>

<body>
	 
	<div class="containerEncabezado" >
		<div style="text-align: left;">
   			<img id="imgEnc" src="img/logoH.png" alt="Logo">	
   		</div>
   		<div id="divtitulo" style="text-align: Center;">
   			<label id="titulo" for="titulo">MODULO DE ACCESO DOCENTE</label>
   		</div>
   		<div style="text-align: right;">
   			<button id="btn__cerrar" >
   				<img id="imgCerrar" src="img/cerrar.png" width="60px" height="60px" alt="Cerrar">
   			</button>
   		</div>
	</div>

	<div class="containerIzq">
		<div style="text-align: center;"><button id="btn_Alumno" > Alumnos </button></div>
		<div style="text-align: center;"><button id="btn_Indumentaria" > Indumentaria </button></div>
		<div style="text-align: center;"><button id="btn_Prestamo" > Prestamos </button></div>
	</div>

    <div class="containerBig" id="Alumnos">
    	<div style="text-align: center;"><button id="btn_nuevoAlumno" > Nuevo + </button></div>
    	<div style="text-align: center;"><button id="btn_VolverAlumno" > Volver </button></div>
    	<div class="" id="listaAlumnos">
		    	<div style="text-align: center;">
		    		<h1>Lista de Alumnos</h1>
		    		<div class="containerLittleTablas" >
		 			
					 <table id="table">
					    <tr>
					      <th>ID</th>
					      <th>NI</th>
					      <th>Nombre</th>
					      <th>Apellido</th>
					      <th>Edad</th>
					      <th>Fecha de Ingreso</th>
					      <th>Categoria</th>
					      <th>Telefono</th>
					      <th>Seguro Medico</th>	
					    </tr>
					    
					    <tr>
					      <td>1</td>
					      <td>Información2</td>
					      <td>Información3</td>
					      <td>Información3</td>
					      <td>DD/MM/AA</td>
					      <td>DD/MM/AA</td>
					      <td>Información3</td>
					      <td>Información3</td>
					      <td>Información3</td>
					      
					    </tr>
					  </table>
								
		        	</div>
		         </div>
		     </div>  
		  <div class="" id="RegisAlumno">
	    	<div style="text-align: center;">
	    	    	<h1>Formulario de Ingreso de Alumno</h1>
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
	          		<label for="fechaNacimiento">Fecha de Nacimiento:</label>
	           		<input type="date" id="fechaNacimiento" name="fechaNacimiento" required>
	        	</form>
				<form action="/procesar-formulario" method="post">
	          		<label for="fechaNacimiento">Fecha de Ingreso:  </label>
	           		<input type="date" id="fechaIngreso" name="fechaIngreso" required>
	        	</form>
	        	<form action="">
	            	<label for="categoria">Categoria:</label>
	            	<input type="text" id="categoria" name="categoria" required>
	            </form>
	        	<form action="">
	            	<label for="telefono">Telefono:</label>
	            	<input type="text" id="Telefono" name="Telefono" required>
	            </form>
	            
	            <form action="">
	            	<label for="seguroM">Seguro Medico:</label>
	            	<input type="text" id="seguroM" name="seguroM" required>
	            </form>
				<form action="">
	            	<label for="usuario">Usuario:</label>
	            	<input type="text" id="usuario" name="usuario" required>
	            </form>
	            <form action="">
	            	<label for="usuario">Contraseña:</label>
	            	<input type="text" id="usuario" name="usuario" required>
	            </form>
	            <form action="">
	            	<label for="observaciones">Observaciones:</label>
	            	 <textarea id="observaciones" rows="8" cols="40"></textarea>
	            </form>
	          </div>
	           <center><button type="submit"> Registrar </button></center>
	        </div>   
	    </div>
    </div>
    
    <div class="containerBig" id="Indumentaria">
    	<div style="text-align: center;"><button id="btn_nuevoIndumentaria" > Nuevo + </button></div>
    	<div style="text-align: center;"><button id="btn_VolverIndumentaria" > Volver </button></div>
    	<div class="" id="listaIndumentaria">
		    	<div style="text-align: center;">
		    		<h1>Inventario</h1>
		    		<div class="containerLittleTablas" >
		 			
					 <table id="table">
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
		  <div class="" id="RegisIndumentaria">
	    	<div style="text-align: center;">
	    	<h1>Formulario de Registro de Indumentaria</h1>
	    	<div class="containerLittle">
	    		
	    		 <form action="">
	            	<label for="detalle">Detalle:</label>
	            	 <textarea id="detalle" rows="8" cols="40"></textarea>
	            </form>
				<form action="">
	            	<label for="tipo">Tipo:</label>
	            	<input type="text" id="tipo" name="tipo" required>
	            </form>
				
	          </div>
	           <center><button type="submit"> Registrar </button></center>    
	       </div>
	    </div>
    </div>

    <div class="containerBig" id="Prestamos">
    		<div style="text-align: center;"><button id="btn_nuevoPrestamo" > Nuevo + </button></div>
    		<div style="text-align: center;"><button id="btn_VolverPrestamo" > Volver </button></div>
    		<div class="" id="listaPrestamos">
		    	<div style="text-align: center;">
		    		<h1>Prestamos</h1>
		    		<div class="containerLittleTablas" >
		 			
					 <table id="table">
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
		  <div class="" id="RegisPrestamos">    
	    	<div style="text-align: center;">
	    	<h1>Formulario de Registro de Prestamos</h1>
	    	<div class="containerLittle">
	    		
	    		<form action="">
	            	<label for="descripcion">Descripción:</label>
	            	 <textarea id="descripcion" rows="8" cols="40"></textarea>
	            </form>
	    	
	 			<form action="/procesar-formulario" method="post">
	          		<label for="fechaPrestamo">Fecha de Prestamo:</label>
	           		<input type="date" id="fechaPrestamo" name="fechaPrestamo" required>
	        	</form>
				<form action="">
	            	<label for="IDestudiante">ID Estudiante:</label>
	            	<input type="text" id="IDestudiante" name="IDestudiante" required>
	            </form>
				
				<form action="">
	            	<label for="IDindumentaria">ID Indumentaria:</label>
	            	<input type="text" id="IDindumentaria" name="IDindumentaria" required>
	            </form>
	          </div>
	           <center><button type="submit"> Registrar </button></center>
	        </div>  
	     </div>
    </div>
    <script src="js/scriptDoc.js"></script>
</body>
</html>