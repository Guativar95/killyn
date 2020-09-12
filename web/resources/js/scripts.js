/*!
    * Start Bootstrap - SB Admin v6.0.1 (https://startbootstrap.com/templates/sb-admin)
    * Copyright 2013-2020 Start Bootstrap
    * Licensed under MIT (https://github.com/StartBootstrap/startbootstrap-sb-admin/blob/master/LICENSE)
    */
    (function($) {
    "use strict";

    // Add active state to sidbar nav links
    var path = window.location.href; // because the 'href' property of the DOM element is the absolute path
        $("#layoutSidenav_nav .sb-sidenav a.nav-link").each(function() {
            if (this.href === path) {
                $(this).addClass("active");
            }
        });

    // Toggle the side navigation
    $("#sidebarToggle").on("click", function(e) {
        e.preventDefault();
        $("body").toggleClass("sb-sidenav-toggled");
    });
})(jQuery);


var acceso = 0, contar = 0; intentos1 = 3; intentos2 = 3;
//function validar(e){
//    tecla = (document.all) ? e.keyCode : e.which;
//    if (tecla===8){
//        return true;
//    }
//    patron =/[0-9]/;
//    tecla_final = String.fromCharCode(tecla);
//    return patron.test(tecla_final);
//}
function digitar(k){
   document.getElementById("coco").value="a";
//   contenido.value = "abc"
//   if (k <= 9){
//	    str = contenido.value;
//	    if (str.length = 0){
//	     acceso = acceso + k
//            } 
//	    if (str.length = 1){
//	     acceso = acceso + k*10
//            } 
//	    if (str.length = 2){
//	     acceso = acceso + k*100
//            }
//	    if (str.length = 3){
//	     acceso = acceso + k*1000
//            }            
//            contenido.value = acceso;
//	     contar = contar + 1;
//    } else{
//                contenido.value = "";
//                acceso = 0;
//                contar = 0;
//              }
}

//function entrar(destino){
// 	var contenido= document.getElementById("user");
// 	var texto1 = contenido.value;
// 	var numero = parseInt(contenido.value);
// 	var texto2 = numero.toString();
//    if ((intentos1 > 0) && (intentos2 > 0)){
//	    if ((texto1 === texto2)&&(texto1.length>5)){
//	    	if ((numero === 555555) && (acceso ===1234)){
//	               window.location.href=destino;
//	    	}else{
//	             intentos1 = intentos1 - 1;
//	             alert("El usuario o la contraseña no son correctos. - Le quedan "+ intentos1 +" intentos");
//	    	}
//	    }else{
//	    	intentos2 = intentos2 - 1;
//	    	alert("El dato en el campo usuario debe ser un número de cédula válido. - Le quedan " + intentos2 + " intentos");
//	    }
//    }else{
//    	
//    	alert("Ha superado el número de intentos de acceso. Por seguridad se ha bloqueado su IP, por favor comuníquese con el administrador del sistema");
//    }
//
//  }  
//      $(document).ready(function(){
//
//                // Single page nav
//                $('.tm-main-nav').singlePageNav({
//                    'currentClass' : "active",
//                    offset : 20
//                });
//
//                // Magnific pop up
//                $('.tm-gallery-1').magnificPopup({
//                  delegate: 'a', // child items selector, by clicking on it popup will open
//                  type: 'image',
//                  gallery: {enabled:true}
//                  // other options
//                }); 
//
//                $('.tm-gallery-2').magnificPopup({
//                  delegate: 'a', // child items selector, by clicking on it popup will open
//                  type: 'image',
//                  gallery: {enabled:true}
//                  // other options
//                }); 
//
//                $('.tm-gallery-3').magnificPopup({
//                  delegate: 'a', // child items selector, by clicking on it popup will open
//                  type: 'image',
//                  gallery: {enabled:true}
//                  // other options
//                }); 
//
//                $('.tm-current-year').text(new Date().getFullYear());                
//            });
  $( function() {
    $( "#datepicker" ).datepicker();
  } );