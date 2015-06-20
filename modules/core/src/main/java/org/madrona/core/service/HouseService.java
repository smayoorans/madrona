package org.madrona.core.service;

import com.madrona.common.model.House;

public interface HouseService {

    boolean insert(House house);

    House get(long id);
}
