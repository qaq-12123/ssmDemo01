<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/11
  Time: 17:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <script src="../../js/jquery-3.3.1.js"></script>
<%--    <script>--%>
<%--        $(function () {--%>
<%--            $("#btn").click(function () {--%>
<%--                var  name = $("name").val();--%>
<%--                // alert(name);--%>
<%--                var  money = $("money").val();--%>
<%--                // alert(money);--%>
<%--                $.ajax({--%>
<%--                    url:"account/saveAccount",--%>
<%--                    contentType:"application/json;charset=UTF-8",--%>
<%--                    dataType:"json",--%>
<%--                    data:{"name":name,"money":money},--%>
<%--                    type:"post",--%>
<%--                    success:function (data) {--%>
<%--                      alert(data.name)--%>
<%--                      alert(data.money)--%>
<%--                    }--%>
<%--                });--%>
<%--            });--%>
<%--        });--%>
<%--    </script>--%>
</head>
<body>
    <h3>查询成功！</h3></br>
    <c:forEach items="${list}" var="account">
        ${account.name}
        ${account.id}
        ${account.money}
        <a href="/account/delAccount?name=${account.name}">删除</a>
        <a href="update.jsp?name=${account.name}">修改</a>
    </c:forEach>
    ${result}</br>
    <a href="../../index.jsp">返回上一页</a></br>
</body>
</html>
