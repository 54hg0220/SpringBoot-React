package guan.com.demo;

import guan.com.demo.model.Employee;
import guan.com.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	public void run(String... args) throws Exception{
		Employee employee1 = new Employee();
		employee1.setFirstName("Guan");
		employee1.setLastName("Huang");
		employee1.setEmailId("guanh@gmail.com");
		employeeRepository.save(employee1);

		Employee employee2 = new Employee();
		employee2.setFirstName("Joe");
		employee2.setLastName("Lee");
		employee2.setEmailId("Joe@gmail.com");
		employeeRepository.save(employee2);
	}

}
