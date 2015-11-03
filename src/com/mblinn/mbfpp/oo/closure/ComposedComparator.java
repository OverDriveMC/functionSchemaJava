package com.mblinn.mbfpp.oo.closure;

import java.util.Comparator;

public class ComposedComparator<T>implements Comparator<T> {
	private Comparator<T>[]comparators;
	public ComposedComparator(Comparator<T>... comparators){
		this.comparators=comparators;
	}
	@Override
	public int compare(T arg0, T arg1) {
		//遍历比较器并逐个调用每个比较器的比较方法
		return 0;
	}	
}
