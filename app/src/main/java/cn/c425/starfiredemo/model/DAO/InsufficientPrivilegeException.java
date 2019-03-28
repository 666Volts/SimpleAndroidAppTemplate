package cn.c425.starfiredemo.model.DAO;

/**
 * 访问存储于服务器上的数据时出现的异常。原因为权限不足。
 */
public class InsufficientPrivilegeException extends DAOException{
    public InsufficientPrivilegeException(String msg){
        super(msg);
    }
}