//package com.training.application.service;
//
//import com.training.application.domain.Customer;
//import com.training.application.domain.Payment;
//import com.training.application.entity.AddressEntity;
//import com.training.application.entity.CustomerEntity;
//import com.training.application.repository.AddressRepository;
//import com.training.application.repository.CustomerRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpEntity;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpMethod;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
//import org.springframework.web.client.RestTemplate;
//
//import java.util.InputMismatchException;
//import java.util.List;
//import java.util.Optional;
//import java.util.stream.Collectors;
//
//@Service
//public class CustomerService {
//
//    @Autowired
//    CustomerRepository customerRepository;
//
//    @Autowired
//    AddressRepository addressRepository;
//
//
//    RestTemplate restTemplate = new RestTemplate();
//
//    public void createCustomer(Customer customer) {
//
//        System.out.println("Valid id, continue..");
//
//        CustomerEntity customerEntity = new CustomerEntity();
//        customerEntity.setName(customer.getName());
//        customerEntity.setEmail(customer.getEmail());
//
//        customerEntity = customerRepository.save(customerEntity);
//
//        int customerId = customerEntity.getId();
//
//        List<AddressEntity> addressEntities = customer.getAddresses().stream().map(address -> {
//            AddressEntity addressEntity = new AddressEntity();
//            addressEntity.setCustomerId(customerId);
//            addressEntity.setLine1(address.getLine1());
//            addressEntity.setLine2(address.getLine2());
//            addressEntity.setCity(address.getCity());
//            addressEntity.setState(address.getState());
//            addressEntity.setCountry(address.getCountry());
//            addressEntity.setZipcode(address.getZipcode());
//            return addressEntity;
//        }).collect(Collectors.toList());
//        addressRepository.saveAll(addressEntities);
//
//        System.out.println("Customer is created in table.");
//
//
//    }
//
//    public Customer getCustomer(int id) {
//
//
//       ResponseEntity<Payment[]> response =
//               restTemplate.exchange("http://localhost:8080/payment-service/getPayments?id=89",
//                       HttpMethod.GET,
//                       new HttpEntity<>(new HttpHeaders()),
//                       Payment[].class);
//
//        Optional<CustomerEntity> optionalCustomerEntity = customerRepository.findById(id);
//        if (optionalCustomerEntity.isPresent()) {
//            CustomerEntity customerEntity = optionalCustomerEntity.get();
//            System.out.println(customerEntity);
//
//            Customer customer = new Customer();
//            customer.setId(customerEntity.getId());
//            customer.setEmail(customerEntity.getEmail());
//            customer.setName(customerEntity.getName());
//            customer.setPayments(response.getBody());
//            return customer;
//        } else {
//            System.out.println("There is no customer available with the give id " + id);
//            return null;
//        }
//
//    }
//
//    public void updateCustomer(Customer customer) {
//
//        Optional<CustomerEntity> optionalCustomerEntity = customerRepository.findById(customer.getId());
//        if (optionalCustomerEntity.isPresent()) {
//
//
//            CustomerEntity customerEntity = new CustomerEntity();
//            customerEntity.setId(customer.getId());
//            customerEntity.setName(customer.getName());
//            customerEntity.setEmail(customer.getEmail());
//
//            customerRepository.save(customerEntity);
//
//            System.out.println("updated in the table.");
//        } else {
//            System.out.println("Invalid input.");
//            throw new InputMismatchException();
//        }
//
//    }
//}
