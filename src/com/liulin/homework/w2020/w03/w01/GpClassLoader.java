package com.liulin.homework.w2020.w03.w01;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;

/**
 * Create by DbL on 2020/3/3
 */
public class GpClassLoader extends  ClassLoader{
    private File classPathFile;
    public GpClassLoader(){
        String classPath = GpClassLoader.class.getResource("").getPath();
        this.classPathFile = new File(classPath);
    }
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        String className = GpClassLoader.class.getPackage().getName()+"."+name;
        if(classPathFile != null){
            File classFile = new File(classPathFile,name.replace("\\.","/")+".class");
            if (classFile.exists()) {
                FileInputStream in = null;
                ByteArrayOutputStream out = null;
                try{
                    in = new FileInputStream(classFile);
                    out = new ByteArrayOutputStream();
                    byte [] buff = new byte[1024];
                    int len;
                    while ((len=in.read(buff))!=-1){
                        out.write(buff,0,len);
                    }
                    return defineClass(className,out.toByteArray(),0,out.size());
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
}
