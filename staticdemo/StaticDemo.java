package staticdemo;

public class StaticDemo {

	public static void main(String[] args) {
		Employee e[] = new Employee[10];
		for(int i=0; i<e.length ;i++)
		{
			e[i] = new Employee();
		}
		e[0].eid="007";
		e[0].name="JamesBond";
		e[1].eid="001";
		e[1].name="Harvey";
		e[1].company= "Specter";// not possible since it is static
		Employee.company="Specter";
		Employee.calculate();
		
		

	}

}
