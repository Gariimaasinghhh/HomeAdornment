
package newpackage;

import database.DBCon;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class passwordConf extends HttpServlet {

      protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try  {
            PrintWriter out = response.getWriter();
            String mail = request.getParameter("email");
            String newpass = request.getParameter("newpass");
            String confirmpass = request.getParameter("confirmpass");
            
            if(newpass.equals(confirmpass)){
                DBCon db = new DBCon();
            
                db.stmt = db.con.createStatement();

                int i = db.stmt.executeUpdate("update registration set password='"+newpass+"'where utype='admin' and email='"+mail+"'");
                if(i>0){
                    response.sendRedirect("ADMIN_HOME");
                }    
            }
            else{
                response.sendRedirect("CHANGE_PASSWORD?New Password and Confirm are not Matched");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }



}
