package lk.ijse.ecommercepos.bo.custom;

import lk.ijse.ecommercepos.bo.SuperBO;
import lk.ijse.ecommercepos.dto.ProductDTO;

import javax.sql.DataSource;

public interface ProductBO extends SuperBO {


    void saveProduct(ProductDTO productDTO, DataSource dataSource);
}

