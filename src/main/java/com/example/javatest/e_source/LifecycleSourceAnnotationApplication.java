package com.example.javatest.e_source;

import com.example.javatest.e_source.bean.Cat;
import com.example.javatest.e_source.bean.Person;
import com.example.javatest.e_source.config.LifecycleDestructionPostProcessor;
import com.example.javatest.e_source.config.LifecycleNameReadPostProcessor;
import com.example.javatest.e_source.config.LifecycleSourceConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LifecycleSourceAnnotationApplication {
    
    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(LifecycleSourceConfiguration.class);
        ctx.register(LifecycleNameReadPostProcessor.class);
        ctx.register(LifecycleDestructionPostProcessor.class);
    
        System.out.println("================准备刷新IOC容器==================");
    
        ctx.refresh();
        
        System.out.println("================IOC容器刷新完毕==================");
        
        ctx.start();
        
        System.out.println("================IOC容器启动完成==================");
    
        Person person = ctx.getBean(Person.class);
        System.out.println(person);
        Cat cat = ctx.getBean(Cat.class);
        System.out.println(cat);
        
        System.out.println("================准备停止IOC容器==================");
        
        ctx.stop();
        
        System.out.println("================IOC容器停止成功==================");
        
        ctx.close();
    }
}
