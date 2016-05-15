package com.dubbo.demo.consumer;

import com.netease.haitao.account.model.Account;
import com.netease.haitao.account.service.AccountService;
import com.netease.health.model.GoodsDetail;
import com.netease.health.model.distributionplatform.DistributionGoods;
import com.netease.health.remote.Ms2DistributeServiceApi;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Jerry Lee
 */
public class ConumerMainMS {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("application-context-consumer-ms.xml");
        classPathXmlApplicationContext.start();
        HashMap<String, String> map = new HashMap<String, String>();map.entrySet();


        /**
         * 测试：
         *  channelId ： 1014
         *  goodsId ： 5733
         *  skuId ： 5733-8714ff84c39dc2249b38804d75df8ebe
         *  分销库存 ： 0
         *  分销售价 ： 4.73
         *  创建时间 ： 2016-03-10 16:50:18:000000
         *  更新时间 ： 2016-03-10 16:50:18:000000
         *  最近一次操作人的工号 ： default/sync_updater
         *  是否共享分销库存 1：共享 0：不共享
         *  商品利润率 0.23
         *
         */
        try {
            Ms2DistributeServiceApi ms2DistributeServiceApi = (Ms2DistributeServiceApi) classPathXmlApplicationContext.getBean("ms2DistributeServiceApiImpl");
            List<String> distributionChannelSkuIds = ms2DistributeServiceApi.getDistributionChannelSkuIds(1014L);
            for(String str : distributionChannelSkuIds) {
                System.out.println(str);
            }
//
//            System.out.println("GOODS ID------------------------------------------");
//            List<Long> distributionChannelGoodsIds = ms2DistributeServiceApi.getDistributionChannelGoodsIds(1014L);
//            for(Long gid : distributionChannelGoodsIds) {
//                System.out.println(gid);
//            }
//
//            System.out.println("GOODS Detail------------------------------------------");
//            GoodsDetail distributionGoodsDetail = ms2DistributeServiceApi.getDistributionGoodsDetailByGoodsId(5733L);
//            System.out.println(distributionGoodsDetail);
//
//            System.out.println("SKU Detail ---------------------------------------------");
//            // 根据SKUID查询商品详情
//            GoodsDetail distributionGoodsDetailById = ms2DistributeServiceApi.getDistributionGoodsDetailById("5378-417092a6b19a863d7e07f004d4f33c92");
//            System.out.println(distributionGoodsDetailById);
//
//            System.out.println("SKU Stock Detail ---------------------------------------------");
//            // 查询库存
//            DistributionGoods distributionGoodsBySkuId = ms2DistributeServiceApi.getDistributionGoodsBySkuId(1014L, "5378-417092a6b19a863d7e07f004d4f33c92");
//            System.out.println(distributionGoodsBySkuId);
        } catch (Exception e) {
            System.out.println("Customer Error !!!!!");
            System.out.println(e);
            e.printStackTrace();
        }

        System.out.println("=====================================");
        System.out.println("=====================================");
    }
}
