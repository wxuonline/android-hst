package com.hengan.hst.common;

import java.util.List;

public class Test {

    /**
     * status : success
     * data : {"prev_date":"","list":[{"model":"news","title":"胡金秋14+11胡明轩12分 男篮蓝队61-68不敌突尼斯","label":"篮球,CBA,中国男篮","createtime":"2018-08-16 21:32:57","match_id":"130409","tag":"","pinglun":"2018_08_16-news-nba-130409","type":"nba","url":"/nba/2018-08-16/130409.htm","thumbnail":"http://tu.qiumibao.com/uploads/day_180816/201808162132087621_thumb.jpg","top_time":"0","top_order":"0","disable_black":false,"top_position":"0","version_url":"/nba/2018-08-16/130409_version1.htm"}]}
     */

    private String status;
    private DataBean data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * prev_date :
         * list : [{"model":"news","title":"胡金秋14+11胡明轩12分 男篮蓝队61-68不敌突尼斯","label":"篮球,CBA,中国男篮","createtime":"2018-08-16 21:32:57","match_id":"130409","tag":"","pinglun":"2018_08_16-news-nba-130409","type":"nba","url":"/nba/2018-08-16/130409.htm","thumbnail":"http://tu.qiumibao.com/uploads/day_180816/201808162132087621_thumb.jpg","top_time":"0","top_order":"0","disable_black":false,"top_position":"0","version_url":"/nba/2018-08-16/130409_version1.htm"}]
         */

        private String prev_date;
        private List<ListBean> list;

        public String getPrev_date() {
            return prev_date;
        }

        public void setPrev_date(String prev_date) {
            this.prev_date = prev_date;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            /**
             * model : news
             * title : 胡金秋14+11胡明轩12分 男篮蓝队61-68不敌突尼斯
             * label : 篮球,CBA,中国男篮
             * createtime : 2018-08-16 21:32:57
             * match_id : 130409
             * tag :
             * pinglun : 2018_08_16-news-nba-130409
             * type : nba
             * url : /nba/2018-08-16/130409.htm
             * thumbnail : http://tu.qiumibao.com/uploads/day_180816/201808162132087621_thumb.jpg
             * top_time : 0
             * top_order : 0
             * disable_black : false
             * top_position : 0
             * version_url : /nba/2018-08-16/130409_version1.htm
             */

            private String model;
            private String title;
            private String label;
            private String createtime;
            private String match_id;
            private String tag;
            private String pinglun;
            private String type;
            private String url;
            private String thumbnail;
            private String top_time;
            private String top_order;
            private boolean disable_black;
            private String top_position;
            private String version_url;

            public String getModel() {
                return model;
            }

            public void setModel(String model) {
                this.model = model;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getLabel() {
                return label;
            }

            public void setLabel(String label) {
                this.label = label;
            }

            public String getCreatetime() {
                return createtime;
            }

            public void setCreatetime(String createtime) {
                this.createtime = createtime;
            }

            public String getMatch_id() {
                return match_id;
            }

            public void setMatch_id(String match_id) {
                this.match_id = match_id;
            }

            public String getTag() {
                return tag;
            }

            public void setTag(String tag) {
                this.tag = tag;
            }

            public String getPinglun() {
                return pinglun;
            }

            public void setPinglun(String pinglun) {
                this.pinglun = pinglun;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getThumbnail() {
                return thumbnail;
            }

            public void setThumbnail(String thumbnail) {
                this.thumbnail = thumbnail;
            }

            public String getTop_time() {
                return top_time;
            }

            public void setTop_time(String top_time) {
                this.top_time = top_time;
            }

            public String getTop_order() {
                return top_order;
            }

            public void setTop_order(String top_order) {
                this.top_order = top_order;
            }

            public boolean isDisable_black() {
                return disable_black;
            }

            public void setDisable_black(boolean disable_black) {
                this.disable_black = disable_black;
            }

            public String getTop_position() {
                return top_position;
            }

            public void setTop_position(String top_position) {
                this.top_position = top_position;
            }

            public String getVersion_url() {
                return version_url;
            }

            public void setVersion_url(String version_url) {
                this.version_url = version_url;
            }
        }
    }
}
