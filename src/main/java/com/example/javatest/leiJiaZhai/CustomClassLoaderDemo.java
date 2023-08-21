package com.example.javatest.leiJiaZhai;

import java.io.IOException;
import java.io.InputStream;

public class CustomClassLoaderDemo extends ClassLoader{


    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        ClassLoader myClassLoader = new ConsumerClassLoader();
        Object obj = myClassLoader.loadClass("com.example.javatest.leiJiaZhai.CustomClassLoaderDemo").newInstance();
        ClassLoader classLoader = obj.getClass().getClassLoader();
        // BootStrapClassLoader在Java中不存在的，因此会是null
        while (null != classLoader) {
            System.out.println(classLoader);
            classLoader = classLoader.getParent();
        }

    }
}


class ConsumerClassLoader extends ClassLoader {
    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        try {
            String classFile = name.substring(name.lastIndexOf(".") + 1) + ".class";
            InputStream in = getClass().getResourceAsStream(classFile);
            if (null == in) {
                return super.loadClass(name);
            }
            byte[] bytes = new byte[in.available()];
            in.read(bytes);
            return defineClass(name, bytes, 0, bytes.length);
        } catch (IOException e) {
            throw new ClassNotFoundException(name);
        }
    }
}

