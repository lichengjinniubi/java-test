package com.example.javatest.getDifferentBean;

import com.example.javatest.getDifferentBean.bean.BaseRankInfo;
import com.example.javatest.getDifferentBean.en.DataSourceEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TestChoiceController {


    @Autowired
    private DataManager dataManager;


    @RequestMapping("/getRank")
    public BaseRankInfo getRankInfo(){
        AbstractDataHandler abstractDataHandler = dataManager.getHandlerMap(DataSourceEnum.FIRSR_DATA);
        log.info("abstractDataHandler {}",abstractDataHandler);
        return abstractDataHandler.getRankInfoById();
    }
}
