import java.util.*;
public class NagasuMain{
	public static void main(String[] args){
		System.out.print("年月をカンマ区切りで入力>>");
		String input = new Scanner(System.in).nextLine();
		int[] years = csvToIntArr(input); 
		boolean isleap = isLeapYear(years[0]);
		int Day = daysOfMonth(years[0],years[1]);
		if(isleap && years[1]==2){
			Day =29;
		}
		System.out.printf
			("%d年%d月は%d日まであります",years[0],years[1],Day);
	}
	public static int[] csvToIntArr(String csv){
		String[] letters = csv.split(",");
		int[] arr = new int [letters.length];
		for(int i=0;i<letters.length;i++){
			arr[i] = Integer.parseInt(letters[i]);
		}
		return arr;
	}
	public static boolean isLeapYear(int year){
		if(year%400 ==0 ||year%100 !=0 && year%4 ==0){
			return true;
		}else{
			return false; 
		}
	}
	public static int daysOfMonth(int year,int month){
		int day=31;
		if(month==2){
			day = 28;
		}else if(month ==4||month==6||month==9){
			day = 30;
		}
		return day;
	}
}
