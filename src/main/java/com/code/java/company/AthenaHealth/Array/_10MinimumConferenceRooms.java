package com.code.java.company.AthenaHealth.Array;


import java.util.Arrays;

public class _10MinimumConferenceRooms {
    public static void main(String[] args) {
         int[] start = {2, 9, 6};
        int[] end = {4, 12, 10};
        System.out.println(minMeetingRoom(start, end));
        System.out.println(minMeetingRoomOptimised(start, end));
    }    
    //Brute force O(n^2) Time and O(1) Space
    public static int minMeetingRoom(int[] start,int[] end){
        int n = start.length;
        int room =1,result=1;
        for(int i=0;i<n;i++){
            room=1;
            for(int j=0;j<n;j++){
                if(i!=j){
                    if(start[i]>=start[j] && end[j]>start[i])
                        room++;
                }
            }
            result = Math.max(room, result);
        }
        return result;
    }
    //using two pointers , Time : O(N*logN) 
    public static int minMeetingRoomOptimised(int[] start,int[] end){
        int n = start.length;
        
        // no. of rooms at any point of time
        int room = 0;
        int res = 0;
        
        // sorting the start and end time of meetings
        Arrays.sort(start);
        Arrays.sort(end);
        
        // pointing to the current index of the start and end array
        int i = 0, j = 0;
        
        while (i < start.length) {
            
            // encountered start time of meeting
            if (start[i] < end[j]) {
                // increase no. of rooms
                room++;
                i++;
            } 
            
            // encountered end time of meeting
            else {
                // decrease no. of rooms
                room--;
                j++;
            }
            
            // updating final result
            res = Math.max(res, room);
        }
        return res;
    }
}
