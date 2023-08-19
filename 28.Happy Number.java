// 202. Happy Number
// Easy

// Write an algorithm to determine if a number n is happy.
// A happy number is a number defined by the following process:
// Starting with any positive integer, replace the number by the sum of the squares of its digits.
// Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
// Those numbers for which this process ends in 1 are happy.
// Return true if n is a happy number, and false if not.

// Example 1:
// Input: n = 19
// Output: true
// Explanation:
// 12 + 92 = 82
// 82 + 22 = 68
// 62 + 82 = 100
// 12 + 02 + 02 = 1

// Example 2:
// Input: n = 2
// Output: false

// Solution using HashSet
class Solution {
    public int squareSum(int n) {
        int sum = 0;
        while (n > 0) {
            int num = n % 10;
            sum += num * num;
            n = n / 10;
        }
        return sum;
    }

    public boolean isHappy(int n) {
        Set<Integer> nums = new HashSet<>();
        while (n != 1 && !nums.contains(n)) {//if there is a cycle(same number repeating) or number equal to 1,come out of loop 
            nums.add(n);   // add the number to hashSet
            n = squareSum(n);
        }
        return n == 1;
    }
}

// Solution using slow fast pointer
class Solution {
    public int squareSum(int n) {
        int sum = 0;
        while (n > 0) {
            int num = n % 10;
            sum += num * num;
            n = n / 10;
        }
        return sum;
    }
    
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do {
            slow = squareSum(slow);
            fast = squareSum(squareSum(fast));
        } while (slow != fast); // checking for cycle 
        
        if (slow == 1) {
            return true;
        }
        return false;
    }
}
