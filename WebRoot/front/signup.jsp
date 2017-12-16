<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
pageContext.setAttribute("basePath", basePath);
%>

<!DOCTYPE html>
<html lang="en">
    <head>
      <meta charset="utf-8">
      <meta http-equiv="X-UA-Compatible" content="IE=edge">
      <title>一豪酒店</title>
      <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
      <link rel="stylesheet" href="${basePath}/static/front/css/bootstrap.min.css">
      <link rel="stylesheet" href="${basePath}/static/front/css/navs.css">
      <link rel="stylesheet" href="${basePath}/static/front/css/font-awesome.min.css">
      <link rel="stylesheet" href="${basePath}/static/front/css/owl.carousel.min.css">
      <link rel="stylesheet" href="${basePath}/static/front/css/bootstrap-datetimepicker.min.css">
      <link rel="stylesheet" href="${basePath}/static/front/css/jquery-ui.min.css">
      <link rel="stylesheet" href="${basePath}/static/front/css/style.css">
      <link rel="stylesheet" href="${basePath}/static/front/css/responsive.css">
      <link type="text/css" rel="stylesheet" href="${basePath}/static/front/css/login.css" media="screen" />
    </head>
    <body>
        <div class="wrapper">
            <header class="header">
              <div class="header-bottom">
                <nav class="navbar navbar-universal navbar-custom">
                  <div class="container">
                    <div class="row">
                      <div class="col-lg-3">
                        <div class="logo"><a href="index.html" class="navbar-brand page-scroll"><img src="${basePath}/static/front/images/logo/logo.png" alt="logo"></a></div>
                      </div>
                      <div class="col-lg-9">
                        <div class="collapse navbar-collapse navbar-main-collapse">
                          <ul class="nav navbar-nav navbar-right">
                            <li><a href="${basePath}/front/index.jsp">主页</a></li>
                              <li><a href="${basePath}/front/rooms.jsp">房间</a></li>
                            <li><a href="${basePath}/front/login.jsp">登录</a></li>
                            <li><a href="${basePath}/front/signup.jsp">注册</a></li>
                          </ul>
                        </div>
                      </div>
                    </div>
                  </div>
                </nav>
              </div>
            </header>
            <section>
                <div>
                    <div style="width:600px;margin:30px auto;">
                        <form action="/sys/booking/save.action" method="post">
                            <h3 style="font-size:20px;">姓名:</h3>
                            <input type="text" class="form-control" style="margin:10px 0px;" name="customerName">
                            <h3 style="font-size:20px;">性别:</h3>
                            <input type="text" class="form-control" style="margin:10px 0px;" name="customerSex">
                            <h3 style="font-size:20px;">电话号码:</h3>
                            <input type="text" class="form-control" style="margin:10px 0px;" name="customerPhone">
                            <h3 style="font-size:20px;">生日:</h3>
                            <input type="text" class="form-control" style="margin:10px 0px;" name="birthday">
                            <h3 style="font-size:20px;">身份证:</h3>
                            <input type="text" class="form-control" style="margin:10px 0px;" name="customerCard">
                            <h3 style="font-size:20px;">地址:</h3>
                            <input type="text" class="form-control" style="margin:10px 0px;" name="customerAddress">
                            <input type="submit" class="btn btn-default " value="&nbsp;&nbsp;&nbsp;&nbsp;注册&nbsp;&nbsp;&nbsp;&nbsp;" style="width:600px;margin:10px 0px;">
                        </form>
                    </div>
                </div>
            </section>
            <footer class="footer">
    <div class="footer-top">
      <div class="container">
        <div class="row">
          <div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
            <div class="footer-top_logo"><a href="index.html"><img src="${basePath}/static/front/images/logo/logo.png" alt="Footer logo"></a></div>
            <div class="footer-top_txt">
              <p>一豪大酒店是一间五星级精品商务综合型酒店。屹立于东莞市寮步镇，地处海珠广场商业繁华地带，购物、娱乐方便快捷。酒店位于各交通网络之交汇点，是商旅人士云集之处。</p>
            </div>
            <div class="footer-top_address">
                <div><i class="fa fa-phone"></i> 电话： <span>0769 - 8888888</span></div>
                <div><i class="fa fa-envelope-o"></i> E-mail: <span><a href="mailto:support@email.com">yihao@email.com</a></span></div>
                <div><i class="fa fa-home"></i> 地址: <span>东莞市寮步镇文昌路2号</span></div>
            </div>
          </div>
          <div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
            <div class="footer-top_rooms">
              <ul>
                <li>
                  <div class="rooms_img">
                    <a href="blog-detail.html"><img src="${basePath}/static/front/images/footer/1.jpg" alt=""></a>
                  </div>
                  <div class="rooms_info">
                    <div class="rooms_t"><a href="blog-detail.html">豪华套房</a></div>
                    <div class="rooms_props">3 床  /  Wi-Fi  /  2 - 洗手间<span>￥399</span></div>
                  </div>
                </li>
                <li>
                  <div class="rooms_img">
                    <a href="blog-detail.html"><img src="${basePath}/static/front/images/footer/2.jpg" alt=""></a>
                  </div>
                  <div class="rooms_info">
                    <div class="rooms_t"><a href="blog-detail.html">总统套房</a></div>
                    <div class="rooms_props">4 床  /  Wi-Fi  /  3 - 洗手间<span>￥999</span></div>
                  </div>
                </li>
                <li>
                  <div class="rooms_img">
                    <a href="blog-detail.html"><img src="${basePath}/static/front/images/footer/3.jpg" alt=""></a>
                  </div>
                  <div class="rooms_info">
                    <div class="rooms_t"><a href="blog-detail.html">水疗房</a></div>
                    <div class="rooms_props">2 床  /  Wi-Fi  /  2 - 洗手间<span>￥599</span></div>
                  </div>
                </li>
              </ul>
            </div>
          </div>
          <div class="col-lg-4 col-md-4 col-sm-12 marg-sm-50 col-xs-12">
            <div class="footer-top_contact_form">
              <div class="contact_form_t">留言表</div>
                  <form action="mail.php" method="POST" class="row form-horizontal form-wizzard">
                    <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
                        <input type="text" name="name" class="form-control" placeholder="您的名字 ">
                    </div>
                    <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
                        <input type="email" name="email" class="form-control" placeholder="Email">
                    </div>
                    <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                      <textarea rows="6" name="message" class="form-control" placeholder="留言信息"></textarea>
                    </div>
                    <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 text-right">
                      <input type="submit" value="提交" class="btn btn-default">
                    </div>
                  </form>
                </div>
            </div>
          </div>
        </div>
      </div>
    <div class="footer-bottom">
      <div class="container">
        <div class="row">
          <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
            <div class="footer-bottom_copy">Copyright &copy; 2017.Company name All rights reserved.</div>
          </div>
          <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
            <div class="footer-bottom_links">
              <a class="active" href="index.html">主页</a>
              <a href="blog.html">新浪微博</a>
              <a href="wizzard-step1.html">预订</a>
              <a href="#">联系我们</a>
            </div>
          </div>
        </div>
      </div>
    </div>
  </footer>
        </div>
    </body>
</html>