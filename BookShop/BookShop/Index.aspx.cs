using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace BookShop
{
    public partial class Index : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            using (BSEntities Db = new BSEntities())
            {
                ddl.DataSource = Db.cities.Select(x=>x.name).ToList();
                ddl.DataBind();
            }
            
        }

        protected void Login_Click(object sender, EventArgs e)
        {
            
        }
    }
}