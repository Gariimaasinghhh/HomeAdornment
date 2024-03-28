
package newpackage;

import database.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class contactConf extends HttpServlet {

     public void service(HttpServletRequest req,HttpServletResponse resp){
        try{
            PrintWriter out = resp.getWriter();
             String name = req.getParameter("name");
              String number = req.getParameter("number");
            String email = req.getParameter("email");
           
            String message = req.getParameter("message");
            
            
            
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Home</title>");
            out.println("</head>");
            out.println("<body>");
            
            DBCon db = new DBCon();
            
            db.stmt = db.con.createStatement();
            
            int row = db.stmt.executeUpdate("insert into contact values('"+name+"','"+number+"','"+email+"','"+message+"')");
            
            if(row>0){
                
                
                resp.sendRedirect("home");
            }
            else{
                resp.sendRedirect("userRegistration?Data Not Inserted");
            }
            
            out.println("</body>");
            out.println("</html>");
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
