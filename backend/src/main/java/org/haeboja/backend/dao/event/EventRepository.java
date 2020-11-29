package org.haeboja.backend.dao.event;

import org.haeboja.backend.dto.Event;

import java.util.List;

public interface EventRepository {


    List<Event> getEventsByHouseId(long houseId);

}
