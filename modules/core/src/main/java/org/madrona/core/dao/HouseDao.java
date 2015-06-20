package org.madrona.core.dao;

import org.madrona.common.House;

/**
 * @author Mayooran
 */
public interface HouseDao {

    boolean insert(House house);

    House get(long id);

    boolean update(House house);
}
