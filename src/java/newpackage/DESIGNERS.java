
package newpackage;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import static javax.management.Query.div;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class DESIGNERS extends HttpServlet {

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


out.println("* html .clearfix {height: 1%;}.clearfix {display: block;}a, abbr, acronym, address, applet, article, aside, audio,b, blockquote, big, body,center, canvas, caption, cite, code, command,datalist, dd, del, details, dfn, dl, div, dt, em, embed,fieldset, figcaption, figure, font, footer, form, h1, h2, h3, h4, h5, h6, header, hgroup, html,i, iframe, img, ins,kbd, keygen,label, legend, li, meter,nav,object, ol, output,p, pre, progress,q, , samp, section, small, span, source, strike, strong, sub, sup,table, tbody, tfoot, thead, th, tr, tdvideo, tt,u, ul, var{background: transparent;border: 0 none;font-size: 100%;margin: 0;padding: 0;border: 0;outline: 0;vertical-align: top; }ol, ul {list-style: none;}blockquote, q {quotes: none;}table, table td { padding:0;border:none;border-collapse:collapse;}img {vertical-align:top; }embed { vertical-align:top;}");









out.println("/* Getting the new tags to behave /article, aside, audio, canvas, command, datalist, details, embed, figcaption, figure, footer, header, hgroup, keygen, meter, nav, output, progress, section, source, video {display:block}mark, rp, rt, ruby, summary, time {display:inline}/ Global properies ======================================================== */html {width:100%}body {font-family:Arial, Helvetica, sans-serf;font-size:100%;color:#262626;min-width:980px;background:#fff}.ic, .ic a {border:0;float:right;background:#fff;color:#f00;width:50%;line-height:10px;font-size:10px;margin:-220% 0 0 0;overflow:hidden;padding:0}.bg-top-shadow {width:100%; background:url(../imagesbg-top-shadow.png) center bottom repeat-x; padding:40px 0 52px}#page3 .bg-top-shadow {padding:40px 0 35px}#page4 .bg-top-shadow {padding:40px 0 60px}#page5 .bg-top-shadow {padding:40px 0 62px}");
out.println(".bg-top {width:100%background:url(../images/bg-top-tail.jpg) center top repeat-x}.bg-top-2 ");
out.println("{width:100%;background:url(../images/bg-top-tail2.jpg) out.println('center top peat-y}.bg {width:100%; background:url(../images/bg-top.jpg) center top no-repeat}.bg-bot {width:100%; background:url(../images/bg-bot-tail.gif) center top repeat-x #fff; padding:30px 0 55px}#page3 .bg-bot, #page4 .bg-bot {padding:30px 0 49px}.main {width:980px;padding:0;margin:0 auto;font-size:0.8125em;line-height:1.6153em}a {color:#ff9601; outline:none}a:hover {text-decoration:none}.col-1, .col-2 {float:left}.wrapper {width:100%; overflow:hidden; position:relative}.extra-wrap {overflow:hidden}p {margin-bottom:18px}.p0 {margin-bottom:0px}.p1 {margin-bottom:8px}.p2 {margin-bottom:15px}.p3 {margin-bottom:30px}.p4 {margin-bottom:40px}.p5 {margin-bottom:50px}.reg {text-transform:uppercase}");
out.println(".fleft {float:left}.fright {float:right}.alignright {text-align:right}.aligncenter {text-align:center}");
out.println(".it {font-style:italic}.letter {letter-spacing:-1px}.color-1 {color:#fff}.color-2 {color:#000}.color-3 {color:#262626}.color-4 {color:#ff9601}");
out.println(".frame {padding:10px;background:#fff;box-shadow: 3px 5px 8px rgba(0,0,0,0.70);-moz-box-shadow: 3px 5px 8px rgba(0,0,0,0.70);-webkit-box-shadow: 3px 5px 8px rgba(0,0,0,0.70)}.frame2 {padding:9px;background:#fff;border:1px solid #e5e5e5}/************boxes***********/.margin-bot {margin-bottom:35px}.spacing {margin-right:35px}.indent-top {padding-top:13px}.indent-top2 {padding-top:4px}.indent-right {padding-right:30px}.indent-right2 {padding-right:10px}.indent-left {padding-left:30px}.indent {padding:0 10px 0 30px}.indent2 {padding-left:50px}.indent3 {padding:0 15px}.indent-bot {margin-bottom:20px}.indent-bot2 {margin-bottom:30px}.indent-bot3 {margin-bottom:45px}.inner {padding:0 55px 0 28px}.inner-2 {padding:0 45px 0 42px}");
out.println(".img-indent-bot {margin-bottom:25px}.img-indent {float:left; margin:0 22px 8px 0}	.img-indent2 {float:left; margin:0 30px 0px 0}	.img-indent3 {float:left; margin:0 23px 0px 0}	.img-indent-r {float:right; margin:0 0px 0px 40px}");	
out.println(".prev-indnt-bot {margm:10px}	.prev-indent-bot2 {margin-bottom:5px}	.buttons a:hover {cursor:pointer}.menu li a, .list-1 li a, .list-2 li a, .link, .button, .logo {text-decoration:none}");
out.println("header {width:100%;position:relative;z-index:2}.row-1 {width:100%;height:71px;background:url(../images/row1-top-tail.gif) left top repeat-x}.row-2 {width:100%;min-height:101px;background:url(../images/row2-tail.gif) left top repeat-x #fff}h1 {padding:15px 0 0 0;position:relative;font-weight:normal;text-transform:uppercase;margin-left:-4px;font-family:'Trebuchet MS', Arial, Helvetica, sans-serif}h1 span {display:inline-block;	font-size:28px;	line-height:1.2em;	color:#949494;	letter-spacing:-1px;	padding:29px 0 0 4px}");
out.println(".logo {display:inline-block;font-size:60px;line-height:1.2em;;color:#262626;cursor:pointer;letter-spacing:-3px}");
	out.println(".logo strong {color:#ff9601; font-weight:normal}");

out.println(".menu {padding:0;width:100%}");
out.println(".menu li {float:left;position:relative}");
	out.println(".menu li:first-child {background:url(../images/menu-a-tail.gif) 0 -71px no-repeat}");
out.println(".menu li a {font-family:'Trebuchet MS'', Arial, Helvetica, sans-serif;display:block;width:188px;font-size:21px;line-height:1.238em;padding:21px 0 24px 0;color:#262626;text-align:center;text-transform:uppercase;background:url(../images/menu-a-tail.gif) right -71px no-repeat;letter-spacing:-1px}");
out.println(".menu li a:hover {color:#fff;background-position:left top;background-repeat:repeat-x;background-color:#000}");

out.println("#search-form {padding:35px 0px 0 37px}");
out.println("#search-form fieldset {position:relative; width:100%; display:block; overflow:hidden}");
out.println("#search-form .search-field {width:181px;height:29px;background:url(../images/search-input-tail.gif) 0 0 repeat-x;border:1px solid #d7d7d7}");
out.println("#search-form input {width:137px;font-size:13px;line-height:1.23em;padding:6px 10px 7px;font-family:Arial, Helvetica, sans-serif;background:none;border:none;margin:0;outline:none}");
out.println("#search-form .search-button {display:block;width:17px;height:16px;text-indent:-5000px;background:url(../images/search-icon.gif) 0 0 no-repeat;position:absolute;right:8px;top:7px}");

out.println("#content {width:100%;padding:0;position:relative;z-index:1}");
out.println(".gallery {padding:20px 0 26px 20px;background:#fff;box-shadow: 0px 5px 8px rgba(0,0,0,0.70);-moz-box-shadow: 0px 5px 8px rgba(0,0,0,0.70);-webkit-box-shadow: 0px 5px 8px rgba(0,0,0,0.70)}");
out.println(".padding {padding:30px 0px 38px}");

out.println(" div.content {/* The display of content is enabled using jQuery so that the slideshow content won't display unless javascript is enabled."); 
	out.println("display: none;width: 620px;height: 403px;margin:  0;padding: 0px;float: left;overflow: hidden}");
out.println(" div.content img {position: relative;z-index: 2}");
 out.println("div.content a, div.navigation a {text-decoration: none;display:block;position:relative;cursor:pointer}");
	out.println("div.content a img, div.navigation a img {position:relative;	z-index:1}");
	out.println("div.content a span, div.navigation a span {display:block;	width:140px;	height:121px;	background:#000;	position:absolute;	left:0;	top:0;	z-index:2}");
	out.println("div.content a span.selected,");
	out.println("div.navigation a span.selected {display:none !important}");
 out.println("div.content a:focus, div.content a:hover, div.content a:active {text-decoration: underline}");
 out.println("div.controls {}div.controls a {padding: 0px}div.ss-controls {float: left;display:none}div.nav-controls {position:absolute;left:0px;width:596px;bottom:0px;z-index: 1}div.nav-controls a.prev {background:url(../images/prev.gif) no-repeat 0 0;width:39px;height:39px;text-indent:-5000px;position:absolute;bottom:2px;left:0;z-index:11}div.nav-controls a.prev:hover {background:url(../images/prev-h.gif) no-repeat 0 0}");
 out.println("div.nav-controls a.next {background:url(../images/next.gif) no-repeat 0 0;width:39px;height:39px;text-indent:-5000px;position:absolute;bottom:2px;right:0;z-index:11}div.nav-controls a.next:hover {background:url(../images/next-h.gif) no-repeat 0 0}div.slideshow-container {position: relative;height: 403px; /* This should be set to be at least the height of the largest image in the slideshow /z-index:1}div.loader {position: absolute;top: 0;left: 0;background-image:url(images/loader.gif);background-repeat: no-repeat;background-position: center;width: 592px;height: 470px; / This should be set to be at least the height of the largest image in the slideshow */}");
 out.println("div.slideshow {}div.slideshow span.image-wrapper {display: block;width: 620px;height: 403px;position:absolute;left:0;top:0}div.slideshow a.advance-link {display: block;width: 620px;height: 403px; /* This should be set to be at least the height of the largest image in the slideshow */	padding: 0;margin: 0}div.slideshow a.advance-link img {padding:0;margin:0;display:block;position:absolute;left:0;top:0}div.slideshow a.advance-link:hover, div.slideshow a.advance-link:active, div.slideshow a.advance-link:visited {text-decoration: none}div.slideshow img {}div.download {float: right}div.caption-container {position: absolute;top: 0;left: 0;width: 596px;height: 151px}span.image-caption {display: block;position: absolute;width: 596px;height: 151px;top: 0;left: 0;z-index:10}div.caption {width: 536px;height: 128px;padding: 23px 30px 0 30px;line-height: 18px;font-size: 13px;color: #fff}");
 out.println("div.caption h5{line-height: 18px;font-size: 13px;color: #fd003f;text-transform:uppercase;font-weight:bold;text-decoration:none}div.caption h6{line-height: 18px;font-size: 13px;color: #fff;font-weight:normal;margin: 0 0 18px 0}div.image-title {}div.image-desc {}div.navigation {}div#thumbs {width: 320px;height:403px;overflow: hidden;padding: 0px 0px 0 0}ul.thumbs {float: right;margin-left:0;padding: 0;width:320px;height:auto;overflow:visible}ul.thumbs li {height: 121px;float:left;margin: 0 20px 20px 0;overflow: hidden;padding: 0;vertical-align:top}ul.thumbs li img {border: none}a.thumb:focus {outline: none}div.pagination {clear: both;text-align:center;position:relative;z-index:10}div.top.pagination {display:none}div.navigation div.bottom { display:none}div.pagination a, div.pagination span.current, div.pagination span.ellipsis {padding:0 4px;font-weight:bold;color:#fff}");
 out.println("div.pagination a:hover {text-decoration: none;color:#ffeaa8}div.pagination span.current {color:#ffeaa8}div.pagination span.ellipsis {border: none;padding: 5px 0 3px 2px}");

out.println(".quote {padding-left:30px;background:url(../images/quote.png) 0 3px no-repeat;position:relative}");
out.println(".spacer-1 {width:100%;background:url(../images/pic-1.gif) 217px 0 repeat-y}h3 {font-family:'Trebuchet MS', Arial, Helvetica, sans-serif;font-size:36px;line-height:1.2em;margin:0 0 22px 0;color:#262626;font-weight:normal;letter-spacing:-2px}h6 {color:#ff9601}.title {display:inline-block;font-family:'Trebuchet MS', Arial, Helvetica, sans-serif;font-size:49px;line-height:71px;text-transform:uppercase;letter-spacing:-3px;color:#ff9601;padding:0 25px 0 0;background:url(../images/pic-2.gif) right 0 repeat-y}.title.t2 {font-size:60px;	line-height:1.3em;	padding:0 40px 0 0;	background:url(../images/pic-3.gif) right 0 no-repeat}.tdate-1 {display:block;font-weight:bold}.border-bot {width:100%;padding-bottom:20px;background:url(../images/pic-1.gif) 0 bottom repeat-x}.box {width:100%;background:#fff;box-shadow: 0px 5px 8px rgba(0,0,0,0.70);-moz-box-shadow: 0px 5px 8px rgba(0,0,0,0.70);-webkit-box-shadow: 0px 5px px rgba(0,0,0,0.70)}");
out.println(".button {display:inline-block;padding:10px 20px 11px;color:#fff;font-family:'Trebuchet MS', Arial, Helvetica, sans-serif;font-size:18px;line-height:1.22em;background:url(../images/button-tail.gif) 0 0 repeat-x #000;text-transform:uppercase;letter-spacing:-1px}.button:hover {background:#ff9601}.list-1 li {display:inline-block;font-family:'Trebuchet MS', Arial, Helvetica, sans-serif;font-size:21px;line-height:26px;padding:0 0 10px 12px;background:url(../images/marker.png) 0 12px no-repeat;letter-spacing:-1px}.list-1 li.last {padding:0 0 0 12px}.list-1 li a:hover {color:#fff}.list-2 li {line-height:1.23em;padding:8px 0;background:url(../images/pic-1.gif) 0 bottom repeat-x}.list-2 li a {display:inline-block;	color:#262626;	padding-left:10px;	background:url(../images/marker-2.gif) 0 6px no-repeat}.list-2 li a:hover {color:#ff9601}.list-2 .last-item {background:none}");
out.println(".price-list li {width: 100%;overflow: hidden;vertical-align: top;line-height: 1.23em;padding:7px 0 9px;color: #262626;background:url(../images/pic-1.gif) 0 bottom repeat-x}.price-list li.last {background:none}.price-list li strong {background: url(../images/pic-4.gif) 0% 12px repeat-x;	display: block;	overflow: hidden}.price-list li span {float: right;	color: #262626}.price-list li a {float: left;	text-decoration: none;	color: #262626;	padding-left:10px;background:url(../images/marker-2.gif) 0 5px no-repeat}.price-list li a:hover {color:#ff9601}.link:hover {text-decoration:underline} .link-1 {display:inline-block;font-size:14px;padding-right:8px;background:url(../images/marker-3.gif) right 8px no-repeat}");
out.println(".link-1:hover {color:#fff} .text-1 {font-family:'Trebuchet MS', Arial, Helvetica, sans-serif;font-size:21px;line-height:30px;color:#ff9601;display:block;letter-spacing:-1px} .price {display:inline-block;font-family:'Trebuchet MS', Arial, Helvetica, sans-serif;font-size:35px;line-height:1.2em;letter-spacing:-2px}dl span {float:left; width:93px}dl strong {float:left; width:80px; font-weight:normal}");

out.println(".carousel {margin: 0 auto;width:940px;height:229px;overflow:hidden;position:relative}.carousel .next {display:block;height:22px;width:11px;position:absolute;right:0px;top:14px;background:url(../images/carousel-control.png) right top no-repeat;text-indent:-5000px}.carousel .prev {display:block;height:22px;width:11px;position:absolute;right:31px;top:14px;background:url(../images/carousel-control.png) left top no-repeat;text-indent:-5000px}.jCarouselLite {left:-12px !important}#carousel li {width:200px !important;height:121px !important;padding:17px 22px 27px;margin-right:-4px;background:url(../images/carousel-li-bg.png) left top no-repeat;position:relative;overflow:hidden}#carousel li a {display:block; position:relative}");
out.println("#carousel li a span {font-family:'Trebuchet MS', Arial, Helvetica, sans-serif;	letter-spacing:-2px;	display:block;	width:78px;	height:35px;	background:#fff;	color:#262626;	font-size:35px;	line-height:1.2em;	position:absolute;	left:0;	bottom:0;	overflow:hidden;	z-index:99}");

out.println("#subscribe-form {display:block}#subscribe-form .subscribe-field {background:#fbfbfb;border:1px solid #fff;width:288px;height:29px;margin-bottom:20px;box-shadow: 0px 5px 8px rgba(0,0,0,0.70);-moz-box-shadow: 0px 5px 8px rgba(0,0,0,0.70);-webkit-box-shadow: 0px 5px 8px rgba(0,0,0,0.70)}#subscribe-form input {width:268px;font-size:13px;line-height:1.23em;color:#262626;padding:6px 10px;margin:0;font-family:Arial, Helvetica, sans-serif;border:none;background:none;outline:none}");

out.println("#contact-form {display:block}#contact-form label {display:block;height:40px;overflow:hidden}#contact-form input {float:left;width:406px;font-size:13px;line-height:1.23em;color:#262626;padding:6px 10px;margin:0;font-family:Arial, Helvetica, sans-serif;border:1px solid #d9d9d9;background:#fcfcfc;outline:none}#contact-form textarea {float:left;height:192px;overflow:auto;width:776px;font-size:13px;line-height:1.23em;color:#404040;padding:6px 10px;margin:0;font-family:Arial, Helvetica, sans-serif;border:1px solid #d9d9d9;background:#fcfcfc;outline:none}.text-form {float:left;display:block;font-size:13px;line-height:1.23em;width:81px;color:#262626;font-family:Arial, Helvetica, sans-serif;padding-top:3px}.buttons {padding:18px 30px 0 0; text-align:right}.buttons a {margin-left:10px; padding:10px 42px 11px}");

out.println("footer {width:100%;padding:40px 0 33px;background:url(../images/footer-tail.gif) center top repeat-x #fff}.phone-numb {display:inline-block;font-size:42px;line-height:1.2em;font-family:'Trebuchet MS', Arial, Helvetica, sans-serif;letter-spacing:-1px;margin-top:-4px}.phone-numb span {display:inline-block;	font-size:28px;	color:#949494;	padding-top:3px}.list-services {padding:0}.list-services li {float:left;	padding:0 0 0 20px}.list-services li:first-child {padding:0}.list-services li a {display:block;width:60px;height:45px;background:url(../images/social-icons.png) left top no-repeat;}.list-services li a.item-2 {background-position:-80px 0}.list-services li a.item-3 {background-position:-160px 0}.list-services li a.item-4 {background-position:-240px 0}");
  
  
  out.println(".container_12 {margin-left: auto;margin-right: auto;width: 960px;}/* Grid >> Global----------------------------------------------------------------------------------------------------/.grid_1,.grid_2,.grid_3,.grid_4,.grid_5,.grid_6,.grid_7,.grid_8,.grid_9,.grid_10,.grid_11,.grid_12 {display:inline;float: left;position: relative;margin-left: 10px;margin-right: 10px;}/ Grid >> Children (Alpha ~ First, Omega ~ Last)----------------------------------------------------------------------------------------------------/.alpha {margin-left: 0;}.omega {margin-right: 0;}/ Grid >> 12 Columns----------------------------------------------------------------------------------------------------*/.container_12 .grid_1 {width:60px;}.container_12 .grid_2 {width:140px;}.container_12 .grid_3 {width:220px;}.container_12 .grid_4 {width:300px;}.container_12 .grid_5 {width:380px;}.container_12 .grid_6 {width:460px;}.container_12 .grid_7 {width:540px;}.container_12 .grid_8 {width:620px;}");
out.println(".container_12 .grid_9 {width:70);.contain2 .grid_10 {width:780px;}.container_12 .grid_11 {width:860px;}.container_12 .grid_12 {width:940px;}/* Prefix Extra Space >> 12 Columns---------------------------------------------------------------------------------------------------*/.container_12 .prefix_1 {padding-left:80px;}.container_12 .prefix_2 {padding-left:160px;}.container_12 .prefix_3 {padding-left:240px;}.container_12 .prefix_4 {padding-left:320px;}.container_12 .prefix_5 {padding-left:400px;}.container_12 .prefix_6 {padding-left:480px;}.container_12 .prefix_7 {padding-left:560px;}.container_12 .prefix_8 {padding-left:640px;}.container_12 .prefix_9 {padding-left:720px;}");
out.println(".container_12 .prefix_10 {padding-left:800px;}.container_12 .prefix_11 {padding-left:880px;}/* Suffix Extra Space >> 12 Columns.container_12 .suffix_1 {padding-right:80px;}.container_12 .suffix_2 {padding-right:160px;}.container_12 .suffix_3 {padding-right:240px;}.container_12 .suffix_4 {padding-right:320px;}.container_12 .suffix_5 {padding-right:400px;}.container_12 .suffix_6 {padding-right:480px;}.container_12 .suffix_7 {padding-right:560px;}.container_12 .suffix_8 {padding-right:640px;}.container_12 .suffix_9 {padding-right:720px;}.container_12 .suffix_10 {padding-right:800px;}.container_12 .suffix_11 {padding-right:880px;}");

  out.println("</style>");
out.println("</head>");
out.println("<body>");
  
  
 
out.println("<header class='header fixed-top'>");


out.println("<a style='color:#FF8D29;font-size:26px;' href='home'>HOME ADORNMENT WEB PORTAL</a>");

out.println("<nav style='height:88px;text-align:center;'>");
 out.println(" <ul>");
    out.println("<li><a href='DESIGNERS'>Our Designers</a></li>");
    out.println("<li><a href='FEEDBACK'> Feedback</a></li>");
    out.println(" <li><a href='ORDER'> Order</a></li>");
   out.println(" <li><a href='CHANGE_U_PASSWORD'>Change <br>Password</a></li>");
   out.println(" <li style='color:#FF8D29'><a style='color:#FF8D29' href='home'>LOGOUT</a></li>");

  out.println("</ul>");
out.println("</nav>");

out.println("<div class='fas fa-bars'></div>");

out.println("</header>");

out.println("<br><br>");

out.println("<br><br>");
out.println("<body style='background-image:url(https://lordnking.com/wp-content/uploads/2022/03/why-interior-design-and-architecture-matters-for-business.jpeg)'>");
   out.println("<br>");
 
       out.println("<h1 class='heading' style='margin-left:70px;'>OUR DESIGNERS</h1>");
          out.println("<img src=''>");
            
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
    