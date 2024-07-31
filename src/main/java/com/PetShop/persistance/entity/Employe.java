package com.PetShop.persistance.entity;

import jakarta.persistence.*;

public class Employe {


    @Entity
    @Table(name = "Empleados")

    public class employe {

        @GeneratedValue(strategy = GenerationType.IDENTITY)

        @Column(name = "Nombre")
        private String employeeFirstName;

        @Column(name = "Apellido")
        private String getEmployeeLastName;

        @Column(name = "telefono")
        private String employeePhone;

        @Column(name = "email")
        private String employeePhoneEmail;

        public String getEmployeeFirstName() {
            return employeeFirstName;
        }

        public void setEmployeeFirstName(String employeeFirstName) {
            this.employeeFirstName = employeeFirstName;
        }

        public String getGetEmployeeLastName() {
            return getEmployeeLastName;
        }

        public void setGetEmployeeLastName(String getEmployeeLastName) {
            this.getEmployeeLastName = getEmployeeLastName;
        }

        public String getEmployeePhone() {
            return employeePhone;
        }

        public void setEmployeePhone(String employeePhone) {
            this.employeePhone = employeePhone;
        }

        public String getEmployeePhoneEmail() {
            return employeePhoneEmail;
        }

        public void setEmployeePhoneEmail(String employeePhoneEmail) {
            this.employeePhoneEmail = employeePhoneEmail;
        }
    }
}
