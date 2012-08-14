package cn.wingfly.ssh.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import cn.wingfly.ssh.dao.PersonDao;
import cn.wingfly.ssh.model.Person;

@Repository
public class PersonDaoImpl implements PersonDao {

	@Resource
	private SessionFactory sessionFactory;

	public void save(Person person) {
		sessionFactory.getCurrentSession().save(person);
	}

	public void delete(int personid) {
		sessionFactory.getCurrentSession()
				.delete(
						sessionFactory.getCurrentSession().load(Person.class,
								personid));
	}

	public void update(Person person) {
		sessionFactory.getCurrentSession().merge(person);
	}

	public Person getPerson(int personid) {
		return (Person) sessionFactory.getCurrentSession().get(Person.class,
				personid);
	}

	@SuppressWarnings("unchecked")
	public List<Person> getAllPerson() {
		String queryString = "from Person";
		Query queryObject = sessionFactory.getCurrentSession().createQuery(
				queryString);
		return queryObject.list();
	}

}
