package org.wecancodeit.review;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import java.util.Collection;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.containsInAnyOrder;

public class ReviewRepositoryTest {
	
	ReviewRepository testRepo;
	
	private Review review = new Review( 012345L, 8, 20, "A review on reviews.", "/review", "General", "Reviews are lame and I don't like them");
	private Review review2 = new Review( 000777L, 7, 07, "Top 10 Irish products", "/irish", "General", "10. Twisted shammrocks\n9. Electric Bagpipes");

	
	@Test
	public void shouldFindAReview() {
		testRepo = new ReviewRepository(review);
		Review one = testRepo.oneReview(012345);
		Review two = testRepo.oneReview(000777);
		testRepo.addReview(review2);
		one = testRepo.oneReview(012345);
		two = testRepo.oneReview(000777);
		assertThat(one, is(review));
		assertThat(two, is(review2));
	}
	
	@Test
	public void shouldFindAllReviews() {
		testRepo = new ReviewRepository(review, review2);
		Collection<Review> result = testRepo.allReviews();
		assertThat(result, containsInAnyOrder(review, review2));
	}
}
