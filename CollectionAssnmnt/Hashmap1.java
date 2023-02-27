package CollectionAssnmnt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class Hashmap1 {
	public static List<String> sortSales(Map<String, Integer> sales) {
		//Implement your logic here and change the return statement accordingly
		List<String> employees = sales.entrySet().stream()
				.sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
				.map(Map.Entry::getKey)
				.collect(Collectors.toList());
		return employees;
	}

	public static void main(String args[]) {
	    Map<String, Integer> sales = new HashMap<String, Integer>();
		sales.put("Mathew", 50);
		sales.put("Lisa", 76);
		sales.put("Courtney", 45);
		sales.put("David", 49);
		sales.put("Paul", 49);
		
		List<String> employees = sortSales(sales);
		
		System.out.println("Employees in the decreasing order of their sales\n=====================================");
		for (String employeeName : employees) {
			System.out.println(employeeName);
		}
	}
}
