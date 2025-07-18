import java.util.*;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>(); // Stack to store surviving asteroids

        for (int asteroid : asteroids) {
            boolean destroyed = false; // flag to track if current asteroid gets destroyed

            // Process collision: only when current asteroid moves left (<0)
            // and top of stack asteroid moves right (>0)
            while (!stack.isEmpty() && asteroid < 0 && stack.peek() > 0) {
                if (stack.peek() < -asteroid) {
                    stack.pop(); // stack asteroid explodes (smaller in size)
                    // keep checking for further collisions
                } else if (stack.peek() == -asteroid) {
                    stack.pop(); // both explode if equal
                    destroyed = true;
                    break; // stop checking
                } else {
                    destroyed = true; // current asteroid explodes (stack top is bigger)
                    break; // stop checking
                }
            }

            // If not destroyed after collisions, it survives
            if (!destroyed) {
                stack.push(asteroid);
            }
        }

        // Prepare result array from stack (reverse order since stack pops from end)
        int[] res = new int[stack.size()];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = stack.pop();
        }

        return res; // final surviving asteroids after all collisions
    }
}


// +ve meets +ve → no collision
// -ve meets -ve → no collision
// +ve meets -ve → possible collision (handled in loop)
