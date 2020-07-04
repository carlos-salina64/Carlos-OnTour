<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" charset=UTF-8">
        <title>OnTour</title>

    </head>
    <%@include file="menu.jsp" %>

        <main>
            <section id="banner">
                <img src="img/banner.jpg">
                <div class="contenedor">
                    <h2>Sitio Web para viajes Escolares</h2>
                    <p>¿Cual es el mejor viaje para su curso?</p>
                    <a href="">Ir a servicio</a>
                </div>
            </section>

            <section id="Bienvenidos">
                <h2>BIENVENIDOS A NUESTRO SISTEMA</h2>
                <p>Estamos felices de mostrarte nuestro nuevo sitio web para que puedas
                    observar la información de los viajes programados para tu curso</p>
            </section>

            <section id="blog">
                <h3>Lo ultimo de nuestro Sitio</h3>
                <div class="contenedor">
                    <article>
                        <img src="img/rel.jpg">
                        <p>Conoce nuestros ultimos paquetes</p>
                    </article>
                    <article>
                        <img src="img/viaje.jpg">
                        <p>Ten experiencias inolvidables</p>
                    </article>
                    <article>
                        <img src="img/chopus.jpg">
                        <h4>Meet the Chopus</h4>
                    </article>
                </div>
            </section>

            <section id="info">
                <h3>Excelentes ofertas de viaje al mejor precio</h3>
                <div class="contenedor">
                    <div class="info-pet">
                        <img src="img/chiloe.jpg">
                        <h6>Nada como el Sur, Chiloe</h6>
                    </div>
                    <div class="info-pet">
                        <img src="img/juan.jpg">
                        <h6>¿Recuerdas a Felipito?, Juan Fernandez</h6>
                    </div>
                    <div class="info-pet">
                        <img src="img/pascua.jpg">
                        <h6>Belleza absoluta, Isla de Pascua</h6>
                    </div>
                </div>
            </section>
        </main>
        
    <%@include file="footer.jsp" %>
    </body>
</html>
