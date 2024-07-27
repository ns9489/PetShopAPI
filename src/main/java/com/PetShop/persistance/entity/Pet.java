package com.PetShop.persistance.entity;

import jakarta.persistence.*;

public class Pet {
   @Entity
   @Table(name = "mascotas")
    public class pet {
       @Id
       @GeneratedValue(strategy = GenerationType.IDENTITY)
       private Integer id;

       @Column(name = "nombre")
       private String name;

      @Column(name = "especies")
       private  String especies;

      @Column(name = "edad")
      private int age;

      @Column(name = "genero")
      private String gander;

      public String getName() {
         return name;
      }

      public void setName(String name) {
         this.name = name;
      }

      public Integer getId() {
         return id;
      }

      public void setId(Integer id) {
         this.id = id;
      }

      public String getEspecies() {
         return especies;
      }

      public void setEspecies(String especies) {
         this.especies = especies;
      }

      public int getAge() {
         return age;
      }

      public void setAge(int age) {
         this.age = age;
      }

      public String getGander() {
         return gander;
      }

      public void setGander(String gander) {
         this.gander = gander;
      }
   }

}
