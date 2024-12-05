package com.exercise.status;

public enum Status {
    Pending("Status Pending"),
    Approved("Status Approved"),
    Rejected("Status Rejected");

    private String statusDescription;

    
    Status(String statusDescription) {
        this.statusDescription = statusDescription;
    }

    
    public String getStatusDescription() {
        return statusDescription;
    }
}