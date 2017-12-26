<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

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
                <div class="logo"><a href="${basePath}/front/index.action" class="navbar-brand page-scroll"><img src="${basePath}/static/front/images/logo/logo.png" alt="logo"></a></div>
              </div>
              <div class="col-lg-9">
                <div class="navbar-header">
                  <button type="button" data-toggle="collapse" data-target=".navbar-main-collapse" class="navbar-toggle"><span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></button>
                </div>
                <div class="collapse navbar-collapse navbar-main-collapse">
                  <ul class="nav navbar-nav navbar-right">
                    <li><a href="${basePath}/front/index.action">主页</a></li>
                     <li><a href="${basePath}/front/rooms.jsp">房间</a></li>
                    <li  id="denglu"><a href="${basePath}/front/login.jsp">登录</a></li>
                    <li id="zhuce"><a href="${basePath}/front/signup.jsp">注册</a></li>
                    <li id="dingdan" style="display:none;"><a href="${basePath}/sys/booking/frontFindAll.action">订单查看</a></li>
                    <li id="mingzi" style="display:none;"><a href="${basePath}/front/rooms.jsp"><%=session.getAttribute("user") %></a></li>
                  </ul>
                </div>
              </div>
            </div>
          </div>
        </nav>
      </div>
    </header>
