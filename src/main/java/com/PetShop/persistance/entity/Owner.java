package com.PetShop.persistance.entity;

import jakarta.persistence.*;

public class Owner {
    @Entity
    @Table(name = "nombres")
    public class owner {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;
        @Column(name = "Nombre del propietario")
        private String name;

        @Column(name = "Apellidos")
        private String Apellidos;

        @Column(name = "Correo electronico")
        private String correoElectronico;

        @Column(name = "Direccion")
        private String Direccion;

        @Column(name = "telefono")
        private String telefono;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getApellidos() {
            return Apellidos;
        }

        public void setApellidos(String apellidos) {
            Apellidos = apellidos;
        }

        public String getCorreoElectronico() {
            return correoElectronico;
        }

        public void setCorreoElectronico(String correoElectronico) {
            this.correoElectronico = correoElectronico;
        }

        public String getDireccion() {
            return Direccion;
        }

        public void setDireccion(String direccion) {
            Direccion = direccion;
        }

        public String getTelefono() {
            return telefono;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }
    }
}
