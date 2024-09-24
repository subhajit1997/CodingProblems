package com.code.java.course.striver.A2ZDSA.Step11_Heaps.Step11_1;

/**
 * practice: https://www.codingninjas.com/studio/problems/min-heap-implementation_5480527?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
 */
public class _2MinHeapImplementation {
    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap(5);
        // Sample operations
        minHeap.insert(2);
        minHeap.insert(2);
        minHeap.insert(1);

        System.out.println("Minimum element extracted: " + minHeap.extractMinElement()); // Output: 1
        minHeap.deleteElement(1); //

    }

    static class MinHeap {
        private int[] heap;
        private int size;
        private int capacity;

        MinHeap(int cap) {
            heap = new int[cap];
            size=0;
            capacity=cap;
        }
        int left(int i){
            return (2*i+1);
        }
        int right(int i){
            return (2*i+2);
        }
        int parent(int i){
            return (i-1)/2;
        }

        void heapify(int i){
            int smallest =i;
            int li = left(i);
            int ri = right(i);
            if(li < size && heap[li] < heap[smallest]){
                smallest=li;
            }

            if(ri <size && heap[ri] < heap[smallest]){
                smallest= ri;
            }
            if(smallest != i){
                swap(i, smallest);
                heapify(smallest);
            }
        }

        void swap(int i , int smallest ){
            int temp = heap[i];
            heap[i]= heap[smallest];
            heap[smallest]= temp;
        }


        // Implement the function to remove minimum element.
        int extractMinElement() {
            if(size == 0){
                return -1;
            }
            int ans = heap[0];
            swap(0 , size-1);
            size--;
            heapify(0);
            return ans;
        }

        // Implement the function to delete an element.
        void deleteElement(int ind) {
            if(ind >=size){return;}
            swap(ind , size-1);
            size--;
            heapify(ind);
        }

        // Implement the function to insert 'val' in the heap.
        void insert(int val) {
            if(size == capacity){
                return;
            }
            heap[size] =val;
            size++;
            int i =size-1;
            while(i >=0){
                if(heap[parent(i)] > heap[i]){
                    swap(parent(i) , i);
                    i = parent(i);
                }else{break;}
            }


        }
    }

};
