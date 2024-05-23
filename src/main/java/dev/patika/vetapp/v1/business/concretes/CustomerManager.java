package dev.patika.vetapp.v1.business.concretes;

import dev.patika.vetapp.v1.business.abstracts.CustomerService;
import dev.patika.vetapp.v1.dao.CustomerRepository;
import dev.patika.vetapp.v1.entities.Animal;
import dev.patika.vetapp.v1.entities.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerManager implements CustomerService {

    private final CustomerRepository customerRepository;

    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer update(Customer customer) {
        getId(customer.getId());
        return customerRepository.save(customer);
    }

    @Override
    public boolean delete(Long id) {
        customerRepository.delete(getId(id));
        return true;
    }

    @Override
    public List<Customer> getAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer getId(Long id) {
        return customerRepository.findById(id).orElseThrow();
    }
}
