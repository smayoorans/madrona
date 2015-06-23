package org.madrona.core.service.impl;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.madrona.common.Staff;
import org.madrona.core.dao.StaffDao;
import org.madrona.core.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StaffServiceImpl implements StaffService {

    private static final Logger logger = LogManager.getLogger(StaffServiceImpl.class);

    @Autowired
    private StaffDao staffDao;

    @Override
    public boolean insert(Staff staff) {
        return staffDao.insert(staff);
    }

}
