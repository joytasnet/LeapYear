
import java.util.*;
public class MatsuokaMain{
	/*public static void daysOfMonth(String yearMonth){
		String ym[]=yearMonth.split(",");
		int[] num_ym=new int[ym.length];
		for(int i=0;i<ym.length;i++){
		num_ym[i]=Integer.parseInt(ym[i]);
		}
		if(num_ym[0]%4==0){
		if(num_ym[0]%100==0&&num_ym[0]%400!=0){
		if(num_ym[1]==2){
		System.out.printf("%d年の%d月は28日です",num_ym[0],num_ym[1]);
		}else if(num_ym[1]%2==0&&num_ym[1]<7||num_ym[1]%2!=0&&num_ym[1]>8){
		System.out.printf("%d年の%d月は30日です",num_ym[0],num_ym[1]);
		}else{
		System.out.printf("%d年の%d月は31日です",num_ym[0],num_ym[1]);
		}

		}else if(num_ym[1]==2){
		System.out.printf("%d年の%d月は29日です",num_ym[0],num_ym[1]);
		}
		}else{
		if(num_ym[1]==2){
		System.out.printf("%d年の%d月は28日です",num_ym[0],num_ym[1]);
		}else if(num_ym[1]%2==0&&num_ym[1]<7||num_ym[1]%2!=0&&num_ym[1]>8){
		System.out.printf("%d年の%d月は30日です",num_ym[0],num_ym[1]);
		}else{
		System.out.printf("%d年の%d月は31日です",num_ym[0],num_ym[1]);
		}
		}
		}*/
	public static int[] csvToIntarr(String csv){
		String ym[]=csv.split(",");
		int[] num_ym=new int[ym.length];
		for(int i=0;i<ym.length;i++){
			num_ym[i]=Integer.parseInt(ym[i]);
		}
		return num_ym;
	}

	public static boolean isLeapYear(int year){
		if(year%4==0){
			if(year%100==0&&year%400!=0){
				return false;
			}else{
				return true;
			}
		}
		return false;
	}

	public static int daysOfMonth(int year,int month){
		int day;
		boolean isLeapYear;
		isLeapYear=isLeapYear(year);
		if(isLeapYear==true&&month==2){
			day=29;
			return day;
		}else if(month==2){
			day=28;
			return day;
		}else if(month==4||month==6||month==9||month==11){
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

