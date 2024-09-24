package com.code.java.company.Lenskart;
/**
 * https://www.codingninjas.com/studio/problems/lru-cache-implementation_670276?interviewProblemRedirection=true
 *
 * Problem statement
 * Design and implement a data structure for Least Recently Used (LRU) cache to support the following operations:
 *
 * 1. get(key) - Return the value of the key if the key exists in the cache, otherwise return -1.
 *
 * 2. put(key, value), Insert the value in the cache if the key is not already present or update the value of the given key if the key is already present. When the cache reaches its capacity, it should invalidate the least recently used item before inserting the new item.
 */

import java.util.HashMap;
import java.util.Map;


class Node {
    Node prev;
    Node next;
    int key, value;
    Node(int _key, int _value) {
        key = _key;
        value = _value;
    }
}
public class LRUCache {
    int capacity;
    Map< Integer, Node > map = new HashMap<>();
    Node head = new Node(0, 0);
    Node tail = new Node(0, 0);

    public LRUCache(int _capacity) {
        capacity = _capacity;
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            remove(node);
            insert(node);
            return node.value;
        } else {
            return -1;
        }
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            remove(map.get(key));
        }
        if (map.size() == capacity) {
            remove(tail.prev);
        }
        insert(new Node(key, value));
    }
    private void remove(Node node) {
        map.remove(node.key);
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void insert(Node node) {
        map.put(node.key, node);
        node.next = head.next;
        node.next.prev = node;
        head.next = node;
        node.prev = head;
    }
}

