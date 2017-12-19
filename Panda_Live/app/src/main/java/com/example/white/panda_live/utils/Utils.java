package com.example.white.panda_live.utils;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * Created by 卢本伟·White on 2017/12/18.
 */
public class Utils {

        private static Class<?> oClass;
        private static Type superclass;
        private static Type[] arguments;

        public static  <T>T  getT(Object o, int i){


            try {
                oClass = o.getClass();
                superclass = oClass.getGenericSuperclass();
                arguments = ((ParameterizedType) superclass).getActualTypeArguments();
                Type t=arguments[i];
                return ((Class<T>)t).newInstance();


            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }

            return null;
        }
}
