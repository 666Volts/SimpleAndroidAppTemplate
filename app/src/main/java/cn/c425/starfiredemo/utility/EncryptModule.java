package cn.c425.starfiredemo.utility;

/**
 * 加密模块。
 */
public class EncryptModule {
    /**
     * 使用慢哈希和SHA256对给定内容进行不可逆的加密。用于传输密码等敏感数据。
     * @param content
     * @return
     */
    public String encryptWithSlowHashSHA256(String content){
        return "";
    }

    /**
     * 使用盐、慢哈希、SHA256对给定内容进行不可逆的加密。
     * @param content
     * @return
     */
    public String encryptWithSaltSlowHashSHA256(String content){
        return "";
    }

    private String slowHash(String content){
        return "";
    }

    private String runSHA256(String content){
        return "";
    }
}
