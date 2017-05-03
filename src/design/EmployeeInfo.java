package design;

import java.util.Scanner;

public class EmployeeInfo implements Employee{
	
 /*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
 * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
 * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
 * go to CnnEmployee class to apply all the fields and attributes.
 * 
 * Important: YOU MUST USE the 
 * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
 * Use all kind of keywords(super,this,static,final........)
 *
 */

	/*
	 * declare few static and final fields and some non-static fields
	 */
	static String companyName;
	int employeeId, salary, bonus;
	static int pension;
	String employeeName;
	 //static String performance;
	
	/*
	 * You must implement the logic for below 2 methods and 
	 * following 2 methods are prototype as well for other methods need to be design,
	 * as you will come up with the new ideas.
	 */
	
	/*
	 * you must have multiple constructor.
	 * Must implement below constructor.
	 */
	public EmployeeInfo(){
		
	}
    public EmployeeInfo(String name, int employeeId){
		
    	employeeName = name;
    	this.employeeId = employeeId;
    	System.out.println("The name of employee is " + employeeName + " EmployeeId is " + employeeId);
    	
    	}
	
	/*
	 * This methods should calculate Employee bonus based on salary and performance.
	 * Then it will return the total yearly bonus. So you need to implement the logic.
	 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on. 
	 * You can set arbitrary number for performance.
	 * So you probably need to send 2 arguments.
	 * 
	 */
	public int calculateEmployeeBonus(String performance, int salary){
		//int total=0;
		//return total;
		if(performance== "Best")
    	{
    		bonus = salary*10/100;
    		
    	}
    	
    	if(performance=="Average")
    	{
    		bonus = salary*8/100;
   
    	}
    	if(performance=="Poor"){
    		bonus = salary*5/100;
    		//salary=(salary*12)+bonus;
    	}
	
    	return bonus;
	}
	
	
	/*
	 * This methods should calculate Employee Pension based on salary and numbers of years with the company.
	 * Then it will return the total pension. So you need to implement the logic.
	 * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
	 * So you probably need to send 2 arguments.
	 * 
	 */
	public static int calculateEmployeePension(int numberofyears, int salary){
		
		if(numberofyears==1)
		pension = 5*salary/100;
		
		if(numberofyears==2)
		pension = 10*salary/100;
		
		if(numberofyears==3)
			pension = 15*salary/100;
			
		return pension;
	}
	@Override
	public int employeeId() {
		return employeeId;
	}
	@Override
	public String employeeName() {
		return employeeName;
	}
	@Override
	public void assignDepartment() {
		
	}
	@Override
	public int calculateSalary() {
		System.out.println("Enter the no of working hours in a month");
		Scanner sc = new Scanner(System.in);
		int  workinghours = sc.nextInt();
		System.out.println("enter no. of working days in a month");
		int days = sc.nextInt();
		int  salary = workinghours*days;
		return salary;
	}
	@Override
	public void benefitLayout() {
		
		salary = (salary*12)+bonus;
		System.out.println("Annual salary with bonus is " + salary);
		
	}
}
