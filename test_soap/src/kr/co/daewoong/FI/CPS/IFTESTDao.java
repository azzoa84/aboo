package kr.co.daewoong.FI.CPS;

public class IFTESTDao {

	public int openCar() throws Exception{
		int c;
		
		try {
			c = 4 / 0;
		} catch (Exception e) {
			System.out.println(e.toString());
			c = -1;
		}
		
		
		
		
		return c;
	}
}
