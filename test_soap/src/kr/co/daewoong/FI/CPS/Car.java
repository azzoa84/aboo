package kr.co.daewoong.FI.CPS;

public class Car {

	public void openCar() throws Exception{
		IFTESTService service = new IFTESTService();
		service.carOpen();
	}
}
