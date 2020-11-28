package org.haeboja.backend.dao.accommodation;

import org.haeboja.backend.dao.accommodation.AccommodationRepository;
import org.haeboja.backend.dto.Accommodation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JdbcAccommodationRepository implements AccommodationRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public long save(Accommodation accommodation) {
        return jdbcTemplate.update(
                "insert into accommodation (id, type, style, name, address, score, ownerWords, photos, info) values (?,?,?,?,?,?,?,?,?)",
                accommodation.getId(),
                accommodation.getType(),
                accommodation.getStyle(),
                accommodation.getName(),
                accommodation.getAddress(),
                accommodation.getScore(),
                accommodation.getOwnerWords(),
                accommodation.getPhotos(),
                accommodation.getInfo()
        );
    }

    @Override
    public List<Accommodation> findAll() {
        return jdbcTemplate.query(
                "select * from accommodation",
                (rs, rowNum) ->
                        new Accommodation(
                                rs.getLong("id"),
                                rs.getString("type"),
                                rs.getString("style"),
                                rs.getString("name"),
                                rs.getString("address"),
                                rs.getDouble("score"),
                                rs.getString("ownerWords"),
                                rs.getBytes("photos"),
                                rs.getString("info")
                        )
        );
    }

    @Override
    public List<Accommodation> findByType(String type) {
        return jdbcTemplate.query(
                "select * from accommodation where type = ?",
                new Object[]{type},
                (rs, rowNum) ->
                        new Accommodation(
                                rs.getLong("id"),
                                rs.getString("type"),
                                rs.getString("style"),
                                rs.getString("name"),
                                rs.getString("address"),
                                rs.getDouble("score"),
                                rs.getString("ownerWords"),
                                rs.getBytes("photos"),
                                rs.getString("info")
                        )

        );
    }

    @Override
    public Accommodation findById(long id) {
        return jdbcTemplate.queryForObject(
                "select * from accommodation where id = ?",
                new Object[]{id},
                (rs, rowNum) ->
                        new Accommodation(
                                rs.getLong("id"),
                                rs.getString("type"),
                                rs.getString("style"),
                                rs.getString("name"),
                                rs.getString("address"),
                                rs.getDouble("score"),
                                rs.getString("ownerWords"),
                                rs.getBytes("photos"),
                                rs.getString("info")
                        )
        );
    }
}
