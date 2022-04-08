import java.util.*;
public class KimuraMain{
	public static void main(String[] args){
		System.out.print("西暦と月をカンマ区切りで入力>>");
		String inp = new Scanner(System.in).nextLine();
		int[] year_days = csvToIntArr(inp);
		System.out.printf("%d年%d月は%dまであります",year_days[0],year_days[1],daysOfMonth(year_days[0],year_days[1]));
	}
	public static int[] csvToIntArr(String csv){
		String[] before_change_nums = csv.split(",");
		int[] changed_nums = new int[before_change_nums.length];
		for(int i=0;i<before_change_nums.length;i++){
			changed_nums[i] = Integer.parseInt(before_change_nums[i]);
		}
		return changed_nums;
	}
	public static boolean isLeapYear(int year){
		if(year%400 ==0 || year%4 ==0 && year%100 !=0){
			return true;
		}else{
			return false;
		}
	}
	public static int daysOfMonth(int year,int month){
		int return_value;
		switch(month){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				return_value = 31;
				break;
			case 2:
				boolean isLeap = isLeapYear(year);
				if(isLeap == true){
					return_value = 29;
				}else{
					return_value = 28;
				}
				break;
			default :
				return_value = 30;
		}
		return return_value;
	}
}
