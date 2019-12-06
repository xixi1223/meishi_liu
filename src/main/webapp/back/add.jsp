
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>add Emp</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css" />
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.8.3.min.js"></script>
    <script type="text/javascript">
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
        $(function(){
            $.post("${pageContext.request.contextPath}/back/green",function(data){
                $.each(data,function(i,green){
                    var option=$("<option/>").val(green.id).text(green.name);
                    $('#green').append(option);
                })
            },'json');
            });

        //查询所有食材标签
        $.post("${pageContext.request.contextPath}/back/findAllFood",function (result) {
            //遍历学生类型标签集合
            $.each(result,function (i,foo) {
                var input = $("<input/>").val(foo.id).attr({"type":"checkbox","name":"foodss"});
                //在标签对象后插入标签文本
                input.after(foo.name);
                $("#foodxu").append(input);
            });
        },"JSON");
    </script>
</head>

<body>
<div id="wrap">
    <div id="top_content">

        <div id="content">
            <p id="whereami">
            </p>
            <h1>
                添加菜谱
            </h1>
            <form action="${pageContext.request.contextPath}/back/add" method="post" enctype="multipart/form-data">
                <table cellpadding="0" cellspacing="0" border="0"
                       class="form_table">
                    <tr>
                        <td valign="middle" align="right">
                            菜谱名:
                        </td>
                        <td valign="middle" align="left">
                            <input type="text" class="inputgri" name="name" />
                        </td>
                    </tr>
                    <tr>
                        <td valign="middle" align="right">
                            工艺:
                        </td>
                        <td valign="middle" align="left">
                            <input type="text" class="inputgri" name="gongyi" />
                        </td>
                    </tr>
                    <tr>
                        <td valign="middle" align="right">
                            素材:
                        </td>

                        <td valign="middle" align="left">
                            <label id="file_upload1_label" for="file_upload1">
                                <span id="uploadtip"></span>
                                <img id="uploadimg" src="" alt="" width="50px" height="50px" />
                            </label>
                            <input type="file" name="picc" class="" id="file_upload1"	onchange="upload_review()" hidden>
                        </td>

                    </tr>
                    <tr>
                        <td valign="middle" align="left">
                            食材:
                        </td>
                        <td valign="middle" align="right">
                            <span id="foodxu"></span>
                        </td>
                    </tr>
                    <tr>
                        <td valign="middle" align="right">
                            简介:
                        </td>
                        <td valign="middle" align="left">
                            <input type="text" class="inputgri" name="intro" value=""/>
                        </td>
                    </tr>
                    <tr>
                        <td valign="middle" align="right">
                            请选择菜系:
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
        <div id="footer_bg">
            ABC@126.com
        </div>
    </div>
</div>
</body>
</html>
