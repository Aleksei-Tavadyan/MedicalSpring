package com.example.medical;

import com.example.controller.PatientController;
import com.example.entity.Patient;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        //SpringApplication.run(Application.class, args);
        PatientController patientController = PatientController.getInstance();
        List<Patient> patientList = patientController.getAll();
        for (int i=0; i<patientList.size();i++)
        {
            System.out.println(patientList.get(i).getpFullName());
        }
    }

}