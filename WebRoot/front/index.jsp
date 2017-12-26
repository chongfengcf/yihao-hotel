<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
pageContext.setAttribute("basePath", basePath);
%>
<%@ taglib prefix="s" uri="/struts-tags" %>

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
<script type="text/javascript">
	function yuding(obj) {
         //判断是否已登录
	     var s="<%=session.getAttribute("user")%>"; 
	     var c = document.getElementById("myfrom");
	       if(s== "null"){
	           if(confirm("请先登录!")){
	            window.location.href  ="${basePath}/front/login.jsp";
	          }else{
	             return false;
	        }  
	       }else{
	      	 c.submit();
	
         } 
	}   
</script>
<body>
  <!-- main wrapper -->
  <div class="wrapper">
    <!-- header -->
     <%@ include file="baseJsp.jsp" %>
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
                <form id="myfrom" action="${basePath}/sys/booking/bookingRoom.action" method="post" class="form-planner form-horizontal">
                  <div class="row">
                    <div class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
                      <div class="form-group">
                        <label>入住时间</label>
                        <input class="form-control __plannerInput" id="time" type="text" name="arrivalDate">
                      </div>
                    </div>
                  </div>
                  <div class="row">
                    <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                      <div class="form-group">
                          <label>房间类型</label>
                          <div class="theme-select">
                            <select id="roomtype" name="roomTypeId" class="form-control __plannerSelect">
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
                        <input type="button" class="btn btn-default " onclick="yuding(this)" value="&nbsp;&nbsp;&nbsp;&nbsp;预定房间&nbsp;&nbsp;&nbsp;&nbsp;">
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
          <ul class="row best-room_ul" id="tsrooms">
            
            
            
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
        <s:iterator value="#comments" status="n">
          <div class="item">
            <div class="testimonials-block_i">
              <div class="testimonials-block_t">Great <span>Service</span></div>
              <p><s:property value="content" /></p>
            </div>
            <div class="testimonials-block_user">
                <div class="user_img"><img src="${basePath}/static/front/images/testimonials/mike.jpg" alt=""></div>
                <div class="user_n"><s:property value="vipName" /></div>
            </div>
          </div>
        </s:iterator>
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
  <!---<script type="text/javascript" src="http://ditu.google.cn/maps/api/js"></script>--->
  <script type="text/javascript" src="${basePath}/static/front/js/map.js"></script>
  <script type="text/javascript" src="${basePath}/static/front/js/main.js"></script>
  <script type="text/javascript" src="${basePath}/static/layDate/layDate/laydate/laydate.js"></script>
  <!-- /Scripts -->
  <script type="text/javascript">
  
	  laydate.render({
	  				min: 0,
				  max:30,
				  elem: '#time' 
				  
				});
  	$(document).ready(function(){
  		judgeLogin();
  		var birthday = "<s:property value="#birthday" />";
  		var today=new Date();
  		birthday2 = birthday.split("-")[1]+"-"+birthday.split("-")[2];
  		var time = (today.getMonth()+1)+"-"+today.getDate();
  		if(birthday2  == time)
  		{
  			alert("<%=session.getAttribute("user") %>,生日快乐!");
  		}
  	})
  
  	$(function(){
        var roomtype = $("#roomtype");
        var tsrooms = $("#tsrooms")
        $.ajax({
            type: "post",//请求方式
            url: "${basePath}/sys/room/getroomtypelist.action",//地址，就是json文件的请求路径
            dataType: "json",//数据类型可以为 text xml json  script  jsonp
            success: function(jsondata){//返回的参数就是 action里面所有的有get和set方法的参数
				data = jsondata.data;
                for(var i=0;i<data.length;i++){
                    $("<option value='" + data[i].id + "'>" + data[i].roomTypeName + "</option>").appendTo(roomtype)//动态添加Option子项
                    if(data[i].roomTypeUrl===undefined)
                    {
                        data[i].roomTypeUrl="default.JPG";
                    }
                    $(" <li class='col-lg-4 col-md-4 col-sm-6 col-xs-12 best-room_li'>"+
                    "<div class='best-room_img'><a href='#'><img src='${basePath}/upload/"+data[i].roomTypeUrl+"'></a>"
                    +"<div class='best-room_overlay'>"+
                    "<div class='overlay_icn'><a href='${basePath}/sys/showroom/show.action?id="+data[i].id+"'></a></div>"
                    +" </div> </div> <div class='best-room-info'><div class='best-room_t'>"+"<a href='best-rooms-detail.html'>"+data[i].roomTypeName+"</a></div>"+
                    " <div class='best-room_desc'>"+data[i].roomTypeDescription+"</div> "+
                    "<div class='best-room_price'><span>"+data[i].price+"</span> / 天 </div></div></li>").appendTo(tsrooms)
                }
            }
        });
    });
    
    function judgeLogin(){
            //判断是否已登录
	        var s="<%=session.getAttribute("user")%>"; 
            if(s != "null"){
	             //$("#login-ad").children("button").remove();
	              document.getElementById('denglu').style.display="none";
	              document.getElementById('zhuce').style.display="none";
	               document.getElementById('mingzi').style.display="inline";
	               document.getElementById("dingdan").style.display="inline";
	            
	       }else{
               return false;
           }
          }

  </script>
</body>
</html>








