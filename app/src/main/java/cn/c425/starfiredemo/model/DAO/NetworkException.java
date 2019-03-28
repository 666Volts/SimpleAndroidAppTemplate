package cn.c425.starfiredemo.model.DAO;

/**
 * 网络异常。可能由网络原因或请求超时引起。
 */
public class NetworkException extends DAOException {
    public NetworkException(String msg){
    super(msg);
    }
}
