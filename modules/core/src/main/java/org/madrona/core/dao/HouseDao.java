package org.madrona.core.dao;

import org.madrona.common.House;

/**
 * @author Mayooran
 */
public interface HouseDao {

    boolean save(House house);

    House get(long id);

    boolean update(House house);
}
