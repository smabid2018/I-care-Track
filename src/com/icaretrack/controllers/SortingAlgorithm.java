/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.icaretrack.controllers;

import com.icaretrack.models.ICareTrackModel;
import java.util.ArrayList;

/**
 * @author Sheikh Md Abid
 * Londonmet Id : 22068727
 * College Id : NP01AI4A220051
 */

public class SortingAlgorithm {
    /**
     * This method sort the element by using respective filter 
     * @param models the main ArrayList that store all patient information
     * @param sortBy the desired filter that selected by user
     */
    public void sort(ArrayList<ICareTrackModel> models, String sortBy) {
        int dataSize = models.size();
        // stops the sorting if model has only one element or less
        if (dataSize <= 1) {
            return;
        }
        // mid index to divide the arraylist into two halves
        int mid = dataSize / 2;
        // two divided arraylist from the main arraylist
        ArrayList<ICareTrackModel> firstModels = new ArrayList<>(models
                .subList(0, mid));
        ArrayList<ICareTrackModel> secondModels = new ArrayList<>(models
                .subList(mid, dataSize));
        // divides both arraylist recursively
        sort(firstModels, sortBy);
        sort(secondModels, sortBy);
        // merge arraylist after sort completes
        merge(firstModels, secondModels, models, sortBy);
    }
    /**
     * compares the divided elements and merge accordingly in ascending order
     * @param firstModels the divided first halves of main arrayList
     * @param secondModels the divided second halves of main arrayList
     * @param mainModels the main patient list as arrayList
     * @param sortBy the desired filter from the user
     */
    private void merge(ArrayList<ICareTrackModel> firstModels, ArrayList
            <ICareTrackModel> secondModels,ArrayList<ICareTrackModel> mainModels,
            String sortBy) {
        int firstCounter = 0;
        int secondCounter = 0;
        int mainArrayCounter = 0;

        while (firstCounter < firstModels.size() && secondCounter < secondModels
                .size()) {
            switch (sortBy) { // switch filter to return output accordingly
                case "Patient ID" -> {
                    if ((firstModels.get(firstCounter)).getPatientId() < 
                            (secondModels.get(secondCounter).getPatientId())) 
                    {
                        mainModels.set(mainArrayCounter, firstModels
                                .get(firstCounter));
                        firstCounter++;
                    } else {
                        mainModels.set(mainArrayCounter, secondModels
                                .get(secondCounter));
                        secondCounter++;
                    }
                }
                case "Full Name" -> {
                    if ((firstModels.get(firstCounter)).getFullName()
                            .compareTo((secondModels.get(secondCounter)
                            .getFullName())) <= 0) 
                    {
                        mainModels.set(mainArrayCounter, firstModels
                                .get(firstCounter));
                        firstCounter++;
                    } else {
                        mainModels.set(mainArrayCounter, secondModels
                                .get(secondCounter));
                        secondCounter++;
                    }
                }
                case "Age" -> {
                    if ((firstModels.get(firstCounter)).getAge()< 
                            (secondModels.get(secondCounter).getAge())) 
                    {
                        mainModels.set(mainArrayCounter, firstModels
                                .get(firstCounter));
                        firstCounter++;
                    } else {
                        mainModels.set(mainArrayCounter, secondModels
                                .get(secondCounter));
                        secondCounter++;
                    }
                }
                case "Address" -> {
                    if (firstModels.get(firstCounter).getAddress()
                            .compareTo(secondModels.get(secondCounter)
                                    .getAddress()) <= 0) 
                    {
                        mainModels.set(mainArrayCounter, firstModels
                                .get(firstCounter));
                        firstCounter++;
                    } else {
                        mainModels.set(mainArrayCounter, secondModels
                                .get(secondCounter));
                        secondCounter++;
                    }
                }
                case "Contact No." -> {
                    if (firstModels.get(firstCounter).getContactNo().
                            compareTo(secondModels.
                                    get(secondCounter).getContactNo()) <= 0) 
                    {
                        mainModels.set(mainArrayCounter, firstModels.
                                get(firstCounter));
                        firstCounter++;
                    } else {
                        mainModels.set(mainArrayCounter, secondModels
                                .get(secondCounter));
                        secondCounter++;
                    }
                }
                case "Gender" -> {
                    if (firstModels.get(firstCounter).getGender().compareTo(
                            secondModels.get(secondCounter).
                                    getGender()) <= 0) 
                    {
                        mainModels.set(mainArrayCounter, firstModels.
                                get(firstCounter));
                        firstCounter++;
                    } else {
                        mainModels.set(mainArrayCounter, secondModels
                                .get(secondCounter));
                        secondCounter++;
                    }
                }
                case "Guardian" -> {
                    if (firstModels.get(firstCounter).getGuardian().
                            compareTo(secondModels.get(secondCounter)
                                    .getGuardian()) <= 0) {
                        mainModels.set(mainArrayCounter, firstModels.
                                get(firstCounter));
                        firstCounter++;
                    } else {
                        mainModels.set(mainArrayCounter, secondModels
                                .get(secondCounter));
                        secondCounter++;
                    }
                }
                case "Relation" -> {
                    if (firstModels.get(firstCounter).getRelation().
                            compareTo(secondModels.get(secondCounter)
                                    .getRelation()) <= 0) 
                    {
                        mainModels.set(mainArrayCounter, firstModels.
                                get(firstCounter));
                        firstCounter++;
                    } else {
                        mainModels.set(mainArrayCounter, secondModels
                                .get(secondCounter));
                        secondCounter++;
                    }
                }
                case "Appointment Date" -> {
                    if (firstModels.get(firstCounter).getDateOA().
                            compareTo(secondModels.get(secondCounter
                            ).getDateOA()) <= 0) 
                    {
                        mainModels.set(mainArrayCounter, firstModels.
                                get(firstCounter));
                        firstCounter++;
                    } else {
                        mainModels.set(mainArrayCounter, secondModels.
                                get(secondCounter));
                        secondCounter++;
                    }
                }
                case "Department" -> {
                    if (firstModels.get(firstCounter).getDepartment().
                            compareTo(secondModels.get(secondCounter)
                                    .getDepartment()) <= 0) 
                    {
                        mainModels.set(mainArrayCounter, firstModels.
                                get(firstCounter));
                        firstCounter++;
                    } else {
                        mainModels.set(mainArrayCounter, secondModels
                                .get(secondCounter));
                        secondCounter++;
                    }
                }
                case "Consultant" -> {
                    if (firstModels.get(firstCounter).getConsultant().
                            compareTo(secondModels.get(secondCounter)
                                    .getConsultant()) <= 0) {
                        mainModels.set(mainArrayCounter, firstModels.
                                get(firstCounter));
                        firstCounter++;
                    } else {
                        mainModels.set(mainArrayCounter, secondModels.
                                get(secondCounter));
                        secondCounter++;
                    }
                }
                default -> {
                    return;
                }
            }
            mainArrayCounter++;
        }

        while (firstCounter < firstModels.size()) {
            mainModels.set(mainArrayCounter, firstModels.
                    get(firstCounter));
            firstCounter++;
            mainArrayCounter++;
        }

        while (secondCounter < secondModels.size()) {
            mainModels.set(mainArrayCounter, secondModels.
                    get(secondCounter));
            secondCounter++;
            mainArrayCounter++;
        }
    }
}
