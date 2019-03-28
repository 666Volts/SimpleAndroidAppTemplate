package cn.c425.starfiredemo.model.DAO;

import cn.c425.starfiredemo.Macro;

/**
 * 没有封装任何业务逻辑、用来访问存放在分布式数据库的类。只应该被DAO中的类访问、使用。
 *  * ID作为所有数据库的唯一主键。
 * 数据库存储格式：ID、name、ex。
 */
 public class DataAccessObject {
    /**
     * 将id对maxServer_取模即为该ID所在的数据库，从该数据库取得该ID对应的记录。失败则抛出异常。
     * @param id
     * @return
     */
    public static String getFromLiteral(long id) throws DataAccessException {
        VisitResult vr = new VisitResult("");
        if(!vr.isOK()){
            throw new DataAccessException(Macro.C425_E_CANT_FIND_SUCH_USER);
        }
        return vr.getContent();
    }

    /**
     * 对content进行哈希操作后对maxServer_取模，结果为该数据所在的数据库，从该数据库中获得key键对应的值。
     * 为content的记录。失败则抛出异常。
     * @param key 要查询的键
     * @param content 要查询的内容
     * @return
     */
    public static String getFromHash(String key, String content) throws DataAccessException {
        VisitResult vr = new VisitResult("");
        if(!vr.isOK()){
            throw new DataAccessException(Macro.C425_E_CANT_FIND_SUCH_USER);
        }
        return vr.getContent();
    }

    /**
     * 查询所有的数据库中，key键对应的值为content的记录。失败则抛出异常。
     * @param key
     * @param content
     * @return
     */
    public static String getFromAll(String key, String content) throws DataAccessException {
        VisitResult vr = new VisitResult("");
        if(!vr.isOK()){
            throw new DataAccessException(Macro.C425_E_CANT_FIND_SUCH_USER);
        }
        return vr.getContent();
    }

    /**
     * 根据id查找数据库，从该数据库中获得该id对应的记录，请求修改其中key键的值为content。失败则抛出异常。
     * @param id
     * @param key
     * @param content
     * @return
     */
    public static String updateOneFromLiteral(long id, String key, String content) throws DataAccessException {
        VisitResult vr = new VisitResult("");
        if(!vr.isOK()){
            throw new DataAccessException(Macro.C425_E_CANT_FIND_SUCH_USER);
        }
        return vr.getContent();
    }

    /**
     * 根据id查找数据库，从该数据库中获得该id对应的记录，请求修改"name"键的值为name,"ex"键的值为ex。
     * 失败则抛出异常。
     * @param id
     * @param name
     * @param ex
     * @return
     */
    public static String updateFromLiteral(long id, String name, String ex) throws DataAccessException {
        VisitResult vr = new VisitResult("");
        if(!vr.isOK()){
            throw new DataAccessException(Macro.C425_E_CANT_FIND_SUCH_USER);
        }
        return vr.getContent();
    }

    /**
     * 根据id查找数据库，请求在该数据库中插入1条记录。失败则抛出异常。
     * @param id
     * @param name
     * @param ex
     * @return
     */
    public static String insertOne(long id, String name, String ex) throws DataAccessException {
        VisitResult vr = new VisitResult("");
        if(!vr.isOK()){
            throw new DataAccessException(Macro.C425_E_ALREADY_EXIST_SUCH_ID);
        }
        return vr.getContent();
    }

    /**
     * 采用了水平切分的最大数据库索引，用来做取模的大数。绝对不能在代码中被更改。
     */
    private static final long maxServer_ = 1073741824;
}
