package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.toaster.rev150105;
import org.opendaylight.yangtools.yang.binding.DataRoot;


/**
 * &lt;p&gt;This class represents the following YANG schema fragment defined in module &lt;b&gt;toaster&lt;/b&gt;
 * &lt;br&gt;Source path: &lt;i&gt;META-INF/yang/toaster.yang&lt;/i&gt;):
 * &lt;pre&gt;
 * module toaster {
 *     yang-version 1;
 *     namespace "urn:opendaylight:params:xml:ns:yang:toaster";
 *     prefix "toaster";
 *
 *     revision 2015-01-05 {
 *         description "";
 *     }
 *
 *     container toaster {
 *         leaf toasterManufacturer {
 *             type DisplayString;
 *         }
 *         leaf toasterModelNumber {
 *             type DisplayString;
 *         }
 *         leaf toasterStatus {
 *             type enumeration;
 *         }
 *     }
 *
 *     identity toast-type {
 *         description
 *             "Base for all bread types supported by the toaster. New bread types not listed here nay be added in the future.";
 *         status CURRENT;
 *     }
 *     identity wheat-bread {
 *         base "()IdentitySchemaNodeImpl[base=null, qname=(urn:opendaylight:params:xml:ns:yang:toaster?revision=2015-01-05)toast-type]";
 *         description
 *             "Wheat bread.";
 *         status CURRENT;
 *     }
 *     identity white-bread {
 *         base "()IdentitySchemaNodeImpl[base=null, qname=(urn:opendaylight:params:xml:ns:yang:toaster?revision=2015-01-05)toast-type]";
 *         description
 *             "White bread.";
 *         status CURRENT;
 *     }
 *
 *     rpc cancel-toast {
 *         "Stop making toast, if any is being made.
 *                           A 'resource-denied' error will be returned
 *                           if the toaster service is disabled.";
 *         status CURRENT;
 *     }
 *     rpc make-toast {
 *         "Make some toast. The toastDone notification will be sent when the toast is finished.
 *                         An 'in-use' error will be returned if toast is already being made. A 'resource-denied' error will
 *                         be returned if the toaster service is disabled.";
 *         input {
 *             leaf toasterDoneness {
 *                 type uint32;
 *             }
 *             leaf toasterToastType {
 *                 type identityref;
 *             }
 *         }
 *         
 *         status CURRENT;
 *     }
 * }
 * &lt;/pre&gt;
 *
 */
public interface ToasterData
    extends
    DataRoot
{




    /**
     * Top-level container for all toaster database objects.
     *
     */
    Toaster getToaster();

}

