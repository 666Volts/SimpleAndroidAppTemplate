package cn.c425.starfiredemo.model.DAO;

/**
 * 访问存储于服务器上的数据时出现的异常。原因为不存在指定的数据或已存在不应存在的数据。
 */
public class DataAccessException extends DAOException{
    public DataAccessException(String msg){
        super(msg);
    }
}
