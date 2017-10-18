package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.toaster.rev150105;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.toaster.rev150105.Toaster.ToasterStatus;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * Top-level container for all toaster database objects.
 *
 * &lt;p&gt;This class represents the following YANG schema fragment defined in module &lt;b&gt;toaster&lt;/b&gt;
 * &lt;br&gt;(Source path: &lt;i&gt;META-INF/yang/toaster.yang&lt;/i&gt;):
 * &lt;pre&gt;
 * container toaster {
 *     leaf toasterManufacturer {
 *         type DisplayString;
 *     }
 *     leaf toasterModelNumber {
 *         type DisplayString;
 *     }
 *     leaf toasterStatus {
 *         type enumeration;
 *     }
 *     leaf darknessFactor {
 *         type uint32;
 *     }
 * }
 * &lt;/pre&gt;
 * The schema path to identify an instance is
 * &lt;i&gt;toaster/toaster&lt;/i&gt;
 *
 * &lt;p&gt;To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.toaster.rev150105.ToasterBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.toaster.rev150105.ToasterBuilder
 *
 */
public interface Toaster
    extends
    ChildOf<ToasterData>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.toaster.rev150105.Toaster>
{


    /**
     * The enumeration built-in type represents values from a set of assigned names.
     *
     */
    public enum ToasterStatus {
        /**
         * The toaster knob position is up. No toast is being made now.
         *
         */
        Up(1),
        
        /**
         * The toaster knob position is down. Toast is being made now.
         *
         */
        Down(2)
        ;
    
    
        int value;
        private static final java.util.Map<java.lang.Integer, ToasterStatus> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, ToasterStatus> b = com.google.common.collect.ImmutableMap.builder();
            for (ToasterStatus enumItem : ToasterStatus.values())
            {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private ToasterStatus(int value) {
            this.value = value;
        }
    
        /**
         * @return integer value
         */
        public int getIntValue() {
            return value;
        }
    
        /**
         * @param valueArg
         * @return corresponding ToasterStatus item
         */
        public static ToasterStatus forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }

    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.cachedReference(org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:toaster","2015-01-05","toaster"));

    /**
     * The name of the toaster's manufacturer. For instance, Microsoft Toaster.
     *
     */
    DisplayString getToasterManufacturer();
    
    /**
     * The name of the toaster's model. For instance, Radiant Automatic.
     *
     */
    DisplayString getToasterModelNumber();
    
    /**
     * This variable indicates the current state of the toaster.
     *
     */
    ToasterStatus getToasterStatus();
    
    /**
     * The darkness factor. Basically, the number of ms to multiple the doneness value 
     * by.
     *
     */
    java.lang.Long getDarknessFactor();

}

