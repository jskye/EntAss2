<!--
/**
 * Created by Julius Myszkowski on 10/05/2015.
 * Subject: ${subjectCode} - ${subjectTitle}
 * University of Newcastle
 * Student Number: c3155112
 * email: c3155112@uon.edu.au, julius.skye@gmail.com
 */
-->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Auditor Console</title>
  </head>
  <body>


    <jsp:useBean id="LoginEventListBean" class="PubSub.LoginEventListBean" scope="application">
           <jsp:getProperty name="LoginEventListBean" property="loginEventList"/>
    </jsp:useBean>

    ${LoginEventListBean.toString()}

 <!--TODO: iterate over list -->

  </body>
</html>
