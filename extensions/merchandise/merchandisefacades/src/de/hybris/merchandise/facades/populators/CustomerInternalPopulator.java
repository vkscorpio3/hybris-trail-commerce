package de.hybris.merchandise.facades.populators;

import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

/**
 * Created on 29.11.2015.
 */
public class CustomerInternalPopulator implements Populator<CustomerModel, CustomerData> {
    @Override
    public void populate(CustomerModel source, CustomerData target) throws ConversionException {
        target.setInternal(source.getIsInternal() == null ? false : source.getIsInternal().booleanValue());
    }
}
