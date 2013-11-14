package util;

public class Util {
	public static String iso2gbk(String tmp){
		try{
			return new String (tmp.getBytes("ISO8859_1"),"GBK");
		}catch (Exception e) {
			return tmp;
		}
	}
}
