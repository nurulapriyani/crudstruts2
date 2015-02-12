<%-- 
    Document   : editmhs
    Created on : Feb 12, 2015, 8:40:44 PM
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
        <div width="500px" align="center">
            <h2>Edit Data</h2>
             <a href="${pageContext.request.contextPath}/listmhs"  class="btn">List Mahasiswa</a><br/></br/>
            <% if(request.getAttribute("msg")!=null)out.print("<div class='alert alert-success' role='alert'>"+(String)request.getAttribute("msg")+"</div>");%>
            <form method="post" action="editmhs">
                <table >
                    <tr><td>NPM</td><td><input type="text" name="npm" id="npm" value='<s:property value="npm"/>'></td></tr>
                    <tr><td>Nama</td><td><input type="text" name="nama" id="nama" value='<s:property value="nama"/>'></td></tr>
                    <tr><td>Tgl lahir</td><td><input type="date" name="tgl_lahir" id="tgl_lahir" value='<s:property value="tgl_lahir"/>'></td></tr>
                    <tr><td>Jk</td><td>
                     <s:if test="%{jk}==L">
                       <input type="radio" name="jk" id="jk" value="L" checked>L<input type="radio" name="jk" id="jk" value="P">P</td></tr>
                     </s:if><s:else>
                        <input type="radio" name="jk" id="jk" value="L" >L<input type="radio" name="jk" id="jk" value="P" checked>P</td></tr>
                       </s:else>
                    <tr><td>Alamat</td><td><textarea cols="22" rows="5" name="alamat" id="alamat"><s:property value="alamat"/></textarea></td></tr>
                    <tr><td></td><td><input type="hidden" name="id" id="id" value=<s:property value="id"/>></td></tr>
                    <tr><td><input type="submit" name="edt"  value="submit" class="btn btn-primary"></td><td></td></tr>
               
                </table>
            </form>
        </div>
    </body>
</html>
