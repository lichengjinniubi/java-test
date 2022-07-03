package com.example.javatest.getDifferentBean;

import com.example.javatest.getDifferentBean.bean.BaseRankInfo;
import com.example.javatest.getDifferentBean.en.DataSourceEnum;
import org.springframework.stereotype.Service;

@Service
public abstract class AbstractDataHandler<T extends BaseRankInfo>{


    public abstract T getRankInfoById();

    public abstract DataSourceEnum getDataSourceEnum();
}
