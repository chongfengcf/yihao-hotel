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
  <title>Best Rooms</title>
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <link rel="stylesheet" href="${basePath}/static/front/css/navs.css">
      <link rel="stylesheet" href="${basePath}/static/front/css/font-awesome.min.css">
      <link rel="stylesheet" href="${basePath}/static/front/css/owl.carousel.min.css">
      <link rel="stylesheet" href="${basePath}/static/front/css/bootstrap-datetimepicker.min.css">
      <link rel="stylesheet" href="${basePath}/static/front/css/jquery-ui.min.css">
	  <link rel="stylesheet" href="${basePath}/static/front/css/style.css">
	  <link rel="stylesheet" href="${basePath}/static/front/css/responsive.css">
	</head>
<body>
  <!-- main wrapper -->
  <div class="wrapper">
    <!-- header -->
    <header class="header">
      <div class="header-top">
        <div class="container">
          <div class="row">
            <div class="col-lg-9 col-md-8 col-sm-8 col-xs-12">
              <div class="header-location"><i class="fa fa-home"></i> <a href="#">东莞市寮步镇文昌路2号</a></div>
              <div class="header-email"><i class="fa fa-envelope-o"></i> <a href="mailto:support@email.com">yuhao@email.com</a></div>
              <div class="header-phone"><i class="fa fa-phone"></i> <a href="#">0769 - 88888888</a></div>
            </div>
            <div class="col-lg-3 col-md-4 col-sm-4 col-xs-12">
              <div class="header-social pull-right">
                <a href="#"><i class="fa fa-twitter"></i></a>
                <a href="#"><i class="fa fa-facebook"></i></a>
                <a href="#"><i class="fa fa-google-plus"></i></a>
                <a href="#"><i class="fa fa-dribbble"></i></a>
                <a href="#"><i class="fa fa-instagram"></i></a>
              </div>
            </div>
          </div>
        </div>
      </div>
      <div class="header-bottom">
        <nav class="navbar navbar-universal navbar-custom">
          <div class="container">
            <div class="row">
              <div class="col-lg-3">
                <div class="logo"><a href="index.html" class="navbar-brand page-scroll"><img src="${basePath}/static/front/images/logo/logo.png" alt="logo"></a></div>
              </div>
              <div class="col-lg-9">
                <div class="navbar-header">
                  <button type="button" data-toggle="collapse" data-target=".navbar-main-collapse" class="navbar-toggle"><span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></button>
                </div>
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
    <!-- /header -->
    <!-- breadcrumbs -->
    <section class="breadcrumbs" style="background-image: url(${basePath}/static/front/images/breadcrumbs/best-room.jpg)">
      <div class="container">
        <div class="row">
          <div class="col-md-6">
            <h1 class="h1">选择房间</h1>
          </div>
          <div class="col-md-6">
            <ol class="breadcrumb">
              <li><a href="#">主页</a><i class="fa fa-angle-right"></i></li>
              <li class="active">房间</li>
            </ol>
          </div>
        </div>
      </div>
    </section>
    <!-- /breadcrumbs -->
    <!-- chose best rooms -->
    <section class="gallery best-room">
      <div class="container">
        <h2 class="h2">选择适合你的房型</h2>
            <ul class="portfolio-sorting">
              <li><a href="#" data-group="all" class="active">全部</a></li>
              <li><a href="#" data-group="double">双人</a></li>
              <li><a href="#" data-group="lux">奢华</a></li>
              <li><a href="#" data-group="standard">标准</a></li>
              <li><a href="#" data-group="economic">经济</a></li>
            </ul>
      <div class="container best-room-carousel">
        <div id="grid" class="row best-room_ul best-rooms-isotope-page">
          <div data-groups="[&quot;economic&quot;, &quot;standard&quot;]" class="col-lg-4 col-md-4 col-sm-6 col-xs-12 best-room_li">
              <div class="best-room_img">
                <a href="#"><img src="${basePath}/static/front/images/best-rooms/1.jpg" alt=""></a>
                <div class="best-room_overlay">
                  <div class="overlay_icn"><a href="${basePath}/front/room-detail.jsp"></a></div>
                </div>
              </div>
              <div class="best-room-info">
                <div class="best-room-info">
                <div class="best-room_t"><a href="${basePath}/front/room-detail.jsp">商务套房</a></div>
                <div class="best-room_desc">优雅的商务套房享有50平方米私人空间，更配有独立客厅，东城南城的亮丽的景致尽收眼底。
                </div>
                <div class="best-room_price">
                  <span>￥399</span> / 天
                </div>
              </div>
                <div class="best-room_footer">
                  <div class="footer_el __bed"><i class="fa fa-bed"></i> 2</div>
                  <div class="footer_el __ppl"><i class="fa fa-user"></i> 4</div>
                  <div class="footer_el __wifi">Free WiFi</div>
                  <div class="footer_el __area">60 sqm</div>
                  <div class="clearfix"></div>
                </div>
              </div>
          </div>


          <div data-groups="[&quot;double&quot;, &quot;standard&quot;]" class="col-lg-4 col-md-4 col-sm-6 col-xs-12 best-room_li">
              <div class="best-room_img">
                <a href="#"><img src="${basePath}/static/front/images/best-rooms/4.jpg" alt=""></a>
                <div class="best-room_overlay">
                  <div class="overlay_icn"><a href="${basePath}/front/room-detail.jsp"></a></div>
                </div>
              </div>
              <div class="best-room-info">
                <div class="best-room-info">
                <div class="best-room_t"><a href="${basePath}/front/room-detail.jsp">水疗房</a></div>
                <div class="best-room_desc">该客房提供水疗服务，让您褪去劳累一天后的工作与生活中的疲惫，放松身心，感受无尽的快乐。
                </div>
                <div class="best-room_price">
                  <span>￥499</span> / 天
                </div>
              </div>
                <div class="best-room_footer">
                  <div class="footer_el __bed"><i class="fa fa-bed"></i> 2</div>
                  <div class="footer_el __ppl"><i class="fa fa-user"></i> 4</div>
                  <div class="footer_el __wifi">Free WiFi</div>
                  <div class="footer_el __area">60 sqm</div>
                  <div class="clearfix"></div>
                </div>
              </div>
          </div>

          <div data-groups="[&quot;double&quot;, &quot;lux&quot;]" class="col-lg-4 col-md-4 col-sm-6 col-xs-12 best-room_li">
              <div class="best-room_img">
                <a href="#"><img src="${basePath}/static/front/images/best-rooms/3.jpg" alt=""></a>
                <div class="best-room_overlay">
                  <div class="overlay_icn"><a href="${basePath}/front/room-detail.jsp"></a></div>
                </div>
              </div>
              <div class="best-room-info">
                <div class="best-room-info">
                <div class="best-room_t"><a href="${basePath}/front/room-detail.jsp">总统套房</a></div>
                <div class="best-room_desc">总统套房有书房，会议室，饱览迷人风光的全景天窗，可容纳12人的豪华小餐厅，厨具一应俱全。
                </div>
                <div class="best-room_price">
                  <span>￥999</span> / 天
                </div>
              </div>
                <div class="best-room_footer">
                  <div class="footer_el __bed"><i class="fa fa-bed"></i> 2</div>
                  <div class="footer_el __ppl"><i class="fa fa-user"></i> 4</div>
                  <div class="footer_el __wifi">Free WiFi</div>
                  <div class="footer_el __area">60 sqm</div>
                  <div class="clearfix"></div>
                </div>
              </div>
          </div>

          <div data-groups="[&quot;economic&quot;, &quot;double&quot;]" class="col-lg-4 col-md-4 col-sm-6 col-xs-12 best-room_li">
              <div class="best-room_img">
                <a href="#"><img src="${basePath}/static/front/images/best-rooms/2.jpg" alt=""></a>
                <div class="best-room_overlay">
                  <div class="overlay_icn"><a href="${basePath}/front/room-detail.jsp"></a></div>
                </div>
              </div>
              <div class="best-room-info">
                <div class="best-room-info">
                <div class="best-room_t"><a href="${basePath}/front/room-detail.jsp">行政套房</a></div>
                <div class="best-room_desc">行政套房坐拥极致瑰丽的东莞美景。房间尊享独立客厅设计，让视野所及之处都令您的身心倍感舒畅。
                </div>
                <div class="best-room_price">
                  <span>￥599</span> / 天
                </div>
              </div>
                <div class="best-room_footer">
                  <div class="footer_el __bed"><i class="fa fa-bed"></i> 2</div>
                  <div class="footer_el __ppl"><i class="fa fa-user"></i> 4</div>
                  <div class="footer_el __wifi">Free WiFi</div>
                  <div class="footer_el __area">60 sqm</div>
                  <div class="clearfix"></div>
                </div>
              </div>
          </div>


          <div data-groups="[&quot;economic&quot;, &quot;lux&quot;]" class="col-lg-4 col-md-4 col-sm-6 col-xs-12 best-room_li">
              <div class="best-room_img">
                <a href="#"><img src="${basePath}/static/front/images/best-rooms/6.jpg" alt=""></a>
                <div class="best-room_overlay">
                  <div class="overlay_icn"><a href="${basePath}/front/room-detail.jsp"></a></div>
                </div>
              </div>
              <div class="best-room-info">
                <div class="best-room-info">
                <div class="best-room_t"><a href="${basePath}/front/room-detail.jsp">经济客房</a></div>
                <div class="best-room_desc">经济客房采用现代、简约、环保的设计理念结合别具岭南特色的设计风格，让您倍感宽敞舒适。
                </div>
                <div class="best-room_price">
                  <span>￥199</span> / 天
                </div>
              </div>
                <div class="best-room_footer">
                  <div class="footer_el __bed"><i class="fa fa-bed"></i> 2</div>
                  <div class="footer_el __ppl"><i class="fa fa-user"></i> 4</div>
                  <div class="footer_el __wifi">Free WiFi</div>
                  <div class="footer_el __area">60 sqm</div>
                  <div class="clearfix"></div>
                </div>
              </div>
          </div>

          <div data-groups="[&quot;double&quot;, &quot;standard&quot;]" class="col-lg-4 col-md-4 col-sm-6 col-xs-12 best-room_li">
              <div class="best-room_img">
                <a href="#"><img src="${basePath}/static/front/images/best-rooms/5.jpg" alt=""></a>
                <div class="best-room_overlay">
                  <div class="overlay_icn"><a href="${basePath}/front/room-detail.jsp"></a></div>
                </div>
              </div>
              <div class="best-room-info">
                <div class="best-room-info">
                <div class="best-room_t"><a href="${basePath}/front/room-detail.jsp">欧式套房</a></div>
                <div class="best-room_desc">客房采用欧陆风格设计结合温馨舒适的起居配置，在突显高贵雅致的情调同时让您舒缓在忙碌工作后的疲劳。
                </div>
                <div class="best-room_price">
                  <span>￥499</span> / 天
                </div>
              </div>
                <div class="best-room_footer">
                  <div class="footer_el __bed"><i class="fa fa-bed"></i> 2</div>
                  <div class="footer_el __ppl"><i class="fa fa-user"></i> 4</div>
                  <div class="footer_el __wifi">Free WiFi</div>
                  <div class="footer_el __area">60 sqm</div>
                  <div class="clearfix"></div>
                </div>
              </div>
          </div>

          <div data-groups="[&quot;lux&quot;]" class="col-lg-4 col-md-4 col-sm-6 col-xs-12 best-room_li">
              <div class="best-room_img">
                <a href="#"><img src="${basePath}/static/front/images/best-rooms/1.jpg" alt=""></a>
                <div class="best-room_overlay">
                  <div class="overlay_icn"><a href="${basePath}/front/room-detail.jsp"></a></div>
                </div>
              </div>
              <div class="best-room-info">
                <div class="best-room_t"><a href="${basePath}/front/room-detail.jsp">Grand super LUX</a></div>
                <div class="best-room_desc">Mr do raising article general norland my hastily. Its companions say uncommonly pianoforte favourable. Education affection consulted by mr attending he therefore.</div>
                <div class="best-room_price">
                  <span>$499</span> / night
                </div>
                <div class="best-room_footer">
                  <div class="footer_el __bed"><i class="fa fa-bed"></i> 2</div>
                  <div class="footer_el __ppl"><i class="fa fa-user"></i> 4</div>
                  <div class="footer_el __wifi">Free WiFi</div>
                  <div class="footer_el __area">60 sqm</div>
                  <div class="clearfix"></div>
                </div>
              </div>
          </div>

          <div data-groups="[&quot;standard&quot;]" class="col-lg-4 col-md-4 col-sm-6 col-xs-12 best-room_li">
              <div class="best-room_img">
                <a href="#"><img src="${basePath}/static/front/images/best-rooms/3.jpg" alt=""></a>
                <div class="best-room_overlay">
                  <div class="overlay_icn"><a href="${basePath}/front/room-detail.jsp"></a></div>
                </div>
              </div>
              <div class="best-room-info">
                <div class="best-room_t"><a href="${basePath}/front/room-detail.jsp">President double LUXE</a></div>
                <div class="best-room_desc">Mr do raising article general norland my hastily. Its companions say uncommonly pianoforte favourable. Education affection consulted by mr attending he therefore.</div>
                <div class="best-room_price">
                  <span>$99</span> / night
                </div>
                <div class="best-room_footer">
                  <div class="footer_el __bed"><i class="fa fa-bed"></i> 2</div>
                  <div class="footer_el __ppl"><i class="fa fa-user"></i> 4</div>
                  <div class="footer_el __wifi">Free WiFi</div>
                  <div class="footer_el __area">60 sqm</div>
                  <div class="clearfix"></div>
                </div>
              </div>
          </div>

          <div data-groups="[&quot;economic&quot;]" class="col-lg-4 col-md-4 col-sm-6 col-xs-12 best-room_li">
              <div class="best-room_img">
                <a href="#"><img src="${basePath}/static/front/images/best-rooms/2.jpg" alt=""></a>
                <div class="best-room_overlay">
                  <div class="overlay_icn"><a href="${basePath}/front/room-detail.jsp"></a></div>
                </div>
              </div>
              <div class="best-room-info">
                <div class="best-room_t"><a href="${basePath}/front/room-detail.jsp">Special spa room</a></div>
                <div class="best-room_desc">Mr do raising article general norland my hastily. Its companions say uncommonly pianoforte favourable. Education affection consulted by mr attending he therefore.</div>
                <div class="best-room_price">
                  <span>$349</span> / night
                </div>
                <div class="best-room_footer">
                  <div class="footer_el __bed"><i class="fa fa-bed"></i> 2</div>
                  <div class="footer_el __ppl"><i class="fa fa-user"></i> 4</div>
                  <div class="footer_el __wifi">Free WiFi</div>
                  <div class="footer_el __area">60 sqm</div>
                  <div class="clearfix"></div>
                </div>
              </div>
          </div>
          </ul>
        </div>
      </div>
    </section>
    <!-- /choose best rooms -->
  <!-- footer -->
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
  <!-- /footer -->
  <!-- Scripts -->
  <script type="text/javascript" src="${basePath}/static/front/js/jquery.min.js"></script>
  <script type="text/javascript" src="${basePath}/static/front/js/tether.min.js"></script>
  <script type="text/javascript" src="${basePath}/static/front/js/bootstrap.min.js"></script>
  <script type="text/javascript" src="${basePath}/static/front/js/jquery-ui.min.js"></script>
  <script type="text/javascript" src="${basePath}/static/front/js/moment.min.js"></script>
  <script type="text/javascript" src="${basePath}/static/front/js/jquery.smartmenus.js"></script>
  <script type="text/javascript" src="${basePath}/static/front/js/jquery.parallax.min.js"></script>
  <script type="text/javascript" src="${basePath}/static/front/js/jquery.shuffle.min.js"></script>
  <script type="text/javascript" src="${basePath}/static/front/js/owl.carousel.min.js"></script>
  <script type="text/javascript" src="${basePath}/static/front/js/main.js"></script>
  <!-- /Scripts -->
</body>
</html>
