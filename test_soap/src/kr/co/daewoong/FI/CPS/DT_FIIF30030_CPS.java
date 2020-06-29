/**
 * DT_FIIF30030_CPS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kr.co.daewoong.FI.CPS;

public class DT_FIIF30030_CPS  implements java.io.Serializable {
    private kr.co.daewoong.FI.CPS.DT_FIIF30030_CPSIN_HEAD[] IN_HEAD;

    private kr.co.daewoong.FI.CPS.DT_FIIF30030_CPSIN_ITEM[] IN_ITEM;

    public DT_FIIF30030_CPS() {
    }

    public DT_FIIF30030_CPS(
           kr.co.daewoong.FI.CPS.DT_FIIF30030_CPSIN_HEAD[] IN_HEAD,
           kr.co.daewoong.FI.CPS.DT_FIIF30030_CPSIN_ITEM[] IN_ITEM) {
           this.IN_HEAD = IN_HEAD;
           this.IN_ITEM = IN_ITEM;
    }


    /**
     * Gets the IN_HEAD value for this DT_FIIF30030_CPS.
     * 
     * @return IN_HEAD
     */
    public kr.co.daewoong.FI.CPS.DT_FIIF30030_CPSIN_HEAD[] getIN_HEAD() {
        return IN_HEAD;
    }


    /**
     * Sets the IN_HEAD value for this DT_FIIF30030_CPS.
     * 
     * @param IN_HEAD
     */
    public void setIN_HEAD(kr.co.daewoong.FI.CPS.DT_FIIF30030_CPSIN_HEAD[] IN_HEAD) {
        this.IN_HEAD = IN_HEAD;
    }

    public kr.co.daewoong.FI.CPS.DT_FIIF30030_CPSIN_HEAD getIN_HEAD(int i) {
        return this.IN_HEAD[i];
    }

    public void setIN_HEAD(int i, kr.co.daewoong.FI.CPS.DT_FIIF30030_CPSIN_HEAD _value) {
        this.IN_HEAD[i] = _value;
    }


    /**
     * Gets the IN_ITEM value for this DT_FIIF30030_CPS.
     * 
     * @return IN_ITEM
     */
    public kr.co.daewoong.FI.CPS.DT_FIIF30030_CPSIN_ITEM[] getIN_ITEM() {
        return IN_ITEM;
    }


    /**
     * Sets the IN_ITEM value for this DT_FIIF30030_CPS.
     * 
     * @param IN_ITEM
     */
    public void setIN_ITEM(kr.co.daewoong.FI.CPS.DT_FIIF30030_CPSIN_ITEM[] IN_ITEM) {
        this.IN_ITEM = IN_ITEM;
    }

    public kr.co.daewoong.FI.CPS.DT_FIIF30030_CPSIN_ITEM getIN_ITEM(int i) {
        return this.IN_ITEM[i];
    }

    public void setIN_ITEM(int i, kr.co.daewoong.FI.CPS.DT_FIIF30030_CPSIN_ITEM _value) {
        this.IN_ITEM[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DT_FIIF30030_CPS)) return false;
        DT_FIIF30030_CPS other = (DT_FIIF30030_CPS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.IN_HEAD==null && other.getIN_HEAD()==null) || 
             (this.IN_HEAD!=null &&
              java.util.Arrays.equals(this.IN_HEAD, other.getIN_HEAD()))) &&
            ((this.IN_ITEM==null && other.getIN_ITEM()==null) || 
             (this.IN_ITEM!=null &&
              java.util.Arrays.equals(this.IN_ITEM, other.getIN_ITEM())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getIN_HEAD() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIN_HEAD());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIN_HEAD(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIN_ITEM() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIN_ITEM());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIN_ITEM(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DT_FIIF30030_CPS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://daewoong.co.kr/FI/CPS", "DT_FIIF30030_CPS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IN_HEAD");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IN_HEAD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://daewoong.co.kr/FI/CPS", ">DT_FIIF30030_CPS>IN_HEAD"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IN_ITEM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IN_ITEM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://daewoong.co.kr/FI/CPS", ">DT_FIIF30030_CPS>IN_ITEM"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
