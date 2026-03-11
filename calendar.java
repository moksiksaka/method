import java.util.Locale;
import java.util.Date;
import java.text.SimpleDateFormat;
class calendar{
	public static void main(String[] args){
		Locale lc = new Locale("TH","th");
		Date dt = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("yyyyy.MMMMM.dd GGG hh:mm aaa",lc);
		String name = sf.format(dt);
		System.out.println(name);
		
	}
}
