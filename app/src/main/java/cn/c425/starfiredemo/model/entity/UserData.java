package cn.c425.starfiredemo.model.entity;

import java.util.ArrayList;

import cn.c425.starfiredemo.model.DAO.DAOException;

/**
 * 用户的数据类。只应该被Service层的类调用。
 */
public class UserData {

    //////
    // 构造/工厂函数
    //////

    /**
     * 从数据库中尝试获取指定ID对应的用户数据。如果不存在则抛出异常。
     * @param id
     */
    public UserData(long id){

    }

    private UserData(){}

    //////
    // 操作。
    //////

    /**
     * 尝试修改这份用户数据。如果不存在则抛出异常。
     * @param usrid 上传用户的ID。
     */
    public void Update(long usrid) throws DAOException{

    }

    //////
    // 属性/属性接口。
    //////

    public long getUserID() {
        return userID_;
    }

    public String getUserName() {
        return userName_;
    }

    /**
     * 申请添加新的话题ID到曾发布的话题ID列表。
     * @param tid 话题ID。
     */
    public void addToMyTopicIDs(long tid) throws DAOException{

    }

    /**
     * 申请添加新的发言ID到曾发布的发言ID列表。
     * @param tid 话题ID。
     */
    public void addToMyCommentIDs(long tid) throws DAOException {

    }

    /**
     * 申请添加新的回复ID到曾发布的回复ID列表。
     * @param tid 话题ID。
     */
    public void addToMyResponseIDs(long tid) throws DAOException {

    }

    /**
     * 返回曾发布的话题ID列表。
     * @return 禁止修改。
     */
    public ArrayList<Long> getMyTopicIDs() {
        return myTopicIDs_;
    }

    /**
     *
     * @return 禁止修改。
     */
    public ArrayList<Long> getMyCommentIDs() {
        return myCommentIDs_;
    }

    /**
     *
     * @return 禁止修改。
     */
    public ArrayList<Long> getMyResponseIDs() {
        return myResponseIDs_;
    }

    /**
     * 用户的ID(全局唯一标识符)。
     */
    private long userID_;

    /**
     * 用户名。
     */
    private String userName_;

    /**
     * 发表的话题id列表。
     */
    private ArrayList<Long> myTopicIDs_;

    /**
     * 发表的言论id列表。
     */
    private ArrayList<Long> myCommentIDs_;

    /**
     * 发表的回复id列表。
     */
    private ArrayList<Long> myResponseIDs_;
}
