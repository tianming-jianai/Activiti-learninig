package com.zsg.activiti.createenv;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.junit.Test;

/**
 * @author Zhangshigang
 * @version 0.1.0
 * @Description
 * https://www.cnblogs.com/Java3y/p/8604308.html
 * https://www.cnblogs.com/summertime-wu/p/7581147.html
 * @create 2020-10-13 21:58
 * @since 0.1.0
 **/
public class ActivitiEnv {

    @Test
    public void createEnv(){
        ProcessEngineConfiguration engineConfiguration = ProcessEngineConfiguration.createStandaloneProcessEngineConfiguration();
        //db
        engineConfiguration.setDatabaseType("mysql");
        engineConfiguration.setJdbcDriver("com.mysql.cj.jdbc.Driver");
        //jdbc:mysql://localhost:3306/test?serverTimezone=GMT%2B8&useUnicode=true&characterEncoding=utf-8&useSSL=false
        engineConfiguration.setJdbcUrl("jdbc:mysql://localhost:3306/activitiTest?useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC");
        engineConfiguration.setJdbcUsername("root");
        engineConfiguration.setJdbcPassword("m123");
        engineConfiguration.setDatabaseSchemaUpdate("true");
        ProcessEngine processEngine = engineConfiguration.buildProcessEngine();//调用此方法才会创建数据表
        System.out.println("流程引擎创建成功！");
        processEngine.close();

    }
}
