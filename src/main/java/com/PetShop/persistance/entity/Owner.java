package com.PetShop.persistance.entity;

import jakarta.persistence.*;
import java.util.List;


    @Entity
    public class Owner {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer ID;

        @Column(name = "Nombres")
        private String ownerFirstName;

        @Column(name = "Apellidos")
        private String OwnerLastName;

        @Column(name = "Correo Electronico")
        private String OwnerEmail;

        @Column(name = "telefono")
        private String OwnerPhoneNumber;

        @Column(name = "Direccion")
        private String OwnerAddress;

        @OneToMany(mappedBy = "owner")
        private List<Pet> pets;

        public Integer getID() {
            return ID;
        }

        public void setID(Integer ID) {
            this.ID = ID;
        }

        public String getOwnerFirstName() {
            return ownerFirstName;
        }

        public void setOwnerFirstName(String ownerFirstName) {
            this.ownerFirstName = ownerFirstName;
        }

        public String getOwnerLastName() {
            return OwnerLastName;
        }

        public void setOwnerLastName(String ownerLastName) {
            OwnerLastName = ownerLastName;
        }

        public String getOwnerEmail() {
            return OwnerEmail;
        }

        public void setOwnerEmail(String ownerEmail) {
            OwnerEmail = ownerEmail;
        }

        public String getOwnerPhoneNumber() {
            return OwnerPhoneNumber;
        }

        public void setOwnerPhoneNumber(String ownerPhoneNumber) {
            OwnerPhoneNumber = ownerPhoneNumber;
        }

        public String getOwnerAddress() {
            return OwnerAddress;
        }

        public void setOwnerAddress(String ownerAddress) {
            OwnerAddress = ownerAddress;
        }

        public List<Pet> getPets() {
            return pets;
        }

        public void setPets(List<Pet> pets) {
            this.pets = pets;
        }
    }
