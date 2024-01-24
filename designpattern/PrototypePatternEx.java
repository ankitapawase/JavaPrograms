package designpattern;

interface Prototype{
	public Prototype getClone();
}
class Employee implements Prototype{
	private int id,age;
	private String name;
	private float salary;
	
	public Employee(int id, int age, String name, float salary) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", age=" + age + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public Prototype getClone() {
		return new Employee(id, age, name, salary);
	}
}
public class PrototypePatternEx {

	public static void main(String[] args) {
		Employee employee=new Employee(101, 23, "Ankita", 44000);
		System.out.println(employee);
		Employee employee1=new Employee(102, 24, "Priya", 54000);
		System.out.println(employee1);

	}

}
