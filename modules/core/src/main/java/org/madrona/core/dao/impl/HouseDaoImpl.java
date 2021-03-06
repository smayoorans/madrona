package org.madrona.core.dao.impl;

import org.madrona.common.House;
import org.madrona.core.dao.HouseDao;
import org.springframework.stereotype.Repository;

@Repository
public class HouseDaoImpl extends AbstractDAO<House> implements HouseDao {

    public HouseDaoImpl() {
        super(House.class);
    }

    @Override
    public boolean save(House house) {
        return super.save(house);
    }

    @Override
    public House get(long id) {
        return super.getById(id);
    }

    @Override
    public boolean update(House house) {
        return super.update(house);
    }
}
