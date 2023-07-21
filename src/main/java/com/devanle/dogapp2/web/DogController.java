package com.devanle.dogapp2.web;

import com.devanle.dogapp2.entity.Breed;
import com.devanle.dogapp2.entity.Dog;
import com.devanle.dogapp2.sevices.DogServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dogs")
public class DogController {

    @Autowired
    private DogServices dogServices;
    @GetMapping("/all")
    public ResponseEntity<List<Dog>> getAllDogs(){
        List<Dog> allDogs = dogServices.getAllDogs();
        return new ResponseEntity<List<Dog>>(allDogs, HttpStatus.OK);
    }

    @GetMapping("/allbreeds")
    public ResponseEntity<List<Breed>> getAllDogBreeds(){
        return new ResponseEntity<List<Breed>>(dogServices.dogBreeds(), HttpStatus.OK);
    }

    @GetMapping("/breed")
    public ResponseEntity<Breed> singleBreed(@RequestBody Long id){
        return new ResponseEntity<Breed>(dogServices.retrieveDogBreedById(id), HttpStatus.OK);
    }

    @GetMapping("/names")
    public ResponseEntity<List<String>> getNames(){
        return new ResponseEntity<List<String>>(dogServices.retrieveDogNames(), HttpStatus.OK);
    }


}
