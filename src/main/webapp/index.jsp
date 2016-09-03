<%--
  Created by IntelliJ IDEA.
  User: gordon
  Date: 16/9/3
  Time: 下午3:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <script src="http://code.jquery.com/jquery-latest.js"></script>
  </head>
  <body>
  $END$
  </body>
  <script >
    var data={title:"shit"};
    $.ajax({
      url: "/create",
      contentType:"application/json",
      data: JSON.stringify(data),
      type: "post",
      success: function (data) {
        alert(data);
      },
      error: function () {
        alert("error");
      }
    })
  </script>
</html>
