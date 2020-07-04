
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar Seguro</title>
    </head>
    <body>
        <%@include file="menu.jsp" %>



        <section id="banner">
            <img src="img/seguro.jpg">
            <div class="contenedor">
                <h2 style="color: white;">Agrega Seguros a los cursos</h2>
                <p style="color: wheat;">Asegurate de que el id del curso es el que correspode a tu curso. Si tienes dudas de cual es, puedes consultar a administracion del sitio</p>

            </div>
        </section>

        <form action="ServletControlador" method="get">
            <section id="Formulario-agregar">
                <div class="contenedor" style="background-color: #333;">

                    <div class="form-group">
                        <label>Id del Curso: </label>
                        <input type="text" required placeholder="Numero del Curso" name="txtCurso" class="form-control">
                        <small>*Importante: Si no recuerda el id del curso que gestiona, llame a administracion del sitio web y proporcione los datos del curso.</small>
                    </div>
                    <div class="form-group">
                        <label>Precio del Seguro: </label>

                        <input type="text" required name="txtPrecio" placeholder="$0" class="form-control">

                    </div>
                    <div class="form-group">
                        <label style="margin-top: 60px;" for="exampleFormControlTextarea1" class="area">Descripción del Seguro. Sea lo mas detallista posible al respecto. Si el seguro es de una empresa externa, pongalo, ademas de cuanto cubre, etc.</label>
                        <textarea placeholder="Seguro contra accidentes proporsionado por la empresa..." required name="txtDes" class="form-control" id="exampleFormControlTextarea1" rows="3"></textarea>
                    </div>
                    <div class="form-group">
                        <script type="text/javascript">
                            function showContent() {
                                element = document.getElementById("content");
                                check = document.getElementById("check");
                                if (check.checked) {
                                    element.style.display = 'block';
                                } else {
                                    element.style.display = 'none';
                                }
                            }

                        </script>
                        <label style="font-size: 20px; align-content: center; text-align: center;">Agregar clausula para accidentes</label>

                        <div class="richi" >
                            <input type="checkbox" style="margin-right: 200px;"  name="check" id="check" onchange="javascript:showContent()">   

                        </div>

                        <div id="content" style="display: none;">
                            <div class="form-group">
                                <label style="margin-top: 60px;" for="exampleFormControlTextarea1" class="area">Liste todos los accidente que cubre el seguro</label>
                                <textarea placeholder="Accidente de trafico, perdida de un niño, asesinato, etc..."  name="txtAcci" class="form-control" id="exampleFormControlTextarea1" rows="3"></textarea>
                            </div>
                        </div>

                    </div>
                </div>
            </section>
            <div class="choche007">
                <input type="submit" value="Registrar" class="btn btn-outline-success">
                <input type="hidden" name="accion" value="RegistrarSeguro">
            </div>
        </form>

        <%@include file="footer.jsp" %>
    </body>
</html>
