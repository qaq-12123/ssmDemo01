<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/11
  Time: 17:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<script type="text/javascript" src="js/jquery-3.3.1.js"></script>
    <%--<a href="account/findAll">查询所有</a>--%>
    <%--<form action="/account/saveAccount" method="get">--%>
        <%--<input type="text" name="name"><br/>--%>
        <%--<input type="text" name="money"><br/>--%>
        <%--<input type="submit" value="提交"><br/>--%>
    <%--</form>--%>

    <%--<form action="/account/testUpload" method="post" enctype="multipart/form-data">--%>
        <%--选择文件<input type="file" name="upload"/>--%>
        <%--<input type="submit" value="上传"/>--%>
    <%--</form>--%>
    <%--<form action="/account/testRecharge" method="post" enctype="multipart/form-data">--%>
        <%--充值账户:<input type="text" name="name"><br/>--%>
        <%--充值金额:<input type="text" name="money"><br/>--%>
        <%--<input type="submit" value="提交"><br/>--%>
    <%--</form>--%>
    <%--<form action="/account/testTransfer" method="post" enctype="multipart/form-data">--%>
        <%--转出账户:<input type="text" name="newName"><br/>--%>
        <%--转入账户:<input type="text" name="oldName"><br/>--%>
        <%--转账金额:<input type="text" name="money"><br/>--%>
        <%--<input type="submit" value="提交"><br/>--%>
    <%--</form>--%>

   <%----%>
<button onclick="find()">登录</button>
<button onclick="sett()">结算</button>
<button onclick="execute()">dfdsfsd</button>
<form action="/admin/findAdmin" method="post">
    <input type="text" name="name">
    <input type="text" name="password">
    <input type="submit">
</form>

<form action="/vehicle/findByLicense" method="post">
    <input type="text" name="license">
    <input type="submit">
</form>
<form action="/vehicle/findByLicense" method="post">
    <input type="text" name="license">
    <input type="submit">
</form>
<form action="/order/findAll" method="post">
    <input type="text" name="phone">
    <input type="text" name="id">
    <input type="submit">
</form>
<form action="/vehicle/findByImg" method="post">
    <input type="text" name="id">
    <input type="submit">
</form>
<button onclick="ddd()" >dsadad</button>
<form action="/order/findStatue" method="post">
    <input type="text" name="orderNo">
    <input type="text" name="statue">
    <input type="submit">
</form>
    <script >
        function ddd() {
            $.ajax({
                url: "/vehicle/findByImg",
                type: "post",
                data: {"id":1},
                dataType: "Json",
                success: function (data) {
                    for (var i=0;i<data.length;i++){
                       alert(data[0].vim);
                    }
                }
            });
        }
        function execute() {
            $.ajax({
                url: "/vehicle/findByLicense",
                type: "post",
                data: {"license":"1"},
                dataType: "Json",
                success: function (data) {
                    alert(data);
                }
            });
        }

        function find() {
            $.ajax({
                url:"/admin/findAdmin",
                type:"post",
                data: {"name":"a","password":"123"},
                dataType: "Json",
                success: function (data) {
                    alert(data);
                }
            })
        }
        function sett() {
            $.ajax({
                url:"/order/settlement",
                type:"post",
                data: {"orderNo":"201907151120"},
                dataType: "Json",
                success: function (data) {
                    alert(data[1]);
                }
            })
        }
        function sett() {
            $.ajax({
                url:"/order/findOrderNo",
                type:"post",
                data: {"orderNo":"201907151120"},
                dataType: "Json",
                success: function (data) {
                    alert(data[1]);
                }
            })
        }
    </script>

</body>
</html>
