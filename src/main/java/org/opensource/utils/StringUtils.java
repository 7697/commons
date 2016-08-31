package org.opensource.utils;

/**
 * String的工具类
 * @author king
 *
 */
public class StringUtils {
	
	/**
	 * 是否为空
	 * @param str
	 * @return true or false
	 */
	public boolean isBlank(String str) {
		if(str == null || "".equals(str)) {
			return true;
		}
		return false;
	} 
}
