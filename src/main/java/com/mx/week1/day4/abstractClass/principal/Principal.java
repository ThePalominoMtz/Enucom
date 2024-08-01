package com.mx.week1.day4.abstractClass.principal;

import com.mx.week1.day4.abstractClass.entity.Doctor;
import com.mx.week1.day4.abstractClass.entity.Lawyer;

public class Principal {
    public static void main(String[] args) {

        // Lawyer instances
        Lawyer lawyer1 = new Lawyer("Saul", "Goodman", 40, 43223, "New Mexico University", 10, "abogado de WalterWhite", "New Mexico", 10000);
        lawyer1.work();
        lawyer1.charge(lawyer1.getType(), lawyer1.getFees());

        Doctor doctor1 = new Doctor("Doctora", "Juguetes", 10, 53434, "UNAM", 7, "Cirujano", "CDMX", 999999);
        doctor1.work();
        doctor1.charge(doctor1.getSpecialty(), doctor1.getConsultationFee());


    }
}
