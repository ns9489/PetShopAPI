package com.PetShop.persistance;

import com.PetShop.persistance.crud.MedicalHistoryCrudRepository;
import com.PetShop.persistance.entity.InvoiceDetail;
import com.PetShop.persistance.entity.MedicalHistory;
import com.PetShop.persistance.entity.Owner;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class MedicalHistoryRepository {
    private MedicalHistoryCrudRepository medicalHistoryCrudRepository;

    public List<MedicalHistory> getAll(){
        return (List<MedicalHistory>) medicalHistoryCrudRepository.findAll();
    }
    public Optional<MedicalHistory> getMedicalHistorylByID(int id){
        return medicalHistoryCrudRepository.findById(id);
    }
    public MedicalHistory save (MedicalHistory medicalHistory){

        return medicalHistoryCrudRepository.save( medicalHistory);
    }
    public void delete (int id){
        medicalHistoryCrudRepository.deleteById(id);
    }


}
