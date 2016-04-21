using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace BookShop
{
    public partial class _Default : Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            using (BSEntities Db = new BSEntities())
            {
                var at = Db.authors.Select(x => new { x.fname,x.lname }).ToList();
                gr.DataSource = at;
                gr.DataBind();
            }

        }
    }
}