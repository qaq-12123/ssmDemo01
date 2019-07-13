<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/11
  Time: 17:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <a href="account/findAll">查询所有</a>
    <form action="/account/saveAccount" method="get">
        <input type="text" name="name"><br/>
        <input type="text" name="money"><br/>
        <input type="submit" value="提交"><br/>
    </form>

    <form action="/account/testUpload" method="post" enctype="multipart/form-data">
        选择文件<input type="file" name="upload"/>
        <input type="submit" value="上传"/>
    </form>
    <form action="/account/testRecharge" method="post" enctype="multipart/form-data">
        充值账户:<input type="text" name="name"><br/>
        充值金额:<input type="text" name="money"><br/>
        <input type="submit" value="提交"><br/>
    </form>
    <form action="/account/testTransfer" method="post" enctype="multipart/form-data">
        转出账户:<input type="text" name="newName"><br/>
        转入账户:<input type="text" name="oldName"><br/>
        转账金额:<input type="text" name="money"><br/>
        <input type="submit" value="提交"><br/>
    </form>
</body>
</html>
