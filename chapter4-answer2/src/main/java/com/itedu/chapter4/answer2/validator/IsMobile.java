package com.itedu.chapter4.answer2.validator;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.FIELD})
@Constraint(validatedBy = IsMobileValidator.class)

public @interface IsMobile {
	boolean needsValid() default true;
    Class<?>[] groups() default {};
    String message() default "�ֻ���ʽ����ȷ";
    Class<? extends Payload>[] payload() default{};
	
}
