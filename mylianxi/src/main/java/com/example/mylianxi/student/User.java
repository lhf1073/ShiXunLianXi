package com.example.mylianxi.student;

import java.util.List;

/**
 * Created by Lenovo on 2018/3/1.
 */

public class User {

    /**
     * error_code : 0
     * reason : 成功的返回
     * result : {"data":[{"author_name":"新华国际头条","category":"头条","date":"2017-11-09 18:04","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20171109/20171109180455_d41d8cd98f00b204e9800998ecf8427e_5_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20171109/20171109180455_d41d8cd98f00b204e9800998ecf8427e_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20171109/20171109180324_8550569f222233a015e1cd7d70d2f2d4_2_mwpm_03200403.jpg","thumbnail_pic_s04":"http://07.imgmini.eastday.com/mobile/20171109/20171109175525_cc33bfe071a38cc75687f5e62d840b96_5_mwpm_03200403.jpg","thumbnail_pic_s05":"http://01.imgmini.eastday.com/mobile/20171109/20171109180324_8550569f222233a015e1cd7d70d2f2d4_2_mwpm_03200403.jpg","title":"俄罗斯女记者参加总统选举 闹着玩还是来真的？","uniquekey":"685d0fccd3f5ea3014d7ab0215fecb5f","url":"http://mini.eastday.com/mobile/171109180455164.html"},{"author_name":"人民网","category":"头条","date":"2017-11-09 18:03","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20171109/20171109180324_0338994e5dcfa065d66d13cf701ccff3_1_mwpm_03200403.jpg","title":"拥抱岘港的碧海蓝天 ","uniquekey":"5f32d44a161e65acb4db3a90f41379d1","url":"http://mini.eastday.com/mobile/171109180324333.html"},{"author_name":"人民网","category":"头条","date":"2017-11-09 17:55","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20171109/20171109175525_4b706e469917a5184710455305391da5_4_mwpm_03200403.jpg","title":"学习贯彻党的十九大精神 中央宣讲团宣讲报告会在郑举行","uniquekey":"2fe32f3da298fe335a3305ee53a30e39","url":"http://mini.eastday.com/mobile/171109175525809.html"},{"author_name":"人民网","category":"头条","date":"2017-11-09 17:45","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20171109/20171109174515_58ca65a50f6c0be854a7daa51ddeee9e_1_mwpm_03200403.jpg","title":"河南出台供暖管理办法 暖气不热可减免费用","uniquekey":"1d1e5e0826f08c0d6a43cba6d43a634f","url":"http://mini.eastday.com/mobile/171109174515991.html"},{"author_name":"新华网","category":"头条","date":"2017-11-09 17:41","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20171109/20171109174110_0c23c9c3a52033063a7af8c11880cf32_9_mwpm_03200403.jpg","title":"最近，又一波\u201c国之重器\u201d上天入海！震惊世界！","uniquekey":"0d18dd09d99605ab69481b7de702c38f","url":"http://mini.eastday.com/mobile/171109174110195.html"},{"author_name":"中国新闻网","category":"头条","date":"2017-11-09 17:18","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20171109/20171109171839_8ea9dccf3d7f9b20d0b8858d03a0e26d_3_mwpm_03200403.jpg","title":"华媒评特朗普访华：定调、对表 中美务实合作","uniquekey":"5872c3ff62720b4580dd6223a29711c4","url":"http://mini.eastday.com/mobile/171109171839025.html"},{"author_name":"欣喜若狂","category":"头条","date":"2017-11-09 17:03","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20171109/20171109170332_c818cc2239e4b5f56ea30ecf3ad7429e_3_mwpm_03200403.jpg","title":"20岁挥霍13800亿，全球封杀，终成世界首富，豪车随意换！","uniquekey":"a24b5cee2a01b81c68b2c792094ad426","url":"http://mini.eastday.com/mobile/171109170332343.html"},{"author_name":"环球网","category":"头条","date":"2017-11-09 17:00","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20171109/20171109170030_447ce0a22cffc2871db1e4d3bb47e306_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20171109/20171109170030_447ce0a22cffc2871db1e4d3bb47e306_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20171109/20171109180324_8550569f222233a015e1cd7d70d2f2d4_2_mwpm_03200403.jpg","title":"中国驻佛罗伦萨总领馆组织侨界学习\u201c十九大\u201d精神","uniquekey":"abdc5d3f5f1650e1ea726dc012d48cff","url":"http://mini.eastday.com/mobile/171109170030318.html"},{"author_name":"搜狐","category":"头条","date":"2017-11-09 16:54","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20171109/20171109165416_e4027a37df0882f8a6b4fc3b28919f33_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20171109/20171109165416_e4027a37df0882f8a6b4fc3b28919f33_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20171109/20171109180324_8550569f222233a015e1cd7d70d2f2d4_2_mwpm_03200403.jpg","title":"无情起来最伤人的星座排行榜","uniquekey":"5a10c38a3a3c27a2a82b6c895ce0c4af","url":"http://mini.eastday.com/mobile/171109165416852.html"},{"author_name":"搜狐","category":"头条","date":"2017-11-09 16:54","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20171109/20171109165415_c57c9075535f30d2d39abfdf40919ef5_6_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20171109/20171109165415_c57c9075535f30d2d39abfdf40919ef5_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20171109/20171109180324_8550569f222233a015e1cd7d70d2f2d4_2_mwpm_03200403.jpg","title":"温故而知新 让我们一起来回顾一下三十年前金融市场的\u201c黑色星期一\u201d","uniquekey":"3cc251fc56c99798d9826c1935519ed8","url":"http://mini.eastday.com/mobile/171109165415774.html"},{"author_name":"世事名嘴","category":"头条","date":"2017-11-09 16:49","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20171109/20171109164933_91402027fd92ce9f57aa8198c4352c06_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20171109/20171109164933_91402027fd92ce9f57aa8198c4352c06_7_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20171109/20171109180324_8550569f222233a015e1cd7d70d2f2d4_2_mwpm_03200403.jpg","title":"21岁少女因车祸\u201c脑死亡\u201d，医院称已尽力，妈妈用一块冰\u201c复活\u201d","uniquekey":"65608c8671795f14128d630d0d60eeb4","url":"http://mini.eastday.com/mobile/171109164933695.html"},{"author_name":"中国新闻网","category":"头条","date":"2017-11-09 16:48","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20171109/20171109164814_c934243f108b251d707bf31c65b1012c_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20171109/20171109164814_c934243f108b251d707bf31c65b1012c_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20171109/20171109180324_8550569f222233a015e1cd7d70d2f2d4_2_mwpm_03200403.jpg","title":"中美元首共同出席中美企业家对话会闭幕式","uniquekey":"38a441ec4a81c7960e5955562292cc9d","url":"http://mini.eastday.com/mobile/171109164814180.html"},{"author_name":"晋宝儿说星座","category":"头条","date":"2017-11-09 16:42","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20171109/20171109164209_208c2ec6405aca25a531d6dd79225844_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20171109/20171109164209_208c2ec6405aca25a531d6dd79225844_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20171109/20171109180324_8550569f222233a015e1cd7d70d2f2d4_2_mwpm_03200403.jpg","title":"未来两年会人丁兴旺，添娃又添福的四大星座女","uniquekey":"d95333a23c1391f383ec95633dc06543","url":"http://mini.eastday.com/mobile/171109164209094.html"},{"author_name":"财经新观点","category":"头条","date":"2017-11-09 16:32","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20171109/20171109163206_c7376709f2a01c6ba9c588bf6448b797_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20171109/20171109163206_c7376709f2a01c6ba9c588bf6448b797_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20171109/20171109180324_8550569f222233a015e1cd7d70d2f2d4_2_mwpm_03200403.jpg","title":"? 没买房的恭喜了 马云宣布杀入房地产","uniquekey":"9c9d70abccdcc9a718d0c1e5cd921b81","url":"http://mini.eastday.com/mobile/171109163206038.html"},{"author_name":"华领天下","category":"头条","date":"2017-11-09 16:26","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20171109/20171109_a9bcb0b74a07d6597ea2911992e62ce4_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20171109/20171109_4bf1b3a7f0054034252111e2bb7a7039_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20171109/20171109180324_8550569f222233a015e1cd7d70d2f2d4_2_mwpm_03200403.jpg","title":"销毁子弹的代价比造子弹还要高，为什么不发放给士兵们军演用呢？","uniquekey":"8d29ce9ddb08183242ca531dca14064d","url":"http://mini.eastday.com/mobile/171109162652110.html"},{"author_name":"爱上奇闻趣事","category":"头条","date":"2017-11-09 16:21","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20171109/20171109_a0dc072857235b42408b50953e5314b0_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20171109/20171109_363b069e5737da63d4bce35f76f8a733_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20171109/20171109180324_8550569f222233a015e1cd7d70d2f2d4_2_mwpm_03200403.jpg","title":"外国亚洲鲤鱼泛滥成灾，黄鳝竟是它们的克星，这下终于解决了","uniquekey":"70861a117b588bfdec8fe29c361183e1","url":"http://mini.eastday.com/mobile/171109162159168.html"},{"author_name":"新华网","category":"头条","date":"2017-11-09 16:21","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20171109/20171109162120_e439c16f191029aa887a6812f86097de_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20171109/20171109162120_39da2061ac2d8cb00c2bc52a0ca10d4b_5_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20171109/20171109180324_8550569f222233a015e1cd7d70d2f2d4_2_mwpm_03200403.jpg","title":"各地开展\u201c119消防宣传日\u201d主题活动","uniquekey":"70f88d88eadbb70315ee4cc198778cab","url":"http://mini.eastday.com/mobile/171109162120077.html"},{"author_name":"过去旳事不必一说再说","category":"头条","date":"2017-11-09 16:03","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20171109/20171109160354_6f58d22c9d4290096fa4a26cd7a4b3dd_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20171109/20171109160354_6f58d22c9d4290096fa4a26cd7a4b3dd_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20171109/20171109180324_8550569f222233a015e1cd7d70d2f2d4_2_mwpm_03200403.jpg","title":"老人不幸腿脚残疾，家里老牛竟能自己装车下田，结果震撼路人","uniquekey":"3aaad1c0a776c85f63c8f25c9dc860d1","url":"http://mini.eastday.com/mobile/171109160354353.html"},{"author_name":"人民网","category":"头条","date":"2017-11-09 16:03","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20171109/20171109160302_8cbf67daf31b12dfee04c846174fe12a_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20171109/20171109160302_0309cfbe291b7ca926feb8b1594cb259_7_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20171109/20171109180324_8550569f222233a015e1cd7d70d2f2d4_2_mwpm_03200403.jpg","title":"\u201c复兴号\u201d助力\u201c双11\u201d 京沪快件10小时内可送达","uniquekey":"ce0e12f2d2a5b329ec0cdad321904a43","url":"http://mini.eastday.com/mobile/171109160302269.html"},{"author_name":"晚间阅科学","category":"头条","date":"2017-11-09 15:49","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20171109/20171109_c0f4e0e2fa0de7b077aa59c0f7279dcf_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20171109/20171109_a13153dc4e82dd115bcc9bdae62e45ef_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20171109/20171109180324_8550569f222233a015e1cd7d70d2f2d4_2_mwpm_03200403.jpg","title":"古埃及一高水平技术, 运用陨石来制造宝剑, 完全不被岁月侵蚀","uniquekey":"2263135e83c3bab07066c5fc0cf9119e","url":"http://mini.eastday.com/mobile/171109154946591.html"},{"author_name":"餐饮行业家","category":"头条","date":"2017-11-09 15:48","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20171109/20171109154850_ca77c37f0466909b4158f40f75911a15_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20171109/20171109154850_ca77c37f0466909b4158f40f75911a15_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20171109/20171109180324_8550569f222233a015e1cd7d70d2f2d4_2_mwpm_03200403.jpg","title":"90后大学生做的是什么生意？一年轻轻松松就赚了一百多万","uniquekey":"dcef643756ab61f6acd2ceeb2628066f","url":"http://mini.eastday.com/mobile/171109154850429.html"},{"author_name":"户外帮","category":"头条","date":"2017-11-09 15:46","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20171109/20171109154628_fd8e3174a9913e31e57a667cc51e2a11_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20171109/20171109154628_fd8e3174a9913e31e57a667cc51e2a11_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20171109/20171109180324_8550569f222233a015e1cd7d70d2f2d4_2_mwpm_03200403.jpg","title":"父母街头跪地表演吃草 只为救9岁儿子","uniquekey":"4fa522e8090b927bd0551094c427b22f","url":"http://mini.eastday.com/mobile/171109154628235.html"},{"author_name":"高峰军事观察","category":"头条","date":"2017-11-09 15:35","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20171109/20171109_4c5cd6361800a16d1e6ded794299cff2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20171109/20171109_8fd8745c5dfd7deac6859b5adc4e13ee_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20171109/20171109180324_8550569f222233a015e1cd7d70d2f2d4_2_mwpm_03200403.jpg","title":"这国防空导弹一开战就会耗光，买中国的两款导弹可派上大用场了","uniquekey":"558619c2c54b133a06ccaea287fc12d1","url":"http://mini.eastday.com/mobile/171109153542425.html"},{"author_name":"华夏时报","category":"头条","date":"2017-11-09 15:35","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20171109/20171109153537_29b21658d2c5de585317de86460ea67e_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20171109/20171109151847_858bab2258079c70a057acc18b5db697_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20171109/20171109180324_8550569f222233a015e1cd7d70d2f2d4_2_mwpm_03200403.jpg","title":"中国进口商与美签订协议 将额外采购1200万吨新年度大豆","uniquekey":"1ec6e41834a465c8c1c19c7edf50e414","url":"http://mini.eastday.com/mobile/171109153537857.html"},{"author_name":"环球网","category":"头条","date":"2017-11-09 15:18","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20171109/20171109151847_858bab2258079c70a057acc18b5db697_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20171109/20171109151847_858bab2258079c70a057acc18b5db697_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20171109/20171109180324_8550569f222233a015e1cd7d70d2f2d4_2_mwpm_03200403.jpg","title":"联合国紧急救援协调员：沙特持续封锁将导致也门严重饥荒","uniquekey":"cfa9e092d20d98cbeca8a8852d0a88fa","url":"http://mini.eastday.com/mobile/171109151847418.html"},{"author_name":"东方网","category":"头条","date":"2017-11-09 15:11","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20171109/20171109151114_6818ef92cbc701e2e434377dbaa40ab6_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20171109/20171109151847_858bab2258079c70a057acc18b5db697_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20171109/20171109180324_8550569f222233a015e1cd7d70d2f2d4_2_mwpm_03200403.jpg","title":"重磅！鼓励和规范互联网租赁自行车发展 沪刚刚出台指导意见","uniquekey":"2b87ae3d8f42c25528be8a36e6f6b9a8","url":"http://mini.eastday.com/mobile/171109151114301.html"},{"author_name":"军情亮点","category":"头条","date":"2017-11-09 15:10","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20171109/20171109_94382883a2dc262a435f2696f1beaadf_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20171109/20171109_eed8368a217f4e150ca03cde5785cac8_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20171109/20171109180324_8550569f222233a015e1cd7d70d2f2d4_2_mwpm_03200403.jpg","title":"未来战机权威消息披露，公布日期值得期待","uniquekey":"49f5094965951d2b0fac6ce9b2c36070","url":"http://mini.eastday.com/mobile/171109151030897.html"},{"author_name":"映象网","category":"头条","date":"2017-11-09 15:06","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20171109/20171109150635_fa2451ea350d72a9fcf97b3860dd7551_10_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20171109/20171109150635_fa2451ea350d72a9fcf97b3860dd7551_18_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20171109/20171109180324_8550569f222233a015e1cd7d70d2f2d4_2_mwpm_03200403.jpg","title":"河南这两个市在全国火了！将领到这些\u201c大礼包\u201d","uniquekey":"7f231f825e05113b8f7a89bc9d88cc4b","url":"http://mini.eastday.com/mobile/171109150635768.html"},{"author_name":"菊花古剑和酒","category":"头条","date":"2017-11-09 15:05","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20171109/20171109_7e717b57e52432237ac22e52eee4bcf7_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20171109/20171109_643a458334cbcf78e9b68b047be22f2a_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20171109/20171109180324_8550569f222233a015e1cd7d70d2f2d4_2_mwpm_03200403.jpg","title":"她是黄磊的初恋，为黄晓明去当交际花，气场不输范冰冰！","uniquekey":"c82e73ecca8c356d3844fe2c3e06a485","url":"http://mini.eastday.com/mobile/171109150559022.html"}],"stat":"1"}
     */

    private int error_code;
    private String reason;
    private ResultBean result;

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * data : [{"author_name":"新华国际头条","category":"头条","date":"2017-11-09 18:04","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20171109/20171109180455_d41d8cd98f00b204e9800998ecf8427e_5_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20171109/20171109180455_d41d8cd98f00b204e9800998ecf8427e_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20171109/20171109180324_8550569f222233a015e1cd7d70d2f2d4_2_mwpm_03200403.jpg","thumbnail_pic_s04":"http://07.imgmini.eastday.com/mobile/20171109/20171109175525_cc33bfe071a38cc75687f5e62d840b96_5_mwpm_03200403.jpg","thumbnail_pic_s05":"http://01.imgmini.eastday.com/mobile/20171109/20171109180324_8550569f222233a015e1cd7d70d2f2d4_2_mwpm_03200403.jpg","title":"俄罗斯女记者参加总统选举 闹着玩还是来真的？","uniquekey":"685d0fccd3f5ea3014d7ab0215fecb5f","url":"http://mini.eastday.com/mobile/171109180455164.html"},{"author_name":"人民网","category":"头条","date":"2017-11-09 18:03","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20171109/20171109180324_0338994e5dcfa065d66d13cf701ccff3_1_mwpm_03200403.jpg","title":"拥抱岘港的碧海蓝天 ","uniquekey":"5f32d44a161e65acb4db3a90f41379d1","url":"http://mini.eastday.com/mobile/171109180324333.html"},{"author_name":"人民网","category":"头条","date":"2017-11-09 17:55","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20171109/20171109175525_4b706e469917a5184710455305391da5_4_mwpm_03200403.jpg","title":"学习贯彻党的十九大精神 中央宣讲团宣讲报告会在郑举行","uniquekey":"2fe32f3da298fe335a3305ee53a30e39","url":"http://mini.eastday.com/mobile/171109175525809.html"},{"author_name":"人民网","category":"头条","date":"2017-11-09 17:45","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20171109/20171109174515_58ca65a50f6c0be854a7daa51ddeee9e_1_mwpm_03200403.jpg","title":"河南出台供暖管理办法 暖气不热可减免费用","uniquekey":"1d1e5e0826f08c0d6a43cba6d43a634f","url":"http://mini.eastday.com/mobile/171109174515991.html"},{"author_name":"新华网","category":"头条","date":"2017-11-09 17:41","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20171109/20171109174110_0c23c9c3a52033063a7af8c11880cf32_9_mwpm_03200403.jpg","title":"最近，又一波\u201c国之重器\u201d上天入海！震惊世界！","uniquekey":"0d18dd09d99605ab69481b7de702c38f","url":"http://mini.eastday.com/mobile/171109174110195.html"},{"author_name":"中国新闻网","category":"头条","date":"2017-11-09 17:18","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20171109/20171109171839_8ea9dccf3d7f9b20d0b8858d03a0e26d_3_mwpm_03200403.jpg","title":"华媒评特朗普访华：定调、对表 中美务实合作","uniquekey":"5872c3ff62720b4580dd6223a29711c4","url":"http://mini.eastday.com/mobile/171109171839025.html"},{"author_name":"欣喜若狂","category":"头条","date":"2017-11-09 17:03","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20171109/20171109170332_c818cc2239e4b5f56ea30ecf3ad7429e_3_mwpm_03200403.jpg","title":"20岁挥霍13800亿，全球封杀，终成世界首富，豪车随意换！","uniquekey":"a24b5cee2a01b81c68b2c792094ad426","url":"http://mini.eastday.com/mobile/171109170332343.html"},{"author_name":"环球网","category":"头条","date":"2017-11-09 17:00","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20171109/20171109170030_447ce0a22cffc2871db1e4d3bb47e306_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20171109/20171109170030_447ce0a22cffc2871db1e4d3bb47e306_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20171109/20171109180324_8550569f222233a015e1cd7d70d2f2d4_2_mwpm_03200403.jpg","title":"中国驻佛罗伦萨总领馆组织侨界学习\u201c十九大\u201d精神","uniquekey":"abdc5d3f5f1650e1ea726dc012d48cff","url":"http://mini.eastday.com/mobile/171109170030318.html"},{"author_name":"搜狐","category":"头条","date":"2017-11-09 16:54","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20171109/20171109165416_e4027a37df0882f8a6b4fc3b28919f33_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20171109/20171109165416_e4027a37df0882f8a6b4fc3b28919f33_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20171109/20171109180324_8550569f222233a015e1cd7d70d2f2d4_2_mwpm_03200403.jpg","title":"无情起来最伤人的星座排行榜","uniquekey":"5a10c38a3a3c27a2a82b6c895ce0c4af","url":"http://mini.eastday.com/mobile/171109165416852.html"},{"author_name":"搜狐","category":"头条","date":"2017-11-09 16:54","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20171109/20171109165415_c57c9075535f30d2d39abfdf40919ef5_6_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20171109/20171109165415_c57c9075535f30d2d39abfdf40919ef5_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20171109/20171109180324_8550569f222233a015e1cd7d70d2f2d4_2_mwpm_03200403.jpg","title":"温故而知新 让我们一起来回顾一下三十年前金融市场的\u201c黑色星期一\u201d","uniquekey":"3cc251fc56c99798d9826c1935519ed8","url":"http://mini.eastday.com/mobile/171109165415774.html"},{"author_name":"世事名嘴","category":"头条","date":"2017-11-09 16:49","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20171109/20171109164933_91402027fd92ce9f57aa8198c4352c06_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20171109/20171109164933_91402027fd92ce9f57aa8198c4352c06_7_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20171109/20171109180324_8550569f222233a015e1cd7d70d2f2d4_2_mwpm_03200403.jpg","title":"21岁少女因车祸\u201c脑死亡\u201d，医院称已尽力，妈妈用一块冰\u201c复活\u201d","uniquekey":"65608c8671795f14128d630d0d60eeb4","url":"http://mini.eastday.com/mobile/171109164933695.html"},{"author_name":"中国新闻网","category":"头条","date":"2017-11-09 16:48","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20171109/20171109164814_c934243f108b251d707bf31c65b1012c_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20171109/20171109164814_c934243f108b251d707bf31c65b1012c_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20171109/20171109180324_8550569f222233a015e1cd7d70d2f2d4_2_mwpm_03200403.jpg","title":"中美元首共同出席中美企业家对话会闭幕式","uniquekey":"38a441ec4a81c7960e5955562292cc9d","url":"http://mini.eastday.com/mobile/171109164814180.html"},{"author_name":"晋宝儿说星座","category":"头条","date":"2017-11-09 16:42","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20171109/20171109164209_208c2ec6405aca25a531d6dd79225844_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20171109/20171109164209_208c2ec6405aca25a531d6dd79225844_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20171109/20171109180324_8550569f222233a015e1cd7d70d2f2d4_2_mwpm_03200403.jpg","title":"未来两年会人丁兴旺，添娃又添福的四大星座女","uniquekey":"d95333a23c1391f383ec95633dc06543","url":"http://mini.eastday.com/mobile/171109164209094.html"},{"author_name":"财经新观点","category":"头条","date":"2017-11-09 16:32","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20171109/20171109163206_c7376709f2a01c6ba9c588bf6448b797_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20171109/20171109163206_c7376709f2a01c6ba9c588bf6448b797_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20171109/20171109180324_8550569f222233a015e1cd7d70d2f2d4_2_mwpm_03200403.jpg","title":"? 没买房的恭喜了 马云宣布杀入房地产","uniquekey":"9c9d70abccdcc9a718d0c1e5cd921b81","url":"http://mini.eastday.com/mobile/171109163206038.html"},{"author_name":"华领天下","category":"头条","date":"2017-11-09 16:26","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20171109/20171109_a9bcb0b74a07d6597ea2911992e62ce4_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20171109/20171109_4bf1b3a7f0054034252111e2bb7a7039_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20171109/20171109180324_8550569f222233a015e1cd7d70d2f2d4_2_mwpm_03200403.jpg","title":"销毁子弹的代价比造子弹还要高，为什么不发放给士兵们军演用呢？","uniquekey":"8d29ce9ddb08183242ca531dca14064d","url":"http://mini.eastday.com/mobile/171109162652110.html"},{"author_name":"爱上奇闻趣事","category":"头条","date":"2017-11-09 16:21","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20171109/20171109_a0dc072857235b42408b50953e5314b0_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20171109/20171109_363b069e5737da63d4bce35f76f8a733_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20171109/20171109180324_8550569f222233a015e1cd7d70d2f2d4_2_mwpm_03200403.jpg","title":"外国亚洲鲤鱼泛滥成灾，黄鳝竟是它们的克星，这下终于解决了","uniquekey":"70861a117b588bfdec8fe29c361183e1","url":"http://mini.eastday.com/mobile/171109162159168.html"},{"author_name":"新华网","category":"头条","date":"2017-11-09 16:21","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20171109/20171109162120_e439c16f191029aa887a6812f86097de_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20171109/20171109162120_39da2061ac2d8cb00c2bc52a0ca10d4b_5_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20171109/20171109180324_8550569f222233a015e1cd7d70d2f2d4_2_mwpm_03200403.jpg","title":"各地开展\u201c119消防宣传日\u201d主题活动","uniquekey":"70f88d88eadbb70315ee4cc198778cab","url":"http://mini.eastday.com/mobile/171109162120077.html"},{"author_name":"过去旳事不必一说再说","category":"头条","date":"2017-11-09 16:03","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20171109/20171109160354_6f58d22c9d4290096fa4a26cd7a4b3dd_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20171109/20171109160354_6f58d22c9d4290096fa4a26cd7a4b3dd_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20171109/20171109180324_8550569f222233a015e1cd7d70d2f2d4_2_mwpm_03200403.jpg","title":"老人不幸腿脚残疾，家里老牛竟能自己装车下田，结果震撼路人","uniquekey":"3aaad1c0a776c85f63c8f25c9dc860d1","url":"http://mini.eastday.com/mobile/171109160354353.html"},{"author_name":"人民网","category":"头条","date":"2017-11-09 16:03","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20171109/20171109160302_8cbf67daf31b12dfee04c846174fe12a_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20171109/20171109160302_0309cfbe291b7ca926feb8b1594cb259_7_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20171109/20171109180324_8550569f222233a015e1cd7d70d2f2d4_2_mwpm_03200403.jpg","title":"\u201c复兴号\u201d助力\u201c双11\u201d 京沪快件10小时内可送达","uniquekey":"ce0e12f2d2a5b329ec0cdad321904a43","url":"http://mini.eastday.com/mobile/171109160302269.html"},{"author_name":"晚间阅科学","category":"头条","date":"2017-11-09 15:49","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20171109/20171109_c0f4e0e2fa0de7b077aa59c0f7279dcf_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20171109/20171109_a13153dc4e82dd115bcc9bdae62e45ef_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20171109/20171109180324_8550569f222233a015e1cd7d70d2f2d4_2_mwpm_03200403.jpg","title":"古埃及一高水平技术, 运用陨石来制造宝剑, 完全不被岁月侵蚀","uniquekey":"2263135e83c3bab07066c5fc0cf9119e","url":"http://mini.eastday.com/mobile/171109154946591.html"},{"author_name":"餐饮行业家","category":"头条","date":"2017-11-09 15:48","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20171109/20171109154850_ca77c37f0466909b4158f40f75911a15_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20171109/20171109154850_ca77c37f0466909b4158f40f75911a15_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20171109/20171109180324_8550569f222233a015e1cd7d70d2f2d4_2_mwpm_03200403.jpg","title":"90后大学生做的是什么生意？一年轻轻松松就赚了一百多万","uniquekey":"dcef643756ab61f6acd2ceeb2628066f","url":"http://mini.eastday.com/mobile/171109154850429.html"},{"author_name":"户外帮","category":"头条","date":"2017-11-09 15:46","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20171109/20171109154628_fd8e3174a9913e31e57a667cc51e2a11_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20171109/20171109154628_fd8e3174a9913e31e57a667cc51e2a11_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20171109/20171109180324_8550569f222233a015e1cd7d70d2f2d4_2_mwpm_03200403.jpg","title":"父母街头跪地表演吃草 只为救9岁儿子","uniquekey":"4fa522e8090b927bd0551094c427b22f","url":"http://mini.eastday.com/mobile/171109154628235.html"},{"author_name":"高峰军事观察","category":"头条","date":"2017-11-09 15:35","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20171109/20171109_4c5cd6361800a16d1e6ded794299cff2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20171109/20171109_8fd8745c5dfd7deac6859b5adc4e13ee_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20171109/20171109180324_8550569f222233a015e1cd7d70d2f2d4_2_mwpm_03200403.jpg","title":"这国防空导弹一开战就会耗光，买中国的两款导弹可派上大用场了","uniquekey":"558619c2c54b133a06ccaea287fc12d1","url":"http://mini.eastday.com/mobile/171109153542425.html"},{"author_name":"华夏时报","category":"头条","date":"2017-11-09 15:35","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20171109/20171109153537_29b21658d2c5de585317de86460ea67e_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20171109/20171109151847_858bab2258079c70a057acc18b5db697_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20171109/20171109180324_8550569f222233a015e1cd7d70d2f2d4_2_mwpm_03200403.jpg","title":"中国进口商与美签订协议 将额外采购1200万吨新年度大豆","uniquekey":"1ec6e41834a465c8c1c19c7edf50e414","url":"http://mini.eastday.com/mobile/171109153537857.html"},{"author_name":"环球网","category":"头条","date":"2017-11-09 15:18","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20171109/20171109151847_858bab2258079c70a057acc18b5db697_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20171109/20171109151847_858bab2258079c70a057acc18b5db697_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20171109/20171109180324_8550569f222233a015e1cd7d70d2f2d4_2_mwpm_03200403.jpg","title":"联合国紧急救援协调员：沙特持续封锁将导致也门严重饥荒","uniquekey":"cfa9e092d20d98cbeca8a8852d0a88fa","url":"http://mini.eastday.com/mobile/171109151847418.html"},{"author_name":"东方网","category":"头条","date":"2017-11-09 15:11","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20171109/20171109151114_6818ef92cbc701e2e434377dbaa40ab6_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20171109/20171109151847_858bab2258079c70a057acc18b5db697_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20171109/20171109180324_8550569f222233a015e1cd7d70d2f2d4_2_mwpm_03200403.jpg","title":"重磅！鼓励和规范互联网租赁自行车发展 沪刚刚出台指导意见","uniquekey":"2b87ae3d8f42c25528be8a36e6f6b9a8","url":"http://mini.eastday.com/mobile/171109151114301.html"},{"author_name":"军情亮点","category":"头条","date":"2017-11-09 15:10","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20171109/20171109_94382883a2dc262a435f2696f1beaadf_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20171109/20171109_eed8368a217f4e150ca03cde5785cac8_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20171109/20171109180324_8550569f222233a015e1cd7d70d2f2d4_2_mwpm_03200403.jpg","title":"未来战机权威消息披露，公布日期值得期待","uniquekey":"49f5094965951d2b0fac6ce9b2c36070","url":"http://mini.eastday.com/mobile/171109151030897.html"},{"author_name":"映象网","category":"头条","date":"2017-11-09 15:06","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20171109/20171109150635_fa2451ea350d72a9fcf97b3860dd7551_10_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20171109/20171109150635_fa2451ea350d72a9fcf97b3860dd7551_18_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20171109/20171109180324_8550569f222233a015e1cd7d70d2f2d4_2_mwpm_03200403.jpg","title":"河南这两个市在全国火了！将领到这些\u201c大礼包\u201d","uniquekey":"7f231f825e05113b8f7a89bc9d88cc4b","url":"http://mini.eastday.com/mobile/171109150635768.html"},{"author_name":"菊花古剑和酒","category":"头条","date":"2017-11-09 15:05","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20171109/20171109_7e717b57e52432237ac22e52eee4bcf7_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20171109/20171109_643a458334cbcf78e9b68b047be22f2a_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20171109/20171109180324_8550569f222233a015e1cd7d70d2f2d4_2_mwpm_03200403.jpg","title":"她是黄磊的初恋，为黄晓明去当交际花，气场不输范冰冰！","uniquekey":"c82e73ecca8c356d3844fe2c3e06a485","url":"http://mini.eastday.com/mobile/171109150559022.html"}]
         * stat : 1
         */

        private String stat;
        private List<DataBean> data;

        public String getStat() {
            return stat;
        }

        public void setStat(String stat) {
            this.stat = stat;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * author_name : 新华国际头条
             * category : 头条
             * date : 2017-11-09 18:04
             * thumbnail_pic_s : http://03.imgmini.eastday.com/mobile/20171109/20171109180455_d41d8cd98f00b204e9800998ecf8427e_5_mwpm_03200403.jpg
             * thumbnail_pic_s02 : http://03.imgmini.eastday.com/mobile/20171109/20171109180455_d41d8cd98f00b204e9800998ecf8427e_3_mwpm_03200403.jpg
             * thumbnail_pic_s03 : http://01.imgmini.eastday.com/mobile/20171109/20171109180324_8550569f222233a015e1cd7d70d2f2d4_2_mwpm_03200403.jpg
             * thumbnail_pic_s04 : http://07.imgmini.eastday.com/mobile/20171109/20171109175525_cc33bfe071a38cc75687f5e62d840b96_5_mwpm_03200403.jpg
             * thumbnail_pic_s05 : http://01.imgmini.eastday.com/mobile/20171109/20171109180324_8550569f222233a015e1cd7d70d2f2d4_2_mwpm_03200403.jpg
             * title : 俄罗斯女记者参加总统选举 闹着玩还是来真的？
             * uniquekey : 685d0fccd3f5ea3014d7ab0215fecb5f
             * url : http://mini.eastday.com/mobile/171109180455164.html
             */

            private String author_name;
            private String category;
            private String date;
            private String thumbnail_pic_s;
            private String thumbnail_pic_s02;
            private String thumbnail_pic_s03;
            private String thumbnail_pic_s04;
            private String thumbnail_pic_s05;
            private String title;
            private String uniquekey;
            private String url;

            public String getAuthor_name() {
                return author_name;
            }

            public void setAuthor_name(String author_name) {
                this.author_name = author_name;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getThumbnail_pic_s() {
                return thumbnail_pic_s;
            }

            public void setThumbnail_pic_s(String thumbnail_pic_s) {
                this.thumbnail_pic_s = thumbnail_pic_s;
            }

            public String getThumbnail_pic_s02() {
                return thumbnail_pic_s02;
            }

            public void setThumbnail_pic_s02(String thumbnail_pic_s02) {
                this.thumbnail_pic_s02 = thumbnail_pic_s02;
            }

            public String getThumbnail_pic_s03() {
                return thumbnail_pic_s03;
            }

            public void setThumbnail_pic_s03(String thumbnail_pic_s03) {
                this.thumbnail_pic_s03 = thumbnail_pic_s03;
            }

            public String getThumbnail_pic_s04() {
                return thumbnail_pic_s04;
            }

            public void setThumbnail_pic_s04(String thumbnail_pic_s04) {
                this.thumbnail_pic_s04 = thumbnail_pic_s04;
            }

            public String getThumbnail_pic_s05() {
                return thumbnail_pic_s05;
            }

            public void setThumbnail_pic_s05(String thumbnail_pic_s05) {
                this.thumbnail_pic_s05 = thumbnail_pic_s05;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getUniquekey() {
                return uniquekey;
            }

            public void setUniquekey(String uniquekey) {
                this.uniquekey = uniquekey;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }
    }
}
