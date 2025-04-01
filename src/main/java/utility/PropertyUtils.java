package utility;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyUtils {

	private static PropertyUtils propertyUtils;
	InputStream inputStream;
	String Value;

	public String getProperty(String key) {
		Properties pros = new Properties();
		try {
			inputStream = getClass().getClassLoader().getResourceAsStream(Constant.configpath);
			if (inputStream != null) {
				pros.load(inputStream);
			} else {
				throw new FileNotFoundException("Property File Not Found..!!");
			}
			Value = pros.getProperty(key);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return Value;
	}

	public static PropertyUtils getInstance() {

		if (propertyUtils == null) {
			synchronized (PropertyUtils.class) {
				if (propertyUtils == null) {
					propertyUtils = new PropertyUtils();
				}
			}
		}
		return propertyUtils;
	}

//	public static void main(String[] args) {
//		
//		PropertyUtils p=new PropertyUtils();
//		p.getProperty(" ");
//		
//		
//		
//	}
}
