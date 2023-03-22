/*
 * package streamAPI;
 * 
 * import java.util.ArrayList; import java.util.Comparator; import
 * java.util.List; import java.util.Optional; import
 * java.util.stream.Collectors;
 * 
 * public class QuestionApi { public static void main(String[] args) {
 * List<Employee7> emps = new ArrayList<Employee7>();
 * 
 * emps.add(new Employee7(1, "Jhansi", 32, "Female", "HR", 2011, 25000.0));
 * emps.add(new Employee7(2, "Smith", 25, "Male", "Sales", 2015, 13500.0));
 * emps.add(new Employee7(3, "David", 29, "Male", "Infrastructure", 2012,
 * 18000.0)); emps.add(new Employee7(4, "Orlen", 28, "Male", "Development",
 * 2014, 32500.0)); emps.add(new Employee7(5, "Charles", 27, "Male", "HR", 2013,
 * 22700.0)); emps.add(new Employee7(6, "Cathy", 43, "Male", "Security", 2016,
 * 10500.0)); emps.add(new Employee7(7, "Ramesh", 35, "Male", "Finance", 2010,
 * 27000.0)); emps.add(new Employee7(8, "Suresh", 31, "Male", "Development",
 * 2015, 34500.0)); emps.add(new Employee7(9, "Gita", 24, "Female", "Sales",
 * 2016, 11500.0)); emps.add(new Employee7(10, "Mahesh", 38, "Male", "Security",
 * 2015, 11000.5)); emps.add(new Employee7(11, "Gouri", 27, "Female",
 * "Infrastructure", 2014, 15700.0)); emps.add(new Employee7(12, "Nithin", 25,
 * "Male", "Development", 2016, 28200.0)); emps.add(new Employee7(13, "Swathi",
 * 27, "Female", "Finance", 2013, 21300.0)); emps.add(new Employee7(14,
 * "Buttler", 24, "Male", "Sales", 2017, 10700.5)); emps.add(new Employee7(15,
 * "Ashok", 23, "Male", "Infrastructure", 2018, 12700.0)); emps.add(new
 * Employee7(16, "Sanvi", 26, "Female", "Development", 2015, 28900.0));
 * 
 * 
 * Map<String, Long> map1 =
 * emps.stream().collect(Collectors.groupingBy(Employee::getGender,
 * Collectors.counting())); System.out.println(map1);
 * 
 * 
 * 
 * emps.stream().map(Employee7::getDepartement) .distinct()
 * .forEach(name->System.out.println(name));
 * 
 * 
 * 
 * Map<String , Double> map =
 * emps.stream().collect(Collectors.groupingBy(Employee7::getGender,
 * Collectors.averagingInt(Employee7::getAge))); System.out.println(map);
 * 
 * 
 * 
 * Optional<Employee7> optional =
 * emps.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee7::
 * getSalary))); if(optional.isPresent()) { Employee7 employee7 =
 * optional.get(); System.out.println(employee7);
 * 
 * 
 * emps.stream() .filter(e->e.yearOfJoining>2015) .map(e->e.name)
 * .forEach(name->System.out.println(name));
 * 
 * 
 * 
 * Map<String , Long> map=emps.stream()
 * .collect(Collectors.groupingBy(Employee7::getDepartement,Collectors.counting(
 * ))); System.out.println(map);
 * 
 * 
 * Map<String, Double> map = emps.stream()
 * .collect(Collectors.groupingBy(Employee7::getDepartment,
 * Collectors.averagingDouble(Employee::getSalary))); System.out.println(map);
 * 
 * 
 * emps.stream() .filter(e->e.getGender().equals("Male")&&
 * e.getDepartement().equals("Developement"))
 * .min(Comparator.comparing(Employee7::getAge)); if(optional.isPresent()) {
 * System.out.println(optional.get());
 * 
 * 
 * Optional<Employee7> optional = emps.stream()
 * .collect(Collectors.minBy(Comparator.comparing(Employee7::getYearOfJoining)))
 * ;
 * 
 * if(optional.isPresent()) { System.out.println(optional.get()); }
 * 
 * 
 * 
 * 
 * 
 * }
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * class Employee7 { int id; String name; int age; String gender; String
 * departement; int yearOfJoining; double salary;
 * 
 * public Employee7(int id, String name, int age, String gender, String
 * departement, int yearOfJoining, double salary) { super(); this.id = id;
 * this.name = name; this.age = age; this.gender = gender; this.departement =
 * departement; this.yearOfJoining = yearOfJoining; this.salary = salary; }
 * 
 * public int getId() { return id; }
 * 
 * public void setId(int id) { this.id = id; }
 * 
 * public String getName() { return name; }
 * 
 * public void setName(String name) { this.name = name; }
 * 
 * public int getAge() { return age; }
 * 
 * public void setAge(int age) { this.age = age; }
 * 
 * public String getGender() { return gender; }
 * 
 * public void setGender(String gender) { this.gender = gender; }
 * 
 * public String getDepartement() { return departement; }
 * 
 * public void setDepartement(String departement) { this.departement =
 * departement; }
 * 
 * public int getYearOfJoining() { return yearOfJoining; }
 * 
 * public void setYearOfJoining(int yearOfJoining) { this.yearOfJoining =
 * yearOfJoining; }
 * 
 * public double getSalary() { return salary; }
 * 
 * public void setSalary(double salary) { this.salary = salary; }
 * 
 * @Override public String toString() { return "Employee [id=" + id + ", name="
 * + name + ", age=" + age + ", gender=" + gender + ", departement=" +
 * departement + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary +
 * "]"; }
 * 
 * 
 * } }
 */