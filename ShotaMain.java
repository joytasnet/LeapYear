import java.util.*;
public class ShotaMain{
	public static void main(String[] args){
		System.out.print("西暦と月をカンマ区切りで入力>>");
		String answer=new Scanner(System.in).nextLine();
		int[] yearMonth=csvToIntArr(answer);
		boolean isLeap=isLeapYear(yearMonth[0]);
		int days= daysOfMonth(yearMonth[1],isLeap);

		System.out.printf("%d年%d月は%d日まであります%n",yearMonth[0],yearMonth[1],days);
	}
	public static int[] csvToIntArr(String csv){
		String[] csvArray=csv.split(",");
		int[] yearMonth=new int[csvArray.length];
		for(int i=0; i<yearMonth.length;i++){
			yearMonth[i]=Integer.parseInt(csvArray[i]);
		}
		return yearMonth;
	}
	public static boolean isLeapYear(int year){
		if(year%400==0){
			return true;
		}else if(year%4==0 && year%100 !=0){
			return true;
		}else{
			return false;
		}
	}
	public static int daysOfMonth(int month,boolean isLeap){
		switch(month){
			case 4:
			case 6:
			case 9:
			case 11:
				return 30;

			case 2:
				if(isLeap){
					return 29;
				}else{
					return 28;
				}
			default:
				return 31;
		}
	}
}
