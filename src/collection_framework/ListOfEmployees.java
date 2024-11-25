package collection_framework;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfEmployees {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setName("Ramu");
		employee.setExp("2");
		employee.setRole("Dev");
		employee.setSal(20000);

		Employee employee1 = new Employee();
		employee1.setName("Shiva");
		employee1.setExp("2");
		employee1.setRole("Dev");
		employee1.setSal(50000);
		Employee employee2 = new Employee();
		employee2.setName("SHER");
		employee2.setExp("2");
		employee2.setRole("Dev");
		employee2.setSal(20000);

		Employee employee3 = new Employee();
		employee3.setName("Ravi");
		employee3.setExp("2");
		employee3.setRole("Dev");
		employee3.setSal(50009);

		List<Employee> employees = new ArrayList<>();
		employees.add(employee);
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);

		List<String> name = new ArrayList<>();

		for (Employee emp : employees) {
			if (emp.getSal() >= 50000) {
//				name.add(emp.getName());
			}
		}
		name = employees.stream().filter(x -> x.getSal() >= 50000).map(y -> y.getName()).collect(Collectors.toList());
		System.out.println(name);
	}
}
