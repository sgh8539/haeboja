package org.haeboja.backend.dao.review;

import org.haeboja.backend.dto.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class jdbcReviewRepository implements ReviewRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public long save(Review review) {
        return jdbcTemplate.update(
                "insert into review (id, author, house_id, room_name, score, title, contents) values (?,?,?,?,?,?,?)",
                review.getId(),
                review.getAuthor(),
                review.getHouseId(),
                review.getRoomName(),
                review.getScore(),
                review.getTitle(),
                review.getContents()
        );
    }

    @Override
    public List<Review> getReviewsByHouseId(long houseId) {
        return jdbcTemplate.query(
                "select * from room where house_id = ?",
                new Object[]{houseId},
                (rs, rowNum) ->
                        new Review(
                                rs.getLong("id"),
                                rs.getString("author"),
                                rs.getLong("house_id"),
                                rs.getString("room_name"),
                                rs.getDouble("score"),
                                rs.getString("title"),
                                rs.getString("contents")
                        )
        );
    }
}
