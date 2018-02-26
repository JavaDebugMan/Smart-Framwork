package com.javaman.service;

import com.javaman.helper.DataBaseHelper;
import com.javaman.model.Customer;
import com.javaman.util.PropsUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * @author pengzhe
 * @date 2018/2/26 17:22
 * @description
 */

public class CustomerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);


    /**
     * 获取客户列表
     *
     * @return
     */
    public List<Customer> getCustomerList() {
        Connection connection = null;
        try {
            List<Customer> list = new ArrayList<>();
            String sql = "SELECT * FROM customer";
            connection = DataBaseHelper.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Customer customer = new Customer();
                customer.setId(resultSet.getLong("id"));
                customer.setName(resultSet.getString("name"));
                customer.setContact(resultSet.getString("contact"));
                customer.setTelephone(resultSet.getString("telephone"));
                customer.setEmail(resultSet.getString("email"));
                customer.setRemark(resultSet.getString("remark"));
                list.add(customer);
            }
            return list;
        }

        catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DataBaseHelper.closeConnection(connection);
        }
        return null;
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
    public boolean createCutomer(Map<String, Object> fieldMap) {
        return false;
    }

    /**
     * 更新客户
     *
     * @param id
     * @param filedMap
     * @return
     */
    public boolean updateCutomer(long id, Map<String, Object> filedMap) {
        return false;
    }

    /**
     * 删除客户
     *
     * @param id
     * @return
     */
    public boolean deleteCustomer(long id) {
        return false;

    }


}
