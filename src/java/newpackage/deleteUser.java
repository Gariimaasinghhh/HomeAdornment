
package newpackage;

import database.DBCon;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class deleteUser extends HttpServlet {
public void service(HttpServletRequest req,HttpServletResponse resp){
        try{
            PrintWriter out = resp.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Delete Data</title>");
            out.println("</head>");
            out.println("<body>");
            
            String email = req.getParameter("email");
            
            DBCon db = new DBCon();
            db.stmt = db.con.createStatement();
            
            int i = db.stmt.executeUpdate("delete from registration where email='"+email+"'");
            
            if(i>0){
                resp.sendRedirect("VIEW_USERS");
            }
            else{
                resp.sendRedirect("showAll?Please try Again");
            }
            
            out.println("</body>");
            out.println("</html>");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}