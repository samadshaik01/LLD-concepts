package org.example.design_patterns.adapter_pattern.hospital;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

        List<InsuranceCompany> insuranceCompaniesList = new ArrayList<InsuranceCompany>();

        HospitalInvoice hospitalInvoice = new HospitalInvoice("John Doe", "Eye Surgery");
        InsuranceCompany insuranceCompanyA = new InsuranceCompanyA(hospitalInvoice);


        InsuranceCompanyB companyB = new InsuranceCompanyB(hospitalInvoice);
        InsuranceCompany insuranceCompanyB = new InsuranceCompanyAdapter(companyB);

        insuranceCompaniesList.add(insuranceCompanyA);
        insuranceCompaniesList.add(insuranceCompanyB);

        for (InsuranceCompany insuranceCompany : insuranceCompaniesList) {
            System.out.println("Patient Name: " + insuranceCompany.getPatientName());
            System.out.println("Treatment Details: " + insuranceCompany.getTreatmentDeatils());
        }





    }
}
