<%-- 
    Document   : inicio
    Created on : 05/12/2019, 08:24:32 AM
    Author     : lab01
--%>

<%@page import="modelo.dao.alumnosDAO"%>
<%@page import="modelo.bean.alumno"%>
<%@page import="java.util.ArrayList"%>
<%@page import="modelo.bean.especialidad"%>
<%@page import="modelo.dao.especialidadDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            table{
                border-collapse: collapse;
            }
            td{
                padding:10px;
            }
            td{
              border: 1px solid black;  
            }
            .tabla td{
                border: none;
            }
        </style>
    </head>
    <body>
        <%
            ArrayList<especialidad> lista = especialidadDAO.listar();
            especialidad esp = (especialidad) request.getAttribute("especialidad");
            ArrayList<alumno> alumnos = (ArrayList<alumno>) request.getAttribute("alumnos");
            ArrayList<alumno> alumnosIndice = (ArrayList<alumno>) request.getAttribute("vistaalumnos");
        %>
        <table>
            <tr>
                <td><a href="nuevaEspecialidad">Nueva Especialidad</a></td>
                <td>
                    <%if(esp == null){%>
                    <p style="padding-left: 300px">                       </p>
                    <%}else{%>
                    <p>Alumnos de la especialidad de <%=esp.getNom_esp()%></p>
                    <%}%>
                </td>
            </tr>
            <tr>
                
                <td>
                    <ul>
                        <%for(especialidad x:lista){%>
                        <li><a href="alumnos?id=<%=x.getCod_esp()%>"><%=x.getNom_esp()%></a></li>
                        <%}%>
                    </ul>
                </td>
                <td>
                    <%if(alumnos == null && alumnosIndice == null){%>
                    <p>                       </p>
                    <%}else if(alumnos == null){%>
                    <table class="tabla">
                        <%for(alumno z:alumnosIndice){%>
                        <tr>
                            <td><%=z.getNom_alum()%></td>
                            <td> <a href="foto?idAlumno=<%=z.getCod_al()%>">Ver</a></td>
                        </tr>
                        <%}%>
                    </table>
                    <%}else{%>
                        <table class="tabla">
                        <%for(alumno y:alumnos){%>
                        <tr>
                            <td><%=y.getNom_alum()%></td>
                            <td> <a href="foto?idAlumno=<%=y.getCod_al()%>">Ver</a></td>
                        </tr>
                        <%}%>
                    </table>
                    <%}%>
                    
                    
                    <%
                        int cantidad  = 0;
                        if(alumnos == null && alumnosIndice == null){
                            cantidad = 0;
                        }else if(alumnos == null){
                            cantidad = alumnosDAO.cantidadAlumnosEspecialidad(alumnosIndice.get(0).getCod_esp());
                        }else{
                            cantidad = alumnosDAO.cantidadAlumnosEspecialidad(alumnos.get(0).getCod_esp());
                        }
                    %>
                    <%if(cantidad==0){%>
                    <span></span>
                    <%}else if(alumnos==null){%>
                    <%for(int i=1;i<=(cantidad/3+1);i++){%>
                    <a href="vistaAlumnos?idEspecialidad=<%=alumnosIndice.get(0).getCod_esp()%>&indice=<%=i%>"><%=i%></a>
                    <%}%>
                    <%}else{%>
                    <%for(int i=1;i<=(cantidad/3+1);i++){%>
                    <a href="vistaAlumnos?idEspecialidad=<%=alumnos.get(0).getCod_esp()%>&indice=<%=i%>"><%=i%></a>
                    <%}%>
                    <%}%>
                    
                </td>
            </tr>
        </table>
    </body>
</html>
