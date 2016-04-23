using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Security;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace BookShop
{
    public partial class SiteMaster : MasterPage
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            if(Session["Username"] != null)
            {
                adminddl.Visible = (string)Session["UserFirstname"] == "Мариян" ? true : false;
                loginPanel.Visible = false;
                btnRegister.Visible = false;
                exitBtn.Visible = true;
            }
            else
            {
                adminddl.Visible = false;
                btnRegister.Visible = true;
                exitBtn.Visible = false;
                loginPanel.Visible = true;

            }
            
            

        }

        protected void btnRegister_Click(object sender, EventArgs e)
        {
            Response.Redirect("Register.aspx");
        }

        protected void loginPanel_Click(object sender, EventArgs e)
        {
            Response.Redirect("Login.aspx");
        }

        protected void exitBtn_Click(object sender, ImageClickEventArgs e)
        {
            Session.Abandon();

            FormsAuthentication.SignOut();

            Session["UserFirstname"] = null;

            Session["Username"] = null;

            Response.Redirect("Default.aspx");
        }

        protected void btnSearch_Click(object sender, ImageClickEventArgs e)
        {

            using (BSEntities Db = new BSEntities())
            {
                Session["src"] = (from r in Db.books
                           where r.author.fname.Contains(tbSearch.Text) || r.name.Contains(tbSearch.Text) || r.category.name.Contains(tbSearch.Text)
                           select new {
                               id = r.id,
                               name = r.name,
                               category = r.category.name,
                               description = r.description,
                               author = r.author.fname + " " + r.author.lname,
                               count = r.count,
                               price = r.price + " " + r.valute.name,

                               image_url = r.image_url
                           }).ToList();
                Response.Redirect("books_view.aspx");
            }
        }
    }
}