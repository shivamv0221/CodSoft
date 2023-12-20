package Codsoft;
import java.util.*;
public class StudentGradeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Grade Calculator");
		System.out.println("Please enter your marks :- ");
		int eng=0,hindi=0,mar=0,maths=0,s=0,ss=0;
		do {
			System.out.print("English :- ");
			eng=sc.nextInt();
		}while(eng < 0 || eng>100);
		do {
			System.out.print("Hindi :- ");
			hindi=sc.nextInt();
		}while(hindi < 0 || hindi >100);
		do {
			System.out.print("Marathi :- ");
			mar=sc.nextInt();
		}while(mar < 0 || mar >100);
		do {
			System.out.print("Maths :- ");
			maths=sc.nextInt();
		}while(maths < 0 || maths >100);
		do {
			System.out.print("Science :- ");
			s=sc.nextInt();
		}while(s < 0 || s >100);
		do {
			System.out.print("Social Science :- ");
			ss=sc.nextInt();
		}while(ss < 0 || ss >100);
		
		long total=eng+hindi+mar+maths+s+ss;
		
		long average=total/6;
		
		char grade=calgrade(average);
		
		System.out.println("The total marks obtained :- "+total+"\nAverage % :- "+average+"\nGrade as per your feed :- "+grade);
	}
	
	private static char calgrade(long total) {
		if(total ==100 || total > 86) {
			return 'A';
		}else if(total <=84 || total >=70) {
			return 'B';
		}else if(total <=69 || total >=50) {
			return 'C';
		}else if(total <=49 || total >= 35){
			return 'D';
		}else {
			return 'E';
		}
	}

}
