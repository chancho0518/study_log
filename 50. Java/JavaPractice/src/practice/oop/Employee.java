package practice.oop;

// 사원(VO, DTO)
public class Employee {
	protected String name;
	protected int age;
	protected String phone;
	protected String empDate;
	protected String dept;
	protected boolean marriage;
	
	public Employee() {
		super(); // 상위클래스의 생성자를 호출 → new Object()
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", phone=" + phone + ", empDate=" + empDate + ", dept="
				+ dept + ", marriage=" + marriage + "]";
	}
}
