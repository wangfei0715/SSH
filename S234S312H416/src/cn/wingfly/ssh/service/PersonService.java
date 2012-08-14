package cn.wingfly.ssh.service;

import java.util.List;

import org.hibernate.HibernateException;

import cn.wingfly.ssh.model.Person;

public interface PersonService {

	public abstract void save(Person person) throws HibernateException;

	public abstract void update(Person person) throws HibernateException;

	public abstract Person getPerson(int personid);

	public abstract List<Person> getAllPerson();

	public abstract void delete(int personid) throws HibernateException;

}