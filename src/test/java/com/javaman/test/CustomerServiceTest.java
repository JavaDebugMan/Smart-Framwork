package com.javaman.test;

import com.javaman.model.Customer;
import com.javaman.service.CustomerService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * @author pengzhe
 * @date 2018/2/26 17:28
 * @description
 */

public class CustomerServiceTest {

    private CustomerService customerService = null;

    public CustomerServiceTest() {
    }


    @Before
    public void init() {
        //初始化数据库
        customerService = new CustomerService();
    }

    @Test
    public void getCustomerListTest() throws Exception {
        List<Customer> customerList = customerService.getCustomerList();
        System.out.println(customerList);
        Assert.assertEquals(2, customerList.size());

    }
}
