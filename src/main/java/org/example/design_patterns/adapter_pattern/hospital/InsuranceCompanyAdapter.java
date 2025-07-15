package org.example.design_patterns.adapter_pattern.hospital;

public class InsuranceCompanyAdapter implements InsuranceCompany {
    private final InsuranceCompanyB insuranceCompanyB;

    public InsuranceCompanyAdapter(InsuranceCompanyB insuranceCompanyB) {
        this.insuranceCompanyB = insuranceCompanyB;
    }

    @Override
    public String getPatientName() {
        return insuranceCompanyB.fetchPatientName();
    }

    @Override
    public String getTreatmentDeatils() {
        return insuranceCompanyB.fetchTreatmentDeatils();
    }
}
