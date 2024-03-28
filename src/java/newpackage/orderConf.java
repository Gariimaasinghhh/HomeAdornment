
package newpackage;

import database.DBCon;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class orderConf extends HttpServlet {

   public void service(HttpServletRequest req,HttpServletResponse resp){
        try{
            PrintWriter out = resp.getWriter();
                String name = req.getParameter("name");
            String contact= req.getParameter("contact");
            String email = req.getParameter("email");
            String category = req.getParameter("category");
            String option = req.getParameter("option");
            String designer = req.getParameter("designer");
          String budget = req.getParameter("budget");
            String address = req.getParameter("address");
            String area = req.getParameter("area");
         
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Home</title>");
            out.println("</head>");
            out.println("<body>");
            
            DBCon db = new DBCon();
            
            db.stmt = db.con.createStatement();
             
             int row = db.stmt.executeUpdate("insert into orders values('"+name+"','"+contact+"','"+email+"','"+category+"','"+option+"','"+designer+"','"+budget+"','"+address+"','"+area+"')");
            
            if(row>0){
                    resp.sendRedirect("USER_HOME");
            }
            else{
                resp.sendRedirect("ORDER?Data Not Inserted");
            }
            
            out.println("</body>");
            out.println("</html>");
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
