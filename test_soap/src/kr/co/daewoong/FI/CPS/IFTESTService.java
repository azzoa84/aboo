package kr.co.daewoong.FI.CPS;

public class IFTESTService implements IFTEST{

	@Override
	public int carOpen() throws Exception{
		// TODO Auto-generated method stub
		IFTESTDao dao = new IFTESTDao();
		return dao.openCar();
	}
}
