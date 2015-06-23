package org.madrona.core.dao.impl;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.madrona.common.Staff;
import org.madrona.core.dao.StaffDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.PreDestroy;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class StaffDaoImpl implements StaffDao {

    private static final Logger logger = LogManager.getLogger(StaffDaoImpl.class);

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
    @Transactional
    public boolean insert(Staff staff) {
        logger.info("Inserting new student to database [{}]", staff);
        try {
            getHibernateSession().save(staff);
            return true;
        } catch (HibernateException ex) {
            logger.error("Error occurred while inserting student information  [{}], [{}] ", staff, ex);
            return false;
        }
    }


}
