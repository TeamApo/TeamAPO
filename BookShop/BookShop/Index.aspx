<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Index.aspx.cs" Inherits="BookShop.Index" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>TeamAPO :: BookShop ::</title>
    <link href="Content/style.css" rel="stylesheet" />
    <style>

        body{
            background: url(images/background.jpeg) no-repeat center center fixed; 
  -webkit-background-size: cover;
  -moz-background-size: cover;
  -o-background-size: cover;
  background-size: cover;
        }
        div#main {
               background: rgba(200, 54, 54, 0.8);
            height:170px;
            width:500px;
            box-shadow:1px 1px 40px 3px white;
            border-radius:100px;

        }
    </style>
</head>
<body>
    <form id="form1" runat="server">
        <div id="main">
    <div class="header">
			<div>BookShop<span><br />TeamAPO</span></div>
		</div>
		
		<div class="login">
				<input type="text" placeholder="username" id="tbUsername" name="user" /><br />
				<input type="password" placeholder="password" id="tbPassword" name="password" /><br />
				<input id="LoginButton" type="button" value="Login" />
            <input id="RegisterButton" type="button" value="Register" />
		</div>
            </div>
    </form>
</body>
</html>
