package org.haeboja.backend.dao.coupon;

import org.haeboja.backend.dto.Coupon;

import java.util.List;

public interface CouponRepository {
    List<Coupon> getCouponByUserId(String userId);
}
