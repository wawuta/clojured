package org.clojured.runtime;

import java.util.IdentityHashMap;

/**
 * Created with IntelliJ IDEA.
 * User: fd
 * Date: 14-6-27
 * Time: 上午12:22
 * To change this template use File | Settings | File Templates.
 */
public class ThreadLocalData {
    final public static int MULTIPLE_VALUES_LIMIT = 20;
    public int mvCount = 0;
    public Object[] mvArray = new Object[MULTIPLE_VALUES_LIMIT];

    IdentityHashMap dynamicBindings = new IdentityHashMap();

    final public Cons getDynamicBinding(Symbol sym)
    {
        return (Cons) dynamicBindings.get(sym);
    }
}
