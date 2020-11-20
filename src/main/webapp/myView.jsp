<%@page isELIgnored="false"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MVC</title>
    </head>
    <body>
        <h1>Name information:</h1>
        The name of the user is 【${model.name}】.<br> <!--調用MyModel中的getName()-->
        The name contains 【${model.nameLength}】 characters. <!--調用MyModel中的getNameLenght()-->
    </body>
</html>
