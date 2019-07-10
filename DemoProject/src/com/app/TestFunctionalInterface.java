/*
 * package com.app;
 * 
 * import java.util.ArrayList; import java.util.Collections; import
 * java.util.Comparator; import java.util.List; import
 * java.util.function.IntBinaryOperator;
 * 
 * @FunctionalInterface interface MyFunctionalInterface { public int
 * myAbstractMethod(int a);
 * 
 * }
 * 
 * class Customer { int id; String name;
 * 
 * public Customer() { // TODO Auto-generated constructor stub }
 * 
 * public Customer(int id, String name) { super(); this.id = id; this.name =
 * name; }
 * 
 * public int getId() { return id; }
 * 
 * public void setId(int id) { this.id = id; }
 * 
 * public String getName() { return name; }
 * 
 * public void setName(String name) { this.name = name; }
 * 
 * @Override public int hashCode() { final int prime = 31; int result = 1;
 * result = prime * result + ((name == null) ? 0 : name.hashCode()); return
 * result; }
 * 
 * @Override public boolean equals(Object obj) { if (this == obj) return true;
 * if (obj == null) return false; if (getClass() != obj.getClass()) return
 * false; Customer1 other = (Customer1) obj; if (name == null) { if (other.name
 * != null) return false; } else if (!name.equals(other.name)) return false;
 * return true; }
 * 
 * @Override public String toString() { return "Employee [id=" + id + ", name="
 * + name + "]"; }
 * 
 * }
 * 
 * public class TestFunctionalInterface { public static Customer1[]
 * getCustomers() { Customer1[] arr = new Customer1[5]; arr[0] = new
 * Customer1(101, "Nikhil"); arr[1] = new Customer1(102, "Sanket"); arr[2] = new
 * Customer1(103, "Prachi"); arr[3] = new Customer1(104, "Atul"); arr[4] = new
 * Customer1(105, "Brijesh"); return arr;
 * 
 * }
 * 
 * 
 * public static void main(String[] args) {
 * 
 * MyFunctionalInterface ref = (num)->num * num; //using user defined functional
 * interface
 * 
 * System.out.println("Result :: "+ref.myAbstractMethod(10));
 * 
 * IntBinaryOperator ref1 = (a, b) -> a + b; // using predefined functional
 * interface
 * 
 * System.out.println(ref1.applyAsInt(10, 20)); }
 * 
 * 
 * public static void main(String[] args) { List<Customer1> cList = new
 * ArrayList<Customer1>(); Customer1[] arr =
 * TestFunctionalInterface.getCustomers(); for (Customer1 customer : arr) {
 * cList.add(customer); }
 * 
 * 
 * 
 * System.out.
 * println("-------------------------Sorting using Annonymous inner class--------------------------"
 * ); //We have been using functional interfaces even prior to java8, //they
 * were used by creating anonymous inner classes using these interfaces
 * 
 * System.out.println("Before Sorting"); cList.forEach(System.out::println);
 * 
 * Collections.sort(cList, new Comparator<Customer1>() { //by using annonymous
 * inner classes
 * 
 * @Override public int compare(Customer1 o1, Customer1 o2) { return
 * o1.getName().compareTo(o2.getName()); } });
 * 
 * System.out.println("After Sorting"); cList.forEach(System.out::println);
 * 
 * 
 * 
 * System.out.
 * println("-------------------------Sorting usingList.sort method--------------------------" 
 * ); // in java8 List interface also introduced sort(Comparator<? super E>
 * c)method hence there is no need to use Collections sort method
 * System.out.println("Before Sorting"); cList.forEach(System.out::println);
 * cList.sort(new Comparator<Customer1>() {
 * 
 * @Override public int compare(Customer1 o1, Customer1 o2) { return
 * o1.getName().compareTo(o2.getName()); }
 * 
 * }); System.out.println("After Sorting"); cList.forEach(System.out::println);
 * 
 * 
 * System.out.
 * println("-------------------------Sorting using Lambda expression--------------------------"
 * ); //list sorting by name using lambda expression
 * System.out.println("Before Sorting"); cList.forEach(System.out::println);
 * cList.sort((Customer1 c1,Customer1 c2)
 * ->c1.getName().compareTo(c2.getName())); System.out.println("After Sorting");
 * cList.forEach(System.out::println);
 * 
 * 
 * System.out.println("Before Sorting"); cList.forEach(System.out::println);
 * Comparator<Customer1> nameCompare =
 * (c1,c2)->c1.getName().compareTo(c2.getName());
 * cList.sort(nameCompare.reversed()); System.out.println("After Sorting");
 * cList.forEach(System.out::println);
 * 
 * }
 * 
 * 
 * }
 */