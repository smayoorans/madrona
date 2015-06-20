package org.madrona.core.dao.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PreDestroy;
import java.io.Serializable;
import java.util.List;

/**
 * Abstract class for all Data Access Object Operations
 *
 * @param <T>
 * @author Mayooran
 */

@Repository
public abstract class AbstractDAO<T extends Serializable> implements Serializable {

    private static final Logger logger = LogManager.getLogger(AbstractDAO.class);

    @Autowired
    protected SessionFactory sessionFactory;
    protected T object;
    protected Class clazz;

    public AbstractDAO(Class clazz) {
        this.clazz = clazz;
    }

    //Executes before being removed from container
    @PreDestroy
    protected void destroy() {
        sessionFactory.getCurrentSession().close();
    }

    private Session getHibernateSession() {
        return sessionFactory.openSession();
    }

    @Transactional
    protected boolean insert(T object) {
        logger.info("Inserting new {} to database [{}]", clazz.getSimpleName(), object);
        try {
            getHibernateSession().save(object);
            logger.info("Successfully inserted new {} to database [{}]", clazz.getSimpleName(), object);
            return true;
        } catch (HibernateException ex) {
            logger.error("Error occurred while inserting {} information  [{}], [{}] ", clazz.getSimpleName(), object, ex);
            return false;
        }
    }

    @Transactional
    protected T getById(long id) {
        logger.info("Retrieving {} details for id [{}]", clazz.getSimpleName(), id);
        try {
            String queryString = "from " + clazz.getSimpleName() + " where id = :id";
            Query query = getHibernateSession().createQuery(queryString);
            query.setLong("id", id);
            object = (T) query.uniqueResult();
            return object;
        } catch (HibernateException ex) {
            logger.error("Error occurred while retrieving {} details for id [{}], [{}]", clazz.getSimpleName(), id, ex);
            return null;
        }
    }

    @Transactional
    protected int deleteById(long id) {
        logger.info("Deleting {} information for the database for student id [{}]",clazz.getSimpleName(), id);
        try{
            String queryString = "delete " + clazz.getSimpleName() + " where id = :id";
            Query query = getHibernateSession().createQuery(queryString);
            query.setLong("id", id);
            return query.executeUpdate();
        } catch (HibernateException ex) {
            logger.error("Error occurred while retrieving {} details for student id [{}], [{}]",clazz.getSimpleName(), id, ex);
            return 0;
        }

    }


    @Transactional
    protected boolean update(T object) {
        logger.info("Updating {} information with new information of [{}]", clazz.getSimpleName(), object);
        try {
            getHibernateSession().merge(object);
            return true;
        } catch (HibernateException ex) {
            logger.error("Error occurred while updating the {} information [{}], [{}] ",clazz.getSimpleName(), object, ex);
            return false;
        }
    }

    @Transactional
    protected List<T> getAll() {
        String queryString = "from " + clazz.getSimpleName();
        Query query = getHibernateSession().createQuery(queryString);
        return (List<T>)query.list();
    }
}