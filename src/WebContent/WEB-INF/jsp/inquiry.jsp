<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
  <meta charset="UTF-8">
  <title>お問い合わせ</title>
</head>

<body>
  <h1>お問い合わせ</h1>
    ユーザーID
    メールアドレス<br>
    件名<input type="text" name="Title"><br>
    お問い合わせ内容<br>
    <textarea name="Inquiry"></textarea><br>
    <input type="submit" name="submit" onclick="MoveCheck();" value="送信">

  <script src = "js/inquiry.js"></script>
</body>

</html>