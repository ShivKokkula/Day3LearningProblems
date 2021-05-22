package EmpWage;

public class EmpWage {

	static final int IS_FULL_TIME = 1;

	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee Wage Computation");
		
		EmpWage e1 = new EmpWage();
		e1.empCheck();
	}
	
	public void empCheck() {
		
		int empCheck = (int) (Math.floor(Math.random() * 10) % 2);
		
		if (empCheck == IS_FULL_TIME) {
			System.out.println("Employ Present");
		}else {
			
			System.out.println("Employ Absent");
		}
	}
	

}