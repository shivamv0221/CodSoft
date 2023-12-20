package STDENT_GRADE_CALCULATOR_CODSOFT;

public interface studentdao {

	public void addstudnet(student stu);
	public void showstudent();
	public void showstudentonrollid(int rollid);
	public void updatestudent(int rollid, String name);
	public void deletestudent(int rollid);
}
