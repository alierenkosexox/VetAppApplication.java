package dev.patika.vetapp.v1.business.abstracts;

import dev.patika.vetapp.v1.entities.Animal;

import java.util.List;

public interface AnimalService {
    Animal save(Animal animal);

    Animal update(Animal animal);

    boolean delete(Long id);

    List<Animal> getAll();

    Animal getId(Long id);
}
