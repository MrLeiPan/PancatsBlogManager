package com.pancats.util;

import java.lang.reflect.Method;

import com.pancats.util.BeanOrder.BeanOrders;
public class AnnotationProcessor {
    public int getSequence(Method method) {
        if (method.isAnnotationPresent(BeanOrders.class)) {
        	BeanOrders myAnnotation = (BeanOrders) method.getAnnotation(BeanOrders.class);
        	return myAnnotation.value();
        }
        return 0;
    }
}
