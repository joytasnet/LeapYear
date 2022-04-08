import java.util.*;
public class MorozumiMain{
	public static void main(String[] args){
		System.out.print("西暦と月を入力>>");
		String yearMonth = new Scanner(System.in).nextLine();
		int[] yms = csvTolntArr(yearMonth);
		int year = yms[0]; 
		int month = yms[1];
		int day = daysOfMonth(year, month);
		System.out.printf("%d年%d月は%d日まであります",year, month, day);
	}
	//文字列を受け取り、int型配列を返却する
	public static int[] csvTolntArr(String csv){
		String[] csvs = csv.split(",");
		int[] yearMonth = new int[csvs.length];
		for(int i=0; i<csvs.length; i++){
			yearMonth[i]	 = Integer.parseInt(csvs[i]);
		}
		return yearMonth;
	}
	//西暦を受け取りそれが閏年なのかを判定する。判定は以下400で割り切れたら閏年、4で割り切れて100で割り切れなかったら閏年
	public static boolean isLeapYear(int year){
	if(year%2 == 0 || year%4 == 0 && year%100 != 0){
		return true;
	}
	return false;
	}
	//西暦と月を受け取り日数を返す
	public static int daysOfMonth(int year, int month){
		int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
		if(isLeapYear(year)){
			days[1]=29;
		}
		return days[month-1];
	}
	//作成したメソッドを利用してアプリを作成する。
}
