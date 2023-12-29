package com.clection.pro1;

import java.util.HashMap;
import java.util.Map;

public class Collection3 {

	public static void main(String[] args) {
        // Create a HashMap 
        Map<String, Integer> studentMarksMap = new HashMap<>();

        // Add some sample data to the HashMap
        studentMarksMap.put("S001", 90);
        studentMarksMap.put("S002", 85);
        studentMarksMap.put("S003", 92);
        studentMarksMap.put("S004", 88);

        // Print student IDs and marks
        System.out.println("Student IDs and Marks:");

        for (Map.Entry<String, Integer> entry : studentMarksMap.entrySet()) {
            String studentId = entry.getKey();
            int marks = entry.getValue();
            System.out.println("Student ID: " + studentId + ", Marks: " + marks);
        }
        System.out.println("Size of HashMap: " + studentMarksMap.size());
    }

}
