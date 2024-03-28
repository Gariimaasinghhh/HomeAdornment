
package newpackage;

import database.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class loginConf extends HttpServlet {
   public void service(HttpServletRequest req,HttpServletResponse resp){
        try{
            PrintWriter out = resp.getWriter();
            String email = req.getParameter("email");
            String password = req.getParameter("password");
            String type = req.getParameter("type");
            
            DBCon db = new DBCon();
            
            db.stmt = db.con.createStatement();
            
            db.rst = db.stmt.executeQuery("select * from registration where email='"+email+"'");
            
            if(db.rst.next()){
            if(type.equals("Admin") && password.equals(db.rst.getString(3))){
               resp.sendRedirect("ADMIN_HOME");
            }
            
                    else if(type.equals("User") && password.equals(db.rst.getString(3))){
                resp.sendRedirect("USER_HOME");
            }
            else{
                resp.sendRedirect("LOGIN?Password is Incorrect");
            }
            }
            else{
                resp.sendRedirect("LOGIN?User Not Found or Please Select User type");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
