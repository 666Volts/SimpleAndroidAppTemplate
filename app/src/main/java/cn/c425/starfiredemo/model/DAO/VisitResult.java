package cn.c425.starfiredemo.model.DAO;

/**
 * 存储数据库的访问结果的类。
 */
class VisitResult {
    VisitResult(String c){
        isOK_ = true;
        content_ = c;
    }

    /**
     * 返回访问是否成功。
     * @return 访问是否成功。
     */
    public final boolean isOK(){
        return isOK_;
    }

    /**
     * 返回访问的结果。
     * @return 访问的结果。
     */
    public final String getContent(){
        return content_;
    }

    /**
     * 访问是否成功。
     */
    private boolean isOK_;

    /**
     * 访问的结果。
     */
    private String content_;
}
