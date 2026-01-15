package com.learning.JAVA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 1,5
 * 2,3
 * 3,8
 * 1,2
 * 4,7
 */

public class Example12 {
    public static void main(String[] args) {
        List<Intervals> lst = Arrays.asList(
                new Intervals(1,5),
                new Intervals(2,3),
                new Intervals(3,8),
                new Intervals(1,2),
                new Intervals(4,7)
        );
        lst.sort(Comparator.comparingInt(a->a.end));
        lst.stream().forEach((a)-> System.out.println(a.start+" "+a.end));
        int collisions = collisionCollect(lst);
        System.out.println(collisions);

    }

    private static int collisionCollect(List<Intervals> lst) {
        int count = 0;
        Intervals prev = lst.get(0);

        for (int i = 1; i < lst.size(); i++) {
            Intervals curr = lst.get(i);
            if (prev.end > curr.start) {
                count++;
                prev.end = Math.max(prev.end, curr.end); // Merge the intervals
            } else {
                prev = curr;
            }
        }
        return count;
    }
}

class Intervals{
    int start;
    int end;
    Intervals(int start,int end){
        this.start=start;
        this.end=end;
    }
}