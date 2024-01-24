package inheritance;

public class SalesPerson extends Employee {
		float sales,commision,totalSalary;

		public SalesPerson() {
			super();
			sales=80;
		}

		public SalesPerson(int id,String name,MyDate dob,float workingdays,float perDay,float sales ) {
			super(id,name,dob,workingdays,perDay);
			this.sales = sales;
			
		}
		@Override
		public void calculate() {
		// TODO Auto-generated method stub
		super.calculate();
		if(sales>=90)
			commision=0.2f*salary;
		else if(sales>=75)
			commision=0.1f*salary;
		if(sales>=60)
			commision=0.05f*salary;
		else
			commision=0.0f;
		
		totalSalary=commision+salary;
		}
		
		@Override
		public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("Sales (in %) :  "+sales);
		System.out.println("Commision : "+commision);
		System.out.println("Total Salary : "+totalSalary);
		}
}
