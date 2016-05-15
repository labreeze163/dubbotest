package com.dubbo.demo.consumer;

import com.netease.haitao.account.model.Account;
import com.netease.haitao.account.service.AccountService;
import com.netease.haitao.credits.service.UserSignServiceFacade;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Jerry Lee
 */
public class ConsumerMain4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("application-context-consumer4.xml");
        classPathXmlApplicationContext.start();

        try {
            AccountService accountService = (AccountService) classPathXmlApplicationContext.getBean("accountService");
//            Account account = new Account();
//            account.setUserName("laotest1@163.com");
//            account.setFirstIp("123.123.123.123");
//            account.setUpdateTime(System.currentTimeMillis());
//            account.setNickNameKaola("ncikaol");
//            account.setGender(1);
//            account.setAvatarKaola("111111");
//            account = accountService.updateOrInsert(account);
//            System.out.println(account);

//            CreditsService creditsService = (CreditsService) classPathXmlApplicationContext.getBean("creditsService");
//            CreditsInfo creditsInfo = new CreditsInfo();
//            creditsInfo.setUserName("zlh1@163.com");
//            creditsInfo.setOpState(1);
//            creditsInfo.setCredits(10);
//            creditsInfo.setType(CreditsOpType.ADD_COMMENT_NORMAL);
//            creditsInfo.setSerialNumber("12304223");
//            boolean b = creditsService.insertCredits(creditsInfo);
//            System.out.println(b);

        } catch (Exception e) {
            System.out.println("Customer Error !!!!!");
            e.printStackTrace();
        }

        System.out.println("=====================================");
        System.out.println("=====================================");
    }
}
