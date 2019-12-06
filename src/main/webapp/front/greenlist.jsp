<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>emplist</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="../css/style.css" />
</head>
<body>
<div id="wrap">
    <div id="top_content">
        <div id="header">
            <div id="rightheader">
                <p>
                    2009/11/20
                    <br />
                </p>
            </div>
            <div id="topheader">
                <h1 id="title">
                    <a href="#">main</a>
                </h1>
            </div>
            <div id="navigation">
            </div>
        </div>
        <div id="content">
            <p id="whereami">
            </p>
            <h1>
                Welcome!${username}
            </h1>
            <table class="table">
                <tr class="table_header">
                    <td>
                        菜系ID
                    </td>
                    <td>
                        菜系名
                    </td>
                    <td>
                        Operation
                    </td>
                </tr>
                <c:forEach items="${list}" var="e">
                <tr class="row1">
                    <td>
                            ${e.id}
                    </td>
                    <td>
                            ${e.name}
                    </td>
                    <td>
                        <a href="${pageContext.request.contextPath}/green/queryByid?id=${e.id}">展示菜谱</a>
                    </td>
                </tr>
                </c:forEach>
            </table>
            <p>
                <input type="button" class="button" value="查看我的菜谱"
                       onclick="location='${pageContext.request.contextPath}/green/queryByuserid'"/>
            </p>
            <p><input type="button" class="button" value="添加菜系"
                      onclick="location='${pageContext.request.contextPath}/front/add.jsp'"/></p>
        </div>
    </div>
    <div id="footer">
        <div id="footer_bg">
            ABC@126.com
        </div>
    </div>
</div>
</body>
</html>