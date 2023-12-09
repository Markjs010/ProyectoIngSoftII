<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Modulo Estudiantes</title>
    <link rel="stylesheet" href="css/style.css">
    <link rel="stylesheet" href="css/bootstrap/css/bootstrap.min.css">      
    <link rel="stylesheet" type="text/css" href="css/datatables/datatables.min.css"/>
    <link rel="stylesheet"  type="text/css" href="css/datatables/DataTables-1.10.18/css/dataTables.bootstrap4.min.css"> 
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css" integrity="sha384-oS3vJWv+0UjzBfQzYUhtDYW+Pj2yciDJxpsK1OYPAYjqT085Qq/1cq5FLXAZQ7Ay" crossorigin="anonymous">  
      
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
    	<div class="containerLittle" >
    		<form action="" >
            	<label for="NI" >NI:</label>
            	
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
					                            	<th class="sorting_asc" tabindex="0" aria-controls="example" rowspan="1" colspan="1" aria-sort="ascending" aria-label="Nombre: activate to sort column descending" style="width: 63px;">ID Indumentaria</th>
					                            	<th class="sorting" tabindex="0" aria-controls="example" rowspan="1" colspan="1" aria-label="Puesto: activate to sort column ascending" style="width: 56px;">Descripción</th>
					                            	<th class="sorting" tabindex="0" aria-controls="example" rowspan="1" colspan="1" aria-label="Año de Ingreso: activate to sort column ascending" style="width: 64px;">Fecha de Prestamo</th>
					                            </tr>
					                        </thead>
					                        <tbody>                                                              
					                        <tr role="row" class="odd">
					                                <td class="sorting_1">9652</td>
					                                <td>Senior Javascript Developer</td>                               
					                                <td>2012/03/29</td>					                             
					                            </tr><tr role="row" class="even">
					                                <td class="sorting_1">789</td>
					                                <td>Contador</td>                               
					                                <td>2011/07/25</td>
					                            </tr><tr role="row" class="odd">
					                                <td class="sorting_1">235</td>
					                                <td>Developer</td>                               
					                                <td>2010/07/14</td>
					                            </tr><tr role="row" class="even">
					                                <td class="sorting_1">562</td>
					                                <td>Arquitecto</td>                               
					                                <td>2011/04/25</td>
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
    <script src="js/scriptAlum.js"></script>
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