package org.example.design_patterns.adapter_pattern.hospital;

public class InsuranceCompanyB {

    private String patientName;
    private String treatmentDeatils;

    public InsuranceCompanyB(HospitalInvoice hospitalInvoice) {
        this.patientName = hospitalInvoice.getPatientName();
        this.treatmentDeatils = hospitalInvoice.getTreatmentDeatils();
    }

    public String fetchPatientName() {
        return patientName;
    }

    public String fetchTreatmentDeatils() {
        return treatmentDeatils;
    }
}
