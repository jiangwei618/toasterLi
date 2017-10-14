package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.toaster.rev150105;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.math.BigInteger;
import java.util.List;
import java.util.Collections;
import com.google.common.collect.Range;
import java.util.Map;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.toaster.rev150105.MakeToastInput} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.toaster.rev150105.MakeToastInput
 *
 */
public class MakeToastInputBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.toaster.rev150105.MakeToastInput> {

    private java.lang.Long _toasterDoneness;
    private java.lang.Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.toaster.rev150105.ToastType> _toasterToastType;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.toaster.rev150105.MakeToastInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.toaster.rev150105.MakeToastInput>> augmentation = Collections.emptyMap();

    public MakeToastInputBuilder() {
    }

    public MakeToastInputBuilder(MakeToastInput base) {
        this._toasterDoneness = base.getToasterDoneness();
        this._toasterToastType = base.getToasterToastType();
        if (base instanceof MakeToastInputImpl) {
            MakeToastInputImpl impl = (MakeToastInputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.toaster.rev150105.MakeToastInput> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.toaster.rev150105.MakeToastInput>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public java.lang.Long getToasterDoneness() {
        return _toasterDoneness;
    }
    
    public java.lang.Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.toaster.rev150105.ToastType> getToasterToastType() {
        return _toasterToastType;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.toaster.rev150105.MakeToastInput>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    private static void checkToasterDonenessRange(final long value) {
        if (value >= 1L && value <= 10L) {
            return;
        }
        throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[1‥10]].", value));
    }
    
    public MakeToastInputBuilder setToasterDoneness(java.lang.Long value) {
        if (value != null) {
            checkToasterDonenessRange(value);
        }
        this._toasterDoneness = value;
        return this;
    }
    /**
     * @deprecated This method is slated for removal in a future release. See BUG-1485 for details.
     */
    @Deprecated
    public static List<Range<BigInteger>> _toasterDoneness_range() {
        final List<Range<BigInteger>> ret = new java.util.ArrayList<>(1);
        ret.add(Range.closed(BigInteger.ONE, BigInteger.TEN));
        return ret;
    }
    
    public MakeToastInputBuilder setToasterToastType(java.lang.Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.toaster.rev150105.ToastType> value) {
        this._toasterToastType = value;
        return this;
    }
    
    public MakeToastInputBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.toaster.rev150105.MakeToastInput>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.toaster.rev150105.MakeToastInput> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public MakeToastInputBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.toaster.rev150105.MakeToastInput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    public MakeToastInput build() {
        return new MakeToastInputImpl(this);
    }

    private static final class MakeToastInputImpl implements MakeToastInput {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.toaster.rev150105.MakeToastInput> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.toaster.rev150105.MakeToastInput.class;
        }

        private final java.lang.Long _toasterDoneness;
        private final java.lang.Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.toaster.rev150105.ToastType> _toasterToastType;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.toaster.rev150105.MakeToastInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.toaster.rev150105.MakeToastInput>> augmentation = Collections.emptyMap();

        private MakeToastInputImpl(MakeToastInputBuilder base) {
            this._toasterDoneness = base.getToasterDoneness();
            this._toasterToastType = base.getToasterToastType();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.toaster.rev150105.MakeToastInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.toaster.rev150105.MakeToastInput>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.toaster.rev150105.MakeToastInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.toaster.rev150105.MakeToastInput>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Long getToasterDoneness() {
            return _toasterDoneness;
        }
        
        @Override
        public java.lang.Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.toaster.rev150105.ToastType> getToasterToastType() {
            return _toasterToastType;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.toaster.rev150105.MakeToastInput>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        private int hash = 0;
        private volatile boolean hashValid = false;
        
        @Override
        public int hashCode() {
            if (hashValid) {
                return hash;
            }
        
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_toasterDoneness == null) ? 0 : _toasterDoneness.hashCode());
            result = prime * result + ((_toasterToastType == null) ? 0 : _toasterToastType.hashCode());
            result = prime * result + ((augmentation == null) ? 0 : augmentation.hashCode());
        
            hash = result;
            hashValid = true;
            return result;
        }

        @Override
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DataObject)) {
                return false;
            }
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.toaster.rev150105.MakeToastInput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.toaster.rev150105.MakeToastInput other = (org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.toaster.rev150105.MakeToastInput)obj;
            if (_toasterDoneness == null) {
                if (other.getToasterDoneness() != null) {
                    return false;
                }
            } else if(!_toasterDoneness.equals(other.getToasterDoneness())) {
                return false;
            }
            if (_toasterToastType == null) {
                if (other.getToasterToastType() != null) {
                    return false;
                }
            } else if(!_toasterToastType.equals(other.getToasterToastType())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                MakeToastInputImpl otherImpl = (MakeToastInputImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.toaster.rev150105.MakeToastInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.toaster.rev150105.MakeToastInput>> e : augmentation.entrySet()) {
                    if (!e.getValue().equals(other.getAugmentation(e.getKey()))) {
                        return false;
                    }
                }
                // .. and give the other one the chance to do the same
                if (!obj.equals(this)) {
                    return false;
                }
            }
            return true;
        }

        @Override
        public java.lang.String toString() {
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("MakeToastInput [");
            boolean first = true;
        
            if (_toasterDoneness != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_toasterDoneness=");
                builder.append(_toasterDoneness);
             }
            if (_toasterToastType != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_toasterToastType=");
                builder.append(_toasterToastType);
             }
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("augmentation=");
            builder.append(augmentation.values());
            return builder.append(']').toString();
        }
    }

}
