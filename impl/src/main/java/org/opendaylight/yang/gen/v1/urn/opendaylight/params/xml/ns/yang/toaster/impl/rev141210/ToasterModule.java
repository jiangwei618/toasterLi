/*
 * Copyright(c) Yoyodyne, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.toaster.impl.rev141210;

import org.opendaylight.controller.md.sal.binding.api.DataBroker;
import org.opendaylight.controller.md.sal.binding.api.DataTreeIdentifier;
import org.opendaylight.controller.md.sal.common.api.data.LogicalDatastoreType;
import org.opendaylight.controller.sal.binding.api.BindingAwareBroker;
import org.opendaylight.toaster.impl.ToasterProvider;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.toaster.rev150105.ToasterService;
import org.opendaylight.yangtools.concepts.ListenerRegistration;

public class ToasterModule extends org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.toaster.impl.rev141210.AbstractToasterModule {
    public ToasterModule(org.opendaylight.controller.config.api.ModuleIdentifier identifier, org.opendaylight.controller.config.api.DependencyResolver dependencyResolver) {
        super(identifier, dependencyResolver);
    }

    public ToasterModule(org.opendaylight.controller.config.api.ModuleIdentifier identifier, org.opendaylight.controller.config.api.DependencyResolver dependencyResolver, org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.toaster.impl.rev141210.ToasterModule oldModule, java.lang.AutoCloseable oldInstance) {
        super(identifier, dependencyResolver, oldModule, oldInstance);
    }

    @Override
    public void customValidation() {
        // add custom validation form module attributes here.
    }

    @Override
    public java.lang.AutoCloseable createInstance() {
        //创建toaster实例
        ToasterProvider provider = new ToasterProvider();

        //服务注册
        getBrokerDependency().registerProvider(provider);

        //设置databroker
        DataBroker dataBrokerService = getDataBrokerDependency();
        provider.setDataProvider(dataBrokerService);

        //rpc注册服务
        final BindingAwareBroker.RpcRegistration<ToasterService> rpcRegistration = getRpcRegistryDependency()
                .addRpcImplementation(ToasterService.class, provider);

        final ListenerRegistration<ToasterProvider> dataTreeChangeListenerRegistration = dataBrokerService
                .registerDataTreeChangeListener(new DataTreeIdentifier<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.toaster.rev150105.Toaster>(LogicalDatastoreType.CONFIGURATION,
                        ToasterProvider.TOASTER_IID), provider);

        final class AutoCloseableToaster implements AutoCloseable {

            @Override
            public void close() throws Exception {
                rpcRegistration.close();
                dataTreeChangeListenerRegistration.close(); //closes the listener registrations (removes it)
            }

        }
        return provider;
    }

}
