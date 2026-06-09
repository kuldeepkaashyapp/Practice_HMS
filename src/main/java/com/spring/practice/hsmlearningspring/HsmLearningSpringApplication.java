package com.spring.practice.hsmlearningspring;

import com.spring.practice.hsmlearningspring.Hospital.Hospital;
import com.spring.practice.hsmlearningspring.database.DataBaseBean;
import com.spring.practice.hsmlearningspring.doctor.Doctor;
import com.spring.practice.hsmlearningspring.patient.Patient;
import com.spring.practice.hsmlearningspring.pharmacy.Pharmacy;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HsmLearningSpringApplication {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");

        System.out.println("====================================");
        System.out.println("    HOSPITAL MANAGEMENT SYSTEM");
        System.out.println("====================================");


        // DATABASE


        System.out.println("\n===== DATABASE =====");

        DataBaseBean dataBaseBean =
                context.getBean("dataBase", DataBaseBean.class);

        dataBaseBean.init();

        // HOSPITAL


        System.out.println("\n===== HOSPITAL DETAILS =====");

        Hospital hospital =
                context.getBean("hospital", Hospital.class);

        System.out.println("Hospital Name    : "
                + hospital.getHospitalName());

        System.out.println("Hospital Address : "
                + hospital.getHospitalAddress());

        hospital.displayHospitalDetails();


        // DOCTOR


        System.out.println("\n===== DOCTOR DETAILS =====");

        Doctor doctor =
                context.getBean("doctor", Doctor.class);

        System.out.println(doctor);


        doctor.writePrescribe("Azithromycin");

        System.out.println("\nPrescription Written:");

        System.out.println(
                doctor.getPricescription()
        );


        // PATIENT


        System.out.println("\n===== PATIENT DETAILS ===");

        Patient patient =
                context.getBean("Patient", Patient.class);

        System.out.println("Patient ID      : "
                + patient.getPatientId());

        System.out.println("Patient Name    : "
                + patient.getPatientName());

        System.out.println("Patient Gender  : "
                + patient.getPatientGender());

        System.out.println("Patient Age     : "
                + patient.getAge());

        System.out.println("Patient Address : "
                + patient.getAddress());

        System.out.println("\nAssigned Doctor:");

        System.out.println(
                patient.getDoctor()
        );


        // PHARMACY


        System.out.println("\n===== PHARMACY DETAILS =====");

        Pharmacy pharmacy =
                context.getBean("phamarcy", Pharmacy.class);

        System.out.println("\nStock Before Selling:");

        System.out.println(
                pharmacy.getStock()
        );

        System.out.println("\nMedicine Dispensing:");

        String medicineStatus =
                pharmacy.getMedicine(
                        doctor.getPricescription()
                );

        System.out.println(medicineStatus);

        System.out.println("\nStock After Selling:");

        System.out.println(
                pharmacy.getStock()
        );

        // COMPLETE WORKFLOW


        System.out.println("\n===== COMPLETE WORKFLOW =====");

        System.out.println(
                doctor.getDoctorName()
                        + " prescribed medicines to "
                        + patient.getPatientName()
        );

        System.out.println(
                "Prescription:\n"
                        + doctor.getPricescription()
        );

        System.out.println(
                "\nMedicines Dispensed Successfully."
        );

        System.out.println(
                "\nPatient belongs to : "
                        + patient.getAddress().getCity()
        );

        // SHUTDOWN


        System.out.println("\n===== APPLICATION SHUTDOWN =====");

        if (context instanceof ClassPathXmlApplicationContext) {
            ((ClassPathXmlApplicationContext) context).close();
        }

        System.out.println(
                "Spring Container Closed Successfully"
        );
    }
}