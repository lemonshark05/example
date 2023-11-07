package hotelapp;

/** A class that represents a hotel review. */
public class Review {
    private String reviewId;
    private String hotelId;
    private String reviewText;
    private String userNickname;
    private int overallRating;

    public Review(String reviewId, String hotelId,
                  String reviewText, String userNickname, int overallRating) {
        this.reviewId = reviewId;
        this.hotelId = hotelId;
        this.reviewText = reviewText;
        this.userNickname = userNickname;
        this.overallRating = overallRating;
    }

    public String getHotelId() {
        return hotelId;
    }

    public String getReviewId() {
        return reviewId;
    }

    public int getOverallRating() {
        return overallRating;
    }

    public String getReviewText() {
        return reviewText;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public String toString() {
        return reviewId + " written by " + getUserNickname() + ": " + getReviewText();
    }

}
