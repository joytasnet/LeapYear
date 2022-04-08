import java.util.*;
public class MatsuokaMain{
	public static int[] csvToIntarr(String csv){
		String ym[]=csv.split(",");
		int[] num_ym=new int[ym.length];
		for(int i=0;i<ym.length;i++){
			num_ym[i]=Integer.parseInt(ym[i]);
		}
		return num_ym;
	}

	public static boolean isLeapYear(int year){
		boolean isYear=false;
		if(year%4==0){
			if(year%100==0&&year%400!=0){
				return isYear;
			}else{
				isYear=true;
				return isYear;
			}
		}
		return isYear;
	}

	public static int daysOfMonth(int year,int month){
		int day;
		boolean isYear;
		isYear=isLeapYear(year);
		if(isYear==true&&month==2){
			day=29;
			return day;
		}else if(month==2){
			day=28;
			return day;
		}else if(month%2==0&&month<7||month%2!=0&&month>8){
			day=30;
			return day;
		}else{
			day=31;
			return day;
		}
	}
	public static void main(String[] args){
		System.out.print("年月をカンマ区切りで入力>>");
		String year_Month=new Scanner(System.in).nextLine();
		int[] ym=csvToIntarr(year_Month);
		int year,month,day;
		year=ym[0];
		month=ym[1];
		day=daysOfMonth(year,month);
		System.out.printf("%d年の%d月は%d日です\n",year,month,day);
	}
}

