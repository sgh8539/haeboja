package org.haeboja.backend.service;

import org.haeboja.backend.dao.review.ReviewRepository;
import org.haeboja.backend.dto.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {

    @Autowired
    ReviewRepository reviewRepository;

    public List<Review> getReviewsByHouseId(long houseId){
        return reviewRepository.getReviewsByHouseId(houseId);
    }
}
