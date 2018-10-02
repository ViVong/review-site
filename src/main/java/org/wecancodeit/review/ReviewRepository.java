package org.wecancodeit.review;

import java.util.Collection;
import java.util.HashMap;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository {
	private HashMap<Long, Review> review = new HashMap<Long, Review>();
	
	public ReviewRepository(Review...newReview) {
		for (Review reviews: newReview) {
			review.put(reviews.GetID(), reviews);
		}
	}
	
	public void addReview(Review newReview) {
		review.put(newReview.GetID(), newReview);
	}
	
	public Review oneReview(long id) {
		return review.get(id);
	}
	
	public Collection<Review> allReviews() {
		return review.values();
	}
}
