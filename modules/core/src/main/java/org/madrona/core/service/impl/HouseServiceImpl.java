package org.madrona.core.service.impl;

import org.madrona.common.House;
import org.madrona.core.dao.HouseDao;
import org.madrona.core.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class HouseServiceImpl implements HouseService {

    @Autowired
    private HouseDao houseDao;

    @Override
    @Transactional
    public boolean save(House house) {
        return houseDao.save(house);
    }

    @Override
    @Transactional
    public House get(long id) {
        return houseDao.get(id);
    }

    @Override
    @Transactional
    public boolean update(House house) {
        return houseDao.update(house);
    }
}
