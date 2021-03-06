package io.renren.common.utils;


import org.apache.commons.lang.StringUtils;

import java.util.Objects;

/**
 * @Description Object 对象工具类
 * @Author haijun.zhang
 * @Date 2019-06-02 22:55:33
 **/
public class ObjectTools {

    /**
     * 调用Object对象的 toString 方法，返回字符串
     * @param o 对象
     * @return 对象toString 字符串
     */
    public static String toStrCut(Object o,Integer cutNum){
        String oStr = toStr(o);
        if(ObjectTools.isNotNull(oStr) && oStr.toCharArray().length>cutNum){
            return oStr.substring(0,cutNum);
        }
        return oStr;
    }

    /**
     * 调用Object对象的 toString 方法，返回字符串
     * @param o 对象
     * @return 对象toString 字符串
     */
    public static String toStr(Object o){
        String oStr = null;
        if(ObjectTools.isNotNull(o)){
            oStr = o.toString();
        }
        return oStr;
    }

    /**
     * 判断 Long 类型参数是否为空或0，
     * @param a 参数
     * @return 如果为空或0返回 false，如果不为空或0返回true
     */
    public static Boolean isNotNullAndZero(Long a){
        return !isNullOrZero(a);
    }

    /**
     * 判断 Integer 类型参数是否为空或0，
     * @param a 参数
     * @return 如果为空或0返回 false，如果不为空或0返回true
     */
    public static Boolean isNotNullAndZero(Integer a){
        return !isNullOrZero(a);
    }

    /**
     * 判断 Long 类型参数是否为空或0，
     * @param a 参数
     * @return 如果为空或0返回 true，如果不为空或0返回false
     */
    public static Boolean isNullOrZero(Long a){
        if(isNull(a) || a == 0){
            return Boolean.TRUE;
        }else {
            return Boolean.FALSE;
        }
    }

    /**
     * 判断 Integer 类型参数是否为空或0，
     * @param a 参数
     * @return 如果为空或0返回 true，如果不为空或0返回false
     */
    public static Boolean isNullOrZero(Integer a){
        if(isNull(a) || a == 0){
            return Boolean.TRUE;
        }else {
            return Boolean.FALSE;
        }
    }

    /**
     * 判断对象是否为空
     * @param o 对象
     * @return TRUE-NULL；TRUE-NOT NULL
     */
    public static Boolean isNull(Object o){
        return o == null;
    }

    /**
     * 判断对象是否为空
     * @param o 对象
     * @return TRUE-NULL；TRUE-NOT NULL
     */
    public static Boolean isBlank(String o){
        return StringUtils.isBlank(o);
    }

    /**
     * 判断对象是否为空
     * @param o 对象
     * @return TRUE-NULL；TRUE-NOT NULL
     */
    public static Boolean isNotBlank(String o){
        return StringUtils.isNotBlank(o);
    }

    /**
     * 判断对象是否为空
     * @param o 对象
     * @return TRUE-NOT NULL；TRUE-NULL
     */
    public static Boolean isNotNull(Object o){
        return !ObjectTools.isNull(o);
    }

    /**
     * 判断两个对象是否相等，主要用户 Byte、Integer 包装类型的 equals 比较
     * 如果其中有一个值为 null 返回false
     * @param a 前一个对象
     * @param b 后一个对象
     * @return 比对结果，相等 true，不相等 false
     */
    public static Boolean equals(Object a, Object b){
        return Objects.equals(a,b);
    }

    /**
     * 判断两个对象是否不相等，主要用户 Byte、Integer 包装类型的 equals 比较
     * 如果其中有一个值为 null 返回false
     * @param a 前一个对象
     * @param b 后一个对象
     * @return 比对结果,不相等 true，相等 false
     */
    public static Boolean notEquals(Object a, Object b){
        return !ObjectTools.equals(a,b);
    }


    /**
     * 将Object转为String
     *
     * @param object 对象
     * @return String
     */
    public static String toString(Object object) {
        if (object == null) {
            return null;
        }
        return object.toString();
    }



    /**
     * 判断目标对象target是否equals 参数args中的一个，只要其中有一个相等，返回true，都不相等返回false
     * @param target 目标对象
     * @param args 多个参数
     * @return true：target in (a,b) false: target not in (a,b)
     */
    public static Boolean in(Object target, Object... args){
        for (Object arg : args) {
            if(Objects.equals(target,arg)){
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    /**
     * 判断目标对象target是否不等于a或b，只有都不相等相等，返回true，其中有一个相等返回false
     * @param target 目标对象
     * @param args 多参数
     * @return true：target not in (a,b) false: target in (a,b)
     */
    public static Boolean notIn(Object target, Object... args){
        return !in(target,args);
    }

    /**
     * 将 Object 类型 转为 Byte
     *
     * @param object
     * @return Byte
     */
    public static Byte toByte(Object object) {
        if (object == null) {
            return null;
        }
        String str = toString(object);
        if (!StringUtils.isNumeric(str)) {
            return null;
        }
        return Byte.valueOf(str);
    }


    /**
     * 将 Object 类型 转为 Integer
     *
     * @param object
     * @return Byte
     */
    public static Integer toInteger(Object object) {
        if (object == null) {
            return null;
        }
        String str = toString(object);
        if (!StringUtils.isNumeric(str)) {
            return null;
        }
        return Integer.valueOf(str);
    }


}
