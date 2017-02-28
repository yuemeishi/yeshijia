package com.xl.yueshijia.yueshijia.Zhuanti;

import java.util.List;

/**
 * Created by Administrator on 2017/2/27 0027.
 */

public class ShipinBean {


    /**
     * code : 200
     * hasmore : true
     * page_total : 2
     * datas : {"article_list":[{"article_title":"做一个名正言顺的\u201c拜金女\u201d","article_id":"864","article_video":"http://video.yueshichina.com/video/2016/bingqilin.mp4","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/08/15/8351ec94e1daaee2","article_publish_time":"1486612860","article_abstract":"金光闪闪的土豪冰淇淋","article_origin":"","top":"0","video_length":"02'49''","tag":["金箔冰淇淋"]},{"article_title":"炉灶间的五星上将","article_id":"873","article_video":"http://video.yueshichina.com/video/2016/0812/huanglei.mp4","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/08/15/43626b0babb167b6","article_publish_time":"1485402000","article_abstract":"我负责厨房 你负责赞扬","article_origin":"","top":"0","video_length":"01'04''","tag":["黄磊"]},{"article_title":"爱情与想吃什么，都是自然发生的","article_id":"869","article_video":"http://video.yueshichina.com/video/2016/0812/zhouxun.mp4","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/08/15/807c968cd9e0f4dc","article_publish_time":"1485402000","article_abstract":"从今天开始我做饭给你吃","article_origin":"悦食中国","top":"1","video_length":"01'11''"},{"article_title":"悦食十八贡「年在一起」第四集","article_id":"1139","article_video":"http://video.yueshichina.com/video/2016/0812/shibagongi.mp4","article_image":"http://yueshi.b0.upaiyun.com/cms/2017/01/18/3434b6e01b4dc0bf","article_publish_time":"1484582400","article_abstract":"一起回家吧","article_origin":"","top":"0","video_length":"01'14''","tag":["一起回家吧"]},{"article_title":"悦食十八贡「年在一起」第三集","article_id":"1135","article_video":"http://video.yueshichina.com/video/2016/0812/shibagongs.mp4","article_image":"http://yueshi.b0.upaiyun.com/cms/2017/01/12/f2bb13f1aefd8518","article_publish_time":"1484222490","article_abstract":"一起睡觉吧","article_origin":"","top":"0","video_length":"01'07''","tag":["一起睡觉吧"]},{"article_title":"记忆中的冬天，米饭化开一勺猪油，很香","article_id":"880","article_video":"http://video.yueshichina.com/video/2016/0812/liangjiahui.mp4","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/09/08/1b55c346d52db01b","article_publish_time":"1484123700","article_abstract":"闭嘴！吃完你的早餐","article_origin":"","top":"0","video_length":"01'33''","tag":["梁家辉"]},{"article_title":"外婆的炸酱面是家的味道","article_id":"870","article_video":"http://video.yueshichina.com/video/2016/0812/pengyuyan.mp4","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/08/15/3d4cfe70774cbe6f","article_publish_time":"1484123640","article_abstract":"面对美味也会偶尔放纵","article_origin":"","top":"0","video_length":"01'10''","tag":["彭于晏"]},{"article_title":"悦食十八贡「年在一起」第二集","article_id":"1127","article_video":"http://video.yueshichina.com/video/2016/0812/shibagonge.mp4","article_image":"http://yueshi.b0.upaiyun.com/cms/2017/01/09/b97fb6189765bb74","article_publish_time":"1483961692","article_abstract":"一起喝酒吧","article_origin":"","top":"0","video_length":"01'06''","tag":["一起喝酒吧"]},{"article_title":"悦食十八贡「年在一起」第一集","article_id":"1126","article_video":"http://video.yueshichina.com/video/2016/0812/shibagongy.mp4","article_image":"http://yueshi.b0.upaiyun.com/cms/2017/01/05/d78f2988b2733822","article_publish_time":"1483623805","article_abstract":"一起做饭吧","article_origin":"","top":"0","video_length":"01'01''","tag":["一起做饭吧"]},{"article_title":"十八贡「年在一起」视频花絮","article_id":"1125","article_video":"http://video.yueshichina.com/video/2016/0812/huaxu.mp4","article_image":"http://yueshi.b0.upaiyun.com/cms/2017/01/05/45866d0923099f98","article_publish_time":"1483611089","article_abstract":"比正片好看的永远是NG","article_origin":"","top":"0","video_length":"02'05''","tag":["一起NG吧"]}],"qa":"Q&A"}
     */

    private int code;
    private boolean hasmore;
    private int page_total;
    private DatasBean datas;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public boolean isHasmore() {
        return hasmore;
    }

    public void setHasmore(boolean hasmore) {
        this.hasmore = hasmore;
    }

    public int getPage_total() {
        return page_total;
    }

    public void setPage_total(int page_total) {
        this.page_total = page_total;
    }

    public DatasBean getDatas() {
        return datas;
    }

    public void setDatas(DatasBean datas) {
        this.datas = datas;
    }

    public static class DatasBean {
        /**
         * article_list : [{"article_title":"做一个名正言顺的\u201c拜金女\u201d","article_id":"864","article_video":"http://video.yueshichina.com/video/2016/bingqilin.mp4","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/08/15/8351ec94e1daaee2","article_publish_time":"1486612860","article_abstract":"金光闪闪的土豪冰淇淋","article_origin":"","top":"0","video_length":"02'49''","tag":["金箔冰淇淋"]},{"article_title":"炉灶间的五星上将","article_id":"873","article_video":"http://video.yueshichina.com/video/2016/0812/huanglei.mp4","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/08/15/43626b0babb167b6","article_publish_time":"1485402000","article_abstract":"我负责厨房 你负责赞扬","article_origin":"","top":"0","video_length":"01'04''","tag":["黄磊"]},{"article_title":"爱情与想吃什么，都是自然发生的","article_id":"869","article_video":"http://video.yueshichina.com/video/2016/0812/zhouxun.mp4","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/08/15/807c968cd9e0f4dc","article_publish_time":"1485402000","article_abstract":"从今天开始我做饭给你吃","article_origin":"悦食中国","top":"1","video_length":"01'11''"},{"article_title":"悦食十八贡「年在一起」第四集","article_id":"1139","article_video":"http://video.yueshichina.com/video/2016/0812/shibagongi.mp4","article_image":"http://yueshi.b0.upaiyun.com/cms/2017/01/18/3434b6e01b4dc0bf","article_publish_time":"1484582400","article_abstract":"一起回家吧","article_origin":"","top":"0","video_length":"01'14''","tag":["一起回家吧"]},{"article_title":"悦食十八贡「年在一起」第三集","article_id":"1135","article_video":"http://video.yueshichina.com/video/2016/0812/shibagongs.mp4","article_image":"http://yueshi.b0.upaiyun.com/cms/2017/01/12/f2bb13f1aefd8518","article_publish_time":"1484222490","article_abstract":"一起睡觉吧","article_origin":"","top":"0","video_length":"01'07''","tag":["一起睡觉吧"]},{"article_title":"记忆中的冬天，米饭化开一勺猪油，很香","article_id":"880","article_video":"http://video.yueshichina.com/video/2016/0812/liangjiahui.mp4","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/09/08/1b55c346d52db01b","article_publish_time":"1484123700","article_abstract":"闭嘴！吃完你的早餐","article_origin":"","top":"0","video_length":"01'33''","tag":["梁家辉"]},{"article_title":"外婆的炸酱面是家的味道","article_id":"870","article_video":"http://video.yueshichina.com/video/2016/0812/pengyuyan.mp4","article_image":"http://yueshi.b0.upaiyun.com/cms/2016/08/15/3d4cfe70774cbe6f","article_publish_time":"1484123640","article_abstract":"面对美味也会偶尔放纵","article_origin":"","top":"0","video_length":"01'10''","tag":["彭于晏"]},{"article_title":"悦食十八贡「年在一起」第二集","article_id":"1127","article_video":"http://video.yueshichina.com/video/2016/0812/shibagonge.mp4","article_image":"http://yueshi.b0.upaiyun.com/cms/2017/01/09/b97fb6189765bb74","article_publish_time":"1483961692","article_abstract":"一起喝酒吧","article_origin":"","top":"0","video_length":"01'06''","tag":["一起喝酒吧"]},{"article_title":"悦食十八贡「年在一起」第一集","article_id":"1126","article_video":"http://video.yueshichina.com/video/2016/0812/shibagongy.mp4","article_image":"http://yueshi.b0.upaiyun.com/cms/2017/01/05/d78f2988b2733822","article_publish_time":"1483623805","article_abstract":"一起做饭吧","article_origin":"","top":"0","video_length":"01'01''","tag":["一起做饭吧"]},{"article_title":"十八贡「年在一起」视频花絮","article_id":"1125","article_video":"http://video.yueshichina.com/video/2016/0812/huaxu.mp4","article_image":"http://yueshi.b0.upaiyun.com/cms/2017/01/05/45866d0923099f98","article_publish_time":"1483611089","article_abstract":"比正片好看的永远是NG","article_origin":"","top":"0","video_length":"02'05''","tag":["一起NG吧"]}]
         * qa : Q&A
         */

        private String qa;
        private List<ArticleListBean> article_list;

        public String getQa() {
            return qa;
        }

        public void setQa(String qa) {
            this.qa = qa;
        }

        public List<ArticleListBean> getArticle_list() {
            return article_list;
        }

        public void setArticle_list(List<ArticleListBean> article_list) {
            this.article_list = article_list;
        }

        public static class ArticleListBean {
            /**
             * article_title : 做一个名正言顺的“拜金女”
             * article_id : 864
             * article_video : http://video.yueshichina.com/video/2016/bingqilin.mp4
             * article_image : http://yueshi.b0.upaiyun.com/cms/2016/08/15/8351ec94e1daaee2
             * article_publish_time : 1486612860
             * article_abstract : 金光闪闪的土豪冰淇淋
             * article_origin :
             * top : 0
             * video_length : 02'49''
             * tag : ["金箔冰淇淋"]
             */

            private String article_title;
            private String article_id;
            private String article_video;
            private String article_image;
            private String article_publish_time;
            private String article_abstract;
            private String article_origin;
            private String top;
            private String video_length;
            private List<String> tag;

            public String getArticle_title() {
                return article_title;
            }

            public void setArticle_title(String article_title) {
                this.article_title = article_title;
            }

            public String getArticle_id() {
                return article_id;
            }

            public void setArticle_id(String article_id) {
                this.article_id = article_id;
            }

            public String getArticle_video() {
                return article_video;
            }

            public void setArticle_video(String article_video) {
                this.article_video = article_video;
            }

            public String getArticle_image() {
                return article_image;
            }

            public void setArticle_image(String article_image) {
                this.article_image = article_image;
            }

            public String getArticle_publish_time() {
                return article_publish_time;
            }

            public void setArticle_publish_time(String article_publish_time) {
                this.article_publish_time = article_publish_time;
            }

            public String getArticle_abstract() {
                return article_abstract;
            }

            public void setArticle_abstract(String article_abstract) {
                this.article_abstract = article_abstract;
            }

            public String getArticle_origin() {
                return article_origin;
            }

            public void setArticle_origin(String article_origin) {
                this.article_origin = article_origin;
            }

            public String getTop() {
                return top;
            }

            public void setTop(String top) {
                this.top = top;
            }

            public String getVideo_length() {
                return video_length;
            }

            public void setVideo_length(String video_length) {
                this.video_length = video_length;
            }

            public List<String> getTag() {
                return tag;
            }

            public void setTag(List<String> tag) {
                this.tag = tag;
            }
        }
    }
}
