package org.opensource.utils.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.opensource.common.constant.DateFormat;

public class DateUtils implements DateFormat{

	/* DateUtils实例 */
	private static DateUtils dateUtils = new DateUtils();
	/* 格式化对象 */
	private SimpleDateFormat sdf = null;
	

	/**
	 * 私有化构造器，确保实例不可以被其他类实例化
	 */
	private DateUtils() {}

	/**
	 * 单例模式
	 * 
	 * @return DateUtils
	 */
	public static DateUtils getInstance() {
		return dateUtils;
	}

	/**
	 * 得到SimpleDateFormat
	 * 
	 * @param formatString
	 * @return SimpleDateFormat
	 */
	private SimpleDateFormat getSimpleDateFormat(String formatString) {
		sdf = new SimpleDateFormat(formatString);
		return sdf;
	}

	/**
	 * 得到默认的<b>yyyy-MM-dd</b>字符串格式
	 * 
	 * @return 如2016-07-30
	 */
	public String getDefaultCurrentStrDate() {
		return getCurrentStrDate(DEFAULT);
	}

	/**
	 * 得到默认的<b>yyyy-MM-dd</b>
	 * 
	 * @return java.util.Date
	 */
	public java.util.Date getDefaultCurrentUtilDate() {
		return getCurrentUtilDate(DEFAULT);
	}
	
	public java.sql.Date getDefaultCurrentSqlDate() {
		return getCurrentSqlDate(DEFAULT);
	}

	/**
	 * 传入指定的格式得到当前日期字符串
	 * 
	 * @param formatString
	 *            字符串格式
	 * @return 字符串日期格式
	 */
	public String getCurrentStrDate(String formatString) {
		SimpleDateFormat sdf = getSimpleDateFormat(formatString);
		return sdf.format(new java.util.Date());
	}
	/**
	 * 得到util格式的日期类型
	 * @param formatString
	 * @return 指定格式util date对象
	 */
	public java.util.Date getCurrentUtilDate(String formatString) {
		try {
			return sdf.parse(formatString);
		} catch (ParseException e) {

			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 得到指定格式的sql类型的日期
	 * @param formatString
	 * @return 指定格式sql date对象
	 */
	public java.sql.Date getCurrentSqlDate(String formatString) {
		try {
			return (java.sql.Date) sdf.parse(formatString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

}
