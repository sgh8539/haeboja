package org.haeboja.backend.dao.event;

import org.haeboja.backend.dto.Event;
import org.haeboja.backend.dto.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class JdbcEventRepository implements EventRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Event> getEventsByHouseId(long houseId) {
        return jdbcTemplate.query(
                "select * from room where houseId = ?",
                new Object[]{houseId},
                (rs, rowNum) ->
                        new Event(
                                rs.getLong("id"),
                                rs.getLong("houseId"),
                                rs.getString("name"),
                                rs.getString("info")
                        )

        );
    }
}
