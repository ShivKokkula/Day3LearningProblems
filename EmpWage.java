package EmpWage;

public class EmpWage {

	static final int IS_FULL_TIME = 1;
	static final int EMP_RATE_PER_HOUR = 20;

	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee Wage Computation");
		
		EmpWage e1 = new EmpWage();
		double wage = e1.calDailyWage(e1.empCheck());
		
		System.out.println("Employee Wage: "+wage);
	}
	
	public int empCheck() {
		
		int empHrs = 0;
		
		int empCheck = (int) (Math.floor(Math.random() * 10) % 2);
		
		if (empCheck == IS_FULL_TIME) {
			System.out.println("Employ Present");
			empHrs = 8;
		}else {
			
			System.out.println("Employ Absent");
		}
		
		return empHrs;
	}
	
	public double calDailyWage(int empHrs) {
		double empWage = 0;
		empWage = empHrs * EMP_RATE_PER_HOUR;
		
		return empWage;
	}
	

}