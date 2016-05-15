package com.dubbo.demo.consumer;

import com.netease.haitao.account.model.CreditsInfo;
import com.netease.haitao.account.service.CreditsService;
import com.netease.haitao.credits.model.SignResult;
import com.netease.haitao.credits.service.UserSignServiceFacade;
import com.netease.health.model.UrsRegResult;
import com.netease.health.service.UrsServiceFacade;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @author Jerry Lee
 */
public class ConsumerMain3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("application-context-consumer3.xml");
        classPathXmlApplicationContext.start();

        UserSignServiceFacade userSignServiceFacade = (UserSignServiceFacade) classPathXmlApplicationContext.getBean("userSignServiceFacade");
//        Map<String, Object> creditAndSignInfo = userSignServiceFacade.getCreditAndSignInfo("laotest1@163.com", 10);
//        System.out.println(creditAndSignInfo);
        SignResult signResult = userSignServiceFacade.signNew("laotest82@163.com", "10.10.10.10", 20);

//        SignResult signResult = userSignServiceFacade.signNew("laotest25@163.com", "10.10.10.10", 10);
//        Map<String, Object> creditAndSignInfo = userSignServiceFacade.getCreditAndSignInfo("laotest56@163.com", 10);
//        UrsServiceFacade ursServiceFacade = (UrsServiceFacade) classPathXmlApplicationContext.getBean("ursServiceFacade");
//        UrsRegResult ursRegResult = ursServiceFacade.distributionUnionLogin("10.10.10.10", "wechat_oj-qzunwdiusu_6r@qq.com", 1080L);
        System.out.println("=====================================");
//        System.out.println(signResult);
//        System.out.println(creditAndSignInfo);
        System.out.println("=====================================");

        //		TreeMap<String, SignDayInfo> signMap = new TreeMap<String, SignDayInfo>(signList);
//		for(Map.Entry<String, SignDayInfo> entry : signMap.entrySet()) {
//			System.out.println(entry.getKey() + ", " + entry.getValue().getPoint() + "," + entry.getValue().isSigned());
//		}
    }
}
