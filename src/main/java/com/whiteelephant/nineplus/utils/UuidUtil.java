package com.whiteelephant.nineplus.utils;

import java.util.UUID;

/**
 * Created by gordon on 16/9/5.
 */
public class UuidUtil {
    public static String generateId() {
        String s = UUID.randomUUID().toString();
        //去掉“-”符号
        return s.substring(0, 8) + s.substring(9, 13) + s.substring(14, 18) + s.substring(19, 23) + s.substring(24);
    }
}
