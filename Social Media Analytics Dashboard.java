import java.util.HashMap;
import java.util.Map;

public class SocialMediaAnalyticsDashboard {
    
    private Map<String, Integer> likesMap;
    private Map<String, Integer> sharesMap;
    private Map<String, Integer> commentsMap;
    
    public SocialMediaAnalyticsDashboard() {
        likesMap = new HashMap<>();
        sharesMap = new HashMap<>();
        commentsMap = new HashMap<>();
    }
    
    public void addPostMetrics(String postId, int likes, int shares, int comments) {
        likesMap.put(postId, likes);
        sharesMap.put(postId, shares);
        commentsMap.put(postId, comments);
    }
    
    public int getTotalLikes() {
        int totalLikes = 0;
        for (int likes : likesMap.values()) {
            totalLikes += likes;
        }
        return totalLikes;
    }
    
    public int getTotalShares() {
        int totalShares = 0;
        for (int shares : sharesMap.values()) {
            totalShares += shares;
        }
        return totalShares;
    }
    
    public int getTotalComments() {
        int totalComments = 0;
        for (int comments : commentsMap.values()) {
            totalComments += comments;
        }
        return totalComments;
    }
    
    public static void main(String[] args) {
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
}
