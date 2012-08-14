package cn.wingfly.ssh.service;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.wingfly.ssh.model.Person;

public class PersonServiceTest {

	private static PersonService personService;
	private static Person person = new Person("单元测试S234S312H416");
	private static Person personnew = new Person(1, "单元测试new66");

	@Before
	public void setUp() throws Exception {
		try {
			ApplicationContext cxt = new ClassPathXmlApplicationContext(
					"applicationContext.xml");
			personService = (PersonService) cxt.getBean("personService");
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testSave() {
		personService.save(person);
	}

	@Test
	public void testUpdate() {
		personService.update(personnew);
	}

	@Test
	public void testDelete() {
		personService.delete(1);
	}

	@Test
	public void testGetPerson() {
		Person person = personService.getPerson(1);
		System.out.println(person.getId() + " " + person.getName());
	}

	@Test
	public void testGetAllPerson() {
		for (Person person : personService.getAllPerson()) {
			System.out.println(person.getId() + " " + person.getName());
		}
	}

}
