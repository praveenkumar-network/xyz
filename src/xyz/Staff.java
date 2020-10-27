package xyz;

import java.math.BigDecimal;

public class Staff {

    private String name;
    private int age;
    private BigDecimal salary;
    private String lastName;
    private double amount;
    
    public Staff() {
	}
	public Staff(String name, int age, BigDecimal salary,String lastName,double amount) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.lastName=lastName;
		this.amount=amount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}

}