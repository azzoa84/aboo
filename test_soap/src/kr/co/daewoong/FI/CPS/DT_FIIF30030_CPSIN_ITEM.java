/**
 * DT_FIIF30030_CPSIN_ITEM.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kr.co.daewoong.FI.CPS;

public class DT_FIIF30030_CPSIN_ITEM  implements java.io.Serializable {
    /* Head-Item 연결키 */
    private java.lang.String PKEY;

    /* 회계 전표의 개별 항목 번호 */
    private java.lang.String BUZEI;

    /* 전기 키 */
    private java.lang.String NEWBS2;

    /* 다음 개별항목의 계정 또는 매치코드 */
    private java.lang.String NEWKO2;

    /* 금액2 */
    private java.lang.String WRBTR2;

    /* 코스트 센터 */
    private java.lang.String KOSTL;

    /* 오더 번호 */
    private java.lang.String AUFNR;

    /* 지정 번호 */
    private java.lang.String ZUONR2;

    /* 품목텍스트 */
    private java.lang.String SGTXT2;

    public DT_FIIF30030_CPSIN_ITEM() {
    }

    public DT_FIIF30030_CPSIN_ITEM(
           java.lang.String PKEY,
           java.lang.String BUZEI,
           java.lang.String NEWBS2,
           java.lang.String NEWKO2,
           java.lang.String WRBTR2,
           java.lang.String KOSTL,
           java.lang.String AUFNR,
           java.lang.String ZUONR2,
           java.lang.String SGTXT2) {
           this.PKEY = PKEY;
           this.BUZEI = BUZEI;
           this.NEWBS2 = NEWBS2;
           this.NEWKO2 = NEWKO2;
           this.WRBTR2 = WRBTR2;
           this.KOSTL = KOSTL;
           this.AUFNR = AUFNR;
           this.ZUONR2 = ZUONR2;
           this.SGTXT2 = SGTXT2;
    }


    /**
     * Gets the PKEY value for this DT_FIIF30030_CPSIN_ITEM.
     * 
     * @return PKEY   * Head-Item 연결키
     */
    public java.lang.String getPKEY() {
        return PKEY;
    }


    /**
     * Sets the PKEY value for this DT_FIIF30030_CPSIN_ITEM.
     * 
     * @param PKEY   * Head-Item 연결키
     */
    public void setPKEY(java.lang.String PKEY) {
        this.PKEY = PKEY;
    }


    /**
     * Gets the BUZEI value for this DT_FIIF30030_CPSIN_ITEM.
     * 
     * @return BUZEI   * 회계 전표의 개별 항목 번호
     */
    public java.lang.String getBUZEI() {
        return BUZEI;
    }


    /**
     * Sets the BUZEI value for this DT_FIIF30030_CPSIN_ITEM.
     * 
     * @param BUZEI   * 회계 전표의 개별 항목 번호
     */
    public void setBUZEI(java.lang.String BUZEI) {
        this.BUZEI = BUZEI;
    }


    /**
     * Gets the NEWBS2 value for this DT_FIIF30030_CPSIN_ITEM.
     * 
     * @return NEWBS2   * 전기 키
     */
    public java.lang.String getNEWBS2() {
        return NEWBS2;
    }


    /**
     * Sets the NEWBS2 value for this DT_FIIF30030_CPSIN_ITEM.
     * 
     * @param NEWBS2   * 전기 키
     */
    public void setNEWBS2(java.lang.String NEWBS2) {
        this.NEWBS2 = NEWBS2;
    }


    /**
     * Gets the NEWKO2 value for this DT_FIIF30030_CPSIN_ITEM.
     * 
     * @return NEWKO2   * 다음 개별항목의 계정 또는 매치코드
     */
    public java.lang.String getNEWKO2() {
        return NEWKO2;
    }


    /**
     * Sets the NEWKO2 value for this DT_FIIF30030_CPSIN_ITEM.
     * 
     * @param NEWKO2   * 다음 개별항목의 계정 또는 매치코드
     */
    public void setNEWKO2(java.lang.String NEWKO2) {
        this.NEWKO2 = NEWKO2;
    }


    /**
     * Gets the WRBTR2 value for this DT_FIIF30030_CPSIN_ITEM.
     * 
     * @return WRBTR2   * 금액2
     */
    public java.lang.String getWRBTR2() {
        return WRBTR2;
    }


    /**
     * Sets the WRBTR2 value for this DT_FIIF30030_CPSIN_ITEM.
     * 
     * @param WRBTR2   * 금액2
     */
    public void setWRBTR2(java.lang.String WRBTR2) {
        this.WRBTR2 = WRBTR2;
    }


    /**
     * Gets the KOSTL value for this DT_FIIF30030_CPSIN_ITEM.
     * 
     * @return KOSTL   * 코스트 센터
     */
    public java.lang.String getKOSTL() {
        return KOSTL;
    }


    /**
     * Sets the KOSTL value for this DT_FIIF30030_CPSIN_ITEM.
     * 
     * @param KOSTL   * 코스트 센터
     */
    public void setKOSTL(java.lang.String KOSTL) {
        this.KOSTL = KOSTL;
    }


    /**
     * Gets the AUFNR value for this DT_FIIF30030_CPSIN_ITEM.
     * 
     * @return AUFNR   * 오더 번호
     */
    public java.lang.String getAUFNR() {
        return AUFNR;
    }


    /**
     * Sets the AUFNR value for this DT_FIIF30030_CPSIN_ITEM.
     * 
     * @param AUFNR   * 오더 번호
     */
    public void setAUFNR(java.lang.String AUFNR) {
        this.AUFNR = AUFNR;
    }


    /**
     * Gets the ZUONR2 value for this DT_FIIF30030_CPSIN_ITEM.
     * 
     * @return ZUONR2   * 지정 번호
     */
    public java.lang.String getZUONR2() {
        return ZUONR2;
    }


    /**
     * Sets the ZUONR2 value for this DT_FIIF30030_CPSIN_ITEM.
     * 
     * @param ZUONR2   * 지정 번호
     */
    public void setZUONR2(java.lang.String ZUONR2) {
        this.ZUONR2 = ZUONR2;
    }


    /**
     * Gets the SGTXT2 value for this DT_FIIF30030_CPSIN_ITEM.
     * 
     * @return SGTXT2   * 품목텍스트
     */
    public java.lang.String getSGTXT2() {
        return SGTXT2;
    }


    /**
     * Sets the SGTXT2 value for this DT_FIIF30030_CPSIN_ITEM.
     * 
     * @param SGTXT2   * 품목텍스트
     */
    public void setSGTXT2(java.lang.String SGTXT2) {
        this.SGTXT2 = SGTXT2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DT_FIIF30030_CPSIN_ITEM)) return false;
        DT_FIIF30030_CPSIN_ITEM other = (DT_FIIF30030_CPSIN_ITEM) obj;
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
            ((this.BUZEI==null && other.getBUZEI()==null) || 
             (this.BUZEI!=null &&
              this.BUZEI.equals(other.getBUZEI()))) &&
            ((this.NEWBS2==null && other.getNEWBS2()==null) || 
             (this.NEWBS2!=null &&
              this.NEWBS2.equals(other.getNEWBS2()))) &&
            ((this.NEWKO2==null && other.getNEWKO2()==null) || 
             (this.NEWKO2!=null &&
              this.NEWKO2.equals(other.getNEWKO2()))) &&
            ((this.WRBTR2==null && other.getWRBTR2()==null) || 
             (this.WRBTR2!=null &&
              this.WRBTR2.equals(other.getWRBTR2()))) &&
            ((this.KOSTL==null && other.getKOSTL()==null) || 
             (this.KOSTL!=null &&
              this.KOSTL.equals(other.getKOSTL()))) &&
            ((this.AUFNR==null && other.getAUFNR()==null) || 
             (this.AUFNR!=null &&
              this.AUFNR.equals(other.getAUFNR()))) &&
            ((this.ZUONR2==null && other.getZUONR2()==null) || 
             (this.ZUONR2!=null &&
              this.ZUONR2.equals(other.getZUONR2()))) &&
            ((this.SGTXT2==null && other.getSGTXT2()==null) || 
             (this.SGTXT2!=null &&
              this.SGTXT2.equals(other.getSGTXT2())));
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
        if (getBUZEI() != null) {
            _hashCode += getBUZEI().hashCode();
        }
        if (getNEWBS2() != null) {
            _hashCode += getNEWBS2().hashCode();
        }
        if (getNEWKO2() != null) {
            _hashCode += getNEWKO2().hashCode();
        }
        if (getWRBTR2() != null) {
            _hashCode += getWRBTR2().hashCode();
        }
        if (getKOSTL() != null) {
            _hashCode += getKOSTL().hashCode();
        }
        if (getAUFNR() != null) {
            _hashCode += getAUFNR().hashCode();
        }
        if (getZUONR2() != null) {
            _hashCode += getZUONR2().hashCode();
        }
        if (getSGTXT2() != null) {
            _hashCode += getSGTXT2().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DT_FIIF30030_CPSIN_ITEM.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://daewoong.co.kr/FI/CPS", ">DT_FIIF30030_CPS>IN_ITEM"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PKEY");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PKEY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BUZEI");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BUZEI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NEWBS2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NEWBS2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NEWKO2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NEWKO2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WRBTR2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "WRBTR2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("KOSTL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "KOSTL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AUFNR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AUFNR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZUONR2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZUONR2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SGTXT2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SGTXT2"));
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
