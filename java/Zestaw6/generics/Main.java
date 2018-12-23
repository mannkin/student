package com.company;

import java.util.*;

public class Main {

    public static ArrayList<Integer> arrayList;
    public static HashSet<Integer> hashSet;
    public static LinkedList<Integer> linkedList;
    public static Stack<Integer> stack;
    public static Vector<Integer> vector;
    public static PriorityQueue<Integer> priorityQueue;
    public static TreeSet<Integer> treeSet;
    public static ArrayList<String> al;
    public static ArrayList<String> hs;
    public static ArrayList<String> ll;
    public static ArrayList<String> s;
    public static ArrayList<String> v;
    public static ArrayList<String> pq;
    public static ArrayList<String> ts;

    public static void add(AbstractCollection collection, ArrayList<String> array) {
        double averageTime = 0;
        ArrayList<Double> a;
        a = new ArrayList<>();
        for(int j=0; j < 10; j++) {
            double time = System.currentTimeMillis();
            for (int i = 0; i < 10000; i++) {
                collection.add(i);
            }
            double addTime = (System.currentTimeMillis() - time);
            a.add(addTime);
            averageTime += addTime;
        }

        double temp = 0;
        for(double x :a)
            temp += (x-averageTime/10)*(x-averageTime/10);
        double stdDev = Math.sqrt(temp);

        array.add(String.format("%.2f",averageTime/1000f));
        array.add(String.format("%.2f",stdDev/1000f));
    }

    public static void contains(AbstractCollection collection, ArrayList<String> array) {
        double averageTime = 0;
        ArrayList<Double> a;
        a = new ArrayList<>();
        for(int j=0; j < 10; j++) {
            double time = System.currentTimeMillis();
            for (int i=0; i < 10000; i++) {
                collection.contains(i);
            }
            double containsTime = (System.currentTimeMillis() - time);
            a.add(containsTime);
            averageTime += containsTime;
        }

        double temp = 0;
        for(double x :a)
            temp += (x-averageTime/10)*(x-averageTime/10);
        double stdDev = Math.sqrt(temp);

        array.add(String.format("%.2f",averageTime/1000f));
        array.add(String.format("%.2f",stdDev/1000f));
    }

    public static void remove(AbstractCollection collection, ArrayList<String> array) {
        double averageTime = 0;
        ArrayList<Double> a;
        a = new ArrayList<>();
        for(int j=0; j < 10; j++) {
            double time = System.currentTimeMillis();
            for (int i = 0; i < 10000; i++) {
                collection.remove(i);
            }
            double removeTime = (System.currentTimeMillis() - time);
            a.add(removeTime);
            averageTime += removeTime;
        }

        double temp = 0;
        for(double x :a)
            temp += (x-averageTime/10)*(x-averageTime/10);
        double stdDev = Math.sqrt(temp);

        array.add(String.format("%.2f",averageTime/1000f));
        array.add(String.format("%.2f",stdDev/1000f));
    }

    public static void usedMemory(AbstractCollection collection, ArrayList<String> array) {
        Runtime rt = Runtime.getRuntime();
        long start = rt.freeMemory();
        collection.add(0);
        long end = start - rt.freeMemory();
        array.add(String.format("%d",end));
    }

    public static void main(String[] args) {
        arrayList = new ArrayList<>();
        hashSet = new HashSet<>();
        linkedList = new LinkedList<>();
        stack = new Stack<>();
        vector = new Vector<>();
        priorityQueue = new PriorityQueue<>();
        treeSet = new TreeSet<>();

        al = new ArrayList<>();
        hs = new ArrayList<>();
        ll = new ArrayList<>();
        s = new ArrayList<>();
        v = new ArrayList<>();
        pq = new ArrayList<>();
        ts = new ArrayList<>();

        add(arrayList, al);
        add(hashSet, hs);
        add(linkedList, ll);
        add(stack, s);
        add(vector, v);
        add(priorityQueue, pq);
        add(treeSet, ts);

        remove(arrayList, al);
        remove(hashSet, hs);
        remove(linkedList, ll);
        remove(stack, s);
        remove(vector, v);
        remove(priorityQueue, pq);
        remove(treeSet, ts);

        contains(arrayList, al);
        contains(hashSet, hs);
        contains(linkedList, ll);
        contains(stack, s);
        contains(vector, v);
        contains(priorityQueue, pq);
        contains(treeSet, ts);

        usedMemory(arrayList, al);
        usedMemory(hashSet, hs);
        usedMemory(linkedList, ll);
        usedMemory(stack, s);
        usedMemory(vector, v);
        usedMemory(priorityQueue, pq);
        usedMemory(treeSet, ts);

        System.out.println("ArrayList      "+al);
        System.out.println("HashSet        "+hs);
        System.out.println("LinkedList     "+ll);
        System.out.println("Stack          "+s);
        System.out.println("Vector         "+v);
        System.out.println("PriorityQueue  "+pq);
        System.out.println("TreeSet        "+ts);
    }
}
