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
  <title>Best Room Detail</title>
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
            <h1 class="h1">房间细节</h1>
          </div>
          <div class="col-md-6">
            <ol class="breadcrumb">
              <li><a href="#">主页</a><i class="fa fa-angle-right"></i></li>
              <li><a href="#">房间</a><i class="fa fa-angle-right"></i></li>
              <li class="active">房间细节</li>
            </ol>
          </div>
        </div>
      </div>
    </section>
    <!-- /breadcrumbs -->
    <!-- room details-->
    <section class="room-detail">
      <div class="container">
        <div class="row">
          <div class="col-lg-12 col-md-12 col-sm-12">
            <div class="row reservation-top">
              <div class="module __reservation">
                <div class="module-block">
                  <form class="form-planner form-horizontal">
                      <div class="col-md-3 col-xs-12">
                        <div class="form-group">
                            <label>预定时间</label>
                            <input class="form-control __plannerInput" id="datetimepicker1" type="text" placeholder="10-05-2015">
                        </div>
                      </div>
                      <div class="col-md-2 col-xs-6">
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
                      <div class="col-md-3 col-xs-12">
                        <div class="form-group">
                            <label>电话</label>
                            <input type="text" class="form-control">
                        </div>
                      </div>
                      <div class="col-md-2 col-xs-12">
                        <div class="form-group">
                            <a href="wizzard-step2.html" class="btn btn-default wizzard-search-btn">预定</a>
                        </div>
                      </div>
                  </form>
                </div>
              </div>
            </div>
          </div>
          <div class="col-lg-12 marg50"><h2 class="h2">房间类型</h2></div>
          <div class="col-lg-6 col-md-6 col-sm-6">
              <div class="owl-carousel owl_gallery">
                <div class="item"><img class="img-responsive" src="${basePath}/static/front/images/gallery/3.jpg"></div>
                <div class="item"><img class="img-responsive" src="${basePath}/static/front/images/gallery/2.jpg"></div>
                <div class="item"><img class="img-responsive" src="${basePath}/static/front/images/gallery/1.jpg"></div>
                <div class="item"><img class="img-responsive" src="${basePath}/static/front/images/gallery/4.jpg"></div>
                <div class="item"><img class="img-responsive" src="${basePath}/static/front/images/gallery/5.jpg"></div>
                <div class="item"><img class="img-responsive" src="${basePath}/static/front/images/gallery/6.jpg"></div>
                <div class="item"><img class="img-responsive" src="${basePath}/static/front/images/gallery/7.jpg"></div>
                <div class="item"><img class="img-responsive" src="${basePath}/static/front/images/gallery/8.jpg"></div>
              </div>
          </div>
          <div class="col-lg-6 col-md-6">
            <div class="room-detail_overview">
              <table class="simple">
                <tr>
                  <td><strong>价格:</strong></td>
                  <td><span>￥ 500</span> / 天</td>
                </tr>
                <tr>
                  <td><strong>面积:</strong></td>
                  <td>150m²</td>
                </tr>
                <tr>
                  <td><strong>床:</strong></td>
                  <td>2 / 张</td>
                </tr>
                <tr>
                  <td><strong>最多容纳人数:</strong></td>
                  <td>5 / 人</td>
                </tr>
                <tr>
                  <td><strong>Wi-Fi:</strong></td>
                  <td>有</td>
                </tr>
                <tr>
                  <td><strong>客房服务:</strong></td>
                  <td>有</td>
                </tr>
                <tr>
                  <td><strong>早餐:</strong></td>
                  <td>有</td>
                </tr>
                <tr>
                  <td><strong>洗衣服务:</strong></td>
                  <td>有</td>
                </tr>
                <tr>
                  <td><strong>机场接送:</strong></td>
                  <td>有</td>
                </tr>
              </table>
            </div>
          </div>
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

