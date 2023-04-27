import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class test1 {
	public static void main(String[] args) throws ParseException {
		String shinyaBirthday = "1998/03/19";
		String minamiBirthday = "2000/02/14";
		String furuyamaBirthday = "1998/09/12";
		//改行
		System.out.println("問１");
		//問題1:現在の時刻を出力してください
		
		 Calendar calendar = Calendar.getInstance();
	        System.out.println(calendar.getTime());
	        System.out.println("問２");
		//問題2:shinyaBirthdayとminamiBirthdayを日付型に変更し条件式で誕生日を比較し早い方の日付を文字列型で出力しなさい。
		//改行
	        SimpleDateFormat format1 = new SimpleDateFormat("yyyy/MM/dd");  
	        SimpleDateFormat format2 = new SimpleDateFormat("yyyy/MM/dd");  
	        
	        Date date1 = format1.parse(shinyaBirthday);  
	        Date date2 = format2.parse(minamiBirthday);  
	        
	        if(date1.before(date2)) {
				String dateToStr = shinyaBirthday.formatted(date1);
	        	System.out.println(dateToStr);
	        }else {
	        	String dateToStr2 = minamiBirthday.formatted(date2);
	        	System.out.println(dateToStr2);
	        }
	        
		System.out.println("問３");
		//問題3:furuyamaBirthdayに５年2ヶ月追加した値を文字列型で表示しなさい
		SimpleDateFormat format3 = new SimpleDateFormat("yyyy/MM/dd");
		Date date3 = format3.parse(furuyamaBirthday);
		
		 Calendar calendar1 = Calendar.getInstance();
		 calendar1.setTime(date3);
		 
		 calendar1.add(Calendar.YEAR, 5);
		 calendar1.add(Calendar.MONTH, 2);
         date3 = calendar1.getTime();
         
         String dateTo = new SimpleDateFormat("yyyy/MM/dd").format(date3);
         System.out.println(dateTo);
	}
}


