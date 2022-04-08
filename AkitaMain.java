import java.util.*;
public class AkitaMain{
	public static void main(String[] args){
		System.out.print("年月をカンマ区切りで入力>>");
		String csv = new Scanner(System.in).nextLine();
		int[] yearMonth = csvToIntArr(csv);
		boolean isLY = isLeapYear(yearMonth[0]);
		int days = daysOfmonth(yearMonth[1],isLY);
		System.out.printf("%d年%d月の日数は%d日です。%n",yearMonth[0],yearMonth[1],days);
	}
	public static int[] csvToIntArr(String csv){
		String [] yearMonthS = csv.split(",");
		int[] yearMonth ={
			Integer.parseInt(yearMonthS[0]),
			Integer.parseInt(yearMonthS[1]),
		};
		return yearMonth;

	}
	public static boolean isLeapYear(int year){
		boolean isLY;
		if(year%400==0){
			isLY=true;
		}else if(year%4==0 && year%100!=0){
			isLY=true;
		}else{
			isLY=false;
		}
		return isLY;
	}
	public static int daysOfmonth(int month,boolean isLY){
		int days;
		switch(month){
			case 2:
				if(isLY){
					days=29;
				}else{
					days=28;
				}
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				days=30;
				break;
			default:
				days=31;
		}
		return days;
	}
}
