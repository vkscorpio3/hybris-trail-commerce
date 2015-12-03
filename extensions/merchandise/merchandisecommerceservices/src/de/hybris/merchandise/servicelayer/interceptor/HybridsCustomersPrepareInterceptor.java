package de.hybris.merchandise.servicelayer.interceptor;

import de.hybris.platform.core.model.security.PrincipalGroupModel;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.core.model.user.UserGroupModel;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;
import de.hybris.platform.servicelayer.user.daos.UserGroupDao;
import org.springframework.beans.factory.annotation.Required;

import java.util.HashSet;
import java.util.Set;

/**
 * Created on 03.12.2015.
 */
public class HybridsCustomersPrepareInterceptor implements PrepareInterceptor<CustomerModel> {

    private static final String HYBRIDS = "hybrids";

    private UserGroupDao userGroupDao;

    @Override
    public void onPrepare(CustomerModel customer, InterceptorContext interceptorContext) throws InterceptorException {
        final UserGroupModel hybrids = userGroupDao.findUserGroupByUid(HYBRIDS);

        if (Boolean.TRUE.equals(customer.getIsInternal())) {
            if (!customer.getGroups().contains(hybrids)) {
                final Set<PrincipalGroupModel> newGroups = new HashSet<PrincipalGroupModel>(customer.getGroups());
                newGroups.add(hybrids);
                customer.setGroups(newGroups);
            }
        } else {
            if (customer.getGroups().contains(hybrids)) {
                final Set<PrincipalGroupModel> newGroups = new HashSet<PrincipalGroupModel>(customer.getGroups());
                newGroups.remove(hybrids);
                customer.setGroups(newGroups);
            }
        }
    }

    @Required
    public void setUserGroupDao(final UserGroupDao userGroupDao) {
        this.userGroupDao = userGroupDao;
    }
}
