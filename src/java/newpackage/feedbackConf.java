

package newpackage;

import database.DBCon;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class feedbackConf extends HttpServlet {

     public void service(HttpServletRequest req,HttpServletResponse resp){
        try{
            PrintWriter out = resp.getWriter();
            String name = req.getParameter("name");
            String email = req.getParameter("email");
            String feedback = req.getParameter("feedback");
            
            
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Home</title>");
            out.println("</head>");
            out.println("<body>");
            
            DBCon db = new DBCon();
            
            db.stmt = db.con.createStatement();
            
            int row = db.stmt.executeUpdate("insert into feedback values('"+name+"','"+email+"','"+feedback+"')");
            
            if(row>0){
                 resp.sendRedirect("USER_HOME");
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