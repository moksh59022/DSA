package Brown;

class FriendRequest {
    public static void main(String[] args) {
        int[] arr = {20,30,100,110,120};
        System.out.println(numFriendRequests(arr));
    }
    public static int numFriendRequests(int[] ages) {
        int[] count = new int[121]; // Age range is 1 to 120

        // Count the frequency of each age
        for (int age : ages) {
            count[age]++;
        }

        int totalRequests = 0;

        // Direct calculation without prefix sum
        for (int ageX = 15; ageX <= 120; ageX++) {
            if (count[ageX] > 0) {
                for (int ageY = 15; ageY <= 120; ageY++) {
                    if (count[ageY] > 0 && canSendRequest(ageX, ageY)) {
                        if (ageX == ageY) {
                            // If both are of the same age, subtract self-requests
                            totalRequests += count[ageX] * (count[ageX] - 1);
                        } else {
                            totalRequests += count[ageX] * count[ageY];
                        }
                    }
                }
            }
        }

        return totalRequests;
    }

    // Function to check if a friend request can be sent
    private static boolean canSendRequest(int ageX, int ageY) {
        if (ageY <= 0.5 * ageX + 7) return false;
        if (ageY > ageX) return false;
        if (ageY > 100 && ageX < 100) return false;
        return true;
    }
}

