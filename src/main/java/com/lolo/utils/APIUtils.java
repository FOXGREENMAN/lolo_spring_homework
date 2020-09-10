package com.lolo.utils;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by admin on 2019/6/13.
 */
public class APIUtils {
    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(APIUtils.class);

    public final static String NUMBER_TYPE = "NUM";
    public final static String EMAIL_TYPE = "EMAIL";

    /**
     * 参数类型校验
     * @param param 入参map
     * @param type 参数类型常量 数字: NUM, email: EMAIL
     * @return 是否校验通过
     */
    public static boolean paramterCheck(String param, String type){
        boolean isPass = false;
        switch (type){
            case NUMBER_TYPE:
                isPass = parameterCheckByRegEx(param,"[0-9]\\d*");
                break;

            case EMAIL_TYPE:
                isPass = parameterCheckByRegEx(param, "[\\w!#$%&'*+/=?^_`{|}~-]+(?:\\.[\\w!#$%&'*+/=?^_`{|}~-]+)*@(?:[\\w](?:[\\w-]*[\\w])?\\.)+[\\w](?:[\\w-]*[\\w])?");
        }
        return isPass;
    }

    /**
     * 参数正则校验
     * @param param 请求参数
     * @param regEx 正则
     * @return 是否校验通过
     */
    public static boolean parameterCheckByRegEx(String param, String regEx){
        Matcher mat = Pattern.compile(regEx).matcher(param);
        return mat.matches();
    }

    /**
     * 参数是否为空校验
     * @param params 入参map
     * @param checkParams 参数名称列表 例如: "age","name","phoneNumber"...
     * @return 是否校验通过
     */
    public static boolean checkParamterNotNull( Map<String, Object> params, String ... checkParams){
        for (int i = 0; i < checkParams.length; i++) {
            if(!params.containsKey(checkParams[i])){
                logger.error("params not have [" + checkParams[i] + "]");
                return false;
            }
            if(StringUtils.isEmpty(params.get(checkParams[i]).toString())){
                logger.error("params [" + checkParams[i] + "] is null or empty");
                return false;
            }
        }
        return true;
    }

    /**
     * 参数是否为空校验
     * @param jsonParams 入参json
     * @param checkParams 参数名称列表 例如: "age","name","phoneNumber"...
     * @return 是否校验通过
     */
    public static boolean checkParamterNotNull(JSONObject jsonParams, String ... checkParams){

        if(jsonParams == null) return false;

        if(jsonParams.isEmpty()) return false;

        for (int i = 0; i < checkParams.length; i++) {
            if(!jsonParams.containsKey(checkParams[i])){
                logger.error("params not have [" + checkParams[i] + "]");
                return false;
            }
            if(StringUtils.isEmpty(jsonParams.get(checkParams[i]).toString())){
                logger.error("params [" + checkParams[i] + "] is null or empty");
                return false;
            }
        }
        return true;
    }

    /**
     * 校验UID白名单格式是否合格
     * @param userListStr 白名单UID列表, 1003,1004,1005;
     * @return 格式是否正确
     */
    public static boolean checkUserWhiteList(String userListStr){
        String resultStr = "";
        if(StringUtils.isEmpty(userListStr)){
            logger.info("白名单为空, 不进行校验,获取到输入白名单:{}",userListStr);
            return true;
        }
        // 验证白名单格式
        return Pattern.compile("^\\d+(,\\d+)*$").matcher(userListStr).matches();
    }
}
