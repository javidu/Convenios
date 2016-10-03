<%-- 
    Document   : principal
    Created on : 3/10/2016, 04:29:47 PM
    Author     : JAVIER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ingenieria de sistemas</title>
        
        <link href="Vista/img/favicon.ico" rel="shortcut icon"  />
        <!--Metaetiqueta para el uso del conjunto de caracteres adecuado-->
        <meta charset="utf-8">
        <!--Metaetiqueta para corregir compatibilidad con navegador Microsft-->
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <!--Metaetiqueta para la correcta visualizaciÃ³n en dispositivos moviles-->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!--AÃ±ada primero el estilo de la libreria (ufps.css o ufps.min.css) y luego sus estilos propios-->
        <link href="../Vista/css/ufps.css" rel="stylesheet">
        <link href="../Vista/css/styles.css" rel="stylesheet">

        <!--LibrerÃ­as para compatibilidad con versiones antiguas de Internet Explorer-->
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
          <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->
        <!--Algunos componentes requieren el uso de la librerÃ­a en javascript-->
        <script src="../Vista/js/ufps.js"></script>

    </head>
    <body>
       <header>
            <center> <img id="banner" src="../Vista/img/Banner-superior.png" alt="imagen" height="100px" width="100%" ></img></center>
        </header>  
 <!--Menu-->

        <div class="ufps-navbar ufps-container " id="menu" >
            <div class="ufps-container-fluid">
                <div class="ufps-navbar-brand">
                    <div class="ufps-btn-menu" onclick="toggleMenu('menu')">
                        <div class="ufps-btn-menu-bar"> </div>
                        <div class="ufps-btn-menu-bar"> </div>
                        <div class="ufps-btn-menu-bar"> </div>
                    </div>

                </div>
                <div class="ufps-navbar-left nav">
                      
                    <li><a href="" class="  ufps-navbar-btn  " >Home </a></li>
                    <li>
                        <a href=""  class="ufps-navbar-btn  " >Modulos </a>
                        <ul>
                            <li> <a href="" class="  ufps-navbar-btn item"  > Proceso de docencia </a></li>
                             <li> <a href="" class="  ufps-navbar-btn item  " > Carga academica </a></li>
                              <li> <a href="" class="  ufps-navbar-btn item  " > Amigos academicos </a></li>
                        </ul>

                    </li>
                </div>
                <div class="ufps-navbar-right nav">
                    <li> <a href="" class="ufps-navbar-btn ">Iniciar Sesión </a></li>

                </div>

            </div>
        </div>
 <!--Contenido-->
    </div >
    <div  class="ufps-container" id="contenido">
       
        
         
        
    </div>

    <div class="ufps-container ufps-footer ">
        <h3>Universidad Francisco de Paula Santander</h3>
        <p>Programa Ingeniería de Sistemas</p>
        

    </div>   
    </body>
</html>
