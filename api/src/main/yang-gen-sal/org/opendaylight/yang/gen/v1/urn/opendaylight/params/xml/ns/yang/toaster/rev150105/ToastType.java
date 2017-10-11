package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.toaster.rev150105;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.BaseIdentity;


/**
 * Base for all bread types supported by the toaster. New bread types not listed 
 * here nay be added in the future.
 *
 * &lt;p&gt;This class represents the following YANG schema fragment defined in module &lt;b&gt;toaster&lt;/b&gt;
 * &lt;br&gt;(Source path: &lt;i&gt;META-INF/yang/toaster.yang&lt;/i&gt;):
 * &lt;pre&gt;
 * identity toast-type {
 *     description
 *         "Base for all bread types supported by the toaster. New bread types not listed here nay be added in the future.";
 *     status CURRENT;
 * }
 * &lt;/pre&gt;
 * The schema path to identify an instance is
 * &lt;i&gt;toaster/toast-type&lt;/i&gt;
 *
 */
public abstract class ToastType extends BaseIdentity
 {
    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.cachedReference(org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:toaster","2015-01-05","toast-type"));


    public ToastType() {
    
    
    }
    









}

