package com.example.pulluprecyclerview;

import java.util.List;

/**
 * Created by ChenJunMei on 2016/12/1.
 */

public class WaitMVBean {

    private DataBean data;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {

        private String stid;
        private List<ComingBean> coming;
        private List<?> hot;
        private List<Integer> movieIds;

        public String getStid() {
            return stid;
        }

        public void setStid(String stid) {
            this.stid = stid;
        }

        public List<ComingBean> getComing() {
            return coming;
        }

        public void setComing(List<ComingBean> coming) {
            this.coming = coming;
        }

        public List<?> getHot() {
            return hot;
        }

        public void setHot(List<?> hot) {
            this.hot = hot;
        }

        public List<Integer> getMovieIds() {
            return movieIds;
        }

        public void setMovieIds(List<Integer> movieIds) {
            this.movieIds = movieIds;
        }

        public static class ComingBean {
            /**
             * boxInfo : 喵，即将上映
             * cat : 剧情,爱情,动画
             * civilPubSt : 0
             * comingTitle : 12月2日 周五
             * desc : 主演:上白石萌音,神木隆之介,长泽雅美
             * dir : 新海诚
             * dur : 107
             * effectShowNum : 0
             * fra : 日本
             * frt : 2016-08-26
             * globalReleased : false
             * headLineShow : false
             * headLinesVO : [{"movieId":344881,"title":"圣地巡礼：美哭的每一帧都有现实取景地","type":"专题","url":"meituanmovie://www.meituan.com/forum/newsDetail?id=16957"},{"movieId":344881,"title":"导演新海诚：梦想做宇航员的动画导演","type":"专访","url":"meituanmovie://www.meituan.com/forum/newsDetail?id=16926"}]
             * id : 344881
             * img : http://p0.meituan.net/w.h/movie/910b2e6c7cb0da947d65ef5c33929eb9366676.jpg
             * late : false
             * localPubSt : 0
             * mk : 0
             * nm : 你的名字。
             * pn : 175
             * preShow : false
             * proScore : 6.6
             * proScoreNum : 9
             * pubDate : 1480608000000
             * pubDesc : 2016-12-02大陆上映
             * pubShowNum : 0
             * recentShowDate : 0
             * recentShowNum : 0
             * rt : 2016-12-02
             * sc : 0
             * scm : 寻君千里行，心系君之名
             * showInfo : 今天67家影院放映79场
             * showNum : 0
             * showst : 4
             * snum : 19311
             * star : 上白石萌音,神木隆之介,长泽雅美
             * ver : 2D
             * videoId : 82197
             * videoName : 终极预告片 12月2日一起看吧！
             * videourl : http://maoyan.meituan.net/movie/videos/854x480c1f128106e4f4715a87a2b9565b74f54.mp4
             * vnum : 21
             * weight : 1
             * wish : 271518
             * wishst : 0
             */

            private String boxInfo;
            private String cat;
            private int civilPubSt;
            private String comingTitle;
            private String desc;
            private String dir;
            private int dur;
            private int effectShowNum;
            private String fra;
            private String frt;
            private boolean globalReleased;
            private boolean headLineShow;
            private int id;
            private String img;
            private boolean late;
            private int localPubSt;
            private int mk;
            private String nm;
            private int pn;
            private boolean preShow;
            private double proScore;
            private int proScoreNum;
            private long pubDate;
            private String pubDesc;
            private int pubShowNum;
            private int recentShowDate;
            private int recentShowNum;
            private String rt;
            private int sc;
            private String scm;
            private String showInfo;
            private int showNum;
            private int showst;
            private int snum;
            private String star;
            private String ver;
            private int videoId;
            private String videoName;
            private String videourl;
            private int vnum;
            private int weight;
            private int wish;
            private int wishst;
            private List<HeadLinesVOBean> headLinesVO;

            public String getBoxInfo() {
                return boxInfo;
            }

            public void setBoxInfo(String boxInfo) {
                this.boxInfo = boxInfo;
            }

            public String getCat() {
                return cat;
            }

            public void setCat(String cat) {
                this.cat = cat;
            }

            public int getCivilPubSt() {
                return civilPubSt;
            }

            public void setCivilPubSt(int civilPubSt) {
                this.civilPubSt = civilPubSt;
            }

            public String getComingTitle() {
                return comingTitle;
            }

            public void setComingTitle(String comingTitle) {
                this.comingTitle = comingTitle;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getDir() {
                return dir;
            }

            public void setDir(String dir) {
                this.dir = dir;
            }

            public int getDur() {
                return dur;
            }

            public void setDur(int dur) {
                this.dur = dur;
            }

            public int getEffectShowNum() {
                return effectShowNum;
            }

            public void setEffectShowNum(int effectShowNum) {
                this.effectShowNum = effectShowNum;
            }

            public String getFra() {
                return fra;
            }

            public void setFra(String fra) {
                this.fra = fra;
            }

            public String getFrt() {
                return frt;
            }

            public void setFrt(String frt) {
                this.frt = frt;
            }

            public boolean isGlobalReleased() {
                return globalReleased;
            }

            public void setGlobalReleased(boolean globalReleased) {
                this.globalReleased = globalReleased;
            }

            public boolean isHeadLineShow() {
                return headLineShow;
            }

            public void setHeadLineShow(boolean headLineShow) {
                this.headLineShow = headLineShow;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getImg() {
                return img;
            }

            public void setImg(String img) {
                this.img = img;
            }

            public boolean isLate() {
                return late;
            }

            public void setLate(boolean late) {
                this.late = late;
            }

            public int getLocalPubSt() {
                return localPubSt;
            }

            public void setLocalPubSt(int localPubSt) {
                this.localPubSt = localPubSt;
            }

            public int getMk() {
                return mk;
            }

            public void setMk(int mk) {
                this.mk = mk;
            }

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public int getPn() {
                return pn;
            }

            public void setPn(int pn) {
                this.pn = pn;
            }

            public boolean isPreShow() {
                return preShow;
            }

            public void setPreShow(boolean preShow) {
                this.preShow = preShow;
            }

            public double getProScore() {
                return proScore;
            }

            public void setProScore(double proScore) {
                this.proScore = proScore;
            }

            public int getProScoreNum() {
                return proScoreNum;
            }

            public void setProScoreNum(int proScoreNum) {
                this.proScoreNum = proScoreNum;
            }

            public long getPubDate() {
                return pubDate;
            }

            public void setPubDate(long pubDate) {
                this.pubDate = pubDate;
            }

            public String getPubDesc() {
                return pubDesc;
            }

            public void setPubDesc(String pubDesc) {
                this.pubDesc = pubDesc;
            }

            public int getPubShowNum() {
                return pubShowNum;
            }

            public void setPubShowNum(int pubShowNum) {
                this.pubShowNum = pubShowNum;
            }

            public int getRecentShowDate() {
                return recentShowDate;
            }

            public void setRecentShowDate(int recentShowDate) {
                this.recentShowDate = recentShowDate;
            }

            public int getRecentShowNum() {
                return recentShowNum;
            }

            public void setRecentShowNum(int recentShowNum) {
                this.recentShowNum = recentShowNum;
            }

            public String getRt() {
                return rt;
            }

            public void setRt(String rt) {
                this.rt = rt;
            }

            public int getSc() {
                return sc;
            }

            public void setSc(int sc) {
                this.sc = sc;
            }

            public String getScm() {
                return scm;
            }

            public void setScm(String scm) {
                this.scm = scm;
            }

            public String getShowInfo() {
                return showInfo;
            }

            public void setShowInfo(String showInfo) {
                this.showInfo = showInfo;
            }

            public int getShowNum() {
                return showNum;
            }

            public void setShowNum(int showNum) {
                this.showNum = showNum;
            }

            public int getShowst() {
                return showst;
            }

            public void setShowst(int showst) {
                this.showst = showst;
            }

            public int getSnum() {
                return snum;
            }

            public void setSnum(int snum) {
                this.snum = snum;
            }

            public String getStar() {
                return star;
            }

            public void setStar(String star) {
                this.star = star;
            }

            public String getVer() {
                return ver;
            }

            public void setVer(String ver) {
                this.ver = ver;
            }

            public int getVideoId() {
                return videoId;
            }

            public void setVideoId(int videoId) {
                this.videoId = videoId;
            }

            public String getVideoName() {
                return videoName;
            }

            public void setVideoName(String videoName) {
                this.videoName = videoName;
            }

            public String getVideourl() {
                return videourl;
            }

            public void setVideourl(String videourl) {
                this.videourl = videourl;
            }

            public int getVnum() {
                return vnum;
            }

            public void setVnum(int vnum) {
                this.vnum = vnum;
            }

            public int getWeight() {
                return weight;
            }

            public void setWeight(int weight) {
                this.weight = weight;
            }

            public int getWish() {
                return wish;
            }

            public void setWish(int wish) {
                this.wish = wish;
            }

            public int getWishst() {
                return wishst;
            }

            public void setWishst(int wishst) {
                this.wishst = wishst;
            }

            public List<HeadLinesVOBean> getHeadLinesVO() {
                return headLinesVO;
            }

            public void setHeadLinesVO(List<HeadLinesVOBean> headLinesVO) {
                this.headLinesVO = headLinesVO;
            }

            public static class HeadLinesVOBean {
                /**
                 * movieId : 344881
                 * title : 圣地巡礼：美哭的每一帧都有现实取景地
                 * type : 专题
                 * url : meituanmovie://www.meituan.com/forum/newsDetail?id=16957
                 */

                private int movieId;
                private String title;
                private String type;
                private String url;

                public int getMovieId() {
                    return movieId;
                }

                public void setMovieId(int movieId) {
                    this.movieId = movieId;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
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
            }
        }
    }
}
