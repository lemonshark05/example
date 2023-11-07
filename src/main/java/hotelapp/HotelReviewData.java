package hotelapp;

import java.util.*;

/** A class that stores the hotel reviews data in maps - note that
 *  this class is different from the one in project 1.
 *  Read the question carefully; the second map, was NOT in project 1.
 */
public class HotelReviewData {

    // A map where the key is a hotelId and a value is a list of reviews for this hotelId
    private Map<String, List<Review>> reviewsMap = new HashMap<>();

    /** Add a review to the reviewsMap
     *
     * @param hotelId id of the hotel
     * @param review review for the hotel with the given hotelId
     */
    public void addReview(String hotelId, Review review) {
        // Do not change this function
        if (!reviewsMap.containsKey(hotelId))
            reviewsMap.put(hotelId, new ArrayList<>());
        reviewsMap.get(hotelId).add(review);
    }

    /** Return a list reviews for a given hotel
     *
     * @param hotelId hotel id
     * @return a list of reviews for this hotel id
     */
   public List<Review> getReviews(String hotelId) {
       if (!reviewsMap.containsKey(hotelId)) {
           return new ArrayList<>();
       }
        return Collections.unmodifiableList(reviewsMap.get(hotelId));
   }
}
