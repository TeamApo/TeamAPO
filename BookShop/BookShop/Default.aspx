<%@ Page Title="Home Page" Language="C#" MasterPageFile="~/Site.Master" AutoEventWireup="true" CodeBehind="Default.aspx.cs" Inherits="BookShop._Default" %>

<asp:Content ID="BodyContent" ContentPlaceHolderID="MainContent" runat="server">
 <style>
     #gr { color:red;}
 </style>
    
    <h3>Автори на книги</h3>
<br />


    <div style="margin-left:550px;"><asp:GridView BorderStyle="Solid" Font-Size="Large" AutoGenerateColumns="false" AutoGenerateEditButton="true" runat="server" ID="gr">
        <Columns>
<asp:BoundField DataField="fname" HeaderText="Име" />
            <asp:BoundField DataField="lname" HeaderText="Фамилия" />
</Columns>
                                    </asp:GridView></div>




<%--        <div class="row">
            <div class="col-sm-3">
                <p>Книга</p>
                <img src="http://placehold.it/150x80?text=IMAGE" class="img-responsive" style="width: 100%" alt="Image">
            </div>
            <div class="col-sm-3">
                <p>Книга</p>
                <img src="http://placehold.it/150x80?text=IMAGE" class="img-responsive" style="width: 100%" alt="Image">
            </div>
            <div class="col-sm-3">
            <p>Книга</p>
                <img src="http://placehold.it/150x80?text=IMAGE" class="img-responsive" style="width: 100%" alt="Image">
            </div>
            <div class="col-sm-3">
                <p>Книга</p>
                <img src="http://placehold.it/150x80?text=IMAGE" class="img-responsive" style="width: 100%" alt="Image">
            </div>
        </div>--%>
</asp:Content>
