package cn.c425.starfiredemo.model.entity;

/**
 * 创建、修改数据时使用无效数据引发的异常。
 */
public class InvalidDataException extends Exception {
    public InvalidDataException(String msg){
        super(msg);
    }
}
