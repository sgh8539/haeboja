package org.haeboja.backend.dao.coupon;

import org.haeboja.backend.dto.Coupon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class jdbcCouponRepository implements CouponRepository{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Coupon> getCouponByUserId(String userId) {
        return jdbcTemplate.query(
                "select * from coupon where userId = ?",
                new Object[] {userId},
                (rs, rowNum) ->
                        new Coupon(
                                rs.getLong("id"),
                                rs.getString("user_id"),
                                rs.getString("name"),
                                rs.getInt("discount"),
                                rs.getDate("from_date"),
                                rs.getDate("to_date"),
                                rs.getString("usabelHouses")
                        )
        );
    }
}
