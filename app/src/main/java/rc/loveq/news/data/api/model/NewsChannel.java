package rc.loveq.news.data.api.model;

import java.util.List;

/**
 * Created by rc on 2018/1/15.
 * Description:
 */

public class NewsChannel {
    /**
     * imgextra : []
     * template : normal1
     * skipID : 00AO0001|2285613
     * lmodify : 2017-12-11 14:47:02
     * postid : PHOT25O1D000100A
     * source : 中国新闻网
     * title : 加州山火持续肆虐 消防员火海中奋战
     * mtime : 2017-12-11 14:47:02
     * hasImg : 1
     * topic_background : http://img2.cache.netease.com/m/newsapp/reading/cover1/C1348646712614.jpg
     * digest :
     * photosetID : 00AO0001|2285613
     * boardid : photoview_bbs
     * alias : Top News
     * hasAD : 1
     * imgsrc : http://cms-bucket.nosdn.127.net/94819ac57a7f4a538b3a7f76c8c523d220171211144254.jpeg
     * ptime : 2017-12-11 14:43:29
     * daynum : 17511
     * hasHead : 1
     * order : 1
     * votecount : 0
     * hasCover : false
     * docid : 9IG74V5H00963VRO_D5CPD7LJbjguopingupdateDoc
     * tname : 头条
     * priority : 355
     * ads : [{"subtitle":"","skipType":"photoset","skipID":"00AP0001|2285592","tag":"photoset","title":"女子陷传销纸币写信求救:做一回英雄","imgsrc":"http://cms-bucket.nosdn.127.net/a2d811ab14434d7d906a3a9c49379dbb20171211115234.jpeg","url":"00AP0001|2285592"},{"subtitle":"","skipType":"photoset","skipID":"00AP0001|2285573","tag":"photoset","title":"男子封路摆酒席 宴请600桌不收礼金","imgsrc":"http://cms-bucket.nosdn.127.net/56c0d26858da4b259820b29042a87fd120171211093755.jpeg","url":"00AP0001|2285573"},{"subtitle":"","skipType":"photoset","skipID":"00AO0001|2285572","tag":"photoset","title":"诺贝尔颁奖礼举行 皇室成员优雅亮相","imgsrc":"http://cms-bucket.nosdn.127.net/c5476cceb162439485139f61796d368a20171211091900.jpeg","url":"00AO0001|2285572"},{"subtitle":"","skipType":"photoset","skipID":"00AP0001|2285561","tag":"photoset","title":"保安伸手接坠楼女子 砸中后双双身亡","imgsrc":"http://cms-bucket.nosdn.127.net/db8e9a7ebb1e4debabcf57fbf657cca220171211080017.jpeg","url":"00AP0001|2285561"},{"subtitle":"","skipType":"photoset","skipID":"00AO0001|2285590","tag":"photoset","title":"韩国3万医生集会反对文在寅医改","imgsrc":"http://cms-bucket.nosdn.127.net/828bbdcf98b24e6bb91375da1cf01ff520171211103431.jpeg","url":"00AO0001|2285590"}]
     * ename : androidnews
     * replyCount : 0
     * imgsum : 5
     * hasIcon : false
     * skipType : photoset
     * cid : C1348646712614
     */

    private String template;
    private String skipID;
    private String lmodify;
    private String postid;
    private String source;
    private String title;
    private String mtime;
    private int hasImg;
    private String topic_background;
    private String digest;
    private String photosetID;
    private String boardid;
    private String alias;
    private int hasAD;
    private String imgsrc;
    private String ptime;
    private String daynum;
    private int hasHead;
    private int order;
    private int votecount;
    private boolean hasCover;
    private String docid;
    private String tname;
    private int priority;
    private String ename;
    private int replyCount;
    private int imgsum;
    private boolean hasIcon;
    private String skipType;
    private String cid;
    private List<Imgextra> imgextra;
    private List<AdsBean> ads;

    public class Imgextra {
        private String imgsrc;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public String getSkipID() {
        return skipID;
    }

    public void setSkipID(String skipID) {
        this.skipID = skipID;
    }

    public String getLmodify() {
        return lmodify;
    }

    public void setLmodify(String lmodify) {
        this.lmodify = lmodify;
    }

    public String getPostid() {
        return postid;
    }

    public void setPostid(String postid) {
        this.postid = postid;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMtime() {
        return mtime;
    }

    public void setMtime(String mtime) {
        this.mtime = mtime;
    }

    public int getHasImg() {
        return hasImg;
    }

    public void setHasImg(int hasImg) {
        this.hasImg = hasImg;
    }

    public String getTopic_background() {
        return topic_background;
    }

    public void setTopic_background(String topic_background) {
        this.topic_background = topic_background;
    }

    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }

    public String getPhotosetID() {
        return photosetID;
    }

    public void setPhotosetID(String photosetID) {
        this.photosetID = photosetID;
    }

    public String getBoardid() {
        return boardid;
    }

    public void setBoardid(String boardid) {
        this.boardid = boardid;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getHasAD() {
        return hasAD;
    }

    public void setHasAD(int hasAD) {
        this.hasAD = hasAD;
    }

    public String getImgsrc() {
        return imgsrc;
    }

    public void setImgsrc(String imgsrc) {
        this.imgsrc = imgsrc;
    }

    public String getPtime() {
        return ptime;
    }

    public void setPtime(String ptime) {
        this.ptime = ptime;
    }

    public String getDaynum() {
        return daynum;
    }

    public void setDaynum(String daynum) {
        this.daynum = daynum;
    }

    public int getHasHead() {
        return hasHead;
    }

    public void setHasHead(int hasHead) {
        this.hasHead = hasHead;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public int getVotecount() {
        return votecount;
    }

    public void setVotecount(int votecount) {
        this.votecount = votecount;
    }

    public boolean isHasCover() {
        return hasCover;
    }

    public void setHasCover(boolean hasCover) {
        this.hasCover = hasCover;
    }

    public String getDocid() {
        return docid;
    }

    public void setDocid(String docid) {
        this.docid = docid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getReplyCount() {
        return replyCount;
    }

    public void setReplyCount(int replyCount) {
        this.replyCount = replyCount;
    }

    public int getImgsum() {
        return imgsum;
    }

    public void setImgsum(int imgsum) {
        this.imgsum = imgsum;
    }

    public boolean isHasIcon() {
        return hasIcon;
    }

    public void setHasIcon(boolean hasIcon) {
        this.hasIcon = hasIcon;
    }

    public String getSkipType() {
        return skipType;
    }

    public void setSkipType(String skipType) {
        this.skipType = skipType;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public List<Imgextra> getImgextra() {
        return imgextra;
    }

    public void setImgextra(List<Imgextra> imgextra) {
        this.imgextra = imgextra;
    }

    public List<AdsBean> getAds() {
        return ads;
    }

    public void setAds(List<AdsBean> ads) {
        this.ads = ads;
    }

    public static class AdsBean {
        /**
         * subtitle :
         * skipType : photoset
         * skipID : 00AP0001|2285592
         * tag : photoset
         * title : 女子陷传销纸币写信求救:做一回英雄
         * imgsrc : http://cms-bucket.nosdn.127.net/a2d811ab14434d7d906a3a9c49379dbb20171211115234.jpeg
         * url : 00AP0001|2285592
         */

        private String subtitle;
        private String skipType;
        private String skipID;
        private String tag;
        private String title;
        private String imgsrc;
        private String url;

        public String getSubtitle() {
            return subtitle;
        }

        public void setSubtitle(String subtitle) {
            this.subtitle = subtitle;
        }

        public String getSkipType() {
            return skipType;
        }

        public void setSkipType(String skipType) {
            this.skipType = skipType;
        }

        public String getSkipID() {
            return skipID;
        }

        public void setSkipID(String skipID) {
            this.skipID = skipID;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getImgsrc() {
            return imgsrc;
        }

        public void setImgsrc(String imgsrc) {
            this.imgsrc = imgsrc;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}
