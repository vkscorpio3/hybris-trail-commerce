package de.hybris.merchandise.core.additions;

import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.ServicelayerTransactionalTest;
import de.hybris.platform.servicelayer.model.ModelService;
import org.junit.Test;

import javax.annotation.Resource;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created on 22.11.2015.
 */
@IntegrationTest
public class DynamicAttributeTest extends ServicelayerTransactionalTest {

    @Resource
    private ModelService modelService;

    @Test
    public void testInternalCustomer() {
        CustomerModel customer = new CustomerModel();
        customer.setUid("customer@hybris.com");
        customer.setName("internal");
        modelService.save(customer);

        assertTrue(customer.getIsInternal());
    }

    @Test
    public void testNotInternalCustomer() {
        CustomerModel customer = new CustomerModel();
        customer.setUid("customer@external.com");
        customer.setName("external");
        modelService.save(customer);

        assertFalse(customer.getIsInternal());
    }
}
