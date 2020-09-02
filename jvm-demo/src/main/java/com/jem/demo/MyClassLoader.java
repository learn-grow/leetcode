package com.jem.demo;

import java.io.*;

/**
 * @author: lisy
 * @version: : MyClassLoader , v0.1 2020年08月31日 2:31 下午
 * @remark: the MyClassLoader is 自定义类加载器，打破双亲委派模型
 */
public class MyClassLoader extends ClassLoader {

    private String path = "./code";

    /**
     * 类加载器名称
     */
    private String name;

    /**
     * 文件类型
     */
    private String fileType = ".class";

    public MyClassLoader(String name){
        super(); //如果不重载父类的构造方法,可以去打破双亲委派模型
        this.name = name;
    }

    public MyClassLoader(ClassLoader parent , String name){
        super(parent);
        this.name = name;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        byte[] bytes = loadClassData(name);
        return defineClass(name , bytes , 0 , bytes.length);
    }

    private byte[] loadClassData(String name) {
        byte[] data = null;
        InputStream in = null;
        name = name.replace("." , "/");
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        try{
            in = new FileInputStream(new File(path + name + fileType));
            int len = 0;
            while (-1 != (len = in.read())){
                out.write(len);
            }
            data = out.toByteArray();
        }catch (FileNotFoundException e){
            e.fillInStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                in.close();
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return data;
    }

    public String getPath(){
        return path;
    }

    public void setPath(String path){
        this.path = path;
    }

    @Override
    public String toString() {
        return "MyClassLoader{" +
                "path='" + path + '\'' +
                "} " + super.toString();
    }
}
