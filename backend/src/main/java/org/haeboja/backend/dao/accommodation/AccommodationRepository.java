package org.haeboja.backend.dao.accommodation;

import org.haeboja.backend.dto.Accommodation;

import java.util.List;

public interface AccommodationRepository {
    long save(Accommodation accommodation);

    List<Accommodation> findAll();

    List<Accommodation> findByType(String type);

    Accommodation findById(long id);

}
