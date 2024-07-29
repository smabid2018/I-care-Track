/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.icaretrack.controllers;

import com.icaretrack.models.ICareTrackModel;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Sheikh Md Abid
 * Londonmet Id : 22068727
 * College Id : NP01AI4A220051
 */
public class SearchingAlgorithm {
    /**
     * This method perform search in ArrayList and return a searched list
     * @param searchValue user input
     * @param model the main arrayList
     * @param low the minimum index of arrayList
     * @param high the maximum index of arrayList
     * @param filter the desired column of table
     * @return resultModel as searched list
     */
    public static List<ICareTrackModel> performBinarySearchAll(
            String searchValue,
            ArrayList<ICareTrackModel> model,
            int low,
            int high,
            String filter
    ) {
        // Stores the search result
        List<ICareTrackModel> resultModels = new ArrayList<>(); 
        // temporary search key with case and white space insensetive
        String tempSearchValue = searchValue.trim().toLowerCase();

        while (low <= high) {
            int mid = low + (high - low) / 2;
            String midValue = getColumnValue(model.get(mid), filter)
                    .trim().toLowerCase();
            // compares the search values with middle object of list
            int result = midValue.compareTo(tempSearchValue); 

            // Check if the searchValue is present at mid
            if (result == 0) {
                // Add the model to the result list
                resultModels.add(model.get(mid));

                // Check for other occurrences in the left and right halves
                int left = mid - 1;
                while (left >= low && getColumnValue(model.get(left),
                        filter).trim().toLowerCase()
                        .equals(tempSearchValue)) {
                    resultModels.add(model.get(left));
                    left--;
                }

                int right = mid + 1;
                while (right <= high && getColumnValue(model
                        .get(right), filter).trim().toLowerCase()
                        .equals(tempSearchValue)) {
                    resultModels.add(model.get(right));
                    right++;
                }

                return resultModels;
            }

            // If searchValue is greater, ignore the left half
            if (result < 0) {
                low = mid + 1;
            }

            // If searchValue is smaller, ignore the right half
            else {
                high = mid - 1;
            }
        }

        // If we reach here, then the searchValue was not present
        return resultModels;
    }
    /**
     * This method return the value of respective filter in each object of model
     * class
     * @param model the main arrayList
     * @param filter the desired column
     * @return value of desired column in each row as string
     */
    private static String getColumnValue(ICareTrackModel model, String filter) {
        return switch (filter) {
            case "Patient ID" -> String.valueOf(model.getPatientId());
            case "Full Name" -> model.getFullName();
            case "Age" -> String.valueOf(model.getAge());
            case "Gender" -> model.getGender();
            case "Address" -> model.getAddress();
            case "Contact No." -> model.getContactNo();
            case "Guardian" -> model.getGuardian();
            case "Relation" -> model.getRelation();
            case "Appointment Date" -> model.getDateOA();
            case "Department" -> model.getDepartment();
            case "Consultant" -> model.getConsultant();
            default -> "";
        };
    }
    
}
