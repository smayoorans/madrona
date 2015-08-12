package org.madrona.core.dao.impl;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.madrona.common.Student;
import org.madrona.core.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.PreDestroy;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class StudentDaoImpl implements StudentDao {

    private static final Logger logger = LogManager.getLogger(StudentDaoImpl.class);

    @Autowired
    protected SessionFactory sessionFactory;

    //Executes before being removed from container
    @PreDestroy
    protected void destroy() {
        sessionFactory.getCurrentSession().close();
    }

    private Session getHibernateSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public boolean save(Student student) {
        logger.info("Inserting new student to database [{}]", student);
        try {
            getHibernateSession().save(student);
            return true;
        } catch (HibernateException ex) {
            logger.error("Error occurred while inserting student information  [{}], [{}] ", student, ex);
            return false;
        }
    }

    @Override
    public Student get(long studentId) {
        logger.info("Retrieving student details for student id [{}]", studentId);
        try {
            String queryString = "from Student where id = :id";
            Query query = getHibernateSession().createQuery(queryString);
            query.setLong("id", studentId);
            return (Student) query.uniqueResult();
        } catch (HibernateException ex) {
            logger.error("Error occurred while retrieving student details for student id [{}], [{}]", studentId, ex);
            return null;
        }
    }

    @Override
    public List get(String propertyName, Object value) {
        try {
            return getHibernateSession().createCriteria(Student.class)
                    .add(Restrictions.eq(propertyName, value))
                    .list();
        } catch (HibernateException ex) {
            logger.error("Error occurred while retrieving student details for student id [{}", ex);
            return null;
        }
    }

    @Override
    public int delete(long id) {
        logger.info("Deleting student information for the database for student id [{}]", id);
        try {
            String queryString = "delete Student where id = :id";
            Query query = getHibernateSession().createQuery(queryString);
            query.setLong("id", id);
            return query.executeUpdate();
        } catch (HibernateException ex) {
            logger.error("Error occurred while retrieving student details for student id [{}], [{}]", id, ex);
            return 0;
        }
    }

    @Override
    public boolean update(Student student) {
        logger.info("Updating student information with new information of [{}]", student);
        try {
            getHibernateSession().saveOrUpdate(student);
            return true;
        } catch (HibernateException ex) {
            logger.error("Error occurred while updating the student information [{}], [{}] ", student, ex);
            return false;
        }
    }

    @Override
    public List<Student> getAll() {
        String queryString = "from Student";
        Query query = getHibernateSession().createQuery(queryString);
        return (List<Student>) query.list();
    }
}
