//Ejecutando funciones
document.getElementById("btn__Docentes").addEventListener("click", Docentes);
document.getElementById("btn__nuevoDocente").addEventListener("click", RegistrarDocente);
document.getElementById("btn__VolverDocente").addEventListener("click", Docentes);

document.getElementById("btn__Multimedia").addEventListener("click", Multimedia);
document.getElementById("btn__nuevoMultimedia").addEventListener("click", RegistrarMultimedia);
document.getElementById("btn__VolverMultimedia").addEventListener("click", Multimedia);

window.addEventListener("resize", anchoPage);

//Declarando variables
var ventana_docentes = document.querySelector("#Docentes");
var formulario_registerD = document.querySelector("#RegisDocente");
var ver_docentes = document.querySelector("#listaDocentes");
var btn_VolverD = document.querySelector("#btn__VolverDocente");
var btn_NuevoD = document.querySelector("#btn__nuevoDocente");

var ventana_multimedia = document.querySelector("#Multimedia");
var formulario_registerM = document.querySelector("#RegisMultimedia");
var ver_Multimedia = document.querySelector("#listaMultimedia");
var btn_VolverM = document.querySelector("#btn__VolverMultimedia");
var btn_NuevoM = document.querySelector("#btn__nuevoMultimedia");
    //FUNCIONES

function anchoPage(){

    if (window.innerWidth > 850){
		ventana_docentes.style.display = "block"; 
        ver_docentes.style.display = "block"; 
        btn_NuevoD.style.display = "block"; 
        formulario_registerD.style.display = "none";  
        btn_VolverD.style.display = "none";
        ventana_multimedia.style.display = "none";  
    }else{
		ventana_docentes.style.display = "block"; 
        ver_docentes.style.display = "block"; 
        btn_NuevoD.style.display = "block"; 
        formulario_registerD.style.display = "none";  
        btn_VolverD.style.display = "none";     }
}
anchoPage()
	
function Docentes(){
     if (window.innerWidth > 850){
       	ventana_docentes.style.display = "block"; 
        ver_docentes.style.display = "block"; 
        btn_NuevoD.style.display = "block"; 
        formulario_registerD.style.display = "none";  
        btn_VolverD.style.display = "none";
        ventana_multimedia.style.display = "none"; 
        
     }else{
       	ventana_docentes.style.display = "block"; 
        ver_docentes.style.display = "block"; 
        btn_NuevoD.style.display = "block"; 
        formulario_registerD.style.display = "none";  
        btn_VolverD.style.display = "none";
        ventana_multimedia.style.display = "none";         		
	}
}
function RegistrarDocente(){
		
    if (window.innerWidth > 850){
		formulario_registerD.style.display = "block"; 
		ver_docentes.style.display = "none";
		btn_VolverD.style.display = "block";
		btn_NuevoD.style.display = "none";
    }else{
        formulario_registerD.style.display = "block"; 
		ver_docentes.style.display = "none";
		btn_VolverD.style.display = "block";
		btn_NuevoD.style.display = "none";

     }
 }

function Multimedia(){
     if (window.innerWidth > 850){
       	ventana_multimedia.style.display = "block"; 
        ver_Multimedia.style.display = "block"; 
        btn_NuevoM.style.display = "block"; 
        formulario_registerM.style.display = "none";  
        btn_VolverM.style.display = "none";
        ventana_docentes.style.display = "none"; 
        
     }else{
       	ventana_multimedia.style.display = "block"; 
        ver_Multimedia.style.display = "block"; 
        btn_NuevoM.style.display = "block"; 
        formulario_registerM.style.display = "none";  
        btn_VolverM.style.display = "none";
        ventana_docentes.style.display = "none";         		
	}
}
function RegistrarMultimedia(){
		
    if (window.innerWidth > 850){
		formulario_registerM.style.display = "block"; 
		ver_Multimedia.style.display = "none";
		btn_VolverM.style.display = "block";
		btn_NuevoM.style.display = "none";
    }else{
        formulario_registerM.style.display = "block"; 
		ver_Multimedia.style.display = "none";
		btn_VolverM.style.display = "block";
		btn_NuevoM.style.display = "none";

     }
  }