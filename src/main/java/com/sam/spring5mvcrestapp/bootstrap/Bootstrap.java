package com.sam.spring5mvcrestapp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sam.spring5mvcrestapp.domain.Category;
import com.sam.spring5mvcrestapp.domain.Customer;
import com.sam.spring5mvcrestapp.repository.CategoryRepository;
import com.sam.spring5mvcrestapp.repository.CustomerRepository;


@Component
public class Bootstrap implements CommandLineRunner{

    
    private final CategoryRepository categoryRespository;
    private final CustomerRepository customerRepository;

    public Bootstrap(CategoryRepository categoryRespository, CustomerRepository customerRepository) {
        this.categoryRespository = categoryRespository;
        this.customerRepository = customerRepository;
    }

   

    @Override
    public void run(String... args) throws Exception {
       
    	loadCategories();
    	loadCustomers();

    }
    
    private void loadCategories() {
    	
    	 Category fruits = new Category();
         fruits.setName("Fruits");

         Category dried = new Category();
         dried.setName("Dried");

         Category fresh = new Category();
         fresh.setName("Fresh");

         Category exotic = new Category();
         exotic.setName("Exotic");

         Category nuts = new Category();
         nuts.setName("Nuts");

         categoryRespository.save(fruits);
         categoryRespository.save(dried);
         categoryRespository.save(fresh);
         categoryRespository.save(exotic);
         categoryRespository.save(nuts);


         System.out.println("Data Loaded = " + categoryRespository.count() );
    }
    
    private void loadCustomers() {
        //given
        Customer customer1 = new Customer();
        customer1.setId(1l);
        customer1.setFirstname("Michale");
        customer1.setLastname("Weston");
        customerRepository.save(customer1);

        Customer customer2 = new Customer();
        customer2.setId(2l);
        customer2.setFirstname("Sam");
        customer2.setLastname("Axe");

        customerRepository.save(customer2);

        System.out.println("Customers Loaded: " + customerRepository.count());
    }
}
