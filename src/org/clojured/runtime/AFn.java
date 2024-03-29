/**
 *   Copyright (c) Rich Hickey. All rights reserved.
 *   The use and distribution terms for this software are covered by the
 *   Common Public License 1.0 (http://opensource.org/licenses/cpl.php)
 *   which can be found in the file CPL.TXT at the root of this distribution.
 *   By using this software in any fashion, you are agreeing to be bound by
 * 	 the terms of this license.
 *   You must not remove this notice, or any other, from this software.
 **/

/* rich Mar 25, 2006 4:05:37 PM */

package org.clojured.runtime;

public class AFn extends AMap implements IFn{

    public Object invoke(ThreadLocalData tld) throws Exception
    {
        return throwArity();
    }

    public Object invoke(ThreadLocalData tld, Object arg1) throws Exception
    {
        return throwArity();
    }

    public Object invoke(ThreadLocalData tld, Object arg1, Object arg2) throws Exception
    {
        return throwArity();
    }

    public Object invoke(ThreadLocalData tld, Object arg1, Object arg2, Object arg3) throws Exception
    {
        return throwArity();
    }

    public Object invoke(ThreadLocalData tld, Object arg1, Object arg2, Object arg3, Object arg4) throws Exception
    {
        return throwArity();
    }

    public Object invoke(ThreadLocalData tld, Object arg1, Object arg2, Object arg3, Object arg4, Object arg5)
            throws Exception
    {
        return throwArity();
    }

    public Object invoke(ThreadLocalData tld, Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Cons args)
            throws Exception
    {
        return throwArity();
    }

    public Object applyTo(ThreadLocalData tld, Cons arglist) throws Exception
    {
        switch(RT.boundedLength(arglist, 5))
        {
            case 0:
                return invoke(tld);
            case 1:
                return invoke(tld, arglist.first);
            case 2:
                return invoke(tld, arglist.first
                        , (arglist = arglist.rest).first
                );
            case 3:
                return invoke(tld, arglist.first
                        , (arglist = arglist.rest).first
                        , (arglist = arglist.rest).first
                );
            case 4:
                return invoke(tld, arglist.first
                        , (arglist = arglist.rest).first
                        , (arglist = arglist.rest).first
                        , (arglist = arglist.rest).first
                );
            case 5:
                return invoke(tld, arglist.first
                        , (arglist = arglist.rest).first
                        , (arglist = arglist.rest).first
                        , (arglist = arglist.rest).first
                        , (arglist = arglist.rest).first
                );
            default:
                return invoke(tld, arglist.first
                        , (arglist = arglist.rest).first
                        , (arglist = arglist.rest).first
                        , (arglist = arglist.rest).first
                        , (arglist = arglist.rest).first
                        , arglist.rest);
        }
    }

    protected Object throwArity()
    {
        throw new IllegalArgumentException("Wrong number of args passed");
    }
}
