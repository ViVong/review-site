package org.wecancodeit.review;

import java.util.HashMap;

public class ReviewRepository {
	HashMap<Long, Review> review = new HashMap<Long, Review>();
	
	public void addReview( long id, int month, int date, String title, String url, String category, String content) {
		Review newReview = new Review(id, month, date, title, url, category, content);
		review.put(newReview.GetID(), newReview);
	}
	
	public Review oneReview(long id) {
		return review.get(id);
	}
	
	public HashMap<Long, Review> allReviews() {
		return review;
	}
}
