package org.haeboja.backend.dao.house;

import org.haeboja.backend.dto.House;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JdbcHouseRepository implements HouseRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public long save(House house) {
        return jdbcTemplate.update(
                "insert into house (id, type, style, name, address, score, ownerWords, photos, info) values (?,?,?,?,?,?,?,?,?)",
                house.getId(),
                house.getType(),
                house.getStyle(),
                house.getName(),
                house.getAddress(),
                house.getScore(),
                house.getOwnerWords(),
                house.getPhotos(),
                house.getInfo()
        );
    }

    @Override
    public List<House> findAll() {
        return jdbcTemplate.query(
                "select * from house",
                (rs, rowNum) ->
                        new House(
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
    public List<House> findByType(String type) {
        return jdbcTemplate.query(
                "select * from house where type = ?",
                new Object[]{type},
                (rs, rowNum) ->
                        new House(
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
    public House findById(long id) {
        return jdbcTemplate.queryForObject(
                "select * from house where id = ?",
                new Object[]{id},
                (rs, rowNum) ->
                        new House(
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