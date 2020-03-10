package com.dujia.config;

import com.google.common.collect.Lists;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BaseController {
    public Map<String, Object> resultMap = new HashMap<String,Object>();

    public enum weekArray {星期一, 星期二, 星期三, 星期四, 星期五, 星期六, 星期七}

    public static List<Object> weekList = Lists.newArrayList("星期一","星期二","星期三","星期四","星期五","星期六","星期日");

    public static Map<String,Object> getFiledInfo(Object obj) {
        Map<String,Object> parameters = new HashMap<>();
        Field[] fields = obj.getClass().getDeclaredFields();
        for (Field field : fields) {
            parameters.put(field.getName(), getFieldValueByName(field.getName(), obj));
        }
        return parameters;
    }


    public static  Object getFieldValueByName(String fieldName,Object o) {
        try {
            String firstLetter = fieldName.substring(0, 1).toUpperCase();
            String getter = "get" + firstLetter + fieldName.substring(1);
            Method method = o.getClass().getMethod(getter, new Class[] {});
            Object value = method.invoke(o, new Object[] {});
            return value;
        } catch (Exception e) {
            return null;
        }
    }
}
