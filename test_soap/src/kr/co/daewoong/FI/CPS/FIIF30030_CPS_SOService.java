/**
 * FIIF30030_CPS_SOService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kr.co.daewoong.FI.CPS;

public interface FIIF30030_CPS_SOService extends javax.xml.rpc.Service {
    public java.lang.String getHTTPS_PortAddress();

    public kr.co.daewoong.FI.CPS.FIIF30030_CPS_SO getHTTPS_Port() throws javax.xml.rpc.ServiceException;

    public kr.co.daewoong.FI.CPS.FIIF30030_CPS_SO getHTTPS_Port(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public java.lang.String getHTTP_PortAddress();

    public kr.co.daewoong.FI.CPS.FIIF30030_CPS_SO getHTTP_Port() throws javax.xml.rpc.ServiceException;

    public kr.co.daewoong.FI.CPS.FIIF30030_CPS_SO getHTTP_Port(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
