package cn.ucai.blackfox.fangclass.application;

/**
 * Created by Administrator on 2017/3/8 0008.
 */

public interface I {

    final String rootUrl = "http://101.251.196.90:8080/FuLiCenterServerV2.0";


    interface   Request {

        final String FIND_NEW_AND_BOUTIQUE_GOODS = "/findNewAndBoutiqueGoods";
        final String CAT_ID = "cat_id";
        final String PAGE_ID = "page_id";
        final String PAGE_SIZE = "page_size";


        final String LOGIN = "/login";
        final String USER_NAME = "m_user_name";
        final String PASS_WORD = "m_user_password";



    }



}
