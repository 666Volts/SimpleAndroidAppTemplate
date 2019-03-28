package cn.c425.starfiredemo.model.service;

import java.util.ArrayList;

import cn.c425.starfiredemo.model.entity.UserData;
import cn.c425.starfiredemo.model.DAO.DAOException;

/**
 * 具有完整功能的用户类型。只应该被Controller层的类使用。
 */
public class User {
    //////
    // 构造/工厂函数。
    //////

    /**
     * 创建一个用户并尝试从数据库中加载id对应的用户信息。如果不存在对应的信息则抛出异常。
     * @param id 用户id。
     */
    public User(long id) throws DAOException{

    }

    //////
    // 操作。
    //////



    //////
    // 属性/属性接口。
    //////

    public long getUserID() {
        return userData_.getUserID();
    }

    public String getUserName() {
        return userData_.getUserName();
    }

    /**
     * 申请添加新的话题ID到曾发布的话题ID列表。
     * @param tid 话题ID。
     */
    public void addToMyTopicIDs(long tid) throws DAOException {

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
        return userData_.getMyTopicIDs();
    }

    /**
     *
     * @return 禁止修改。
     */
    public ArrayList<Long> getMyCommentIDs() {
        return userData_.getMyCommentIDs();
    }

    /**
     *
     * @return 禁止修改。
     */
    public ArrayList<Long> getMyResponseIDs() {
        return userData_.getMyResponseIDs();
    }

    /**
     * 用户数据。
     */
    private UserData userData_;
}
