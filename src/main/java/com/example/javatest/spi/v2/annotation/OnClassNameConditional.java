package com.example.javatest.spi.v2.annotation;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class OnClassNameConditional implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        String className = (String) metadata.getAnnotationAttributes(ConditionalOnClassName.class.getName()).get("value");

        try {
            System.out.println(className);
            Class.forName(className);
        }catch (ClassNotFoundException e){
            System.out.println("Class not found");
            return false;
        }

        return true;
    }
}
