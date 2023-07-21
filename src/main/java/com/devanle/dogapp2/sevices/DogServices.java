package com.devanle.dogapp2.sevices;

import com.devanle.dogapp2.entity.Breed;
import com.devanle.dogapp2.entity.Dog;
import com.devanle.dogapp2.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DogServices {
    @Autowired
    DogRepository dogRepository;

    public List<Dog> getAllDogs(){
        return (List<Dog>) dogRepository.findAll();
    }

    public List<Breed> dogBreeds(){
        List<Dog> dogs = (List<Dog>)(dogRepository.findAll());
        List<Breed> breeds = new ArrayList<>();
        for(Dog dog : dogs){
            breeds.add(dog.getBreed());
        }
        return breeds;
    }

    public Breed retrieveDogBreedById(Long id){
        return dogRepository.findById(id).get().getBreed();
    }

    public List<String> retrieveDogNames(){
        List<Dog> dogs = (List<Dog>)dogRepository.findAll();
        List<String> dogNames = new ArrayList<>();
        for(Dog dog: dogs){
            dogNames.add(dog.getName());
        }
//        List<String> dogNames = dogRepository.findAllName();
        return dogNames;
    }
}
