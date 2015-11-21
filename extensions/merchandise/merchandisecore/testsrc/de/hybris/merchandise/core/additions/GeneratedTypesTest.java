package de.hybris.merchandise.core.additions;

import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.merchandise.core.constants.GeneratedMerchandiseCoreConstants.Attributes.Customer;
import de.hybris.merchandise.core.constants.GeneratedMerchandiseCoreConstants.Attributes.Product;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.core.model.user.CustomerModel;
import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created on 22.11.2015.
 */
@UnitTest
public class GeneratedTypesTest {
    @Test
    public void testProductAttribute() {
        assertThat(Product.INTERNALONLY, equalTo(ProductModel.INTERNALONLY));
    }

    @Test
    public void testCustomerAttribute() {
        assertThat(Customer.ISINTERNAL, equalTo(CustomerModel.ISINTERNAL));
    }
}
