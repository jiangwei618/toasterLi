/*
* Generated file
*
* Generated from: yang module name: toaster-impl yang module local name: toaster
* Generated by: org.opendaylight.controller.config.yangjmxgenerator.plugin.JMXGenerator
* Generated at: Sat Oct 14 21:24:56 CST 2017
*
* Do not modify this file unless it is present under src/main directory
*/
package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.toaster.impl.rev141210;
@org.opendaylight.yangtools.yang.binding.annotations.ModuleQName(namespace = "urn:opendaylight:params:xml:ns:yang:toaster:impl", name = "toaster-impl", revision = "2014-12-10")

public abstract class AbstractToasterModule extends org.opendaylight.controller.config.spi.AbstractModule<AbstractToasterModule> implements org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.toaster.impl.rev141210.ToasterModuleMXBean {
    private static final org.slf4j.Logger LOGGER = org.slf4j.LoggerFactory.getLogger(org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.toaster.impl.rev141210.AbstractToasterModule.class);

    //attributes start

    public static final org.opendaylight.controller.config.api.JmxAttribute dataBrokerJmxAttribute = new org.opendaylight.controller.config.api.JmxAttribute("DataBroker");
    private javax.management.ObjectName dataBroker; // optional

    public static final org.opendaylight.controller.config.api.JmxAttribute brokerJmxAttribute = new org.opendaylight.controller.config.api.JmxAttribute("Broker");
    private javax.management.ObjectName broker; // mandatory

    //attributes end

    public AbstractToasterModule(org.opendaylight.controller.config.api.ModuleIdentifier identifier,org.opendaylight.controller.config.api.DependencyResolver dependencyResolver) {
        super(identifier, dependencyResolver);
    }

    public AbstractToasterModule(org.opendaylight.controller.config.api.ModuleIdentifier identifier,org.opendaylight.controller.config.api.DependencyResolver dependencyResolver,AbstractToasterModule oldModule,java.lang.AutoCloseable oldInstance) {
        super(identifier, dependencyResolver, oldModule, oldInstance);
    }

    @Override
    public void validate() {
        if(dataBroker != null) {
            dependencyResolver.validateDependency(org.opendaylight.controller.config.yang.md.sal.binding.DataBrokerServiceInterface.class, dataBroker, dataBrokerJmxAttribute);
        }
        dependencyResolver.validateDependency(org.opendaylight.controller.config.yang.md.sal.binding.BindingAwareBrokerServiceInterface.class, broker, brokerJmxAttribute);

        customValidation();
    }

    protected void customValidation() {
    }

    private org.opendaylight.controller.md.sal.binding.api.DataBroker dataBrokerDependency;
    protected final org.opendaylight.controller.md.sal.binding.api.DataBroker getDataBrokerDependency(){
        return dataBrokerDependency;
    }private org.opendaylight.controller.sal.binding.api.BindingAwareBroker brokerDependency;
    protected final org.opendaylight.controller.sal.binding.api.BindingAwareBroker getBrokerDependency(){
        return brokerDependency;
    }

    protected final void resolveDependencies() {
        if (dataBroker!=null) {
            dataBrokerDependency = dependencyResolver.resolveInstance(org.opendaylight.controller.md.sal.binding.api.DataBroker.class, dataBroker, dataBrokerJmxAttribute);
        }
        brokerDependency = dependencyResolver.resolveInstance(org.opendaylight.controller.sal.binding.api.BindingAwareBroker.class, broker, brokerJmxAttribute);
    }

    public boolean canReuseInstance(AbstractToasterModule oldModule){
        // allow reusing of old instance if no parameters was changed
        return isSame(oldModule);
    }

    public java.lang.AutoCloseable reuseInstance(java.lang.AutoCloseable oldInstance){
        // implement if instance reuse should be supported. Override canReuseInstance to change the criteria.
        return oldInstance;
    }

    public boolean isSame(AbstractToasterModule other) {
        if (other == null) {
            throw new IllegalArgumentException("Parameter 'other' is null");
        }
        if (java.util.Objects.deepEquals(dataBroker, other.dataBroker) == false) {
            return false;
        }
        if(dataBroker!= null) {
            if (!dependencyResolver.canReuseDependency(dataBroker, dataBrokerJmxAttribute)) { // reference to dependency must be reusable as well
                return false;
            }
        }
        if (java.util.Objects.deepEquals(broker, other.broker) == false) {
            return false;
        }
        if(broker!= null) {
            if (!dependencyResolver.canReuseDependency(broker, brokerJmxAttribute)) { // reference to dependency must be reusable as well
                return false;
            }
        }

        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractToasterModule that = (AbstractToasterModule) o;
        return identifier.equals(that.identifier);
    }

    @Override
    public int hashCode() {
        return identifier.hashCode();
    }

    // getters and setters
    @Override
    public javax.management.ObjectName getDataBroker() {
        return dataBroker;
    }

    @Override
    @org.opendaylight.controller.config.api.annotations.RequireInterface(value = org.opendaylight.controller.config.yang.md.sal.binding.DataBrokerServiceInterface.class)
    public void setDataBroker(javax.management.ObjectName dataBroker) {
        this.dataBroker = dataBroker;
    }

    @Override
    public javax.management.ObjectName getBroker() {
        return broker;
    }

    @Override
    @org.opendaylight.controller.config.api.annotations.RequireInterface(value = org.opendaylight.controller.config.yang.md.sal.binding.BindingAwareBrokerServiceInterface.class)
    public void setBroker(javax.management.ObjectName broker) {
        this.broker = broker;
    }

    public org.slf4j.Logger getLogger() {
        return LOGGER;
    }

}
