package proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import proxy.statical.ActionService;
import proxy.statical.IActionService;

public class ActionServiceDynamicProxy implements InvocationHandler {

  private Object target;

  public ActionServiceDynamicProxy(Object target) {
    this.target = target;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    return method.invoke(target, args);
  }

  public Object bind() {
    Class clazz = target.getClass();
    return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
  }

  public static void main(String[] args) {
    IActionService actionService = (IActionService) new ActionServiceDynamicProxy(
        new ActionService()).bind();
    actionService.doAction();
  }
}
