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
    <script src="js/jquery-3.3.1.js"></script>
    <script>
        $(function () {
            $("#btn").click(function () {
                $.ajax({
                    url:"http://qaq12123.in.8866.org:30102/account/findAllCityMap",
                    contentType:"application/json;charset=UTF-8",
                    dataType:"json",
                    type:"post",
                    success:function (data) {
                            for (var key in data){
                            var d = data[key][0];
                            for(var i=1; i<data[key].length;i++){
                                d = d+"、"+data[key][i]
                            }
                            $("#btx").append(key+" : "+d+"</br>")
                        }
                    }
                });
            });
        });
    </script>
</head>
<body>
    <button  type="button" id="btn">查询所有</button>
    <div id="btx">
    </div>
    <a href="http://qaq12123.in.8866.org:30102/account/findOrder">订单</a>
    <a href="http://qaq12123.in.8866.org:30102/account/findAllCity">城市</a>

    <a href="http://qaq12123.in.8866.org:30102/account/findAllCityMap">哈哈</a>
    <a href="http://qaq12123.in.8866.org:30102/account/findOrderList">哈哈</a>
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
