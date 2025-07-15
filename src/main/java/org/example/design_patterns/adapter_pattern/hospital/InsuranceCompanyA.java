package org.example.design_patterns.adapter_pattern.hospital;

public class InsuranceCompanyA implements InsuranceCompany {

    private final HospitalInvoice hospitalInvoice;

    public InsuranceCompanyA(HospitalInvoice hospitalInvoice) {
        this.hospitalInvoice = hospitalInvoice;
    }
    @Override
    public String getPatientName() {
        return hospitalInvoice.getPatientName();
    }

    @Override
    public String getTreatmentDeatils() {
        return hospitalInvoice.getTreatmentDeatils();
    }
}
