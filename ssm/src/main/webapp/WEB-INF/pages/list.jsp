<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/13
  Time: 15:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>查询成功！</h3>
    <c:forEach items="${map}" var="map">
        ${map.key}:
        <c:forEach items="${map.value}" var="cityname" varStatus="i">
            ${cityname.cityname}${cityname.abb}
        </c:forEach></br>
    </c:forEach>
    <c:forEach items="${list}" var="list">
        订单     : ${list.orderNo}</br>
        取车城市 : ${list.collectionCity}</br>
        取车城门店 : ${list.colleationStore}</br>
        还车城市 : ${list.returnCity}</br>
        还车门店 : ${list.returnStore}</br>
        租车时长 : ${list.rentTime}</br>
        租车时间 : ${list.startday}${list.week1}</br>
        还车时间 : ${list.endday}${list.week2}</br>
        车型     : ${list.brand}</br>
        图片展示 : <img src="${list.img}" alt="">
        <h3>------------</h3>
    </c:forEach></br>
</body>
</html>
