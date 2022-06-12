<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Save request</title>
</head>
<body>
    <form action="check-request" method="post">
        <label for="order-type">order type</label>
        <input id="order-type" name="order-type" placeholder="Enter order type" type="text"/>

        <label for="order-status">order status</label>
        <input id="order-status" name="order-status" placeholder="Enter order status" type="text"/>

        <input type="submit" value="send"/>

    </form>
</body>
</html>