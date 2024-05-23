package dev.patika.vetapp.v1.api;

import dev.patika.vetapp.v1.business.abstracts.AnimalService;
import dev.patika.vetapp.v1.core.config.modelMapper.ModelMapperService;
import dev.patika.vetapp.v1.core.result.ResultData;
import dev.patika.vetapp.v1.core.utilites.ResulHelper;
import dev.patika.vetapp.v1.dto.request.animal.AnimalSaveRequest;
import dev.patika.vetapp.v1.dto.response.animal.AnimalResponse;
import dev.patika.vetapp.v1.entities.Animal;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/animals")
@RequiredArgsConstructor
public class AnimalController {

    private final AnimalService animalService;
    private final ModelMapperService mapperService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResultData<AnimalResponse> saveAnimal(@Valid @RequestBody AnimalSaveRequest animalSaveRequest){
        return ResulHelper.CREATED(mapperService.forResponse().map(animalService.save(mapperService.forRequest().map(animalSaveRequest,Animal.class)),AnimalResponse.class));
    }

    @GetMapping("/{id}")
    public Animal getAnimal(@PathVariable("id") Long id){
        return animalService.getId(id);
    }

    @PutMapping
    public Animal update(@Valid @RequestBody Animal animal){
        return animalService.update(animal);
    }

    @DeleteMapping
    public boolean delete(Long id){
        animalService.delete(id);
        return true;
    }
}
