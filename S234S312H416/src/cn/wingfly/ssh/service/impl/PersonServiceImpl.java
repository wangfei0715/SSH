package cn.wingfly.ssh.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.wingfly.ssh.dao.PersonDao;
import cn.wingfly.ssh.model.Person;
import cn.wingfly.ssh.service.PersonService;

@Service("personService")
@Transactional
public class PersonServiceImpl implements PersonService {

	@Resource
	private PersonDao personDao;

	public void save(Person person) {
		personDao.save(person);
	}

	public void delete(int personid) {
		personDao.delete(personid);
	}

	public void update(Person person) {
		personDao.update(person);
	}

	@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
	public Person getPerson(int personid) {
		return personDao.getPerson(personid);
	}

	@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
	public List<Person> getAllPerson() {
		return personDao.getAllPerson();
	}

}
