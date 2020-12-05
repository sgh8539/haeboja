package org.haeboja.backend.dao.accommodation;

import org.haeboja.backend.dto.Accommodation;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccommodationRepository {
    long save(Accommodation accommodation);

    List<Accommodation> findAll();

    List<Accommodation> findByType(String type);

    Accommodation findById(long id);

}
