public class ClosestTargetCircularArray {

    public int closestTarget(String[] words, String target, int startIndex) {
        
        int n = words.length;
        int minDist = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {

            // check target match
            if (words[i].equals(target)) {

                // forward distance
                int forward = (i - startIndex + n) % n;

                // backward distance
                int backward = (startIndex - i + n) % n;

                // minimum distance
                int dist = Math.min(forward, backward);

                // update answer
                minDist = Math.min(minDist, dist);
            }
        }

        // agar target nahi mila
        if (minDist == Integer.MAX_VALUE)
            return -1;

        return minDist;
    }

    public static void main(String[] args) {

        ClosestTargetCircularArray obj = new ClosestTargetCircularArray();

        String[] words = {"hello", "i", "am", "leetcode", "hello"};
        String target = "hello";
        int startIndex = 1;

        int result = obj.closestTarget(words, target, startIndex);

        System.out.println("Shortest Distance: " + result);
    }
}