import java.util.*;
public class NagatsuMain{
	public static void main(String[] args){
		System.out.print("年月をカンマ区切りで入力>>");
		String csv =  new Scanner(System.in).nextLine();
		int[] data = csvToIntArr(csv);
    boolean isLeap = isLeapYear(data[0]);
		int day = daysOfMonth(data[0],data[1]);
		System.out.printf("%d年%d月の日数は%d日です。%n",data[0],data[1],day);
	}
	public static int[] csvToIntArr(String csv){
		String[] strs = csv.split(",");
		int[] data = {Integer.parseInt(strs[0]),Integer.parseInt(strs[1])};
		return data;
	}
	public static boolean isLeapYear(int year){
		boolean isLeap;
		if(year % 400 == 0){
			isLeap = true;
		}else if(year % 100 == 0){
			isLeap = false;
		}else if(year % 4 == 0){
			isLeap = true;
		}else{
			isLeap = false;
		}
		return isLeap;
	}
	public static int daysOfMonth(int year,int month){
		int day;
    boolean isLeap = isLeapYear(year);
		if(month==2 && isLeap==true){
			day = 29;
		}else if(month==2 && isLeap==false){
			day = 28;
		}else if(month==4 || month==6 || month==9 || month==11){
			day = 30;
		}else{
			day = 31;
		}
		return day;
	}
}
