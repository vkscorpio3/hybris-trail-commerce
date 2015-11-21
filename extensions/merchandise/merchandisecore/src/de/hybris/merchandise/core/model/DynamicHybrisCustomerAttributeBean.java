package de.hybris.merchandise.core.model;

import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.model.attribute.DynamicAttributeHandler;

/**
 * Created on 22.11.2015.
 */
public class DynamicHybrisCustomerAttributeBean implements DynamicAttributeHandler<Boolean, CustomerModel> {
    @Override
    public Boolean get(CustomerModel model) {
        if (model == null)
            throw new IllegalArgumentException("Item model is required");

        // Accelerator stores the email in the ID (uid) field
        final String email = model.getUid();
        return Boolean.valueOf(email != null && (email.endsWith("hybris.de") || email.endsWith("hybris.com")));
    }

    @Override
    public void set(CustomerModel model, Boolean aBoolean) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
