<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Index.aspx.cs" Inherits="BookShop.Index" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>TeamAPO :: BookShop ::</title>
    <link href="Content/style.css" rel="stylesheet" />
      <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
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
        tr > td{ margin-top:5px;}
    </style>
</head>
<body>
    <form id="form1" runat="server">
         <!-- Trigger the modal with a button -->
 
  <!-- Modal -->
  <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">Регистрация</h4>
        </div>
        <div class="modal-body">
          <table id="tbl">
              <tr>
                  <td>
                    Потребителско име: 
                  </td>
                  <td>
                    <asp:TextBox class="form-control input-sm" runat="server" Width="150"></asp:TextBox>
                  </td>
              </tr>
               <tr>
                  <td>
                    Парола: 
                  </td>
                  <td>
                    <asp:TextBox class="form-control input-sm" runat="server" Width="150"></asp:TextBox>
                  </td>
              </tr>
               <tr>
                  <td>
                    Име: 
                  </td>
                  <td>
                    <asp:TextBox class="form-control input-sm" runat="server" Width="150"></asp:TextBox>
                  </td>
              </tr>
               <tr>
                  <td>
                    Фамилия: 
                  </td>
                  <td>
                    <asp:TextBox class="form-control input-sm" runat="server" Width="150"></asp:TextBox>
                  </td>
              </tr>
               <tr>
                  <td>
                   Населено място:
                  </td>
                  <td>
                    <asp:DropDownList ID="ddl" class="form-control input-sm" runat="server" Width="150"></asp:DropDownList>
                  </td>
              </tr>
               <tr>
                  <td>
                   Адрес:
                  </td>
                  <td>
                    <asp:TextBox class="form-control input-sm" runat="server" Width="250"></asp:TextBox>
                  </td>
              </tr>
          </table>
        
        </div>
        <div class="modal-footer">
           <button type="button" class="btn btn-success" data-dismiss="modal">Регистрирай</button>
          <button type="button" class="btn btn-default" data-dismiss="modal">Изход</button>
        </div>
      </div>
        </div>
    </div>
        <div id="main">
    <div class="header">
			<div>BookShop<span><br />TeamAPO</span></div>
		</div>
		
		<div class="login">
				<input type="text" placeholder="username" id="tbUsername" name="user" /><br />
				<input type="password" placeholder="password" id="tbPassword" name="password" /><br />
				<input id="LoginButton" type="button" value="Login" onclick="LoginClick" />
            <input id="RegisterButton" data-toggle="modal" data-target="#myModal" type="button" value="Register" />
		</div>
            </div>
    </form>
</body>
</html>
