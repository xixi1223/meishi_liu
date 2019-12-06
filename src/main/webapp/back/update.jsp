<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>update Emp</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/css/style.css" />
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.8.3.min.js"></script>
    <script type="text/javascript">
        $(function(){
            $.post("${pageContext.request.contextPath}/back/green",function(data){
                $.each(data,function(i,green){
                    var option=$("<option/>").val(green.id).text(green.name);
                    if(green.id=="${menu.green.id}"){
                        option.attr("selected","selected");
                    }
                    $('#green').append(option);
                })
            },'json');

            //查询所有食材标签
            $.post("${pageContext.request.contextPath}/back/findAllFood",function (result) {
                //遍历学生类型标签集合
                $.each(result,function (i,foo) {
                    var input = $("<input/>").val(foo.id).attr({"type":"checkbox","name":"foodss"});
                    //在标签对象后插入标签文本
                    <c:forEach items="${menu.food}" var="h">
                    if(foo.id==${h.id}){
                        input.attr("checked","checked");
                    }
                    </c:forEach>
                    input.after(foo.name);
                    $("#foodxu").append(input);
                });
            },"JSON");
        });

        function upload_review() {
            var img = document.getElementById("uploadimg");
            var input = document.getElementById("file_upload1");
            var tip = document.getElementById("uploadtip");
            var file = input.files.item(0);
            var freader = new FileReader();
            freader.readAsDataURL(file);
            freader.onload = function(e) {
                img.src = e.target.result;
                tip.style.display = "none";
            };
        }



    </script>



</head>

<body>
<div id="wrap">
    <div id="top_content">
        <div id="header">
            <div id="rightheader">

            </div>
            <div id="topheader">
                <h1 id="title">
                    <a href="#">Main</a>
                </h1>
            </div>
            <div id="navigation">
            </div>
        </div>
        <div id="content">
            <p id="whereami">
            </p>
            <h1>
                更新菜谱:
            </h1>
            <form action="${pageContext.request.contextPath}/back/updateMenu" method="post" enctype="multipart/form-data">
                <table cellpadding="0" cellspacing="0" border="0"
                       class="form_table">
                    <tr>
                        <td valign="middle" align="right">
                            菜谱ID:
                        </td>
                        <td valign="middle" align="left">
                            <input type="text" class="inputgri" name="id" value="${menu.id}" readonly="readonly"/>
                        </td>
                    </tr>
                    <tr>
                        <td valign="middle" align="right">
                            菜谱名:
                        </td>
                        <td valign="middle" align="left">
                            <input type="text" class="inputgri" name="name" value="${menu.name}"/>
                        </td>
                    </tr>
                    <tr>
                        <td valign="middle" align="right">
                        食材:
                        <td valign="middle" align="left">
                            <span id="foodxu"></span>
                        </td>
                    </tr>
                    <tr>
                        <td valign="middle" align="right">
                            工艺:
                        </td>
                        <td valign="middle" align="left">
                            <input type="text" class="inputgri" name="gongyi" value="${menu.gongyi}"/>
                        </td>
                    </tr>
                    <tr>
                        <td valign="middle" align="right">
                            素材:
                        </td>
                        <td valign="middle" align="left">
                            <label id="file_upload1_label" for="file_upload1">
                                <span id="uploadtip"></span>
                                <img id="uploadimg" src="${pageContext.request.contextPath}/imgs/${menu.pic}" alt="" width="50px" height="50px" />
                            </label>
                            <input type="file" name="picc" class="" id="file_upload1"	onchange="upload_review()" hidden>
                        </td>
                    </tr>
                    <tr>
                        <td valign="middle" align="right">
                            简介:
                        </td>
                        <td valign="middle" align="left">
                            <input type="text" class="inputgri" name="intro" value="${menu.intro}"/>
                        </td>
                    </tr>
                    <tr>
                        <td valign="middle" align="right">
                            所属菜系:
                        </td>
                        <td valign="middle" align="left">
                            <select style="width:178px;" id="green" name="greenid">
                            </select>
                        </td>
                    </tr>
                </table>
                <p>
                    <input type="submit" class="button" value="Confirm" />
                </p>
            </form>
        </div>
    </div>
    <div id="footer">

    </div>
</div>
</body>
</html>
