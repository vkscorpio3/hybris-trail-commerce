package de.hybris.merchandise.facades.populators;

import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

/**
 * Created on 29.11.2015.
 */
public class ProductInternalOnlyPopulator implements Populator<ProductModel, ProductData> {
    @Override
    public void populate(ProductModel source, ProductData target) throws ConversionException {
        target.setInternalOnly(source.getInternalOnly() == null ? false : source.getInternalOnly().booleanValue());
    }
}
