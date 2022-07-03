package com.example.javatest.getDifferentBean;

import com.example.javatest.getDifferentBean.bean.BaseRankInfo;
import com.example.javatest.getDifferentBean.en.DataSourceEnum;

public interface DataHandler {

    public DataSourceEnum getDataSourceEnum();

    public BaseRankInfo getRankInfoById();
}
