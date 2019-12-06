<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" pageEncoding="UTF-8" %>
<html>
<head>
    <title>emplist</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="../css/style.css" />
    <link href="${pageContext.request.contextPath}/css/common.css" type="text/css" rel="stylesheet" />
</head>
<body>
<div id="wrap">
    <div id="top_content">
        <div id="header">
            <div id="navigation">
            </div>
        </div>
        <div id="content">
            <p id="whereami">
            </p>
            <h1>
                Welcome!
            </h1>
            <table class="table">
                <tr class="table_header">
                    <td>
                        菜谱ID
                    </td>
                    <td>
                        菜谱名字
                    </td>
                    <td>
                        菜谱食材
                    </td>
                    <td>
                        配图
                    </td>
                    <td>
                        所属菜系
                    </td>
                    <td>
                        工艺
                    </td>
                    <td>
                        简介
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
                        <c:forEach items="${e.food}" var="f">
                            ${f.name}
                        </c:forEach>
                    </td>
                    <td>
                        <img src="${pageContext.request.contextPath}/imgs/${e.pic}" style="height: 50px;width:50px">
                    </td>
                    <td>
                            ${e.green.name}
                    </td>
                    <td>
                            ${e.gongyi}
                    </td>
                    <td>
                            ${e.intro}
                    </td>
                    <td>
                        <a href="${pageContext.request.contextPath}/back/delete?menuid=${e.id}">删除</a>&nbsp;&nbsp;
                        <a href="${pageContext.request.contextPath}/back/showupdate?id=${e.id}">修改</a>
                    </td>
                </tr>
                </c:forEach>
            </table>
            <p>
                <input type="button" class="button" value="添加菜谱" onclick="location='${pageContext.request.contextPath}/back/add.jsp'"/>
            </p>
        </div>
    </div>
</div>
</body>
</html>
