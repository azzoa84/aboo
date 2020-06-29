package kr.co.daewoong.FI.CPS;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;

public class Test {

	public static void main(String[] args) throws Exception {

		String sHi = "안녕";

		for (byte b : sHi.getBytes("utf-8")) {

			System.out.println(b);

		}
		System.out.println("------------------------------------------------");
		for (byte b : sHi.getBytes("euc-kr")) {

			System.out.println(b);

		}

		/*
		 * String a = new String("홍길동".getBytes("euc-kr"));
		 * System.out.println(a);
		 * 
		 * String helloString = "홍동"; byte[] euckrStrBuffer =
		 * helloString.getBytes("euc-kr");
		 * 
		 * System.out.println(new String(euckrStrBuffer));
		 * System.out.println(new String(euckrStrBuffer, "euc-kr"));
		 * 
		 * String originalStr = "ȫ�浿"; String[] charSet = {"utf-8", "euc-kr",
		 * "ksc5601", "iso-8859-1", "x-windows-949"};
		 * 
		 * for (int i = 0; i < charSet.length; i++) { for (int j = 0; j <
		 * charSet.length; j++) { try { System.out.println("[" + charSet[i] +
		 * "," + charSet[j] + "] = " + new
		 * String(originalStr.getBytes(charSet[i]), charSet[j])); } catch
		 * (Exception e) { // TODO: handle exception } } }
		 */
	}

}
