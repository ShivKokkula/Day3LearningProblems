package EmpWage;

public class EmpWage {

	static final int IS_FULL_TIME = 1;
	static final int IS_PART_TIME = 2;
	static final int EMP_RATE_PER_HOUR = 20;
	public static final int NUM_OF_WORKING_DAYS = 2;

	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee Wage Computation");
		
		EmpWage e1 = new EmpWage();
		double wage = e1.calDailyWage(e1.empHrsForMonth());
		
		System.out.println("Employee Wage: "+wage);
	}
	
	public int empCheck() {
		
		int empHrs = 0;
		
		int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
		
		switch(empCheck) {
		case IS_FULL_TIME:
			System.out.println("Employ Present: Full Time");
			empHrs = 8;
			break;
		case IS_PART_TIME:
			System.out.println("Employ Present: Part Time");
			empHrs = 4;
			break;
			
		default:
			System.out.println("Employ Absent");
			empHrs = 0;
			break;
		}
		
		return empHrs;
	}
	
	public int empHrsForMonth() {
		int totalEmpHrs = 0;
		for (int day =0; day<NUM_OF_WORKING_DAYS; day++) {
			totalEmpHrs = totalEmpHrs + empCheck();
		}
		
		return totalEmpHrs;
	}
	
	public double calDailyWage(int empHrs) {
		double empWage = 0;
		empWage = empHrs * EMP_RATE_PER_HOUR;
		
		return empWage;
	}
	

}