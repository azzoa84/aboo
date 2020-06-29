package kr.co.daewoong.FI.CPS;

public class FIIF30030_CPS_SOProxy implements kr.co.daewoong.FI.CPS.FIIF30030_CPS_SO {
  private String _endpoint = null;
  private kr.co.daewoong.FI.CPS.FIIF30030_CPS_SO fIIF30030_CPS_SO = null;
  
  public FIIF30030_CPS_SOProxy() {
    _initFIIF30030_CPS_SOProxy();
  }
  
  public FIIF30030_CPS_SOProxy(String endpoint) {
    _endpoint = endpoint;
    _initFIIF30030_CPS_SOProxy();
  }
  
  private void _initFIIF30030_CPS_SOProxy() {
    try {
      fIIF30030_CPS_SO = (new kr.co.daewoong.FI.CPS.FIIF30030_CPS_SOServiceLocator()).getHTTPS_Port();
      if (fIIF30030_CPS_SO != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)fIIF30030_CPS_SO)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)fIIF30030_CPS_SO)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (fIIF30030_CPS_SO != null)
      ((javax.xml.rpc.Stub)fIIF30030_CPS_SO)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public kr.co.daewoong.FI.CPS.FIIF30030_CPS_SO getFIIF30030_CPS_SO() {
    if (fIIF30030_CPS_SO == null)
      _initFIIF30030_CPS_SOProxy();
    return fIIF30030_CPS_SO;
  }
  
  public kr.co.daewoong.FI.CPS.DT_FIIF30030_CPS_responseEX_RESULT[] FIIF30030_CPS_SO(kr.co.daewoong.FI.CPS.DT_FIIF30030_CPS MT_FIIF30030_CPS) throws java.rmi.RemoteException{
    if (fIIF30030_CPS_SO == null)
      _initFIIF30030_CPS_SOProxy();
    return fIIF30030_CPS_SO.FIIF30030_CPS_SO(MT_FIIF30030_CPS);
  }
  
  
}