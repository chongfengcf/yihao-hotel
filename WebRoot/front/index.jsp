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
    <!-- parallax -->
      <section class="bg-parallax parallax-window">
        <div class="overlay"></div>
        <div class="container">
          <div class="row">
            <div class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
              <div class="parallax-text">
                <h2 class="parallax_t __white">一豪 · 五星级酒店</h2>
                <h2 class="parallax_t __green">东莞市寮步镇文昌路2号</h2>
                <p>酒店拥有精致客房、一流的会议空间、商务友好设施和非凡的服务，可为宾客提供完美的休闲住宿体验。 客房配有豪华床上用品、高速上网接入、全尺寸桌子和符合人体工学原理的座椅。 您可享受 Asia Bistro 餐厅和 Alto Vino 意式餐厅，也可到 Pulp 酒吧品一杯葡萄酒，还可到 YI Ho 中餐厅体验传统粤菜。</p>
              </div>
            </div>
            <!-- planner-->
            <div class="col-lg-6 col-md-6 col-sm-12 col-xs-12 planner">
              <div class="planner-block">
                <form action="${basePath}/sys/booking/bookingRoom.action" method="post" class="form-planner form-horizontal">
                  <div class="row">
                    <div class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
                      <div class="form-group">
                        <label>入住时间</label>
                        <input class="form-control __plannerInput" id="datetimepicker1" type="text" name="arrivalDate">
                      </div>
                    </div>
                  </div>
                  <div class="row">
                    <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                      <div class="form-group">
                          <label>房间类型</label>
                          <div class="theme-select">
                            <select id="roomtype" name="roomTypeId" class="form-control __plannerSelect">
                              <option value="">选择房间类型</option>
                            </select>
                          </div>
                      </div>
                    </div>
                  </div>
                  <div class="row">
                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                      <div class="form-group">
                          <label>人数</label>
                          <div class="theme-select">
                            <select class="form-control __plannerSelect">
                              <option value="">1</option>
                              <option value="">2</option>
                              <option value="">3</option>
                              <option value="">4</option>
                              <option value="">5</option>
                            </select>
                          </div>
                        </div>
                      </div>
                    <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
                      <div class="form-group">
                          <label>电话号码</label>
                          <input type="text" name="vipPhone" class="form-control">
                        </div>
                      </div>
                  </div>
                  <div class="row">
                    <div class="col-lg-12 col-md-12 col-sm-12">
                      <div >
                        <input type="submit" class="btn btn-default " value="&nbsp;&nbsp;&nbsp;&nbsp;预定房间&nbsp;&nbsp;&nbsp;&nbsp;">
                      </div>
                    </div>
                  </div>
                </form>
              </div>
            </div>
            <!-- /planner-->
          </div>
        </div>
    </section>
    <!-- /parallax -->
    <!-- chose best rooms -->
    <section class="best-room">
      <div class="container">
        <div class="title-main">
          <h2 class="h2">一豪酒店<span class="title-secondary">特色客房</span></h2>
        </div>
        <div class="best-room-carousel">
          <ul class="row best-room_ul">
            <li class="col-lg-4 col-md-4 col-sm-6 col-xs-12 best-room_li">
              <div class="best-room_img">
                <a href="#"><img src="${basePath}/static/front/images/best-rooms/1.jpg" alt=""></a>
                <div class="best-room_overlay">
                  <div class="overlay_icn"><a href="${basePath}/front/room-detail.jsp"></a></div>
                </div>
              </div>
              <div class="best-room-info">
                <div class="best-room_t"><a href="best-rooms-detail.html">商务套房</a></div>
                <div class="best-room_desc">优雅的商务套房享有50平方米私人空间，更配有独立客厅，东城南城的亮丽的景致尽收眼底。
                </div>
                <div class="best-room_price">
                  <span>￥399</span> / 天
                </div>
              </div>
            </li>
            <li class="col-lg-4 col-md-4 col-sm-6 col-xs-12 best-room_li">
              <div class="best-room_img">
                <a href="#"><img src="${basePath}/static/front/images/best-rooms/2.jpg" alt=""></a>
                <div class="best-room_overlay">
                  <div class="overlay_icn"><a href="best-rooms-detail.html"></a></div>
                </div>
              </div>
              <div class="best-room-info">
                <div class="best-room_t"><a href="${basePath}/front/room-detail.jsp">水疗房</a></div>
                <div class="best-room_desc">该客房提供水疗服务，让您褪去劳累一天后的工作与生活中的疲惫，放松身心，感受无尽的快乐。
                </div>
                <div class="best-room_price">
                  <span>￥499</span> / 天
                </div>
              </div>
            </li>
            <li class="col-lg-4 col-md-4 col-sm-6 col-xs-12 best-room_li">
              <div class="best-room_img">
                <a href="#"><img src="${basePath}/static/front/images/best-rooms/3.jpg" alt=""></a>
                <div class="best-room_overlay">
                  <div class="overlay_icn"><a href="${basePath}/front/room-detail.jsp"></a></div>
                </div>
              </div>
              <div class="best-room-info">
                <div class="best-room_t"><a href="best-rooms-detail.html">总统套房</a></div>
                <div class="best-room_desc">总统套房有书房，会议室，饱览迷人风光的全景天窗，可容纳12人的豪华小餐厅，厨具一应俱全，主客两间卧室各设会客区和浴室。
                </div>
                <div class="best-room_price">
                  <span>￥999</span> / 天
                </div>
              </div>
            </li>
            <li class="col-lg-4 col-md-4 col-sm-6 col-xs-12 best-room_li">
              <div class="best-room_img">
                <a href="#"><img src="${basePath}/static/front/images/best-rooms/4.jpg" alt=""></a>
                <div class="best-room_overlay">
                  <div class="overlay_icn"><a href="${basePath}/front/room-detail.jsp"></a></div>
                </div>
              </div>
              <div class="best-room-info">
                <div class="best-room_t"><a href="${basePath}/front/room-detail.jsp">行政套房</a></div>
                <div class="best-room_desc">行政套房采用开放式设计，让您坐拥极致瑰丽的珠江美景。房间尊享独立客厅设计，宽敞的客厅以现代、简约、环保的风格精心搭配，让视野所及之处都令您的身心倍感舒畅与温暖。
                </div>
                <div class="best-room_price">
                  <span>￥599</span> / 天
                </div>
              </div>
            </li>
            <li class="col-lg-4 col-md-4 col-sm-6 col-xs-12 best-room_li">
              <div class="best-room_img">
                <a href="#"><img src="${basePath}/static/front/images/best-rooms/5.jpg" alt=""></a>
                <div class="best-room_overlay">
                  <div class="overlay_icn"><a href="${basePath}/front/room-detail.jsp"></a></div>
                </div>
              </div>
              <div class="best-room-info">
                <div class="best-room_t"><a href="${basePath}/front/room-detail.jsp">经济客房</a></div>
                <div class="best-room_desc">客房采用现代、简约、环保的设计理念结合别具岭南特色的设计风格，让您倍感宽敞舒适。房间内设有现代中式家具和平面电视，为您的商务出行提供温馨及舒适的居停体验。
                </div>
                <div class="best-room_price">
                  <span>￥199</span> / 天
                </div>
              </div>
            </li>
            <li class="col-lg-4 col-md-4 col-sm-6 col-xs-12 best-room_li">
              <div class="best-room_img">
                <a href="#"><img src="${basePath}/static/front/images/best-rooms/6.jpg" alt=""></a>
                <div class="best-room_overlay">
                  <div class="overlay_icn"><a href="${basePath}/front/room-detail.jsp"></a></div>
                </div>
              </div>
              <div class="best-room-info">
                <div class="best-room_t"><a href="${basePath}/front/room-detail.jsp">欧式套房</a></div>
                <div class="best-room_desc">客房采用欧陆风格设计结合温馨舒适的起居配置，在突显高贵雅致的情调同时让您舒缓在忙碌工作后的疲劳。宽敞的玻璃窗及高楼层开阔的视野，为您呈奉美丽的东莞景。
                </div>
                <div class="best-room_price">
                  <span>￥499</span> / 天
                </div>
              </div>
            </li>
          </ul>
        </div>
      </div>
    </section>

    <!-- /choose best rooms -->
    <!-- lux banner parallax -->
      <section class="banner bg-parallax2">
        <div class="overlay"></div>
      <div class="banner-parallax">
        <div class="container">
          <div class="text-center">
            <div class="banner-parallax_raiting">
              <a href="#"><span class="star __selected"></span></a>
              <a href="#"><span class="star __selected"></span></a>
              <a href="#"><span class="star __selected"></span></a>
              <a href="#"><span class="star __selected"></span></a>
              <a href="#"><span class="star __selected"></span></a>
            </div>
            <h2 class="banner-parallax_t">超级奢华套房</h2>
            <div class="banner-parallax_price"><span>￥3000</span> / 天</div>
            <a href="#" class="btn btn-default">预定</a>
          </div>
        </div>
      </div>
    </section>

    <!-- /enjoy our services -->
    <!-- testiomonials -->
    <section class="testimonials">
      <div class="container">
        <div class="title-main"><h2 class="h2">客人评价<span class="title-secondary">People Says About Us</span></h2></div>
        <div class="owl-carousel">
          <div class="item">
            <div class="testimonials-block_i">
              <div class="testimonials-block_t">Great <span>Service</span></div>
              <p>好好吃的麻薯哦怎么会有这么好吃的麻薯</p>
            </div>
            <div class="testimonials-block_user">
                <div class="user_img"><img src="${basePath}/static/front/images/testimonials/mike.jpg" alt=""></div>
                <div class="user_n">沈鑫</div>
            </div>
          </div>
          <div class="item">
            <div class="testimonials-block_i">
              <div class="testimonials-block_t">Thank You Very Much <span>I Am Happy!</span></div>
              <p>好好吃的麻薯哦怎么会有这么好吃的麻薯</p>
            </div>
            <div class="testimonials-block_user">
                <div class="user_img"><img src="${basePath}/static/front/images/testimonials/mila.png" alt=""></div>
                <div class="user_n">纯纯</div>
            </div>
          </div>
        </div>
      </div>
    </section>
    <!-- /testiomonials -->
    <!-- map -->
    <!-- /map -->
  <!-- /main wrapper -->
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
  <!---<script type="text/javascript" src="http://ditu.google.cn/maps/api/js"></script>--->
  <script type="text/javascript" src="${basePath}/static/front/js/map.js"></script>
  <script type="text/javascript" src="${basePath}/static/front/js/main.js"></script>
  <!-- /Scripts -->
  <script type="text/javascript">
  	$(function(){
        var roomtype = $("#roomtype");
        $.ajax({
            type: "post",//请求方式
            url: "${basePath}/sys/room/getroomtypelist.action",//地址，就是json文件的请求路径
            dataType: "json",//数据类型可以为 text xml json  script  jsonp
            success: function(jsondata){//返回的参数就是 action里面所有的有get和set方法的参数
				data = jsondata.data;
                for(var i=0;i<data.length;i++){
                    $("<option value='" + data[i].id + "'>" + data[i].roomTypeName + "</option>").appendTo(roomtype)//动态添加Option子项
                }
            }
        });
    });
  </script>
</body>
</html>
