package com.example.javatest.getDifferentBean.handler;

import com.example.javatest.getDifferentBean.AbstractDataHandler;
import com.example.javatest.getDifferentBean.bean.DataFrstInfo;
import com.example.javatest.getDifferentBean.bean.DataSecondInfo;
import com.example.javatest.getDifferentBean.en.DataSourceEnum;
import org.springframework.stereotype.Service;

@Service
public class DataSecondHandler extends AbstractDataHandler {

    @Override
    public DataSecondInfo getRankInfoById() {
        DataSecondInfo dataSecondInfo = new DataSecondInfo();
        dataSecondInfo.setDescv3("v1");
        dataSecondInfo.setDescv4("v2");
        return dataSecondInfo;
    }


    @Override
    public DataSourceEnum getDataSourceEnum() {
        return DataSourceEnum.SECONDS_DATA;
    }
}
