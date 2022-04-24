<%--
  Created by IntelliJ IDEA.
  User: LISHANSHAN
  Date: 2022/4/17
  Time: 15:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加书籍</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">

    <div class="row clearfix">
        <div class="page-header">
            <h1>
                <small>新增书籍</small>
            </h1>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/book/addBooks" method="post">
        <div class="form-group">
            <label>书籍名称</label>
            <input type="text" class="form-controller" name="bookName" required>
        </div>
        <div class="form-group">
            <label>书籍数量</label>
            <input type="text" class="form-controller" name="bookCounts" required>
        </div>
        <div class="fom-group">
            <label>书籍详情</label>
            <input type="text" name="detail" class="form-controller" required>
        </div>
        <div class="fom-group">
        <input type="submit" class="form-controller" value="提交">
        </div>
    </form>
</div>
</body>
</html>
