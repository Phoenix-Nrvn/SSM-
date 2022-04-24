<%--
  Created by IntelliJ IDEA.
  User: LISHANSHAN
  Date: 2022/4/17
  Time: 15:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改书籍</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改书籍</small>
                </h1>
            </div>
        </div>
    </div>

<form action="${pageContext.request.contextPath}/book/updateBooks" method="post">
    <input type="hidden" name="bookId" value="${books.bookId}">
    <div class="form-group">
        <label>书籍名称</label>
        <input type="text" name="bookName" class="form-controller" value="${books.bookName}">
    </div>

    <div class="form-group">
        <label>书籍数目</label>
        <input type="text" name="bookCounts" class="form-controller" value="${books.bookCounts}">
    </div>

    <div class="form-group">
        <label>书籍详情</label>
        <input type="text" name="detail" class="form-controller" value="${books.detail}">
    </div>

    <div class="form-group">
        <input type="submit" value="提交" class="form-controller">
    </div>
</form>
</div>
</body>
</html>
