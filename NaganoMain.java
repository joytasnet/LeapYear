import java.util.*;
public class NaganoMain{
	public static void main(String[] args){
		System.out.print("年月をカンマ区切りで入力>");
		String csv = new Scanner(System.in).next();
		int[] ym = csvTointArr(csv);
		System.out.printf("%d年%d月は%d日まであります%n",ym[0],ym[1],daysOfMonth(ym[0],ym[1]));
	}
	public static int[] csvTointArr(String csv){
		String[] data=csv.split(",");
		int[] n =new int[data.length];
		for(int i =0;i<data.length;i++){
			n[i] = Integer.parseInt(data[i]);
		}
		return n;
	}
	public static boolean isLeapYear(int year){
		if(year%400==0 || year %4==0 && year %100!=0){
			return true;
		}else{
			return false;
		}
	}
	public static int daysOfMonth(int year,int month){
		int day = 0;
		switch(month){
			case 1 :
			case 3 :
			case 5 :
			case 7 :
			case 8 :
			case 10 :
			case 12 :
				day = 31; 
				break;
			case 2 :
				boolean isLeap = isLeapYear(year);
				if(isLeap==true){
					day = 29;
				}else{
					day = 28;
				}
				break;
			default:
				day = 30;
		}
		return day;

	}
}
