package org.wecancodeit.review;

import java.util.Collection;
import java.util.HashMap;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository {
	private HashMap<Long, Review> review = new HashMap<Long, Review>();
	
	public ReviewRepository() {
		Review review1 = new Review( 012345L, 8, 20, "A Review on Reviews", "/review.jpg", "Joke Reviews", "Reviews are lame and I don't like them. However I must express how I feel about them and their ilk in the only way I know how. By writing reviews about them.");
		Review review2 = new Review( 000777L, 7, 07, "Top 10 Irish products", "/shamrock.jpg", "Top 10s", "10. Twisted shamrocks\n9. Electric Bagpipes 8. Fake Pots of Gold 7. Rainbow Loafers 6. Irish Coffee 5. Square of Turf");
		Review review3 = new Review( 370335L, 12, 17, "Why Flowers are Overrated", "/flowers.jpg", "Short Pieces", "Flowers might smell 'Nice' If you like nature and all that but the truth is they are poison.");
		Review review4 = new Review( 246010L, 1, 21, "Taco Seasoning, The Ultimate Condiment?", "/taco.jpg", "Short Pieces", "From quesadillas to burritos to tacos, we all know mexican food is delicious. However the taste of Mexico isn't limited to only their cuisine. Salt and pepper is the a staple and we put it on everything. So why not the same with taco seasoning? Try it and find out.");
		Review review5 = new Review( 124903L, 4, 20, "Top 5 Weather to Stay Indoors To", "/rain.jpg", "Top 5s", "10. Sleet 9. Hail 8. Snow 7. Rain 6. Blizzard 5. Tornados 4. Hurricanes");
		review.put(review1.getId(), review1);
		review.put(review2.getId(), review2);
		review.put(review3.getId(), review3);
		review.put(review4.getId(), review4);
		review.put(review5.getId(), review5);
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
