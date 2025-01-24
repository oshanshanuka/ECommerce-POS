package lk.ijse.ecommercepos.bo;

import lk.ijse.ecommercepos.bo.custom.impl.ProductBOImpl;
import lk.ijse.ecommercepos.dao.DaoFactory;

import javax.sql.DataSource;

public class BoFactory {
    private static BoFactory boFactory;
    private final DataSource dataSource;

    private BoFactory(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public static BoFactory getBoFactory(DataSource dataSource) {
        if (boFactory == null) {
            boFactory = new BoFactory(dataSource);
        }
        return boFactory;
    }

    public enum BoType {
        PRODUCT
    }

    public SuperBO getBoType(BoType boType) {
        switch (boType) {
            case PRODUCT:
                return new ProductBOImpl((DaoFactory) DaoFactory.getDaoFactory(dataSource));
            default:
                return null;
        }
    }
}
