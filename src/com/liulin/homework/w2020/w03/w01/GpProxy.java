package com.liulin.homework.w2020.w03.w01;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.awt.print.PrinterAbortException;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Create by DbL on 2020/3/3
 */
public class GpProxy {
    public static final String ln = "\r\n";
    public static Object newProxyInstance(GpClassLoader loader,
                                          Class<?>[] interfaces,
                                          GpInvocationHandler h){

        try {
            // 1.动态生成原码.java文件
            String src = generateSrc(interfaces);
            //2.Java文件输出到磁盘，保存为文件$Proxy0.java
            String filePath = GpProxy.class.getResource("").getPath();
            File f = new File(filePath+"$Proxy0.java");
            FileWriter fw = new FileWriter(f);
            fw.write(src);
            fw.flush();
            fw.close();
            // 3.把.java文件编译成$Proxy0.class文件
            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager manager = compiler.getStandardFileManager(null,null,null);
            Iterable iterable = manager.getJavaFileObjects(f);

            JavaCompiler.CompilationTask task = compiler.getTask(null,manager,null,null,null,iterable);
            task.call();
            manager.close();
            //4.把生成的.class文件加载到JVM中
            Class proxyClass = loader.findClass("$Proxy0");
            Constructor c = proxyClass.getConstructor(GpInvocationHandler.class);
            //5.返回新的代理对象
            return c.newInstance(h);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  null;
    }

    private static String generateSrc(Class<?>[] interfaces) {
        StringBuffer sb = new StringBuffer();
        sb.append("package  com.liulin.homework.w2020.w03.w01;package com.liulin.homework.w2020.w03.w01;"+ln);
        sb.append("import com.liulin.study.designpatterns.e_proxymode.dynamicproxy.jdkproxy.IPerson;"+ln);
        sb.append("import java.lang.reflect.*;"+ln);
        sb.append("public final class $Proxy0 implements "+interfaces[0].getName()+"{"+ln);
        sb.append("GpInvocationHandler h;"+ln);
        sb.append("public $Proxy0(GpInvocationHandler h){ "+ln);
            sb.append("this.h = h ;"+ln);
        sb.append("}"+ln);

        for (Method m : interfaces[0].getMethods()) {
            Class<?> [] params = m.getParameterTypes();

            StringBuilder paramNames = new StringBuilder();
            StringBuilder paramValues = new StringBuilder();
            StringBuilder paramClasses = new StringBuilder();
            for (int i = 0; i <params.length ; i++) {
                Class clazz = params[i];
                String type = clazz.getName();
                paramNames.append(type+" "+ "arg"+i);
                paramValues.append("arg"+i);
                paramClasses.append(clazz.getName()+".class");
                if(i > 0 && i < params.length-1){
                    paramNames.append(",");
                    paramClasses.append(",");
                    paramValues.append(",");
                }
            }
            sb.append("public "+ m.getReturnType().getName()+ " "+ m.getName()+"("+paramNames.toString()+"){"+ln);
                sb.append("try{ " + ln);
                sb.append(" Method m = "+interfaces[0].getName()+".class.getMethod(\""+m.getName()+"\",new Class[]{"+paramClasses.toString() +"});"+ln);
                sb.append("this.h.invoke(this,m,new Object[]{"+paramValues +"});"+ln);
                sb.append("return; "+ln);
                sb.append("}"+ ln);
                sb.append("catch(Error _ex) { }" +ln);
                sb.append("catch(Throwable throwable)"+ ln);
                sb.append("{"+ln);
                sb.append(" throw new UndeclaredThrowableException(throwable);" +ln);
                sb.append("}"+ln);
            sb.append("}"+ln);
        }

        sb.append("}"+ln);
        return sb.toString();
    }
}
