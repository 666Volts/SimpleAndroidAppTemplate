package cn.c425.starfiredemo.controller;

import cn.c425.starfiredemo.model.service.*;

/**
 * APP主逻辑辅助类。用于进行APP的主逻辑。
 */
public class APPMainLogicHelper {

    //////
    // 用户的全局操作。
    //////

    /**
     * 登录操作。
     * @param id
     * @param pw 密码明文。
     * @return 登录是否成功。
     */
    public static Boolean signIn(long id, String pw){
        return false;
    }

    /**
     * 注册操作。已经完成了邮箱验证码验证。
     * @param id
     * @param pn 绑定的手机号。
     * @param un 注册的用户名。
     * @param pw 密码明文。
     * @return
     */
    public static Boolean signUp(long id, long pn, String un, String pw){

        return false;
    }

    /**
     * 退出当前用户的登录。
     */
    public static void exit(){

    }

    /**
     * 当前用户。
     */
    public static User currentUser_;

    /**
     * 加载用户配置。如果之前没有则创建默认并保存。TODO : 载入到userSettings。
     */
    public static void loadSettings(long id){

    }

    //////
    // 程序行为。
    //////

    ////////////
    ///// ---- 等待服务端响应。
    ////////////

    /**
     * 绘制下一次等待的UI。如果没有处于等待的状态则进入等待状态直到通知等待结束。等待将在用户向服务器发
     * 送请求时发生，直到收到服务器返回的数据。
     */
    public static void waitRender(){
        if(isWaiting_){

        }else{
            beginWait();
        }
    }

    /**
     * 结束等待。
     */
    public static void endWait(){
        isWaiting_ = false;

    }

    /**
     * 开始等待。
     */
    private static void beginWait(){
        isWaiting_ = true;

    }

    /**
     * 是否在等待。不要在beginWait和endWait之外的地方修改。
     */
    private static boolean isWaiting_;

    ////////////
    ///// ---- 提醒。
    ////////////

    /**
     * 播放设置的铃声。
     */
    public static void ring(){

    }

    /**
     * 根据设置震动。
     */
    public static void vibrate(){

    }

    //////
    // 通信相关。
    //////

    /**
     * 用于验证用户是否登录，以避免恶意发送的数据包。用户退出登陆时服务端上该用户的token改变。用户发送的
     * token与服务端的不一致时任何操作均会视为权限不足。
     */
    private String token_;
}
