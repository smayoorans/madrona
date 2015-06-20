package org.madrona.core.service;

import org.madrona.common.House;

/**
 *  Sport House Related Interface
 */
public interface HouseService {

    boolean insert(House house);

    House get(long id);

    boolean update(House house);
}
