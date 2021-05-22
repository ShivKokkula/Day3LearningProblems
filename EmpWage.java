package EmpWage;

public class EmpWage {

	static final int IS_FULL_TIME = 1;
	static final int IS_PART_TIME = 2;
	static final int EMP_RATE_PER_HOUR = 20;
	public static final int NUM_OF_WORKING_DAYS = 4;
	public static final int MAX_HOURS_IN_MONTH = 20;
	int totalWorkingDays = 0;

	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee Wage Computation");
		
		EmpWage e1 = new EmpWage();
		double wage = e1.calDailyWage(e1.empHrsForMonth());
		
		System.out.println("Total Employee Wage: "+wage);
	}
	
	public int empCheck() {
		
		int empHrs = 0;
		
		int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
		
		switch(empCheck) {
		case IS_FULL_TIME:
			System.out.println("Day "+(totalWorkingDays+1)+" Employ Present: Full Time");
			empHrs = 8;
			break;
		case IS_PART_TIME:
			System.out.println("Day "+(totalWorkingDays+1)+" Employ Present: Part Time");
			empHrs = 4;
			break;
			
		default:
			System.out.println("Day "+(totalWorkingDays+1)+" Employ Absent");
			empHrs = 0;
			break;
		}
		
		return empHrs;
	}
	
	public int empHrsForMonth() {
		int totalEmpHrs = 0;
		while (totalEmpHrs < MAX_HOURS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS ) {
			totalEmpHrs = totalEmpHrs + empCheck();
			totalWorkingDays++;
		}
		
		return totalEmpHrs;
	}
	
	public double calDailyWage(int empHrs) {
		double empWage = 0;
		empWage = empHrs * EMP_RATE_PER_HOUR;
		
		return empWage;
	}
	

}