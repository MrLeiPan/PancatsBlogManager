package com.pancats.util;
import static java.lang.annotation.ElementType.METHOD;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
public class BeanOrder{
	@Target({METHOD})
	@Retention(RetentionPolicy.RUNTIME)
	public @interface BeanOrders {
		int value() default 0;
	}
}

