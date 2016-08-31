package org.opensource.utils.collections;

import java.util.ArrayList;

/**
 * List的工具类
 * @author king
 * @param <E>
 *
 */
public class ListUtils<E> extends ArrayList<E>{

	private static final long serialVersionUID = 1L;

	public static <E> ArrayList<E> newArryList() {
		return new ArrayList<E>();
	}
	
}
