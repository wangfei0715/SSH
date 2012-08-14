package cn.wingfly.ssh.web.action;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.HibernateException;
import org.springframework.stereotype.Controller;

import cn.wingfly.ssh.model.Person;
import cn.wingfly.ssh.service.PersonService;

@Controller
public class PersonAction {
	@Resource
	private PersonService personService;

	private String message;
	private Person person;
	private List<Person> personlist;

	public String list() {
		personlist = personService.getAllPerson();
		return "list";
	}

	public String add() {
		if ("".equals(person.getName()) || person.getName() == null)
			message = "请输入姓名";
		else {
			try {
				personService.save(person);
				message = "添加成功";
			} catch (HibernateException e) {
				message = "添加失败";
				e.printStackTrace();
			}
		}
		return "message";
	}

	public String edit() {
		return "edit";
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<Person> getPersonlist() {
		return personlist;
	}

	public void setPersonlist(List<Person> personlist) {
		this.personlist = personlist;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

}