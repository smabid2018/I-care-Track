/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.icaretrack.util;

/**
 * @author Sheikh Md Abid
 * Londonmet Id : 22068727
 * College Id : NP01AI4A220051
 */
public class StringUtil {
    public static String searchFound = " Patients found";
    public static String searchNotFound = "No Patients found";
    public static String fullNameBlank = "Patient's name cannot be blank";
    public static String ageBlank = "Age cannot be blank";
    public static String invalidAge = "Invalid age";
    public static String emptyGender = "Gender is not selected";
    public static String emptyAddress = "Address cannot be empty";
    public static String emptyGuardian = "Guardian name cannot be empty";
    public static String emptyContact = "Contact No. cannot be empty";
    public static String lessContact = "Contact No. cannot be less than 6 digit";
    public static String emptyDOA = "Appointment date cannot be empty";
    public static String emptyID = "ID cannot be empty";
    public static String lessID = "ID cannot be less than 4 digit";
    public static String invalidField = "Invalid Fields";
    public static String admitFailed = """
                                       Patient ID already present!!! 
                                       Please enter new ID""";
    public static String idTaken = "ID already taken";
    public static String admitted= "Patient admitted successfully";
    public static String replaced = "Patient replaced successfully";
    public static String formatError = "Please Enter correct inputs";
    public static String selectPatient = 
            """
                Select any patient's first !
                Double click on patient's data you want to edit:)""";

    public static String selectToDelete = """
                                          No patient selected!
                                          Select from list to delete!!""";
    
    public static String editProgress = 
            """
                Edit in progress!!
                It deletes permanently and editing panel will lost also!!!""";
    public static String confirmDelete = """
                                         Are you sure!
                                         It deletes permanently!!!""";
    public static String symbols = "Symbol are not allowed";
    public static String numbers = "Number are not allowed";
    public static String alphabets = "Alphabets are not allowed";
    public static String invalidChar = "Invalid Character pressed";
    public static String deleted = "Deleted Successfully";
    public static String edit = """
                                Are you sure to edit?
                                If data is present in this section will be lost
                                 Click 'Yes' then use this section!""";
    public static String dateError = "Date is not appropriate format";
}
