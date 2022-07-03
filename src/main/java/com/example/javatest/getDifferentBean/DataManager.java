package com.example.javatest.getDifferentBean;

import com.example.javatest.getDifferentBean.en.DataSourceEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import sun.jvm.hotspot.compiler.ImmutableOopMap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@Slf4j
public class DataManager implements ApplicationContextAware, InitializingBean {

    private ApplicationContext applicationContext;


    private Map<DataSourceEnum, AbstractDataHandler> handlerMap = new HashMap<>();

    /**
     * 这种方式也可以获取实现类，接口和抽象类都适用
     * @throws Exception
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        Map<String,AbstractDataHandler> maps = applicationContext.getBeansOfType(AbstractDataHandler.class);
        System.out.println(maps);
        maps.forEach((k, v) ->{
            handlerMap.put(v.getDataSourceEnum(), v);
        });
    }

    /**
     * 这种方式可以获取实现类，接口和抽象类都适用
     * @param rankHandlers
     */
    public DataManager(List<AbstractDataHandler> rankHandlers) {

        ImmutableMap
        rankHandlers.forEach(rankHandler -> handlerMap.put(rankHandler.getDataSourceEnum(), rankHandler));
        System.out.println(rankHandlers);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    public AbstractDataHandler getHandlerMap(DataSourceEnum dataSourceEnum){
        return handlerMap.get(dataSourceEnum);
    }
}
