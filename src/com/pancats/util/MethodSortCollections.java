package com.pancats.util;

import java.lang.reflect.Method;
import java.util.Comparator;

public class MethodSortCollections implements Comparator<Method> {
	private AnnotationProcessor processor=null;
	public MethodSortCollections() {
		processor=new AnnotationProcessor();
	}
	@Override
	public int compare(Method o1, Method o2) {
		return processor.getSequence(o1)-processor.getSequence(o2);
	}

}
