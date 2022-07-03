package com.example.javatest.getDifferentBean.handler;

import com.example.javatest.getDifferentBean.AbstractDataHandler;
import com.example.javatest.getDifferentBean.bean.BaseRankInfo;
import com.example.javatest.getDifferentBean.bean.DataFrstInfo;
import com.example.javatest.getDifferentBean.en.DataSourceEnum;
import org.springframework.stereotype.Service;

@Service
public class DataFirstHandler extends AbstractDataHandler {

    @Override
    public DataFrstInfo getRankInfoById() {
        DataFrstInfo dataFrstInfo = new DataFrstInfo();
        dataFrstInfo.setDescv1("v1");
        dataFrstInfo.setDescv2("v2");
        return dataFrstInfo;
    }

    @Override
    public DataSourceEnum getDataSourceEnum() {
        return DataSourceEnum.FIRSR_DATA;
    }
}
