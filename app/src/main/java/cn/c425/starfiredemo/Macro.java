package cn.c425.starfiredemo;

public final class Macro {
    public static final int NAME_MAX_LENGTH = 16;

    public static final String C425_E_CANT_FIND_SUCH_USER = "找不到对应的用户。";
    public static final String C425_E_ALREADY_EXIST_SUCH_ID = "已经存在拥有该ID的用户了。";
    public static final String C425_E_INVALID_INFO = "无效信息。";
    public static final String C425_E_BE_REFUSED = "请求被拒绝。";
    public static final String C425_E_CANT_FIND_SUCH_CONTENT = "找不到对应的内容。";

    /**
     * 接收到的数据类型。
     */
    public enum RECEIVED_DATA_TYPE {
        RECEIVED_DATA_USER_DATA, RECEIVED_DATA_TASK_DATA, RECEIVED_DATA_CAPTCHA
    }
}
