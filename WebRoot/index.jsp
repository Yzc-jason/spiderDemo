<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!doctype html>

<html lang="en">

<head>
<meta charset="utf-8">

<title></title>
<meta name="description" content="">
<meta name="author" content="">


</head>

<body>

	<h1>内网公告抓取</h1>
	<form id="form-signup_v1" action="news_spiderNews" method="post"
		class="validation-form-container">

		<div class="field">
			<label for="signup_v1-username">网址</label>
			<div class="ui left labeled input">

				<input id="signup_v1-username" name="url" type="text">

				<div class="ui corner label"></div>
			</div>
		</div>

		<div class="field">
			<label for="signup_v1-password">开始页数</label>
			<div class="ui left labeled input">

				<input id="signup_v1-password" name="start" type="text">


			</div>
		</div>
		<div class="field">
			<label for="signup_v1-password">结束页数</label>
			<div class="ui left labeled input">

				<input id="signup_v1-password" name="stop" type="text">


			</div>
		</div>



		<input type="submit" class="ui blue submit button" value="确定">


	</form>


</body>

</html>
