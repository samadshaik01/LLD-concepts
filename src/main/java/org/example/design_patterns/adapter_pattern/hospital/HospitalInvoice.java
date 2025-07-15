package org.example.design_patterns.adapter_pattern.hospital;

public class HospitalInvoice {
    private final String patientName;
    private String treatmentDeatils;

    public HospitalInvoice(String patientName, String treatmentDeatils) {
        this.patientName = patientName;
        this.treatmentDeatils = treatmentDeatils;
    }
    public String getPatientName() {
        return patientName;
    }
    public String getTreatmentDeatils() {
        return treatmentDeatils;
    }
}
