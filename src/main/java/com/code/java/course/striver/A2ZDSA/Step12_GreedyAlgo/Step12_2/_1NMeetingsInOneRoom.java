package com.code.java.course.striver.A2ZDSA.Step12_GreedyAlgo.Step12_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * learn:https://takeuforward.org/data-structure/n-meetings-in-one-room/
 * prcatice:https://www.codingninjas.com/studio/problems/maximum-meetings_1062658?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
 */
public class _1NMeetingsInOneRoom {
    public static void main(String[] args) {

    }
    //using greedy approach
    /**
     * Overall TC: O(n) +O(n log n) + O(n) ~O(n log n)
     *
     * Space Complexity: O(n)
    **/
     public static int maximumMeetings(int[] start, int[] end) {
        int n = start.length;
        ArrayList<meeting> meet = new ArrayList<>();

        for(int i = 0; i < start.length; i++)
            meet.add(new meeting(start[i], end[i], i+1));

        meetingComparator mc = new meetingComparator();
        Collections.sort(meet, mc);
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(meet.get(0).pos);
        int limit = meet.get(0).end;

        for(int i = 1;i<start.length;i++) {
            if(meet.get(i).start > limit) {
                limit = meet.get(i).end;
                answer.add(meet.get(i).pos);
            }
        }
        return answer.size();
    }
}
class meeting {
    int start;
    int end;
    int pos;

    meeting(int start, int end, int pos)
    {
        this.start = start;
        this.end = end;
        this.pos = pos;
    }
}
class meetingComparator implements Comparator<meeting>
{
    @Override
    public int compare(meeting o1, meeting o2)
    {
        if (o1.end < o2.end)
            return -1;
        else if (o1.end > o2.end)
            return 1;
        else if(o1.pos < o2.pos)
            return -1;
        return 1;
    }
}

