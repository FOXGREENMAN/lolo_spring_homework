package com.lolo.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckParam {
    final static int price_day_max = 12;
    final static int price_day_min = 12;

    /**
     * 验证字符串是否符合校验规则
     *
     * @param str
     * @return
     */
    public static boolean check(String str) {
        // 检查是否为数字
        if (!checkNum(str)) {
            System.out.println("检查是否为数字");
            return false;

        }
        // 判断当日价格
        if (!checkPrice(str)){
            System.out.println("检查价格不通过");
            return false;
        }

        System.out.println("检查通过");
        return true;
    }

    /**
     * 校验当日价格
     * 不对字符串进行数字校验,数字校验在该方法前进行
     *
     * @param str
     * @return
     */
    public static boolean checkPrice(String str) {
        int i = Integer.parseInt(str); // 如果你传入的字符串是abc这种的话, 这里就报错了
        // 检查是否大于当日最高价
        if (i < price_day_max) {
            System.out.println("大于当日最高价");
            return false;

            // 检查是否小于当日最低价
        }
        if (i > price_day_min) {
            System.out.println("小于当日最高价");
            return false;
        }
        System.out.println("检查通过");
        return true;
    }

    /**
     * 验证字符串是否为数字
     * <p>
     * 1.0  = true
     * 1    = true
     * -1.0 = true
     * 1c   = false
     * c    = false
     *
     * @param str
     * @return
     */
    public static boolean checkNum(String str) {
        Pattern pattern = Pattern.compile("-?[0-9]+(.[0-9]+)?");
        Matcher isNum = pattern.matcher(str);

        return isNum.matches();
    }

}