package dev.patika.vetapp.v1.business.concretes;

import dev.patika.vetapp.v1.business.abstracts.AnimalService;
import dev.patika.vetapp.v1.core.exception.NotFoundAnimal;
import dev.patika.vetapp.v1.core.exception.NotFoundCustomer;
import dev.patika.vetapp.v1.core.utilites.Message;
import dev.patika.vetapp.v1.dao.AnimalRepository;
import dev.patika.vetapp.v1.dao.CustomerRepository;
import dev.patika.vetapp.v1.entities.Animal;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AnimalManager implements AnimalService {

    private final AnimalRepository animalRepository;
    private final CustomerRepository customerRepository;

    @Override
    public Animal save(Animal animal) {
        if(customerRepository.findById(animal.getCustomer().getId()).isEmpty()){
            throw new NotFoundCustomer(Message.NOT_FOUND_CUSTOMER);
        }
        return animalRepository.save(animal);
    }

    @Override
    public Animal update(Animal animal) {
        getId(animal.getId());
        return animalRepository.save(animal);
    }

    @Override
    public boolean delete(Long id) {
        animalRepository.delete(getId(id));
        return true;
    }

    @Override
    public List<Animal> getAll() {
        return animalRepository.findAll();
    }

    @Override
    public Animal getId(Long id) {
        return animalRepository.findById(id).orElseThrow(() -> new NotFoundAnimal());
    }
}
