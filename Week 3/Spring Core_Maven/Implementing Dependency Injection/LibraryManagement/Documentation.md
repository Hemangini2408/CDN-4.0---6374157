import java.util.*;

class EditDistanceCalculator {

    // Function Signature: EditDistance(String s1, String s2)
    public static int EditDistance(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        int[][] dp = new int[m + 1][n + 1];

        // Initialize base cases
        for (int i = 0; i <= m; i++) dp[i][0] = i;
        for (int j = 0; j <= n; j++) dp[0][j] = j;

        // Fill the DP table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1]; // No operation needed
                } else {
                    dp[i][j] = 1 + Math.min(
                        dp[i - 1][j - 1], // Substitution
                        Math.min(dp[i - 1][j], // Deletion
                                 dp[i][j - 1]) // Insertion
                    );
                }
            }
        }

        return dp[m][n];
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read full line and split by comma
    
        String input = sc.nextLine();
        String[] parts = input.split(",");

        if (parts.length != 2) {
            System.out.println("Invalid input format. Please use: \"string1\", \"string2\"");
            return;
        }

        // Clean up quotes and whitespace
        String s1 = parts[0].trim().replaceAll("^\"|\"$", "");
        String s2 = parts[1].trim().replaceAll("^\"|\"$", "");

        // Call the function and print result
        int result = EditDistanceCalculator.EditDistance(s1, s2);
    
        System.out.println(result);

        sc.close();
    }
}
