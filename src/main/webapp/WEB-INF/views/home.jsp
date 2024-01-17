<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Calculator</title>
</head>
<body>
<h2>Calculator</h2>
<form th:action="@{/home/save}" th:method="post">
    <label>
        <input type="number" name="number1">
    </label>
    <label>
        <input type="number" name="number2">
    </label>
    <br>
    <br>
    <input type="submit" name="submit" value="Add(+)">
    <input type="submit" name="submit" value="Sub(-)">
    <input type="submit" name="submit" value="Mul(x)">
    <input type="submit" name="submit" value="Div(/)">
</form>
<br>
<h3 th:text="Result-- + ${result}"></h3>
</body>
</html>
