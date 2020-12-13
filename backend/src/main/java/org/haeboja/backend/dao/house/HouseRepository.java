package org.haeboja.backend.dao.house;

import org.haeboja.backend.dto.house.House;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HouseRepository {
    long save(House house);

    List<House> findAll();

    List<House> findByType(String type);

    House findById(long id);

}
