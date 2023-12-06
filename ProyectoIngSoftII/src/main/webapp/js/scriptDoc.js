//Ejecutando funciones
document.getElementById("btn__regisAlumno").addEventListener("click", RegistrarAlumno);
document.getElementById("btn__regisIndumentaria").addEventListener("click", RegistrarIndumentaria);
document.getElementById("btn__regisPrestamo").addEventListener("click", RegistrarPrestamo);
window.addEventListener("resize", anchoPage);

//Declarando variables
var formulario_registerA = document.querySelector("#Alumno");
var formulario_registerI = document.querySelector("#Indumentaria");
var formulario_registerP = document.querySelector("#Prestamos");



    //FUNCIONES

function anchoPage(){

    if (window.innerWidth > 850){
		formulario_registerA.style.display = "block"; 
		formulario_registerI.style.display = "none";
       	formulario_registerP.style.display = "none";
          	
    }else{
		formulario_registerA.style.display = "block"; 
		formulario_registerI.style.display = "none";
       	formulario_registerP.style.display = "none";
    }
}
anchoPage()
	
function RegistrarAlumno(){
		
    if (window.innerWidth > 850){
		formulario_registerA.style.display = "block"; 
		formulario_registerI.style.display = "none";
       	formulario_registerP.style.display = "none";
    }else{
        formulario_registerA.style.display = "block";
        formulario_registerI.style.display = "none";
       	formulario_registerP.style.display = "none";
     }
  }

    function RegistrarIndumentaria(){
        if (window.innerWidth > 850){
        	formulario_registerI.style.display = "block"; 
        	formulario_registerP.style.display = "none";
            formulario_registerA.style.display = "none";    
        }else{
        	formulario_registerI.style.display = "block"; 
        	formulario_registerP.style.display = "none";
            formulario_registerA.style.display = "none";  
       		
        }

	}
	
	 function RegistrarPrestamo(){
        if (window.innerWidth > 850){
       		formulario_registerP.style.display = "block";
       		formulario_registerA.style.display = "none";
        	formulario_registerI.style.display = "none";
 
        }else{
       		formulario_registerP.style.display = "block";
       		formulario_registerA.style.display = "none";
        	formulario_registerI.style.display = "none";

        }
        
     }