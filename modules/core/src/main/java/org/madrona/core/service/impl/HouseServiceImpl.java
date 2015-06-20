package org.madrona.core.service.impl;

import com.madrona.common.model.House;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.madrona.core.dao.HouseDao;
import org.madrona.core.dao.impl.AbstractDAO;
import org.madrona.core.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HouseServiceImpl implements HouseService {

    private static final Logger logger = LogManager.getLogger(HouseServiceImpl.class);

    @Autowired
    private HouseDao houseDao;

    @Override
    public boolean insert(House house) {
        logger.info("Inserting house information [{}] " , house);
        return houseDao.insert(house);
    }

    @Override
    public House get(long id) {
        return null;
    }
}
