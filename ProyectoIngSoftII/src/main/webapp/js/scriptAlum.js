//Ejecutando funciones
document.getElementById("btn__verAlumno").addEventListener("click", VerAlumno);
document.getElementById("btn__verPrestamo").addEventListener("click", VerPrestamo);
window.addEventListener("resize", anchoPage);

//Declarando variables
var formulario_verA = document.querySelector("#InfoPersonal");
var formulario_verP = document.querySelector("#Prestamos");

    //FUNCIONES

function anchoPage(){

    if (window.innerWidth > 850){
		formulario_verA.style.display = "block"; 
		formulario_verP.style.display = "none";
          	
    }else{
		formulario_verA.style.display = "block"; 
		formulario_verP.style.display = "none";
    }
}
anchoPage()
	
function VerAlumno(){
		
    if (window.innerWidth > 850){
		formulario_verA.style.display = "block"; 
		formulario_verP.style.display = "none";
    }else{
        formulario_verA.style.display = "block";
        formulario_verP.style.display = "none";

     }
  }

    function VerPrestamo(){
        if (window.innerWidth > 850){
        	formulario_verP.style.display = "block"; 
        	formulario_verA.style.display = "none";    
        }else{
        	formulario_verP.style.display = "block"; 
        	formulario_verA.style.display = "none"; 
       		
        }
        
     }