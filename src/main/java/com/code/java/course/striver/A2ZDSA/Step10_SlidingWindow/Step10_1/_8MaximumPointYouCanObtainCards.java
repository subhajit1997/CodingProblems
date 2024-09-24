package com.code.java.course.striver.A2ZDSA.Step10_SlidingWindow.Step10_1;

/**
 * practice: https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/solutions/598055/python-js-java-go-c-o-k-sliding-window-w-visualization/
 */
public class _8MaximumPointYouCanObtainCards {
    public static void main(String[] args) {

    }

    //sliding window:
    public static int maxScore(int[] cardPoints, int k) {
        // Initial pick: pick all k crad from left hand side
        int cardPick=0;
        int right =cardPoints.length-1,left =k-1;
        for(int i=0;i<k;i++){
            cardPick +=cardPoints[i];
        }
        int max = cardPick;
        for(int i=0;i<k;i++){
            //left hand side discards one, and right hand side picks on more
            cardPick +=(cardPoints[right]-cardPoints[left]);
            //update max point
            max = Math.max(max,cardPick);
            // update card index for both sides in adjustment
            left -=1;
            right -=1;
        }
        return max;

    }
}
