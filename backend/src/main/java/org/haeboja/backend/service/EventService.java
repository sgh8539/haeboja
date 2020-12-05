package org.haeboja.backend.service;

import org.haeboja.backend.dao.event.EventRepository;
import org.haeboja.backend.dto.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {

    @Autowired
    EventRepository eventRepository;

    public List<Event> getEventsByHouseId(long houseId) {
        return eventRepository.getEventsByHouseId(houseId);
    }
}
