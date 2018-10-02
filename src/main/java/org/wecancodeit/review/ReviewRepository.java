package org.wecancodeit.review;

import java.util.Collection;
import java.util.HashMap;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository {
	private HashMap<Long, Review> review = new HashMap<Long, Review>();
	
	public ReviewRepository() {
		Review review1 = new Review( 012345L, 8, 20, "A review on reviews.", "/review", "General", "Reviews are lame and I don't like them");
		Review review2 = new Review( 000777L, 7, 07, "Top 10 Irish products", "https://c4.staticflickr.com/4/3898/15020047401_b007dd849d_o.jpg", "General", "10. Twisted shammrocks\n9. Electric Bagpipes");
		review.put(review1.getId(), review1);
		review.put(review2.getId(), review2);
	}
	
	public ReviewRepository(Review...newReview) {
		for (Review reviews: newReview) {
			review.put(reviews.getId(), reviews);
		}
	}
	
	public void addReview(Review newReview) {
		review.put(newReview.getId(), newReview);
	}
	
	public Review oneReview(long id) {
		return review.get(id);
	}
	
	public Collection<Review> allReviews() {
		return review.values();
	}
}
