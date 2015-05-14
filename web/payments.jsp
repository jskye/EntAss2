<!--

/**
 * Created by Julius Myszkowski on 14/05/2015.
* Subject: SENG4400 - Enterprise Architecture
 * University of Newcastle
 * Student Number: c3155112
 * email: c3155112@uon.edu.au, julius.skye@gmail.com
 */
-->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Payments
</title>
  </head>
  <body>
  <H1>Payments</H1>

  <!--//TODO: use javascript to disable one input when the other is typed in-->

  <form action="paymentsResult.jsp" method = "GET">
      <table>
          <tr>
              <td> Credit Card Number  : </td><td> <input name="creditcard" size=15 type="text" /> </td>
              </tr>
          <tr>
              <td> Paypal ID  : </td><td> <input name="paypal" size=15 type="text" /> </td>
              </tr>
          </table>
      <input type="submit" value="MakePayment" />
      </form>
  <br><a href="loginResult.jsp?doLogout=true">Logout?</a>
  </body>
</html>
