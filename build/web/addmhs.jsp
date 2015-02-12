<%-- 
    Document   : addmhs
    Created on : Feb 12, 2015, 7:23:56 PM
    Author     : nurul apriyani
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="${pageContext.request.contextPath}/assets/css/bootstrap.css" rel="stylesheet">
        <title>Edit Mahasiswa</title>
    </head>
    <body>
        <div align="center" width="500px">
            <h2>Edit Data</h2>
            <a href="${pageContext.request.contextPath}/listmhs"  class="btn">List Mahasiswa</a><br/></br/>
            <% if(request.getAttribute("msg")!=null)out.print("<div class='alert alert-success' role='alert'>"+(String)request.getAttribute("msg")+"</div>");%>
            <form method="post" action="addmhs">
                <table >
                    <tr><td>NPM</td><td><input type="text" name="npm" id="npm" value=""></td></tr>
                    <tr><td>Nama</td><td><input type="text" name="nama" id="nama"></td></tr>
                    <tr><td>Tgl lahir</td><td><input type="date" name="tgl_lahir" id="tgl_lahir"></td></tr>
                    <tr><td>Jk</td><td><input type="radio" name="jk" id="jk" value="L">L<input type="radio" name="jk" id="jk" value="P">P</td></tr>
                    <tr><td>Alamat</td><td><textarea cols="22" rows="5" name="alamat" id="alamat"></textarea></td></tr>
                    <tr><td><input type="submit" class="btn btn-primary"></td><td></td></tr>
                </table>
            </form>
        </div>
    </body>
</html>
