

package newpackage;

import database.DBCon;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class VIEW_FEEDBACK extends HttpServlet {

    public void service(HttpServletRequest req,HttpServletResponse resp){
                try{
            PrintWriter out = resp.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<link rel=\"stylesheet\" href=\"css/flexslider.css\" type=\"text/css\" media=\"screen\" />");
            out.println("<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css'>");
            out.println("<link href='js/h1.js' rel='stylesheet' type='text/js'>");
            out.println("<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css'>");
            out.println("<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js'></script>");
            out.println("<script src='https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js'></script>");
            out.println("<script src='https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js'></script>");	
              out.println("<link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css'>");

            out.println("<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css'>");
            out.println("<script src='https://code.jquery.com/jquery-3.2.1.slim.min.js' ></script>");
            out.println("<script src='https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js' ></script>");
            out.println("<script src='https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js'></script>");	

            
           out.println("  <!-- magnific popup css link  -->");
  out.println("<link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/magnific-popup.js/1.1.0/magnific-popup.min.css'>");

out.println("  <!-- font awesome file link  -->");
  out.println("<link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css'>");

out.println("  <!-- bootstrap file link  -->");
 out.println(" <link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.3/css/bootstrap.min.css'>");

out.println("  <!-- custom css file link  -->");
  out.println("<link rel='stylesheet' href='css/style.css'>");

out.println("  <title>Responsive Architechture and Interior Design Website Tutorial</title>");
out.println("<style>");


out.println("@import url('https://fonts.googleapis.com/css2?family=Exo+2:ital,wght@0,200;0,300;0,400;0,500;0,600;1,300;1,400;1,500&display=swap');");

  out.println(":root{--orange:#ff7a00;}*{ margin:0; padding:0;box-sizing: border-box;transition:all .2s linear;text-transform: capitalize;font-family: 'Exo 2', sans-serif;}html{font-size: 62.5%;scroll-behavior: smooth;}body{overflow-x: hidden;}.heading{font-size: 3rem;font-weight:bold; text-align: center; letter-spacing: 1.0rem;  color:#444;margin:2rem 0;padding-top: 6rem; text-decoration: underline;text-decoration-style: solid;text-decoration-color: var(--orange);text-underline-offset:1rem;}");

  out.println(".header{  display: flex;align-items: center;justify-content: space-between;width:100%; background:#fff; z-index: 100;  padding:1rem 2rem;box-shadow: 0 .2rem .5rem rgba(0,0,0,.3);}.header .logo img{height: 4rem;}.header nav ul{  list-style-type: none;display: flex;align-items: center;justify-content: space-around;margin:0; padding:0;}.header nav ul li{  margin: 0 1.5rem;}.header nav ul li a{ font-size: 2rem;color:#666;}.header nav ul li a:hover{color:#000; text-decoration: none;}.header .fa-bars{font-size: 2.5rem;color:#666;  cursor: pointer;  display: none;}.home .hero{ min-height: 60vh; background-size: cover;  background-position: center;display: flex; align-items: center;}");

  out.println(".home .row{  margin:0;}.home .hero .text1{  font-size: 5rem;  width:45rem; background:#fff;  padding:1rem;  text-align: center;  opacity: .8;}.home .hero .text2{  font-size: 3rem; width:35rem; background:var(--orange); padding:1rem;  text-align: center; opacity: .8; margin-top: 1rem; color:#fff;}.home .counting{ min-height: 40vh;  padding:2rem 0; display: flex; align-items: center;justify-content: center; flex-wrap: wrap;}.home .counting .box{margin: 2rem 4rem;text-align: center;}.home .counting .box .count{font-size: 7rem; color:#444;}.home .counting .box h3{ font-size: 2rem;color:var(--orange);}");

  out.println(".about{ min-height: 100vh;padding-bottom: 3rem;}.about .image{ padding:2rem;}.about .image img{ height:45rem; object-fit: cover;box-shadow: 2.5rem 2.5rem 0 1rem var(--orange);}.about .info{padding:2rem;margin-top: 3rem;}.about .info h2{ color:var(--orange);font-size: 3rem;} .about .info p{font-size: 1.4rem; color:#444; margin:2rem 0;}.about .info .icons a{  font-size: 2rem; height: 4rem;  width:4rem; line-height: 4rem; text-align: center;  background:#333;color:#fff; border-radius: .5rem;  margin-right: 1rem;  text-decoration: none;}.about .info .icons a:hover{background:var(--orange);}.service{min-height: 100vh;}.service .box-container{width:90%;display: flex;justify-content: center;flex-wrap: wrap;}");

  out.println(".service .box-container .box{  height:25rem;width:25rem;  box-shadow: 0 .2rem .5rem rgba(0,0,0,.3);border-left: .5rem solid var(--orange);border-right: .5rem solid var(--orange); border-radius: .5rem;text-align: center;padding-top: 6rem;margin:2rem 3rem;}.service .box-container .box .fas{color:var(--orange);font-size: 5rem;}.service .box-container .box p{color:#333;font-size: 1.1rem;  margin:2rem 0;}.project{ min-height:100vh;  background:#333;}");

  out.println(".project .heading{color:#fff;}.project .box-container{ display: flex;justify-content: center;flex-wrap: wrap;}.project .box-container .box{  height:20rem;width:30rem;  border-radius: .5rem; margin:2rem;overflow: hidden;box-shadow: 0 .3rem .5rem #000;}.project .box-container .box img;height:100%; width:100%;object-fit: cover;}.project .box-container .box:hover img{transform: scale(1.3);}.contact{ min-height: 100vh;}.contact-box-container{ width:93%;display: flex;justify-content: center; flex-wrap: wrap;}.contact-box-container .contact-box{height:15rem;  flex:1 0 30rem; margin:2rem; box-shadow: 0 .3rem .5rem rgba(0,0,0,.2);border-radius: .5rem;text-align: center; padding-top: 4rem;}");
  
  out.println(".contact-box-container .contact-box i{color:var(--orange);font-size: 4rem;}.contact-box-container .contact-box h3{  font-size: 1.8rem;  color:#444;margin:2rem 0;}.contact .form-container{width:90%; box-shadow: 0 .3rem .5rem rgba(0,0,0,.2); border-radius: .5rem;  padding:1rem 3rem; margin-bottom: 2rem;}.contact .form-container form input, textarea{height:4.5rem;padding:0 1rem; margin:2rem 0; font-size: 1.5rem;box-shadow: 0 .3rem .5rem rgba(0,0,0,.2);  border:none;outline: none;  color:#333;}.contact .form-container form .inputBox{display: flex; justify-content: space-between;}.contact .form-container form input[type='text']{width:49%;}.contact .form-container form input[type='email']{ width:100%;}.contact .form-container form textarea{width:100%;height:20rem;padding:1rem; resize: none;overflow-y: auto;}");

  out.println(".contact .form-container form input[type='submit']{ background:var(--orange); width:15rem;color:#fff;font-size: 2rem;}.contact .form-container form input[type='submit']:hover{opacity:.8;}.footer{background:#333;text-align: center;}.footer .row{width:100%;margin-left: 0; padding:1rem;}.footer .row .col-md-3{ margin:1rem 0;}.footer h2{font-size: 2.5rem;color:#fff;}.footer p{ font-size: 1.2rem;color:#ccc;}.footer .list{display: flex;  flex-flow: column;}.footer .list a{ color:#ccc;font-size: 1.7rem;}");

  out.println(".footer .letter p{font-size: 2rem;}.footer .letter input[type='email']{  outline: none; border: none;background:none;padding:0 1rem;color:#fff;  height:3rem;  width:100%; border:.1rem solid #fff; font-size: 1.5rem;}.footer .letter input[type='submit']{  outline: none;border: none;  background:#fff;margin:1rem 0;width:10rem;  font-size: 1.6rem;}.footer .letter input[type='submit']:hover{background:var(--orange); color:#fff;}");

  out.println(".footer .credit{width: 100%;text-align: center; color:#fff; font-size: 2rem;padding:1rem 0; margin:1rem 0;margin-bottom: 0;border-top: .1rem solid #aaa; letter-spacing: .2rem;}.footer .credit span{ color:var(--orange);}.fa-times{transform: rotate(180deg);}@media (max-width:768px){  html{ font-size: 50%;}.header .fa-bars{display: block;}.header nav{ position: fixed; top:6rem; right: -120%;height:calc(100vh - 6rem);width:100vw;background: rgba(0,0,0,.5);  z-index: 1000; border-top: .1rem solid rgba(0,0,0,.3);}");
  out.println(".header nav ul{ height: 100%; width:33rem;background:#fff; flex-flow: column;justify-content: center;float: right;}.header nav ul li{margin:1rem 0;}.header nav ul li a{ display: block; padding:.5rem 0; border: .1rem solid rgba(0,0,0,.3);width:25rem;border-radius: 5rem; text-align: center;}.header nav ul li a:hover{background:#333;color:#fff;} .header .nav-toggle{right: 0%;}}@media (max-width:400px){.home .hero .text1{ font-size: 3.5rem;width: 33rem;}  .home .hero .te2{font-size: 2.5rem;width: 30rem;}}");
out.println("</style>");
out.println("</head>");
 
out.println("<header class='header fixed-top'>");

out.println("<a style='color:#FF8D29;font-size:26px;' href='home'>HOME ADORNMENT WEB PORTAL</a>");


out.println("<nav style='height:88px;text-align:center;'>");
 out.println(" <ul>");
    out.println("<li><a href='VIEW_USERS'>View <br>Users</a></li>");
    out.println("<li><a href='VIEW_CONTACT'>View <br>Contact<br>Requests</a></li>");
    out.println("<li><a href='VIEW_REQUEST'>View<br> Catalouge<br> Requests</a></li>");
    out.println("<li><a href='VIEW_FEEDBACK'>View<br> Feedback</a></li>");
    out.println(" <li><a href='VIEW_ORDER'>View<br> Orders</a></li>");
   out.println(" <li><a href='CHANGE_PASSWORD'>Change <br>Password</a></li>");
   out.println(" <li style='color:#FF8D29'><a style='color:#FF8D29' href='home'>LOGOUT</a></li>");

  out.println("</ul>"); 
out.println("</nav>");
 
out.println("<div class='fas fa-bars'></div>");

out.println("</header>");

out.println("<br><br>");
out.println("<body style='background-image:url(https://lordnking.com/wp-content/uploads/2022/03/why-interior-design-and-architecture-matters-for-business.jpeg)'>");
   out.println("<br>");
 
       out.println("<h1 class='heading' style='margin-left:70px;'>USERS</h1>");
           
            out.println("<br>");
        
            out.println("<div style='margin:6px auto !important;padding:10px 20px !important;border:0px solid blue;width:98%;border-radius:30px;'>");
            out.println("<table width='100%' cellpadding='10'>");
            out.println("<tr style='padding-left:10px;background-color:black;opacity:0.8;color:white;font-size:14pt;height:42px;'>");
            out.println("<th>&nbsp;&nbsp;S.No</th>");
            out.println("<th>Name</th>");
            out.println("<th>Email </th>");
            out.println("<th>Feedback</th>");
       
            out.println("</tr>");
            
            DBCon db = new DBCon();
            
            db.stmt = db.con.createStatement();
            
            db.rst = db.stmt.executeQuery("select * from feedback");
            int count = 1;
            
            while(db.rst.next()){
                out.println("<tr style='margin:9px !important;background-color:white;height:42px;opacity:0.96;color:black;font-size:12pt'>");
                out.println("<th>&nbsp;&nbsp; "+ count +" </th>");
                out.println("<th> "+ db.rst.getString(1) +" </th>");
                out.println("<th> "+ db.rst.getString(2) +" </th>");
                out.println("<th> "+ db.rst.getString(3) +" </th>");
                out.println("</tr>");
                count++;
            }
            
            
            
            out.println("</table>");
            out.println("</div>");
            
out.println("<!-- jquery file link  -->");
out.println("<script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js'></script>");

out.println("<!-- magnific popup link  -->");
out.println("<script src='https://cdnjs.cloudflare.com/ajax/libs/magnific-popup.js/1.1.0/jquery.magnific-popup.min.js'></script>");

out.println("<!-- main/custom javascript file link  -->");
out.println("<script src='js/main.js'></script>");

out.println("</body>");
out.println("</html>");
 }
                
        catch(IOException e){
        } catch (SQLException ex) {
            Logger.getLogger(VIEW_USERS.class.getName()).log(Level.SEVERE, null, ex);
        }
  
    }
}
    