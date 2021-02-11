<%-- 
    Document   : horosco
    Created on : Feb 9, 2021, 6:18:19 PM
    Author     : salaz
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
    </head>
    <body style="background-color: lightgrey;">
        <div class="container">
            <form action="Horoscopo" method="get">
                <%
                    String signo = (String) request.getAttribute("signo");
                    String diaSeleccionado = (String) request.getAttribute("dia");
                    String mesSeleccionado = (String) request.getAttribute("mes");
                    ArrayList<String> meses = (ArrayList<String>) request.getAttribute("meses");
                    ArrayList<String> dias = (ArrayList<String>) request.getAttribute("dias");


                %>

                <p>Nombre</p>
                <input type="text" name="nombre" value="<%=request.getAttribute("nombre")%>">
                <p>Dia nacimiento</p>
                <select class="form-control" name="dia">

                    <%

                        for (String dia : dias) {
                            String textoSelected = "";
                            if (dia.equals(diaSeleccionado)) {
                                textoSelected = "selected";
                            }


                    %><option <%=textoSelected%> value="<%=dia%>"><%=dia%></option>
                    <%}%>


                </select>
                <p>Mes nacimiento</p>
                <select class="form-control" name="mes">
                    <%

                        for (String mes : meses) {
                            String textoSelected = "";
                            if (mes.equals(mesSeleccionado)) {
                                textoSelected = "selected";
                            }


                    %>
                    <option <%=textoSelected%> value="<%=mes%>"><%=mes%></option>
                    <% }%>
                </select>

                <input class="btn btn-primary" type="submit" value="Enviar">
            </form>
            <div class="card" style="width: 18rem;">
                <%if (signo.equals("FECHA NO VALIDA")) {
                %>
                <div class="card-body">
                    <p>Nombre: <%=request.getAttribute("nombre")%></p>
                    <p>No existe el dia para el mes seleccionado<p>
                </div>
                
                <%
                } else {
                %>
                <img src="signos/<%=signo%>.jpg">
                <div class="card-body">
                    <p>Nombre: <%=request.getAttribute("nombre")%></p>
                    <p>Signo: <%=signo%></p>
                </div>
                <%
                    }
                %>







            </div>

        </div>


    </body>
</html>
