package STDENT_GRADE_CALCULATOR_CODSOFT;
import java.util.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		studentdao stdo=new Studentimpl();
		System.out.println("||Welcome...to...Student...Management...System||");
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Please select the following option :- ");
			System.out.println("1. Add Student\n"+"2. Show all Student\n"+"3. Show Student based on RollId :- \n"+"4. Update Student\n"+"5. Delete Student\n"+"6. Exit application\n");
			System.out.print("Enter choice :- ");
			int choice=sc.nextInt();
			switch(choice) {
			case 1 :student stu=new student();
			System.out.print("Enter RollID :- ");
			int rollid=sc.nextInt();
			System.out.print("Enter Name :- ");
			String name=sc.next();
			System.out.print("Enter STD :- ");
			int std=sc.nextInt();
			System.out.print("Enter Address :- ");
			String add=sc.next();
			stu.setRollid(rollid);stu.setName(name);
			stu.setStd(std);stu.setAddress(add);
			stdo.addstudnet(stu);
			break;
			
			case 2 : stdo.showstudent();
			break;
			
			case 3 : System.out.print("Enter RollID to show details of Student :- ");
			int id=sc.nextInt();
			stdo.showstudentonrollid(id);
			break;
			
			case 4 : System.out.print("Enter RollId to update the name of Student :- ");
			int id1=sc.nextInt();
			System.out.print("Enter name to update :- ");
			String name1=sc.next();
			stdo.updatestudent(id1, name1);
			break;
			
			case 5 : System.out.print("Enter ROllId to delete the record :- ");
			int id2=sc.nextInt();
			stdo.deletestudent(id2);
			break;
			
			case 6 : System.out.println("Thankyou for using the application...");
			System.exit(0);
			break;
			
			default: System.out.println("Enter valid choice...!");
			}
		}while(true);
		
	}

}
