//Ejecutando funciones
document.getElementById("btn_Alumno").addEventListener("click", Alumnos);
document.getElementById("btn_nuevoAlumno").addEventListener("click", RegistrarAlumno);
document.getElementById("btn_VolverAlumno").addEventListener("click", Alumnos);

document.getElementById("btn_Indumentaria").addEventListener("click", Indumentaria);
document.getElementById("btn_nuevoIndumentaria").addEventListener("click", RegistrarIndumentaria);
document.getElementById("btn_VolverIndumentaria").addEventListener("click", Indumentaria);

document.getElementById("btn_Prestamo").addEventListener("click", Prestamos);
document.getElementById("btn_nuevoPrestamo").addEventListener("click", RegistrarPrestamo);
document.getElementById("btn_VolverPrestamo").addEventListener("click", Prestamos);	
window.addEventListener("resize", anchoPage);

//Declarando variables
var ventana_alumnos = document.querySelector("#Alumnos");
var ver_alumnos = document.querySelector("#listaAlumnos");
var formulario_registerA = document.querySelector("#RegisAlumno");
var btn_VolverA = document.querySelector("#btn_VolverAlumno");
var btn_NuevoA = document.querySelector("#btn_nuevoAlumno");

var ventana_indumentaria = document.querySelector("#Indumentaria");
var ver_indumentaria = document.querySelector("#listaIndumentaria");
var formulario_registerI = document.querySelector("#RegisIndumentaria");
var btn_VolverI = document.querySelector("#btn_VolverIndumentaria");
var btn_NuevoI = document.querySelector("#btn_nuevoIndumentaria");

var ventana_prestamos = document.querySelector("#Prestamos");
var ver_prestamos = document.querySelector("#listaPrestamos");
var formulario_registerP = document.querySelector("#RegisPrestamos");
var btn_VolverP = document.querySelector("#btn_VolverPrestamo");
var btn_NuevoP = document.querySelector("#btn_nuevoPrestamo");



    //FUNCIONES

function anchoPage(){

    if (window.innerWidth > 850){
		ventana_alumnos.style.display = "block"; 
        ver_alumnos.style.display = "block"; 
        btn_NuevoA.style.display = "block"; 
        formulario_registerA.style.display = "none";  
        btn_VolverA.style.display = "none";
        ventana_prestamos.style.display = "none";
        ventana_indumentaria.style.display = "none";
          	
    }else{
		ventana_alumnos.style.display = "block"; 
        ver_alumnos.style.display = "block"; 
        btn_NuevoA.style.display = "block"; 
        formulario_registerA.style.display = "none";  
        btn_VolverA.style.display = "none";
        ventana_prestamos.style.display = "none";
        ventana_indumentaria.style.display = "none";
    }
}
anchoPage()
	
function Alumnos(){
     if (window.innerWidth > 850){
       	ventana_alumnos.style.display = "block"; 
        ver_alumnos.style.display = "block"; 
        btn_NuevoA.style.display = "block"; 
        formulario_registerA.style.display = "none";  
        btn_VolverA.style.display = "none";
        ventana_prestamos.style.display = "none";
        ventana_indumentaria.style.display = "none"; 
        
     }else{
       	ventana_alumnos.style.display = "block"; 
        ver_alumnos.style.display = "block"; 
        btn_NuevoA.style.display = "block"; 
        formulario_registerA.style.display = "none";  
        btn_VolverA.style.display = "none";
        ventana_prestamos.style.display = "none";
        ventana_indumentaria.style.display = "none";         		
	}
}
function RegistrarAlumno(){
		
    if (window.innerWidth > 850){
		formulario_registerA.style.display = "block"; 
		ver_alumnos.style.display = "none";
		btn_VolverA.style.display = "block";
		btn_NuevoA.style.display = "none";
    }else{
        formulario_registerA.style.display = "block"; 
		ver_alumnos.style.display = "none";
		btn_VolverA.style.display = "block";
		btn_NuevoA.style.display = "none";

     }
 }
 
 
 function Indumentaria(){
     if (window.innerWidth > 850){
       	ventana_indumentaria.style.display = "block"; 
        ver_indumentaria.style.display = "block"; 
        btn_NuevoI.style.display = "block"; 
        formulario_registerI.style.display = "none";  
        btn_VolverI.style.display = "none";
        ventana_prestamos.style.display = "none";
        ventana_alumnos.style.display = "none"; 
        
     }else{
       	ventana_indumentaria.style.display = "block"; 
        ver_indumentaria.style.display = "block"; 
        btn_NuevoI.style.display = "block"; 
        formulario_registerI.style.display = "none";  
        btn_VolverI.style.display = "none";
        ventana_prestamos.style.display = "none";
        ventana_alumnos.style.display = "none";         		
	}
}
function RegistrarIndumentaria(){
		
    if (window.innerWidth > 850){
		formulario_registerI.style.display = "block"; 
		ver_indumentaria.style.display = "none";
		btn_VolverI.style.display = "block";
		btn_NuevoI.style.display = "none";
    }else{
        formulario_registerI.style.display = "block"; 
		ver_indumentaria.style.display = "none";
		btn_VolverI.style.display = "block";
		btn_NuevoI.style.display = "none";

     }
 }
 
 function Prestamos(){
     if (window.innerWidth > 850){
       	ventana_prestamos.style.display = "block"; 
        ver_prestamos.style.display = "block"; 
        btn_NuevoP.style.display = "block"; 
        formulario_registerP.style.display = "none";  
        btn_VolverP.style.display = "none";
        ventana_alumnos.style.display = "none";
        ventana_indumentaria.style.display = "none"; 
        
     }else{
       	ventana_prestamos.style.display = "block"; 
        ver_prestamos.style.display = "block"; 
        btn_NuevoP.style.display = "block"; 
        formulario_registerP.style.display = "none";  
        btn_VolverP.style.display = "none";
        ventana_alumnos.style.display = "none";
        ventana_indumentaria.style.display = "none";         		
	}
}
function RegistrarPrestamo(){
		
    if (window.innerWidth > 850){
		formulario_registerP.style.display = "block"; 
		ver_alumnos.style.display = "none";
		btn_VolverP.style.display = "block";
		btn_NuevoP.style.display = "none";
    }else{
        formulario_registerP.style.display = "block"; 
		ver_alumnos.style.display = "none";
		btn_VolverP.style.display = "block";
		btn_NuevoP.style.display = "none";

     }
 }