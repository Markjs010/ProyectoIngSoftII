	<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Modulo Administrador</title>
    <link rel="stylesheet" href="css/style.css">
    <link rel="stylesheet" href="css/bootstrap/css/bootstrap.min.css">      
    <link rel="stylesheet" type="text/css" href="css/datatables/datatables.min.css"/>
    <link rel="stylesheet"  type="text/css" href="css/datatables/DataTables-1.10.18/css/dataTables.bootstrap4.min.css"> 
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css" integrity="sha384-oS3vJWv+0UjzBfQzYUhtDYW+Pj2yciDJxpsK1OYPAYjqT085Qq/1cq5FLXAZQ7Ay" crossorigin="anonymous">  
      
</head>

<body>
	<header>
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
	</div></header>

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
		 				<div class="row">
			                <div class="col-lg-12">
			                    <div class="table-responsive">        
			                        <div id="TableDocente" class="dataTables_wrapper dt-bootstrap4 no-footer">
			                        	<div id="example_filter" class="dataTables_filter">
			                        		<label>Buscar:<input type="search" class="form-control form-control-sm" placeholder="" aria-controls="example"></label>
			                        	</div>
			                        	<table id="example" class="table table-striped table-bordered dataTable no-footer" cellspacing="0" width="100%" role="grid" aria-describedby="example_info" style="width: 100%;">
					                        <thead>
					                            <tr role="row">
					                            	<th class="sorting_asc" tabindex="0" aria-controls="example" rowspan="1" colspan="1" aria-sort="ascending" aria-label="Nombre: activate to sort column descending" style="width: 63px;">NI</th>
					                            	<th class="sorting_asc" tabindex="0" aria-controls="example" rowspan="1" colspan="1" aria-sort="ascending" aria-label="Nombre: activate to sort column descending" style="width: 63px;">Nombre</th>
					                            	<th class="sorting_asc" tabindex="0" aria-controls="example" rowspan="1" colspan="1" aria-sort="ascending" aria-label="Nombre: activate to sort column descending" style="width: 63px;">Apellido</th>
					                            	<th class="sorting" tabindex="0" aria-controls="example" rowspan="1" colspan="1" aria-label="Año de Ingreso: activate to sort column ascending" style="width: 64px;">Fecha de Contrato</th>
					                            	<th class="sorting_asc" tabindex="0" aria-controls="example" rowspan="1" colspan="1" aria-sort="ascending" aria-label="Nombre: activate to sort column descending" style="width: 63px;">Especialidad</th>
					                            	<th class="sorting" tabindex="0" aria-controls="example" rowspan="1" colspan="1" aria-label="Salario: activate to sort column ascending" style="width: 52px;">Administrador</th>
					                            </tr>
					                        </thead>
					                        <tbody>                                                              
					                        <tr role="row" class="odd">
					                                <td class="sorting_1">Cedric Kelly</td>
					                                <td>Senior Javascript Developer</td>
					                                <td>Edinburgh</td>                                
					                                <td>2012/03/29</td>
					                                <td>$433,060</td>
					                                <td>San Francisco</td>
					                            </tr><tr role="row" class="even">
					                                <td class="sorting_1">Garrett Winters</td>
					                                <td>Contador</td>
					                                <td>Tokyo</td>                                
					                                <td>2011/07/25</td>
					                                <td>$170,750</td>
					                                <td>San Francisco</td>
					                            </tr><tr role="row" class="odd">
					                                <td class="sorting_1">Jonas Alexander</td>
					                                <td>Developer</td>
					                                <td>San Francisco</td>                                
					                                <td>2010/07/14</td>
					                                <td>$86,500</td>
					                                <td>San Francisco</td>
					                            </tr><tr role="row" class="even">
					                                <td class="sorting_1">Tiger Nixon</td>
					                                <td>Arquitecto</td>
					                                <td>Edinburgh</td>                                
					                                <td>2011/04/25</td>
					                                <td>$320,800</td>
					                                <td>San Francisco</td>
					                            </tr></tbody>        
					                       </table>
					                       <div class="dataTables_info" id="example_info" role="status" aria-live="polite">Mostrando registros del 1 al 4 de un total de 4 registros</div>
					                       <div class="dataTables_length" id="example_length">
						                       	<label>Mostrar <select name="example_length" aria-controls="example" class="custom-select custom-select-sm form-control form-control-sm">
							                       	<option value="10">10</option>
							                       	<option value="25">25</option>
							                       	<option value="50">50</option>
							                       	<option value="100">100</option>
						                       	</select> registros</label>
						                    </div>
						                    
						                    <div class="dt-buttons btn-group" style="text-align: left;">  
							                    <button class="btn btn-success" tabindex="0" aria-controls="example" type="button" title="Exportar a Excel">
							                    	<span><i class="fas fa-file-excel"></i> </span>
							                    </button> 
							                    <button class="btn btn-danger" tabindex="0" aria-controls="example" type="button" title="Exportar a PDF">
							                    	<span><i class="fas fa-file-pdf"></i> </span>
							                    </button> 
							                    <button class="btn btn-info " tabindex="0" aria-controls="example" type="button" title="Imprimir">
							                 		<span><i class="fa fa-print"></i> </span>
							                 	</button> 
							                 </div>
						                    <div class="dataTables_paginate paging_simple_numbers" id="example_paginate">
						                    <ul class="pagination">
						                    	<li class="paginate_button page-item previous disabled" id="example_previous">
						                    		<a href="" aria-controls="example" data-dt-idx="0" tabindex="0" class="page-link">Anterior</a>
						                    	</li>
						                    	<li class="paginate_button page-item active">
						                    		<a href="" aria-controls="example" data-dt-idx="1" tabindex="0" class="page-link">1</a>
						                    	</li>
						                    	<li class="paginate_button page-item next disabled" id="example_next">
						                    		<a href="" aria-controls="example" data-dt-idx="2" tabindex="0" class="page-link">Siguiente</a>
						                    	</li>
						                    </ul>
						                    </div>
						                </div>                  
					                  </div>			                    
					               </div>
					        </div> 
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
		 				<div class="row">
			                <div class="col-lg-12">
			                    <div class="table-responsive">        
			                        <div id="TableDocente" class="dataTables_wrapper dt-bootstrap4 no-footer">
			                        	<div id="example_filter" class="dataTables_filter">
			                        		<label>Buscar:<input type="search" class="form-control form-control-sm" placeholder="" aria-controls="example"></label>
			                        	</div>
			                        	<table id="example" class="table table-striped table-bordered dataTable no-footer" cellspacing="0" width="100%" role="grid" aria-describedby="example_info" style="width: 100%;">
					                        <thead>
					                            <tr role="row">
					                            	<th class="sorting_asc" tabindex="0" aria-controls="example" rowspan="1" colspan="1" aria-sort="ascending" aria-label="Nombre: activate to sort column descending" style="width: 63px;">Información</th>
					                            </tr>
					                        </thead>
					                        <tbody>                                                              
					                        <tr role="row" class="odd">
					                                <td class="sorting_1">CedricKelly.jpg</td>
					                            </tr><tr role="row" class="even">
					                                <td class="sorting_1">GarrettWinters.mp4</td>
					                            </tr><tr role="row" class="odd">
					                                <td class="sorting_1">JonasAlexander.png</td>
					                            </tr><tr role="row" class="even">
					                                <td class="sorting_1">Tiger Nixon</td>
					                            </tr></tbody>        
					                       </table>
					                       <div class="dataTables_info" id="example_info" role="status" aria-live="polite">Mostrando registros del 1 al 4 de un total de 4 registros</div>
					                       <div class="dataTables_length" id="example_length">
						                       	<label>Mostrar <select name="example_length" aria-controls="example" class="custom-select custom-select-sm form-control form-control-sm">
							                       	<option value="10">10</option>
							                       	<option value="25">25</option>
							                       	<option value="50">50</option>
							                       	<option value="100">100</option>
						                       	</select> registros</label>
						                    </div>
						                    
						                    <div class="dt-buttons btn-group" style="text-align: left;">  
							                    <button class="btn btn-success" tabindex="0" aria-controls="example" type="button" title="Exportar a Excel">
							                    	<span><i class="fas fa-file-excel"></i> </span>
							                    </button> 
							                    <button class="btn btn-danger" tabindex="0" aria-controls="example" type="button" title="Exportar a PDF">
							                    	<span><i class="fas fa-file-pdf"></i> </span>
							                    </button> 
							                    <button class="btn btn-info " tabindex="0" aria-controls="example" type="button" title="Imprimir">
							                 		<span><i class="fa fa-print"></i> </span>
							                 	</button> 
							                 </div>
						                    <div class="dataTables_paginate paging_simple_numbers" id="example_paginate">
						                    <ul class="pagination">
						                    	<li class="paginate_button page-item previous disabled" id="example_previous">
						                    		<a href="" aria-controls="example" data-dt-idx="0" tabindex="0" class="page-link">Anterior</a>
						                    	</li>
						                    	<li class="paginate_button page-item active">
						                    		<a href="" aria-controls="example" data-dt-idx="1" tabindex="0" class="page-link">1</a>
						                    	</li>
						                    	<li class="paginate_button page-item next disabled" id="example_next">
						                    		<a href="" aria-controls="example" data-dt-idx="2" tabindex="0" class="page-link">Siguiente</a>
						                    	</li>
						                    </ul>
						                    </div>
						                </div>                  
					                  </div>
					                    
					                </div>
					        </div> 

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
    <script src="jquery/jquery-3.3.1.min.js"></script>
    <script src="popper/popper.min.js"></script>
    <script src="bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="datatables/datatables.min.js"></script>    
    <script src="datatables/Buttons-1.5.6/js/dataTables.buttons.min.js"></script>  
    <script src="datatables/JSZip-2.5.0/jszip.min.js"></script>    
    <script src="datatables/pdfmake-0.1.36/pdfmake.min.js"></script>    
    <script src="datatables/pdfmake-0.1.36/vfs_fonts.js"></script>
    <script src="datatables/Buttons-1.5.6/js/buttons.html5.min.js"></script>
    <script type="text/javascript" src="js/scriptTable.js"></script> 
</body>
</html>