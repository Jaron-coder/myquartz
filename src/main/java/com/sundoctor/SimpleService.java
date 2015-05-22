package com.sundoctor;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * Created by zhanglong on 2015/5/22.
 */
@Service("simpleService")
public class SimpleService  implements Serializable{

    private static final long serialVersionUID = 122323233244334343L;
    private static final Logger logger =  Logger.getLogger(SimpleService.class);

    public void testMethod1(){
        //这里执行定时调度业务
        logger.info("testMethod1.......1");
    }

    public void testMethod2(){
        logger.info("testMethod2.......2");
    }
}
