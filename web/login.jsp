<!--
* Created by Julius Myszkowski on 5/05/2015.
* Subject: SENG440 - Assignment2
* University of Newcastle
* Student Number: c3155112
* email: c3155112@uon.edu.au, julius.skye@gmail.com
* TODO: convert to tag libs
-->

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Login</title>
  </head>
  <HEAD>
      <TITLE>Login using jsp</TITLE>
  </HEAD>

  <body>
  <H1>LOGIN</H1>
  <%



      String myname =  (String)session.getAttribute("username");

      if(myname!=null)
      {
          out.println("Welcome " + myname + "<a href=\"loginResult.jsp?doLogout=true\">Logout</a>");
      }
      else
      {
          String firstLogin = "true";
          session.setAttribute("firstLogin", firstLogin);
  %>
  <form action="loginResult.jsp" method = "POST">
      <table>
          <tr>
              <td> Username  : </td><td> <input name="username" size=15 type="text" /> </td>
          </tr>
          <tr>
              <td> Password  : </td><td> <input name="password" size=15 type="text" /> </td>
          </tr>
      </table>
      <input type="submit" value="login" />
  </form>
  <%
      }
  %>

  </body>
</html>
