
package newpackage;

import java.io.IOException;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class home extends HttpServlet {

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

  out.println(".header{  display: flex;align-items: center;justify-content: space-between;width:100%; background:#fff; z-index: 100;  padding:1rem 2rem;box-shadow: 0 .2rem .5rem rgba(0,0,0,.3);}.header .logo img{height: 4rem;}.header nav ul{  list-style-type: none;display: flex;align-items: center;justify-content: space-around;margin:0; padding:0;}.header nav ul li{  margin: 0 1.5rem;}.header nav ul li a{ font-size: 2rem;color:#666;}.header nav ul li a:hover{color:#000; text-decoration: none;}.header .fa-bars{font-size: 2.5rem;color:#666;  cursor: pointer;  display: none;}.home .hero{ min-height: 60vh;background: url(http://cdn.home-designing.com/wp-content/uploads/2020/11/black-and-grey-living-room.jpg) no-repeat; background-size: cover;  background-position: center;display: flex; align-items: center;}");

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
out.println("<body>");
  
 
out.println("<header class='header fixed-top'>");


out.println("<a style='color:#FF8D29;font-size:26px;' href='home'>HOME ADORNMENT WEB PORTAL</a>");

out.println("<nav>");
 out.println(" <ul>");
    out.println("<li><a href='#home'>home</a></li>");
    out.println("<li><a href='#about'>about</a></li>");
    out.println("<li><a href='#service'>services</a></li>");
    out.println("<li><a href='#project'>projects</a></li>");
   out.println(" <li><a href='#contact'>contact</a></li>");
   out.println(" <li style='color:#FF8D29'><a style='color:#FF8D29' href='LOGIN'>LOGIN&nbsp;|</a><a style='color:#FF8D29' href='REGISTRATION'>&nbspREGISTRATION</a></li>");

  out.println("</ul>");
out.println("</nav>");

out.println("<div class='fas fa-bars'></div>");

out.println("</header>");

out.println("<br><br>");

out.println("<br id='home' >");
out.println("<section class='home container-fluid p-0'>");

out.println("<div class='row hero'>");
 out.println(" <div class='col pl-3 ml-sm-5 p-0'>");
    out.println("<h1 class='text1'>Creating Home</h1>");
    out.println("<h3 class='text2'>Of Your Dreams!</h3>");
  out.println("</div>");
out.println("</div>");

out.println("<div class='counting'>");

out.println("<div class='box'>");
  out.println("<h1 class='count' data-count='1200'>1200+</h1>");
  out.println("<h3>working hours</h3>");
out.println("</div>");

out.println("<div class='box'>");
  out.println("<h1 class='count' data-count='15'>15+</h1>");
 out.println(" <h3>awards</h3>");
out.println("</div>");

out.println("<div class='box'>");
  out.println("<h1 class='count' data-count='1000'>1000+</h1>");
  out.println("<h3>clients</h3>");
out.println("</div>");

out.println("<div class='box'>");
  out.println("<h1 class='count' data-count='840'>840+</h1>");
  out.println("<h3>projects</h3>");
out.println("</div>");

out.println("</div>");

out.println("</section>");


out.println("<br id='about'>");
out.println("<br>");
out.println("<section class='about container'>");
out.println("<br>");
out.println("<h1 class='heading'>about us</h1>");
out.println("<br>");
out.println("<div class='row align-items-center'>");

  out.println("<div class='col-md-6 image'>");
    out.println("<img src='https://media.designcafe.com/wp-content/uploads/2021/11/09191216/living-room-interior-design-photo-gallery-where-black-laminated-tv-unit-design.jpg' width='90%' alt=''>");
  out.println("</div>");

  out.println("<div class='col-md-6 info'>");
    out.println("<h2>the best Interior Design in the city</h2>");
   out.println(" <p>When you knowthe basic home designing principles you can transform any space to look fabulous. You know what it feels like when you walk into a well designed room. You can sense how everything feels cohesive and put together. It feels just right. You can achieve that effect in your own home with a little knowledge of basic design principles. Pair that knowledge with practice and experimentation and you're on your way to creating a beautiful home</p>");
out.println("<div class='icons'>");
      out.println("<a href='#' class='fab fa-facebook-f'></a>");
      out.println("<a href='#' class='fab fa-twitter'></a>");
      out.println("<a href='#' class='fab fa-instagram'></a>");
      out.println("<a href='#' class='fab fa-pinterest '></a>");
   out.println("</div>");
  out.println("</div>");

out.println("</div>");

out.println("</section>");



out.println("<br id='service'>");


out.println("<section id='service' class='service'>");
out.println("<br>");
out.println("<h1 class='heading'>our services</h1>");
out.println("<br>");
out.println("<div class='box-container mx-auto'>");

 out.println(" <div class='box'>");
    out.println("<div class='fas fa-palette'></div>");
    out.println("<br><h3style='margin-top:30px;'>BEST PAINTING EXPERIENCE</h3>");
  out.println("</div>");

 out.println(" <div class='box'>");
    out.println("<div class='fas fa-tools'></div>");
     out.println("<br><h3 style='margin-top:30px;'>BEST MAINTAINENCE PROVIDED</h3>");
  out.println("</div>");

  out.println("<div class='box'>");
   out.println(" <div class='fas fa-house-user'></div>");
   out.println("<br><h3 style='margin-top:30px;'>BEST DECOR</h3>");
  out.println("</div>");

  out.println("<div class='box'>");
    out.println("<div class='fas fa-couch'></div>");
    out.println("<br><h3 style='margin-top:30px;'>BEST FURNITURE</h3>");
  out.println("</div>");

  out.println("<div class='box'>");
    out.println("<div class='fas fa-bed'></div>");
    out.println("<br><h3 style='margin-top:30px;'>MOST COMFORTABLE</h3>");
  out.println("</div>");

  out.println("<div class='box'>");
   out.println(" <div class='fas fa-bath'></div>");
   out.println("<br><h3 style='margin-top:30px;'>BEST DESIGNS</h3>");
  out.println("</div>");

out.println("</div>");

out.println("</section>");


out.println("<br id='project'>");
out.println("<br>");
out.println("<section  class='project'>");
out.println("<br>");
  out.println("<div class='heading'>our projects</div>");
  out.println("<br>");
  out.println("<div class='box-container mx-auto'>");
  
  out.println("<div class='box'>");
    out.println("<a href='https://st.hzcdn.com/simgs/pictures/exteriors/bana-banaguni-builders-img~b201252f0c57ed4e_3-3088-1-8e8050a.jpg' title='house'>");
      out.println("<img src='https://st.hzcdn.com/simgs/pictures/exteriors/bana-banaguni-builders-img~b201252f0c57ed4e_3-3088-1-8e8050a.jpg' alt=''>");
    out.println("</a>");
  out.println("</div>");
  
 out.println("<div class='box'>");
    out.println("<a href='http://cdn.home-designing.com/wp-content/uploads/2019/04/living-room-pendant-light.jpg' title='hall'>");
      out.println("<img src='https://media.istockphoto.com/photos/mock-up-poster-frame-in-modern-interior-background-living-room-style-picture-id1354262369?b=1&k=20&m=1354262369&s=170667a&w=0&h=NSa2jV-7TGl_Kz-8RW7A_fcokos0qNPaXr8mCC_MpRs=' alt=''>");
    out.println("</a>");
  out.println("</div>");
  
  out.println("<div class='box'>");
   out.println("out.println(' <a href='https://www.modernholic.com/wp-content/uploads/2012/08/Indoor-Swimming-Pool-Luxury.jpg' title='pool'>");
      out.println("<img src='https://www.modernholic.com/wp-content/uploads/2012/08/Indoor-Swimming-Pool-Luxury.jpg' alt=''>");
    out.println("</a>");
  out.println("</div>");
  
 out.println(" <div class='box'>");
    out.println("<a href='https://www.decorpot.com/images/mobile-kitchen.jpg' title='kitchen'>");
      out.println("<img src='https://www.decorpot.com/images/mobile-kitchen.jpg' alt=''>");
    out.println("</a>");
  out.println("</div>");
  
  out.println("<div class='box'>");
    out.println("<a href='https://static.wixstatic.com/media/1dffdf_62633edc324346d6a5b686017f4d0e01~mv2.jpg/v1/fill/w_563,h_422,al_c,q_90/1dffdf_62633edc324346d6a5b686017f4d0e01~mv2.jpg' title='bath'>");
      out.println("<img src='https://static.wixstatic.com/media/1dffdf_62633edc324346d6a5b686017f4d0e01~mv2.jpg/v1/fill/w_563,h_422,al_c,q_90/1dffdf_62633edc324346d6a5b686017f4d0e01~mv2.jpg' alt=''>");
   out.println(" </a>");
  out.println("</div>");
  
  out.println("<div class='box'>");
    out.println("<a href='https://i.pinimg.com/originals/8e/19/ba/8e19ba97e4734997371a0b5b49fa822b.jpg' title='toilet'>");
      out.println("<img src='https://i.pinimg.com/originals/8e/19/ba/8e19ba97e4734997371a0b5b49fa822b.jpg' alt=''>");
    out.println("</a>");
  out.println("</div>");
  
  out.println("</div>");
  
  out.println("</section>");



out.println("<section id='contact' class='contact'>");

out.println("<h1 class='heading'>contact us</h1>");

out.println("<div class='contact-box-container mx-auto'>");

  out.println("<h3 class='contact-box' style='margin-top:20px;height:90px;width:150px;'><i class='fas fa-map-marker-alt'></i>&nbsp;&nbsp;Lucknow,INDIA -229001</h3>");
 out.println("<h3 class='contact-box' style='margin-top:20px;height:90px;width:150px;'><i class='fas fas fa-envelope-alt'></i>&nbsp;&nbsp;garima@gmail.com</h3>");
 out.println("<h3 class='contact-box' style='margin-top:20px;height:90px;width:150px;'><i class='fas fas fa-phone-alt'></i>&nbsp;&nbsp;+9100000000</h3>");


out.println("</div>");

out.println("<div class='form-container mx-auto inputBox'>");

out.println("<form method='post' action='contactConf' >");
                        out.println("<table style='text-align:center !important;margin-top:15px;' margin-left:10px;' width='100%' cellpadding='7' style='color:white;padding-left:15px !important'>");
            
            
            
            out.println("</table>");
            out.println("<input type='text' name='name' placeholder='name' id='name'>");
            
            out.println("<input type='text' name='number' placeholder='Phone No.'  id='number' style='width:50%'>");
             out.println("<input type='text' name='email' placeholder='email' id='email' style='width:100%' >");
           out.println("<th><textarea type='text' cols='15' rows='5' name='message' id='message' style='height:70px;'  placeholder='Message'></textarea></th>");
       out.println("<th><input type='submit' value='SUBMIT'></th>");
           
            out.println("</form>");
            
out.println("<section class='container-fluid footer'>");

out.println("<div class='row'>");



out.println("<div class='col-md-3'>");
 out.println(" <h2>our location</h2>");
 out.println(" <div class='list'>");
    out.println("<a href='#'>Lucknow</a>");
    out.println("<a href='#'>Barabanki</a>");
    out.println("<a href='#'>Raebareli</a>");
    out.println("<a href='#'>Noida</a>");
    
  out.println("</div>");
out.println("</div>");

out.println("<div class='col-md-3'>");
 out.println(" <h2>follow us</h2>");
  out.println("<div class='list'>");
   out.println(" <a href='#'>facebook</a>");
    out.println("<a href='#'>twitter</a>");
    out.println("<a href='#'>instagram</a>");
    out.println("<a href='#'>pinterest</a>");
  out.println("</div>");
out.println("</div>");

out.println("<div class='col-md-3 text-center text-md-left letter'>");
  out.println("<h2>Want Our All Catalouge Designs!</h2>");

  
  
  out.println("<form method='post' action='requestConf' >");
  out.println("<input type='email' name='email' placeholder='Enter your email'>");
  out.println("<input type='submit' placeholder='Get it on your email'>");
  out.println("</form>");
out.println("</div>");


out.println("</section>");
out.println("</section>");

 
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
        }
  
    }
}
    
    