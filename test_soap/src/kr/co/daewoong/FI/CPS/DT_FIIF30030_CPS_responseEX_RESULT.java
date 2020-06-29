/**
 * DT_FIIF30030_CPS_responseEX_RESULT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kr.co.daewoong.FI.CPS;

public class DT_FIIF30030_CPS_responseEX_RESULT  implements java.io.Serializable {
    /* Head-Item 연결키 */
    private java.lang.String PKEY;

    /* 회사 코드 */
    private java.lang.String BUKRS;

    /* 회계연도 */
    private java.lang.String GJAHR;

    /* 회계 전표 번호 */
    private java.lang.String BELNR;

    /* 반제회계연도 */
    private java.lang.String EJAHR;

    /* 반제전표 전표번호 */
    private java.lang.String AUGBL;

    /* 처리 상태 */
    private java.lang.String MTYPE;

    /* 메세지 */
    private java.lang.String ZMSG;

    public DT_FIIF30030_CPS_responseEX_RESULT() {
    }

    public DT_FIIF30030_CPS_responseEX_RESULT(
           java.lang.String PKEY,
           java.lang.String BUKRS,
           java.lang.String GJAHR,
           java.lang.String BELNR,
           java.lang.String EJAHR,
           java.lang.String AUGBL,
           java.lang.String MTYPE,
           java.lang.String ZMSG) {
           this.PKEY = PKEY;
           this.BUKRS = BUKRS;
           this.GJAHR = GJAHR;
           this.BELNR = BELNR;
           this.EJAHR = EJAHR;
           this.AUGBL = AUGBL;
           this.MTYPE = MTYPE;
           this.ZMSG = ZMSG;
    }


    /**
     * Gets the PKEY value for this DT_FIIF30030_CPS_responseEX_RESULT.
     * 
     * @return PKEY   * Head-Item 연결키
     */
    public java.lang.String getPKEY() {
        return PKEY;
    }


    /**
     * Sets the PKEY value for this DT_FIIF30030_CPS_responseEX_RESULT.
     * 
     * @param PKEY   * Head-Item 연결키
     */
    public void setPKEY(java.lang.String PKEY) {
        this.PKEY = PKEY;
    }


    /**
     * Gets the BUKRS value for this DT_FIIF30030_CPS_responseEX_RESULT.
     * 
     * @return BUKRS   * 회사 코드
     */
    public java.lang.String getBUKRS() {
        return BUKRS;
    }


    /**
     * Sets the BUKRS value for this DT_FIIF30030_CPS_responseEX_RESULT.
     * 
     * @param BUKRS   * 회사 코드
     */
    public void setBUKRS(java.lang.String BUKRS) {
        this.BUKRS = BUKRS;
    }


    /**
     * Gets the GJAHR value for this DT_FIIF30030_CPS_responseEX_RESULT.
     * 
     * @return GJAHR   * 회계연도
     */
    public java.lang.String getGJAHR() {
        return GJAHR;
    }


    /**
     * Sets the GJAHR value for this DT_FIIF30030_CPS_responseEX_RESULT.
     * 
     * @param GJAHR   * 회계연도
     */
    public void setGJAHR(java.lang.String GJAHR) {
        this.GJAHR = GJAHR;
    }


    /**
     * Gets the BELNR value for this DT_FIIF30030_CPS_responseEX_RESULT.
     * 
     * @return BELNR   * 회계 전표 번호
     */
    public java.lang.String getBELNR() {
        return BELNR;
    }


    /**
     * Sets the BELNR value for this DT_FIIF30030_CPS_responseEX_RESULT.
     * 
     * @param BELNR   * 회계 전표 번호
     */
    public void setBELNR(java.lang.String BELNR) {
        this.BELNR = BELNR;
    }


    /**
     * Gets the EJAHR value for this DT_FIIF30030_CPS_responseEX_RESULT.
     * 
     * @return EJAHR   * 반제회계연도
     */
    public java.lang.String getEJAHR() {
        return EJAHR;
    }


    /**
     * Sets the EJAHR value for this DT_FIIF30030_CPS_responseEX_RESULT.
     * 
     * @param EJAHR   * 반제회계연도
     */
    public void setEJAHR(java.lang.String EJAHR) {
        this.EJAHR = EJAHR;
    }


    /**
     * Gets the AUGBL value for this DT_FIIF30030_CPS_responseEX_RESULT.
     * 
     * @return AUGBL   * 반제전표 전표번호
     */
    public java.lang.String getAUGBL() {
        return AUGBL;
    }


    /**
     * Sets the AUGBL value for this DT_FIIF30030_CPS_responseEX_RESULT.
     * 
     * @param AUGBL   * 반제전표 전표번호
     */
    public void setAUGBL(java.lang.String AUGBL) {
        this.AUGBL = AUGBL;
    }


    /**
     * Gets the MTYPE value for this DT_FIIF30030_CPS_responseEX_RESULT.
     * 
     * @return MTYPE   * 처리 상태
     */
    public java.lang.String getMTYPE() {
        return MTYPE;
    }


    /**
     * Sets the MTYPE value for this DT_FIIF30030_CPS_responseEX_RESULT.
     * 
     * @param MTYPE   * 처리 상태
     */
    public void setMTYPE(java.lang.String MTYPE) {
        this.MTYPE = MTYPE;
    }


    /**
     * Gets the ZMSG value for this DT_FIIF30030_CPS_responseEX_RESULT.
     * 
     * @return ZMSG   * 메세지
     */
    public java.lang.String getZMSG() {
        return ZMSG;
    }


    /**
     * Sets the ZMSG value for this DT_FIIF30030_CPS_responseEX_RESULT.
     * 
     * @param ZMSG   * 메세지
     */
    public void setZMSG(java.lang.String ZMSG) {
        this.ZMSG = ZMSG;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DT_FIIF30030_CPS_responseEX_RESULT)) return false;
        DT_FIIF30030_CPS_responseEX_RESULT other = (DT_FIIF30030_CPS_responseEX_RESULT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PKEY==null && other.getPKEY()==null) || 
             (this.PKEY!=null &&
              this.PKEY.equals(other.getPKEY()))) &&
            ((this.BUKRS==null && other.getBUKRS()==null) || 
             (this.BUKRS!=null &&
              this.BUKRS.equals(other.getBUKRS()))) &&
            ((this.GJAHR==null && other.getGJAHR()==null) || 
             (this.GJAHR!=null &&
              this.GJAHR.equals(other.getGJAHR()))) &&
            ((this.BELNR==null && other.getBELNR()==null) || 
             (this.BELNR!=null &&
              this.BELNR.equals(other.getBELNR()))) &&
            ((this.EJAHR==null && other.getEJAHR()==null) || 
             (this.EJAHR!=null &&
              this.EJAHR.equals(other.getEJAHR()))) &&
            ((this.AUGBL==null && other.getAUGBL()==null) || 
             (this.AUGBL!=null &&
              this.AUGBL.equals(other.getAUGBL()))) &&
            ((this.MTYPE==null && other.getMTYPE()==null) || 
             (this.MTYPE!=null &&
              this.MTYPE.equals(other.getMTYPE()))) &&
            ((this.ZMSG==null && other.getZMSG()==null) || 
             (this.ZMSG!=null &&
              this.ZMSG.equals(other.getZMSG())));
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
        if (getPKEY() != null) {
            _hashCode += getPKEY().hashCode();
        }
        if (getBUKRS() != null) {
            _hashCode += getBUKRS().hashCode();
        }
        if (getGJAHR() != null) {
            _hashCode += getGJAHR().hashCode();
        }
        if (getBELNR() != null) {
            _hashCode += getBELNR().hashCode();
        }
        if (getEJAHR() != null) {
            _hashCode += getEJAHR().hashCode();
        }
        if (getAUGBL() != null) {
            _hashCode += getAUGBL().hashCode();
        }
        if (getMTYPE() != null) {
            _hashCode += getMTYPE().hashCode();
        }
        if (getZMSG() != null) {
            _hashCode += getZMSG().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DT_FIIF30030_CPS_responseEX_RESULT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://daewoong.co.kr/FI/CPS", ">DT_FIIF30030_CPS_response>EX_RESULT"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PKEY");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PKEY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BUKRS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BUKRS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GJAHR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "GJAHR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BELNR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BELNR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EJAHR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EJAHR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AUGBL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AUGBL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MTYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MTYPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZMSG");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZMSG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
