package com.javaman.test;

import com.javaman.model.Customer;
import com.javaman.service.CustomerService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @Test
    public void createCustomerTest() {
        Map<String, Object> fieldMap = new HashMap<>();
        fieldMap.put("name", "customer11");
        fieldMap.put("contact", "Hohn");
        fieldMap.put("telephone", "12214214");
        boolean cutomer = customerService.createCutomer(fieldMap);
        System.out.println(cutomer);
    }

    @Test
    public void updateCustomerTest() {
        long id = 1;
        Map<String, Object> fieldMap = new HashMap<>();
        fieldMap.put("contact", "Eric");
        boolean b = customerService.updateCutomer(id, fieldMap);
        System.out.println(b);
    }

    @Test
    public void deleteCustomer() {
        long id = 4;
        boolean b = customerService.deleteCustomer(id);
        System.out.println(b);


    }


}
