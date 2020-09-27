package javabean;


import java.text.SimpleDateFormat;
import java.util.*;

public class Date_d {
	private String now;
	
	public String now_time() {
//	SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
	
	Calendar calendar = Calendar.getInstance(); 

	int cur_month=calendar.get(Calendar.MONTH)+1;

	int cur_year=calendar.get(Calendar.YEAR);

	int cur_day=calendar.get(Calendar.DAY_OF_MONTH);
	
	now = cur_year+"-"+cur_month+"-"+cur_day;
	
	return now;
	
	}	
	
	public String huanq() {
		Calendar calendar = Calendar.getInstance(); 

		int cur_month=calendar.get(Calendar.MONTH)+2;

		int cur_year=calendar.get(Calendar.YEAR);

		int cur_day=calendar.get(Calendar.DAY_OF_MONTH);
		
		now = cur_year+"-"+cur_month+"-"+cur_day;
		
		return now;
	}
	
	@SuppressWarnings("unused")
	public String chaoq(String bl) throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
        //开始时间
		
        Date startDate = sdf.parse(bl);
//结束时间
        Calendar calendar = Calendar.getInstance(); 

    	int cur_month=calendar.get(Calendar.MONTH)+1;

    	int cur_year=calendar.get(Calendar.YEAR);

    	int cur_day=calendar.get(Calendar.DAY_OF_MONTH);
    	
    	now = cur_year+"-"+cur_month+"-"+cur_day;
    	
        Date endDate = sdf.parse(now);///////////////////////////////////////////////
//System.out.println("结束时间"+endDate);
//System.out.println(endDate.getTime());
//得到相差的天数 betweenDate
        long betweenDate = (endDate.getTime()-startDate.getTime())/(60*60*24*1000);
  
        String beet = betweenDate+"";
		
		return beet;	
	}
/*	
	  
	SimpleDateFormat format = new  SimpleDateFormat("yyyy-MM-dd"); 

	   Date dd = new Date();

	   Calendar calendar = Calendar.getInstance();

	   calendar.setTimeZone(dd);

	   calendar.add(Calendar.DATE,10); 

	   String T1 = format.format(calendar.getTime() ) ;

	
	SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
	  String str="20110823";
	  
	  Date dt=sdf.parse(str);
	  Calendar rightNow = Calendar.getInstance();
	  rightNow.setTime(dt);
	  rightNow.add(Calendar.YEAR,-1);//日期减1年
	  rightNow.add(Calendar.MONTH,3);//日期加3个月
	  rightNow.add(Calendar.DAY_OF_YEAR,10);//日期加10天
	  Date dt1=rightNow.getTime();
	  String reStr = sdf.format(dt1);
	  System.out.println(reStr);
*/	  
}
