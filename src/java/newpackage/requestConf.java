

package newpackage;

import database.DBCon;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class requestConf extends HttpServlet {

   public void service(HttpServletRequest req,HttpServletResponse resp){
        try{
            PrintWriter out = resp.getWriter();
            
            String email = req.getParameter("email");
           
            
            
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Home</title>");
            out.println("</head>");
            out.println("<body>");
            
            DBCon db = new DBCon();
            
            db.stmt = db.con.createStatement();
            
            int row = db.stmt.executeUpdate("insert into catalouge values('"+email+"')");
            
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