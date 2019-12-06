<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>emplist</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css" />
    <link href="${pageContext.request.contextPath}/css/common.css" type="text/css" rel="stylesheet" />
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.8.3.min.js"></script>
    <script type="text/javascript">
    </script>
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
                Welcome!
            </h1>
            <table class="table">
                <tr class="table_header">
                    <td id="cid">
                        菜谱ID
                    </td>
                    <td>
                        菜谱名字
                    </td>
                    <td>
                        菜谱工艺
                    </td>
                    <td>
                        菜谱图片
                    </td>
                    <td>
                        学习菜谱的人数
                    </td>
                    <td>
                        菜谱介绍
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
                            ${e.gongyi}
                    </td>
                    <td>
                        <img src="${pageContext.request.contextPath}/imgs/${e.pic}" style="width: 50px; height: 50px">
                    </td>
                    <td>
                            ${e.rcount}
                    </td>
                    <td>
                            ${e.intro}
                    </td>
                    <td>
                        <input type="button"
                               onclick="location='${pageContext.request.contextPath}/green/count?cid=${e.id}' " value="学习"/>
                    </td>
                </tr>
                </c:forEach>
            </table>
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