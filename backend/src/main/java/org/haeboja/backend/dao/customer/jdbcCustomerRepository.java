package org.haeboja.backend.dao.customer;

import org.haeboja.backend.dto.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class jdbcCustomerRepository implements CustomerRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public long save(Customer customer) {
        return jdbcTemplate.update("insert into customer (id, name, nick_name, phone_number)" +
                    "values ( ?,?,?,? )",
                customer.getId(),
                customer.getName(),
                customer.getNickname(),
                customer.getPhoneNumber()
        );
    }

    public Customer getCustomerById(String id) {
        return jdbcTemplate.queryForObject(
                "select * from customer where id = ?",
                new Object[]{id},
                (rs, rowNum) -> new Customer(
                        rs.getString("id"),
                        rs.getString("name"),
                        rs.getString("nick_name"),
                        rs.getString("phone_number")
                )
        );
    }
}
