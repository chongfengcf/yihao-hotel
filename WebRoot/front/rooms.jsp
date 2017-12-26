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
    <%@ include file="baseJsp.jsp" %>
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
    <%@ include file="footer.jsp" %>
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
