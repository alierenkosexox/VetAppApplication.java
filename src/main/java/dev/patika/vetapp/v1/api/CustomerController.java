package dev.patika.vetapp.v1.api;

import dev.patika.vetapp.v1.business.abstracts.CustomerService;
import dev.patika.vetapp.v1.entities.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/customers")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping
    public Customer save(@RequestBody Customer customer){
        return customerService.save(customer);
    }
}
