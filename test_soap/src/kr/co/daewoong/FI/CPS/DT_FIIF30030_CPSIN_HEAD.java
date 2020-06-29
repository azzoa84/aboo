/**
 * DT_FIIF30030_CPSIN_HEAD.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kr.co.daewoong.FI.CPS;

public class DT_FIIF30030_CPSIN_HEAD  implements java.io.Serializable {
    /* Head-Item 연결키 */
    private java.lang.String PKEY;

    /* 전표 증빙일 */
    private java.lang.String BLDAT;

    /* 전표의 전기일 */
    private java.lang.String BUDAT;

    /* 전표 유형 */
    private java.lang.String BLART;

    /* 회사 코드 */
    private java.lang.String BUKRS;

    /* 통화 키 */
    private java.lang.String WAERS;

    /* 법인카드 카드사명 */
    private java.lang.String CARDNM;

    /* 법인카드 업종구분코드 */
    private java.lang.String MCC_CODE;

    /* 법인카드 업종명 */
    private java.lang.String MCC_NAME;

    /* 전표 헤더 텍스트 */
    private java.lang.String BKTXT;

    /* 다음 개별항목의 전기키 */
    private java.lang.String NEWBS;

    /* 다음 개별항목의 계정 또는 매치코드 */
    private java.lang.String NEWKO;

    /* 금액1 */
    private java.lang.String WRBTR;

    /* 세액 */
    private java.lang.String WMWST;

    /* 부가가치세 코드 */
    private java.lang.String MWSKZ;

    /* 사업장 */
    private java.lang.String BUPLA;

    /* 만기 계산 기준일 */
    private java.lang.String ZFBDT;

    /* 결재은행계좌 번호 */
    private java.lang.String ZUONR;

    /* 카드가맹점: 사업자등록번호 */
    private java.lang.String XREF1;

    /* 카드가맹점: 압체명 */
    private java.lang.String XREF2;

    /* 법인카드 번호 */
    private java.lang.String XREF3;

    /* 품목텍스트 */
    private java.lang.String SGTXT;

    public DT_FIIF30030_CPSIN_HEAD() {
    }

    public DT_FIIF30030_CPSIN_HEAD(
           java.lang.String PKEY,
           java.lang.String BLDAT,
           java.lang.String BUDAT,
           java.lang.String BLART,
           java.lang.String BUKRS,
           java.lang.String WAERS,
           java.lang.String CARDNM,
           java.lang.String MCC_CODE,
           java.lang.String MCC_NAME,
           java.lang.String BKTXT,
           java.lang.String NEWBS,
           java.lang.String NEWKO,
           java.lang.String WRBTR,
           java.lang.String WMWST,
           java.lang.String MWSKZ,
           java.lang.String BUPLA,
           java.lang.String ZFBDT,
           java.lang.String ZUONR,
           java.lang.String XREF1,
           java.lang.String XREF2,
           java.lang.String XREF3,
           java.lang.String SGTXT) {
           this.PKEY = PKEY;
           this.BLDAT = BLDAT;
           this.BUDAT = BUDAT;
           this.BLART = BLART;
           this.BUKRS = BUKRS;
           this.WAERS = WAERS;
           this.CARDNM = CARDNM;
           this.MCC_CODE = MCC_CODE;
           this.MCC_NAME = MCC_NAME;
           this.BKTXT = BKTXT;
           this.NEWBS = NEWBS;
           this.NEWKO = NEWKO;
           this.WRBTR = WRBTR;
           this.WMWST = WMWST;
           this.MWSKZ = MWSKZ;
           this.BUPLA = BUPLA;
           this.ZFBDT = ZFBDT;
           this.ZUONR = ZUONR;
           this.XREF1 = XREF1;
           this.XREF2 = XREF2;
           this.XREF3 = XREF3;
           this.SGTXT = SGTXT;
    }


    /**
     * Gets the PKEY value for this DT_FIIF30030_CPSIN_HEAD.
     * 
     * @return PKEY   * Head-Item 연결키
     */
    public java.lang.String getPKEY() {
        return PKEY;
    }


    /**
     * Sets the PKEY value for this DT_FIIF30030_CPSIN_HEAD.
     * 
     * @param PKEY   * Head-Item 연결키
     */
    public void setPKEY(java.lang.String PKEY) {
        this.PKEY = PKEY;
    }


    /**
     * Gets the BLDAT value for this DT_FIIF30030_CPSIN_HEAD.
     * 
     * @return BLDAT   * 전표 증빙일
     */
    public java.lang.String getBLDAT() {
        return BLDAT;
    }


    /**
     * Sets the BLDAT value for this DT_FIIF30030_CPSIN_HEAD.
     * 
     * @param BLDAT   * 전표 증빙일
     */
    public void setBLDAT(java.lang.String BLDAT) {
        this.BLDAT = BLDAT;
    }


    /**
     * Gets the BUDAT value for this DT_FIIF30030_CPSIN_HEAD.
     * 
     * @return BUDAT   * 전표의 전기일
     */
    public java.lang.String getBUDAT() {
        return BUDAT;
    }


    /**
     * Sets the BUDAT value for this DT_FIIF30030_CPSIN_HEAD.
     * 
     * @param BUDAT   * 전표의 전기일
     */
    public void setBUDAT(java.lang.String BUDAT) {
        this.BUDAT = BUDAT;
    }


    /**
     * Gets the BLART value for this DT_FIIF30030_CPSIN_HEAD.
     * 
     * @return BLART   * 전표 유형
     */
    public java.lang.String getBLART() {
        return BLART;
    }


    /**
     * Sets the BLART value for this DT_FIIF30030_CPSIN_HEAD.
     * 
     * @param BLART   * 전표 유형
     */
    public void setBLART(java.lang.String BLART) {
        this.BLART = BLART;
    }


    /**
     * Gets the BUKRS value for this DT_FIIF30030_CPSIN_HEAD.
     * 
     * @return BUKRS   * 회사 코드
     */
    public java.lang.String getBUKRS() {
        return BUKRS;
    }


    /**
     * Sets the BUKRS value for this DT_FIIF30030_CPSIN_HEAD.
     * 
     * @param BUKRS   * 회사 코드
     */
    public void setBUKRS(java.lang.String BUKRS) {
        this.BUKRS = BUKRS;
    }


    /**
     * Gets the WAERS value for this DT_FIIF30030_CPSIN_HEAD.
     * 
     * @return WAERS   * 통화 키
     */
    public java.lang.String getWAERS() {
        return WAERS;
    }


    /**
     * Sets the WAERS value for this DT_FIIF30030_CPSIN_HEAD.
     * 
     * @param WAERS   * 통화 키
     */
    public void setWAERS(java.lang.String WAERS) {
        this.WAERS = WAERS;
    }


    /**
     * Gets the CARDNM value for this DT_FIIF30030_CPSIN_HEAD.
     * 
     * @return CARDNM   * 법인카드 카드사명
     */
    public java.lang.String getCARDNM() {
        return CARDNM;
    }


    /**
     * Sets the CARDNM value for this DT_FIIF30030_CPSIN_HEAD.
     * 
     * @param CARDNM   * 법인카드 카드사명
     */
    public void setCARDNM(java.lang.String CARDNM) {
        this.CARDNM = CARDNM;
    }


    /**
     * Gets the MCC_CODE value for this DT_FIIF30030_CPSIN_HEAD.
     * 
     * @return MCC_CODE   * 법인카드 업종구분코드
     */
    public java.lang.String getMCC_CODE() {
        return MCC_CODE;
    }


    /**
     * Sets the MCC_CODE value for this DT_FIIF30030_CPSIN_HEAD.
     * 
     * @param MCC_CODE   * 법인카드 업종구분코드
     */
    public void setMCC_CODE(java.lang.String MCC_CODE) {
        this.MCC_CODE = MCC_CODE;
    }


    /**
     * Gets the MCC_NAME value for this DT_FIIF30030_CPSIN_HEAD.
     * 
     * @return MCC_NAME   * 법인카드 업종명
     */
    public java.lang.String getMCC_NAME() {
        return MCC_NAME;
    }


    /**
     * Sets the MCC_NAME value for this DT_FIIF30030_CPSIN_HEAD.
     * 
     * @param MCC_NAME   * 법인카드 업종명
     */
    public void setMCC_NAME(java.lang.String MCC_NAME) {
        this.MCC_NAME = MCC_NAME;
    }


    /**
     * Gets the BKTXT value for this DT_FIIF30030_CPSIN_HEAD.
     * 
     * @return BKTXT   * 전표 헤더 텍스트
     */
    public java.lang.String getBKTXT() {
        return BKTXT;
    }


    /**
     * Sets the BKTXT value for this DT_FIIF30030_CPSIN_HEAD.
     * 
     * @param BKTXT   * 전표 헤더 텍스트
     */
    public void setBKTXT(java.lang.String BKTXT) {
        this.BKTXT = BKTXT;
    }


    /**
     * Gets the NEWBS value for this DT_FIIF30030_CPSIN_HEAD.
     * 
     * @return NEWBS   * 다음 개별항목의 전기키
     */
    public java.lang.String getNEWBS() {
        return NEWBS;
    }


    /**
     * Sets the NEWBS value for this DT_FIIF30030_CPSIN_HEAD.
     * 
     * @param NEWBS   * 다음 개별항목의 전기키
     */
    public void setNEWBS(java.lang.String NEWBS) {
        this.NEWBS = NEWBS;
    }


    /**
     * Gets the NEWKO value for this DT_FIIF30030_CPSIN_HEAD.
     * 
     * @return NEWKO   * 다음 개별항목의 계정 또는 매치코드
     */
    public java.lang.String getNEWKO() {
        return NEWKO;
    }


    /**
     * Sets the NEWKO value for this DT_FIIF30030_CPSIN_HEAD.
     * 
     * @param NEWKO   * 다음 개별항목의 계정 또는 매치코드
     */
    public void setNEWKO(java.lang.String NEWKO) {
        this.NEWKO = NEWKO;
    }


    /**
     * Gets the WRBTR value for this DT_FIIF30030_CPSIN_HEAD.
     * 
     * @return WRBTR   * 금액1
     */
    public java.lang.String getWRBTR() {
        return WRBTR;
    }


    /**
     * Sets the WRBTR value for this DT_FIIF30030_CPSIN_HEAD.
     * 
     * @param WRBTR   * 금액1
     */
    public void setWRBTR(java.lang.String WRBTR) {
        this.WRBTR = WRBTR;
    }


    /**
     * Gets the WMWST value for this DT_FIIF30030_CPSIN_HEAD.
     * 
     * @return WMWST   * 세액
     */
    public java.lang.String getWMWST() {
        return WMWST;
    }


    /**
     * Sets the WMWST value for this DT_FIIF30030_CPSIN_HEAD.
     * 
     * @param WMWST   * 세액
     */
    public void setWMWST(java.lang.String WMWST) {
        this.WMWST = WMWST;
    }


    /**
     * Gets the MWSKZ value for this DT_FIIF30030_CPSIN_HEAD.
     * 
     * @return MWSKZ   * 부가가치세 코드
     */
    public java.lang.String getMWSKZ() {
        return MWSKZ;
    }


    /**
     * Sets the MWSKZ value for this DT_FIIF30030_CPSIN_HEAD.
     * 
     * @param MWSKZ   * 부가가치세 코드
     */
    public void setMWSKZ(java.lang.String MWSKZ) {
        this.MWSKZ = MWSKZ;
    }


    /**
     * Gets the BUPLA value for this DT_FIIF30030_CPSIN_HEAD.
     * 
     * @return BUPLA   * 사업장
     */
    public java.lang.String getBUPLA() {
        return BUPLA;
    }


    /**
     * Sets the BUPLA value for this DT_FIIF30030_CPSIN_HEAD.
     * 
     * @param BUPLA   * 사업장
     */
    public void setBUPLA(java.lang.String BUPLA) {
        this.BUPLA = BUPLA;
    }


    /**
     * Gets the ZFBDT value for this DT_FIIF30030_CPSIN_HEAD.
     * 
     * @return ZFBDT   * 만기 계산 기준일
     */
    public java.lang.String getZFBDT() {
        return ZFBDT;
    }


    /**
     * Sets the ZFBDT value for this DT_FIIF30030_CPSIN_HEAD.
     * 
     * @param ZFBDT   * 만기 계산 기준일
     */
    public void setZFBDT(java.lang.String ZFBDT) {
        this.ZFBDT = ZFBDT;
    }


    /**
     * Gets the ZUONR value for this DT_FIIF30030_CPSIN_HEAD.
     * 
     * @return ZUONR   * 결재은행계좌 번호
     */
    public java.lang.String getZUONR() {
        return ZUONR;
    }


    /**
     * Sets the ZUONR value for this DT_FIIF30030_CPSIN_HEAD.
     * 
     * @param ZUONR   * 결재은행계좌 번호
     */
    public void setZUONR(java.lang.String ZUONR) {
        this.ZUONR = ZUONR;
    }


    /**
     * Gets the XREF1 value for this DT_FIIF30030_CPSIN_HEAD.
     * 
     * @return XREF1   * 카드가맹점: 사업자등록번호
     */
    public java.lang.String getXREF1() {
        return XREF1;
    }


    /**
     * Sets the XREF1 value for this DT_FIIF30030_CPSIN_HEAD.
     * 
     * @param XREF1   * 카드가맹점: 사업자등록번호
     */
    public void setXREF1(java.lang.String XREF1) {
        this.XREF1 = XREF1;
    }


    /**
     * Gets the XREF2 value for this DT_FIIF30030_CPSIN_HEAD.
     * 
     * @return XREF2   * 카드가맹점: 압체명
     */
    public java.lang.String getXREF2() {
        return XREF2;
    }


    /**
     * Sets the XREF2 value for this DT_FIIF30030_CPSIN_HEAD.
     * 
     * @param XREF2   * 카드가맹점: 압체명
     */
    public void setXREF2(java.lang.String XREF2) {
        this.XREF2 = XREF2;
    }


    /**
     * Gets the XREF3 value for this DT_FIIF30030_CPSIN_HEAD.
     * 
     * @return XREF3   * 법인카드 번호
     */
    public java.lang.String getXREF3() {
        return XREF3;
    }


    /**
     * Sets the XREF3 value for this DT_FIIF30030_CPSIN_HEAD.
     * 
     * @param XREF3   * 법인카드 번호
     */
    public void setXREF3(java.lang.String XREF3) {
        this.XREF3 = XREF3;
    }


    /**
     * Gets the SGTXT value for this DT_FIIF30030_CPSIN_HEAD.
     * 
     * @return SGTXT   * 품목텍스트
     */
    public java.lang.String getSGTXT() {
        return SGTXT;
    }


    /**
     * Sets the SGTXT value for this DT_FIIF30030_CPSIN_HEAD.
     * 
     * @param SGTXT   * 품목텍스트
     */
    public void setSGTXT(java.lang.String SGTXT) {
        this.SGTXT = SGTXT;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DT_FIIF30030_CPSIN_HEAD)) return false;
        DT_FIIF30030_CPSIN_HEAD other = (DT_FIIF30030_CPSIN_HEAD) obj;
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
            ((this.BLDAT==null && other.getBLDAT()==null) || 
             (this.BLDAT!=null &&
              this.BLDAT.equals(other.getBLDAT()))) &&
            ((this.BUDAT==null && other.getBUDAT()==null) || 
             (this.BUDAT!=null &&
              this.BUDAT.equals(other.getBUDAT()))) &&
            ((this.BLART==null && other.getBLART()==null) || 
             (this.BLART!=null &&
              this.BLART.equals(other.getBLART()))) &&
            ((this.BUKRS==null && other.getBUKRS()==null) || 
             (this.BUKRS!=null &&
              this.BUKRS.equals(other.getBUKRS()))) &&
            ((this.WAERS==null && other.getWAERS()==null) || 
             (this.WAERS!=null &&
              this.WAERS.equals(other.getWAERS()))) &&
            ((this.CARDNM==null && other.getCARDNM()==null) || 
             (this.CARDNM!=null &&
              this.CARDNM.equals(other.getCARDNM()))) &&
            ((this.MCC_CODE==null && other.getMCC_CODE()==null) || 
             (this.MCC_CODE!=null &&
              this.MCC_CODE.equals(other.getMCC_CODE()))) &&
            ((this.MCC_NAME==null && other.getMCC_NAME()==null) || 
             (this.MCC_NAME!=null &&
              this.MCC_NAME.equals(other.getMCC_NAME()))) &&
            ((this.BKTXT==null && other.getBKTXT()==null) || 
             (this.BKTXT!=null &&
              this.BKTXT.equals(other.getBKTXT()))) &&
            ((this.NEWBS==null && other.getNEWBS()==null) || 
             (this.NEWBS!=null &&
              this.NEWBS.equals(other.getNEWBS()))) &&
            ((this.NEWKO==null && other.getNEWKO()==null) || 
             (this.NEWKO!=null &&
              this.NEWKO.equals(other.getNEWKO()))) &&
            ((this.WRBTR==null && other.getWRBTR()==null) || 
             (this.WRBTR!=null &&
              this.WRBTR.equals(other.getWRBTR()))) &&
            ((this.WMWST==null && other.getWMWST()==null) || 
             (this.WMWST!=null &&
              this.WMWST.equals(other.getWMWST()))) &&
            ((this.MWSKZ==null && other.getMWSKZ()==null) || 
             (this.MWSKZ!=null &&
              this.MWSKZ.equals(other.getMWSKZ()))) &&
            ((this.BUPLA==null && other.getBUPLA()==null) || 
             (this.BUPLA!=null &&
              this.BUPLA.equals(other.getBUPLA()))) &&
            ((this.ZFBDT==null && other.getZFBDT()==null) || 
             (this.ZFBDT!=null &&
              this.ZFBDT.equals(other.getZFBDT()))) &&
            ((this.ZUONR==null && other.getZUONR()==null) || 
             (this.ZUONR!=null &&
              this.ZUONR.equals(other.getZUONR()))) &&
            ((this.XREF1==null && other.getXREF1()==null) || 
             (this.XREF1!=null &&
              this.XREF1.equals(other.getXREF1()))) &&
            ((this.XREF2==null && other.getXREF2()==null) || 
             (this.XREF2!=null &&
              this.XREF2.equals(other.getXREF2()))) &&
            ((this.XREF3==null && other.getXREF3()==null) || 
             (this.XREF3!=null &&
              this.XREF3.equals(other.getXREF3()))) &&
            ((this.SGTXT==null && other.getSGTXT()==null) || 
             (this.SGTXT!=null &&
              this.SGTXT.equals(other.getSGTXT())));
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
        if (getBLDAT() != null) {
            _hashCode += getBLDAT().hashCode();
        }
        if (getBUDAT() != null) {
            _hashCode += getBUDAT().hashCode();
        }
        if (getBLART() != null) {
            _hashCode += getBLART().hashCode();
        }
        if (getBUKRS() != null) {
            _hashCode += getBUKRS().hashCode();
        }
        if (getWAERS() != null) {
            _hashCode += getWAERS().hashCode();
        }
        if (getCARDNM() != null) {
            _hashCode += getCARDNM().hashCode();
        }
        if (getMCC_CODE() != null) {
            _hashCode += getMCC_CODE().hashCode();
        }
        if (getMCC_NAME() != null) {
            _hashCode += getMCC_NAME().hashCode();
        }
        if (getBKTXT() != null) {
            _hashCode += getBKTXT().hashCode();
        }
        if (getNEWBS() != null) {
            _hashCode += getNEWBS().hashCode();
        }
        if (getNEWKO() != null) {
            _hashCode += getNEWKO().hashCode();
        }
        if (getWRBTR() != null) {
            _hashCode += getWRBTR().hashCode();
        }
        if (getWMWST() != null) {
            _hashCode += getWMWST().hashCode();
        }
        if (getMWSKZ() != null) {
            _hashCode += getMWSKZ().hashCode();
        }
        if (getBUPLA() != null) {
            _hashCode += getBUPLA().hashCode();
        }
        if (getZFBDT() != null) {
            _hashCode += getZFBDT().hashCode();
        }
        if (getZUONR() != null) {
            _hashCode += getZUONR().hashCode();
        }
        if (getXREF1() != null) {
            _hashCode += getXREF1().hashCode();
        }
        if (getXREF2() != null) {
            _hashCode += getXREF2().hashCode();
        }
        if (getXREF3() != null) {
            _hashCode += getXREF3().hashCode();
        }
        if (getSGTXT() != null) {
            _hashCode += getSGTXT().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DT_FIIF30030_CPSIN_HEAD.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://daewoong.co.kr/FI/CPS", ">DT_FIIF30030_CPS>IN_HEAD"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PKEY");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PKEY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BLDAT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BLDAT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BUDAT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BUDAT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BLART");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BLART"));
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
        elemField.setFieldName("WAERS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "WAERS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CARDNM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CARDNM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MCC_CODE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MCC_CODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MCC_NAME");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MCC_NAME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BKTXT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BKTXT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NEWBS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NEWBS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NEWKO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NEWKO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WRBTR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "WRBTR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WMWST");
        elemField.setXmlName(new javax.xml.namespace.QName("", "WMWST"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MWSKZ");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MWSKZ"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BUPLA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BUPLA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZFBDT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZFBDT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZUONR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZUONR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("XREF1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "XREF1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("XREF2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "XREF2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("XREF3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "XREF3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SGTXT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SGTXT"));
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
