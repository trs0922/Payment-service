//package com.training.application.controller;
//
//import com.training.application.domain.Customer;
//import com.training.application.service.CustomerService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping(value = "/customer-service")
//public class CustomerController {
//
//    @Autowired
//    CustomerService customerService;
//
//    @RequestMapping(value = "/create", method = RequestMethod.POST)
//    public ResponseEntity createCustomer(@RequestBody Customer customer) {
//        customerService.createCustomer(customer);
//        ResponseEntity response = new ResponseEntity("Successfully created the customer", HttpStatus.CREATED);
//
//        return response;
//    }
//
//    @RequestMapping(value = "/read/{cust-id}", method = RequestMethod.GET)
//    public ResponseEntity getCustomer(@PathVariable(name = "cust-id") int id) {
//        System.out.println("the given customer id is :" + id);
//
//        Customer customer = customerService.getCustomer(id);
//        if (customer == null) {
//            ResponseEntity response = new ResponseEntity("The given customer is not found in the table", HttpStatus.NOT_FOUND);
//            return response;
//        } else {
//            ResponseEntity response = new ResponseEntity(customer, HttpStatus.OK);
//            return response;
//        }
//    }
//
//    @RequestMapping(value = "/update", method = RequestMethod.PUT)
//    public ResponseEntity updateCustomer(@RequestBody Customer customer) {
//
//        try {
//            customerService.updateCustomer(customer);
//            ResponseEntity response = new ResponseEntity("updated successfully", HttpStatus.OK);
//            return response;
//        } catch (Exception exception) {
//            ResponseEntity response = new ResponseEntity("updated is not success", HttpStatus.BAD_REQUEST);
//            return response;
//        }
//    }
//
//    @RequestMapping(value = "/update", method = RequestMethod.GET)
//    public ResponseEntity updCustomer(@RequestBody Customer customer) {
//
//        try {
//            customerService.updateCustomer(customer);
//            ResponseEntity response = new ResponseEntity("updated successfully", HttpStatus.OK);
//            return response;
//        } catch (Exception exception) {
//            ResponseEntity response = new ResponseEntity("updated is not success", HttpStatus.BAD_REQUEST);
//            return response;
//        }
//    }
//}
