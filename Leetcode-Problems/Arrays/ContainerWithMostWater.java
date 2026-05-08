

            // Move smaller height pointer
            if (height[l] <= height[r]) {
                l++;
            } else {
                r--;
            }
        }

        return maxArea;
    }
}

/*
Approach:
1. Use two pointers: left at start, right at end.
2. Calculate area = min(height[left], height[right]) * width.
3. Update maximum area.
4. Move the pointer with smaller height inward.
5. Continue until pointers meet.
*/
