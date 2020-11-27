package org.haeboja.backend.service;

import org.haeboja.backend.dao.accommodation.AccommodationRepository;
import org.haeboja.backend.dto.Accommodation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccommodationService {

    @Autowired
    AccommodationRepository accommodationRepository;

    @Autowired
    Accommodation   accommodation;

    public List<Accommodation> getAccommodationsByType(String type) {
        return accommodationRepository.findByType(type);
    }
}
