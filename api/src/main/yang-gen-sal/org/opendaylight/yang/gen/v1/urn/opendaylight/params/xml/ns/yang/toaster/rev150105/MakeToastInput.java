package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.toaster.rev150105;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * &lt;p&gt;This class represents the following YANG schema fragment defined in module &lt;b&gt;toaster&lt;/b&gt;
 * &lt;br&gt;(Source path: &lt;i&gt;META-INF/yang/toaster.yang&lt;/i&gt;):
 * &lt;pre&gt;
 * container input {
 *     leaf toasterDoneness {
 *         type uint32;
 *     }
 *     leaf toasterToastType {
 *         type identityref;
 *     }
 * }
 * &lt;/pre&gt;
 * The schema path to identify an instance is
 * &lt;i&gt;toaster/make-toast/input&lt;/i&gt;
 *
 * &lt;p&gt;To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.toaster.rev150105.MakeToastInputBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.toaster.rev150105.MakeToastInputBuilder
 *
 */
public interface MakeToastInput
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.toaster.rev150105.MakeToastInput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.cachedReference(org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:toaster","2015-01-05","input"));

    /**
     * This variable controls how well-done is the ensuing toast. It should be on a 
     * scale of 1 to 10. Toast made at 10 generally is considered unfit for human 
     * consumption; toast made at 1 is warmed lightly.
     *
     */
    java.lang.Long getToasterDoneness();
    
    /**
     * This variable informs the toaster of the type of material that is being toasted.
     * The toaster uses this information, combined with toasterDoneness, to compute for
     * how long the material must be toasted to achieve the required doneness.
     *
     */
    java.lang.Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.toaster.rev150105.ToastType> getToasterToastType();

}

