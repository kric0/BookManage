<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="dao.*"
    import="java.util.*"
    import="javabean.*"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
 request.setCharacterEncoding("UTF-8");
  String num1 = (String)request.getAttribute("id");
  String num2 = request.getParameter("id");
  
  String num = null;
  if(num1!=null) num = num1;
  else num = num2;
  
  S_book s = new S_book();
  U_book u = new U_book();
  List<Book> list;
  String type = "id";
  String m = null;
  System.out.println(num);
  list = s.b_type(type, num);
  
  System.out.println("9999");
  System.out.println(list.size());
  System.out.println(list.get(0).getInfo());
  
//最大借阅量为8
  String uname = (String)session.getAttribute("uname");
//String uname = "3434";
  S_info p = new S_info();
  int sum = p.s_uname(uname);
  System.out.println(sum);
  if(sum>=8){%>
     当前借阅已达上限，不可借书！
 <%} if(sum<8){ System.out.println("12ferg");
//未达上限，可借阅

 //若book.info为可借

	 if(list.size()==1&&list.get(0).getInfo().equals("可借")) {
    //往info表里插入一条借书信息	  
	  Date_d dd = new Date_d();
      String name = list.get(0).getName();
      String type1 = "借书";
      String now = dd.now_time();
      String hua = dd.huanq();
      Date_d chaq = new Date_d();
      String cq= chaq.chaoq(hua);
      Info inf = new Info(num,name,uname,type1,now,hua,cq,null,null);
      I_info i = new I_info();
      int f = i.i_info(inf);
      
      if(f==1){
      //插入成功后，更新book表信息，将可借改为预约
	    int n = u.u_info(num);
	    System.out.println("0000");
	    if(n==1){//这条信息能不能传给管理员？用户没用啊
		    m="book表信息记录已更新";
	       %>借书成功		  
	  <%}  
		else{
			m="book表更新操作失败";
	      %>借书失败，出现异常错误。	      
	      <% }
      }
   //插入操作失败
    else{
    	%>借书失败，出现异常错误。。。
    <% }
  }
//若book.info为预约
  else{
	  if(list.get(0).getInfo().equals("预约")){%>
		 该图书已被借走，当前只可预约！请前往预约页面！ 
	 <%  }
	  
  }
 }  %>
   
   
  


</body>
</html>