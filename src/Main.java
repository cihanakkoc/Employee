
public class Main {

	public static void main(String[] args)
	{
		String name = "Ali";
		String surname = "Can";
		double salary = 3000;
		
		Employee e1 = new Employee(name, surname, salary);
		
		name = "Ayþe";
		surname = "Can";
		salary = 5000;
		
		Employee e2 = new Employee(name, surname, salary);
		
		System.out.println(e1);
		System.out.println(e2);
		
		e2.setSalary(-1);
		e1.setSalary(e1.getSalary() + 500);
		
		System.out.println(e1);
		System.out.println(e2);
		
		String info = e1.toString();
		System.out.println(info);
	}
	
}
