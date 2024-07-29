/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java 
 */
package com.icaretrack.models;

/**
 * @author Sheikh Md Abid
 * Londonmet Id : 22068727
 * College Id : NP01AI4A220051
 */
public class ICareTrackModel {
    // Defining the global variables for each attributes
    private int patientId;
    private String fullName;
    private int age;
    private String gender;
    private String address;
    private String contactNo;
    private String guardian;
    private String relation;
    private String department;
    private String dateOA;
    private String consultant;
    
    
    /**
     * This is a constructor that initialize the attributes of patients
     * @param patientId The unique identifier of patient
     * @param fullName the name of patient
     * @param age the age of patient
     * @param gender the gender of patient
     * @param address the address of patient
     * @param contactNo the contact number of patient
     * @param guardian the guardian of patient
     * @param relation the relation of guardian with patient
     * @param department the department of visit by patient
     * @param dateOA the date of appointment
     * @param consultant  the consultant visited by patient
     */
    public ICareTrackModel(int patientId, String fullName, int age, String 
            gender, String address, String contactNo, String guardian, String 
                    relation, String department, String dateOA, String 
                            consultant) 
    {
        this.patientId = patientId;
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.contactNo = contactNo;
        this.guardian = guardian;
        this.relation = relation;
        this.department = department;
        this.dateOA = dateOA;
        this.consultant = consultant;
    }
    
    
    // Getters and setters for each attributes
    /**
     * this return instance value
     * @return patientId the id of patient
     */
    public int getPatientId() {
        return patientId;
    }

    /**
     * set the patient id 
     * @param patientId  the allocated unique value of each patient
     */
    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    /**
     * returns fullname of patient
     * @return fullName the name the patient
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * set the Name of patient
     * @param fullName the name of patient
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * returns the age of patient
     * @return age 
     */
    public int getAge() {
        return age;
    }

    /**
     * set the age of patient
     * @param age age of patient
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * returns the gender of patient
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * set the gender of patient
     * @param gender 
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * returns the address of patient
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * sets the address of patient
     * @param address 
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * returns the contact of patient
     * @return contactNo
     */
    public String getContactNo() {
        return contactNo;
    }

    /**
     * sets contact number of patient
     * @param contactNo 
     */
    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    /**
     * returns the guardian name of patient
     * @return guardian
     */
    public String getGuardian() {
        return guardian;
    }

    /**
     * sets the guardian name of patient
     * @param guardian 
     */
    public void setGuardian(String guardian) {
        this.guardian = guardian;
    }

    /**
     * returns the relation of patient with guardian
     * @return relation
     */
    public String getRelation() {
        return relation;
    }

    /**
     * sets the relation of patient with guardian
     * @param relation 
     */
    public void setRelation(String relation) {
        this.relation = relation;
    }

    /**
     * gets the department of visit by patient
     * @return department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * sets the department of visit by patient
     * @param department 
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * gets the appointment date of patient
     * @return dateOA
     */
    public String getDateOA() {
        return dateOA;
    }

    /**
     * sets the appointment date of patient
     * @param dateOA 
     */
    public void setDateOA(String dateOA) {
        this.dateOA = dateOA;
    }

    /**
     * gets the doctor's name who treat the patient
     * @return consultant
     */
    public String getConsultant() {
        return consultant;
    }

    /**
     * sets the doctor's name who treat the patient
     * @param consultant 
     */
    public void setConsultant(String consultant) {
        this.consultant = consultant;
    }
    
    
    
    
    
    
}
