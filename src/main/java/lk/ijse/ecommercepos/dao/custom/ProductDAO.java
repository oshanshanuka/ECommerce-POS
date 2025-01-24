package lk.ijse.ecommercepos.dao.custom;

import lk.ijse.ecommercepos.dao.CrudDao;
import lk.ijse.ecommercepos.entity.Product;

import java.sql.Connection;

public interface ProductDAO extends CrudDao<Product> {

    boolean save(Product product, Connection connection);
}

