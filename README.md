### Social Media Analytics Dashboard

This Java project provides a simple implementation of a Social Media Analytics Dashboard. It allows users to track and analyze metrics such as likes, shares, and comments for different social media posts.

### Features:

- **Add Post Metrics**: Users can add metrics for individual social media posts, including likes, shares, and comments.
- **Total Metrics Calculation**: The dashboard calculates the total number of likes, shares, and comments across all posts.

### How to Use:

1. Create an instance of the `SocialMediaAnalyticsDashboard` class.
2. Use the `addPostMetrics` method to add metrics for each social media post.
3. Use the `getTotalLikes`, `getTotalShares`, and `getTotalComments` methods to retrieve the total metrics.

### Example:

```java
public static void main(String[] args) {
    // Create a SocialMediaAnalyticsDashboard instance
    SocialMediaAnalyticsDashboard dashboard = new SocialMediaAnalyticsDashboard();

    // Add post metrics
    dashboard.addPostMetrics("post1", 100, 50, 20);
    dashboard.addPostMetrics("post2", 200, 75, 30);
    dashboard.addPostMetrics("post3", 150, 60, 25);

    // Display total metrics
    System.out.println("Total Likes: " + dashboard.getTotalLikes());
    System.out.println("Total Shares: " + dashboard.getTotalShares());
    System.out.println("Total Comments: " + dashboard.getTotalComments());
}

```

### Future Enhancements:

- Implement methods to calculate average metrics.
- Add support for additional social media platforms.
- Implement data visualization features for better analysis.
