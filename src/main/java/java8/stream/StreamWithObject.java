package java8.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamWithObject {

	public static void main(String[] args) {

	
		
		List<Employee> empList = getAllEmployee();
		List<String> list = empList.stream().sorted(Comparator.comparingInt(Employee::getId).reversed()).limit(3)
				.map(Employee::getName).collect(Collectors.toList());

		list.stream().forEach(System.out::println);

		System.out.println("---------------------get All Active Employee--------------------------");

		List<String> activeEmpList = empList.stream().filter(e1 -> e1.isActive() == true).map(Employee::getName)
				.collect(Collectors.toList());

		activeEmpList.stream().forEach(System.out::println);
		System.out.println();
		System.out.println("-------------------- Collectors ----------------------------");
		System.out.println();

		System.out.println("----------------------- Collect Result to List--------------------------------");
		List<Employee> collect = empList.stream().filter(e1 -> e1.isActive()).collect(Collectors.toList());
		System.out.println("List :" + collect);

		System.out.println();
		System.out.println("----------------------- Collect Result to Set-----------------------------------");
		Set<Employee> collect2 = empList.stream().filter(e1 -> e1.isActive()).collect(Collectors.toSet());
		System.out.println("Set :" + collect2);

		System.out.println();
		System.out.println("----------------------- Collect Result to Map---------------------------");
		Map<Integer, Employee> collect3 = empList.stream().filter(e1 -> e1.isActive())
				.collect(Collectors.toMap(e1 -> e1.getId(), e1 -> e1));
		System.out.println("Map :" + collect3);

		System.out.println();
		System.out.println("----------------------- Collector Joining string-------------------------------");
		String collect4 = empList.stream().map(e -> e.getName()).collect(Collectors.joining(","));
		System.out.println("Collector joining ressult :" + collect4);

		System.out.println();
		System.out.println("----------------------- Collector groupingBy----------------------------");
		Map<String, List<Employee>> collect5 = empList.stream().collect(Collectors.groupingBy(e -> e.getDept()));
		System.out.println("Grouping By :" + collect5);

		System.out.println();
		System.out.println("------------ Count employee in each department groupingBy---------------");
		Map<String, Long> collect6 = empList.stream()
				.collect(Collectors.groupingBy(Employee::getDept, Collectors.counting()));
		System.out.println("Count Grouping By :" + collect6);

		System.out.println();
		System.out.println(
				"----- Using Parallel Stream : Used only when input size is more than 10000 elements------------");
		Map<String, List<Employee>> collect7 = empList.stream().parallel()
				.collect(Collectors.groupingBy(Employee::getDept));
		System.out.println("Group by Department :" + collect7);

	}

	private static List<Employee> getAllEmployee() {

		List<Employee> empList = new ArrayList<>();
		Employee emp1 = new Employee(1, "Raj", true, "Finanace");
		Employee emp2 = new Employee(2, "Kumar", false, "Finanace");
		Employee emp3 = new Employee(3, "Ajay", true, "Auto");
		Employee emp4 = new Employee(4, "Ram", false, "Auto");
		Employee emp5 = new Employee(5, "Shyam", true, "Admin");
		Employee emp6 = new Employee(6, "Radheshyam", false, "Sales");
		Employee emp7 = new Employee(7, "Lakhan", true, "Sales");

		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		empList.add(emp6);
		empList.add(emp7);

		return empList;
	}
}
