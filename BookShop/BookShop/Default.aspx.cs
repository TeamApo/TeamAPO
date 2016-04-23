﻿using System;
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
            if(Session["UserFirstname"] != null)
            {
                welcome.InnerText = "Здравей, " + Session["UserFirstname"] + " !";
            }
            else
            {
                welcome.InnerText = "Здравей!";
            }
        }
    }
}