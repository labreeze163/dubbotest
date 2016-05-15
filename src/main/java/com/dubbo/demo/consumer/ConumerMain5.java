package com.dubbo.demo.consumer;

import com.netease.haitao.account.model.Account;
import com.netease.haitao.account.service.AccountService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Jerry Lee
 */
public class ConumerMain5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("application-context-consumer5.xml");
        classPathXmlApplicationContext.start();

        try {
            AccountService accountService = (AccountService) classPathXmlApplicationContext.getBean("accountService");
            Account account = new Account();
            account.setUserName("erenyoushuo4_142@163.com");
            account.setPhoneNum("7884561323");
            account = accountService.updateOrInsert(account);
        } catch (Exception e) {
            System.out.println("Customer Error !!!!!");
            e.printStackTrace();
        }

        System.out.println("=====================================");
        System.out.println("=====================================");
    }
}
