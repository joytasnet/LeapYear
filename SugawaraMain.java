import java.util.*;
public class SugawaraMain{
	public static void main(String[] args){
		//年月日入力
		System.out.print("西暦と月をカンマ区切りで入力>>");
		String yearAndMonth = new Scanner(System.in).nextLine();
		//csvToIntArray METHOD
		int[] yearmonth = csvToIntArray(yearAndMonth);
		int year = yearmonth[0];
		int month = yearmonth[1];
		//isLeapYear METHOD
		boolean isLeapYear = isLeapYear(year);
		//daysOfMonth METHOD
		int days = daysOfMonth(year,month);
		//表示
		System.out.printf("%d年%d月は%d日あります。%n",year,month,days);
	}

/*METHOD*/
	/*【int型配列にしてあげる・csvToIntArrayメソッド】*/
	public static int[] csvToIntArray(String csv){
		String[] data = csv.split(",");
		int[] intdata = new int[data.length];
		for(int i=0 ; i<data.length ; i++){
			intdata[i] = Integer.parseInt(data[i]);
		}
		return intdata;
	}
	/*【うるう年の判定・isLeapYearメソッド】*/
	public static boolean isLeapYear(int year){
		if((year%400==0)||(year%100!=0)&&(year%4==0)){
			return true;
		}else{
			return false;
		}
	}

	/*【何日あるかの判定・daysOfMonthメソッド】*/
	public static int daysOfMonth(int year , int month){
		int days =0;
		if(month==2){
			//2月
			if(isLeapYear(year)){
				days = 29;
			}else{
				days=28;
			}
			return days;

		}else if((month==4)||(month==6)||(month==9)||(month==11)){
			//30日の月
			days = 30;
			return days;
		}else{
			//31日の月
			days =31;
			return days;
		}
	}
}
