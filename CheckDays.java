import java.util.*;
class CheckDays{
	public static void main(String args[]){
		System.out.println("\tInput Month Number & Check How Many Days for the Month\n");
		Scanner input=new Scanner(System.in);
		System.out.print("Input Month Number : ");
		int month=input.nextInt();
		System.out.println();
		if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12){
			System.out.println("\t31 Days");
		}else if(month==4 || month==6 || month==9 || month==11){
			System.out.println("\t30 Days");
		}else if(month==2){
			System.out.println("\t28 Days");
		}else{
			System.out.println("\tWrong Month");
		}
	}
}
