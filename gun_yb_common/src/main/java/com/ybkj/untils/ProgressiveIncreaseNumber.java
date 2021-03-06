package com.ybkj.untils;

import org.springframework.stereotype.Component;

import java.util.Random;

/**
 *@Description:  功能描述（递增数）
 *@Author:       刘家义
 *@CreateDate:   2018/7/31 11:35
 *@UpdateUser:   刘家义
 *@UpdateDate:   2018/7/31 11:35
 *@UpdateRemark: 修改内容
 *@Version:      1.0
*/
@SuppressWarnings("all")
@Component
public class ProgressiveIncreaseNumber {

    private static final ProgressiveIncreaseNumber instance = new ProgressiveIncreaseNumber();

    private ProgressiveIncreaseNumber() {}

    public static ProgressiveIncreaseNumber getInstance() {
        return instance;
    }

    public static synchronized String getRandomNumber() {
        Random rand = new Random();
        StringBuffer sb=new StringBuffer();
        for (int i=1;i<=4;i++){
            int randNum = rand.nextInt(9)+1;
            String num=randNum+"";
            sb=sb.append(num);
        }
        String random=String.valueOf(sb);
        return random;
    }

    public static void main(String[] args) {
        System.out.println(getRandomNumber());
    }
    /**
     * 0000-9999:递增
     * @param num
     * @return
     */
    public static String getNumber(int num)
    {
        num++;
        String result = "";
        switch ((num+"").length()) {
            case 1:
                result = "000" + num;
                break;
            case 2:
                result = "00" + num;
                break;
            case 3:
                result = "0" + num;
                break;
            case 4:
                result = "" + num;
                break;
// 此处代表编号已经超过了9999，从0重新开始
            default:
                result = "0000";
                break;
        }
        return result;
    }
}
