package com.javaman.service;

import com.javaman.helper.DataBaseHelper;
import com.javaman.model.Customer;
import com.javaman.smart.framwork.annotation.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

/**
 * @author pengzhe
 * @date 2018/2/26 17:22
 * @description
 */
@Service
public class CustomerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);


    /**
     * 获取客户列表
     *
     * @return
     */
    public List<Customer> getCustomerList() {
        String sql = "SELECT * FROM customer";
        return DataBaseHelper.queryEntityList(Customer.class, sql);
    }

    /**
     * 获取客户
     *
     * @param id
     * @return
     */
    public Customer getCustomer(long id) {
        return null;
    }

    /**
     * 创建客户
     *
     * @param fieldMap
     * @return
     */
    public boolean createCustomer(Map<String, Object> fieldMap) {
        return DataBaseHelper.insertEntity(Customer.class, fieldMap);
    }

    /**
     * 更新客户
     *
     * @param id
     * @param filedMap
     * @return
     */
    public boolean updateCustomer(long id, Map<String, Object> filedMap) {
        return DataBaseHelper.updateEntity(Customer.class, id, filedMap);
    }

    /**
     * 删除客户
     *
     * @param id
     * @return
     */
    public boolean deleteCustomer(long id) {
        return DataBaseHelper.deleteEntity(Customer.class, id);

    }


}
