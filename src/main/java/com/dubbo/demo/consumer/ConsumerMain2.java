package com.dubbo.demo.consumer;

import com.dubbo.demo.HelloService;
import com.netease.haitao.account.constant.CreditsOpType;
import com.netease.haitao.account.model.AccountCredits;
import com.netease.haitao.account.model.CreditsInfo;
import com.netease.haitao.account.service.CreditsService;
import com.netease.haitao.credits.service.UserSignServiceFacade;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

/**
 * @author Jerry Lee
 */
public class ConsumerMain2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("application-context-consumer2.xml");
        classPathXmlApplicationContext.start();

        CreditsService creditsService = (CreditsService) classPathXmlApplicationContext.getBean("creditsService");
        UserSignServiceFacade userSignServiceFacade = (UserSignServiceFacade) classPathXmlApplicationContext.getBean("userSignServiceFacade");
//        CreditsInfo creditsInfo = new CreditsInfo();
//        creditsInfo.setCredits(50);
//        creditsInfo.setDescription("xf test");
//        creditsInfo.setSerialNumber("xiaofan_test00012222");
//        creditsInfo.setTimestamp(System.currentTimeMillis());
//        creditsInfo.setType(1);
//        creditsInfo.setUserName("erenyoushuo8@163.com");
//        boolean result = creditsService.insertCredits(creditsInfo);
        userSignServiceFacade.getCreditAndSignInfo("laotest82@163.com", 10)
        System.out.println("=====================================");
//        System.out.println(result);
        System.out.println("=====================================");
    }
}
