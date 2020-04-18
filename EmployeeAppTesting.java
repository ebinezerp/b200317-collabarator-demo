public class EmployeeAppTesting{
	
	
	public static void testEmployeeNameComparator(){
		
		Employee emp1 = new Employee(101,"ravi",35);
		Employee emp2 = new Employee(102, "kishore", 55);
		
		EmployeeNameComparator comparator = new EmployeeNameComparator();
		int value = comparator.compare(emp1,emp2);
		
		assert value>0 : "Wrong implementation";
		
		System.out.println("Test successful");
		
	}
	
	
	public static void main(String[] args){
		
		
		testEmployeeNameComparator();
		
	}
	
}