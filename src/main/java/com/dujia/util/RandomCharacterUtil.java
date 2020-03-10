package com.dujia.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

/**
 * @Description: 生成随机字符串，订单号生成，验证码生成等
 */
public class RandomCharacterUtil {

    /**
     *  通过给定长度(stringLength)、数据类型(stringType)指定生成需要的字符串：
     *  stringType of type：A，B，C
     *  @return A string of a specified length.
     */
    public String CharacterRandomArray(Integer stringLength, String stringType){
        String nonceStr = "";
        String [] stringArray = new String[]{"1","2","3","4","5","6","7","8","9","0","Q","q","W","w","E","e","R","r","T","t","Y","y","U","u","I","i","O","o","P","p","A","a","S","s","D","d","F","f","G","g","H","h","J","j","K","k","L","l","Z","z","X","x","C","c","V","v","B","b","N","n","M","m"};

        if("YZM".equals(stringType)){
            String str = Math.round(Math.random()*100000)+"";
            nonceStr = str;
            System.out.println(nonceStr);
        }
        /** 固定随机字符生成： */
        if("RANDOM".equals(stringType)){
            for(int i = 1; i <= stringLength; i++){
                nonceStr += stringArray[new Random().nextInt(stringArray.length)];
            }
        }
        /**
         * Order key: 参数类型，ORDERKEY，订单号。
         * 生成规则：当前时间的时分秒+UUID后4位数字+5位随机数
         * */
        if("ORDERKEY".equals(stringType)){
            /** 第一部分：当前时间时分秒 */
            Date nowTime = new Date();
            String str1 = new SimpleDateFormat("hh:MM:sss").format(new Date());
            str1 = str1.replace(":","");
            /** 第二部分：UUID后4位 */
            String uuid = UUID.randomUUID().toString();
            String str2 = "";
            if(uuid != null && !"".equals(uuid)){
                for(int i = 0; i < uuid.length(); i++){
                    if(uuid.charAt(i) >= 48 && uuid.charAt(i) <= 57){
                        str2+=uuid.charAt(i);
                    }
                }
            }
            str2 = str2.substring(str2.length()-4,str2.length());
            /** 第三部分：随机数 */
            String str3 = Math.round(Math.random()*100000)+"";
            //System.out.println(">>>>:"+str1+"-"+str2+"-"+str3);
            nonceStr = str1+str2+str3;
        }

        /**
         * 生成规则：当前时间的时分秒随机数
         * */
        if("HOMESTAY".equals(stringType)){
            /** 第一部分：当前时间时分秒 */
            Date nowTime = new Date();
            String str1 = new SimpleDateFormat("hh:MM:ss").format(new Date());
            str1 = str1.replace(":","");
            nonceStr = str1;
        }
        return nonceStr;
    }



}
