package  com.liulin.homework.w2020.w03.w01;
import com.liulin.study.designpatterns.e_proxymode.dynamicproxy.jdkproxy.IPerson;
import java.lang.reflect.*;
public final class $Proxy0 implements com.liulin.homework.w2020.w03.w01.IPerson{
    GpInvocationHandler h;
    public $Proxy0(GpInvocationHandler h){
        this.h = h ;
    }
    public void buyInsure(double arg0){
        try{
            Method m = com.liulin.homework.w2020.w03.w01.IPerson.class.getMethod("buyInsure",new Class[]{double.class});
            this.h.invoke(this,m,new Object[]{arg0});
            return;
        }
        catch(Error _ex) { }
        catch(Throwable throwable)
        {
            throw new UndeclaredThrowableException(throwable);
        }
    }
    public void findLove(){
        try{
            Method m = com.liulin.homework.w2020.w03.w01.IPerson.class.getMethod("findLove",new Class[]{});
            this.h.invoke(this,m,new Object[]{});
            return;
        }
        catch(Error _ex) { }
        catch(Throwable throwable)
        {
            throw new UndeclaredThrowableException(throwable);
        }
    }
}
