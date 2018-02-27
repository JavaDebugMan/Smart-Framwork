package com.javaman.controller;

import com.javaman.model.Customer;
import com.javaman.service.CustomerService;
import com.javaman.smart.framwork.annotation.Action;
import com.javaman.smart.framwork.annotation.Controller;
import com.javaman.smart.framwork.annotation.Inject;
import com.javaman.smart.framwork.controller.Param;
import com.javaman.smart.framwork.controller.View;

import java.util.List;

/**
 * @author pengzhe
 * @date 2018/2/27 11:47
 * @description
 */
@Controller
public class CustomerController {

    @Inject
    private CustomerService customerService;

    @Action("get:/customer")
    public View index(Param param) {
        List<Customer> customerList = customerService.getCustomerList();
        System.out.println(customerList);
        return new View("customer.jsp").addModel("customerList", customerList);
    }


}
