package cn.c425.starfiredemo.model.entity;

import java.util.ArrayList;

import cn.c425.starfiredemo.model.DAO.DAOException;

/**
 * 内容的数据抽象类。
 */
public class ContentData {

    //////
    // 构造/工厂函数。
    //////

    /**
     * 创建一份在数据库中 不 存 在 的新的内容数据。这份内容数据当中的全部数据成员已经进行了初始化。
     */
    public ContentData(long id, String content, long spid){
        contentID_ = id;
        content_ = content;
        speakerID_ = spid;
        childrenContentID_ = new ArrayList<>();
    }

    private ContentData(){}

    /**
     * 从数据库中尝试获取指定ID对应的内容数据。如果不存在则返回NULL。
     * @param id
     * @return
     */
    public static ContentData GetFromID(long id) throws DAOException {
        ContentData cd = new ContentData();
        // TODO : 添加实际代码。
        return cd;
    }

    //////
    // 操作。
    //////

    /**
     * 尝试上传这份内容数据。如果已经存在则抛出异常。
     * @param usrid 进行操作的用户的ID。
     * @throws DAOException
     */
    public void Upload(long usrid) throws DAOException{

    }

    /**
     * 尝试删除这份内容数据。
     * @param usrid 进行操作的用户ID。
     * @throws DAOException
     */
    public void Delete(long usrid) throws DAOException{

    }

    //////
    // 属性。
    //////

    public long getContentID() {
        return contentID_;
    }

    public String getContent() {
        return content_;
    }

    public long getSpeakerID() {
        return speakerID_;
    }

    public long getParentContentID() {
        return parentContentID_;
    }

    /**
     *
     * @return 禁止修改。
     */
    public ArrayList<Long> getChildrenContentID() {
        return childrenContentID_;
    }

    public CONTENT_DATA_TYPE getContent_type() {
        return content_type_;
    }

    public int getReleasedYear() {
        return releasedYear_;
    }

    public int getReleasedMonth() {
        return releasedMonth_;
    }

    public int getReleasedDay() {
        return releasedDay_;
    }

    public int getReleasedHour() {
        return releasedHour_;
    }

    public int getReleasedMinute() {
        return releasedMinute_;
    }

    public int getReleasedSecond() {
        return releasedSecond_;
    }

    public boolean isDeleted() {
        return deleted_;
    }

    public boolean isValid() {
        return valid_;
    }

    /**
     * 内容的全局标识ID。
     */
    private long contentID_;

    /**
     * 包含的未被解析的原始内容主体。(比如图片仍以链接形式存在)
     */
    private String content_;

    /**
     * 发布言论的用户ID。
     */
    private long speakerID_;

    /**
     * 所属的内容的ID。(例如对发言A的回复B的所属内容是A，在话题C下发言A的所述内容是C)
     */
    private long parentContentID_;

    /**
     * 所持有的子内容的ID集合。
     */
    private ArrayList<Long> childrenContentID_;

    private CONTENT_DATA_TYPE content_type_;

    /**
     * 发布的年份。
     */
    private int releasedYear_;

    /**
     * 发布的月份。
     */
    private int releasedMonth_;

    /**
     * 发布的天。
     */
    private int releasedDay_;

    /**
     * 发布的小时。
     */
    private int releasedHour_;

    /**
     * 发布的分。
     */
    private int releasedMinute_;

    /**
     * 发布的秒。
     */
    private int releasedSecond_;

    /**
     * 是否为被删除的言论。
     */
    private boolean deleted_;

    /**
     * 是否为有效的内容。(确实存在于服务器上的内容)
     */
    private boolean valid_;

    //////
    // 辅助类/成员。
    //////

    public enum CONTENT_DATA_TYPE{
        /**
         * 话题/文章。
         */
        CONTENT_DATA_TOPIC,
        /**
         * 发言。相当于话题/文章的回复。
         */
        CONTENT_DATA_COMMENT,
        /**
         * 发言的回复。
         */
        CONTENT_DATA_RESPONSE
    }
}
