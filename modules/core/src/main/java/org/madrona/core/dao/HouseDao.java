package org.madrona.core.dao;

import com.madrona.common.model.House;

/**
 * @author Mayooran
 */
public interface HouseDao {

    boolean insert(House house);

    House get(long id);
}
