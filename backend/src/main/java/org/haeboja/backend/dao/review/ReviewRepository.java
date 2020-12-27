package org.haeboja.backend.dao.review;

import org.haeboja.backend.dto.Review;

import java.util.List;

public interface ReviewRepository {
    long save(Review review);

    List<Review> getReviewsByHouseId(long houseId);
}
