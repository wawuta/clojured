/**
 *   Copyright (c) Rich Hickey. All rights reserved.
 *   The use and distribution terms for this software are covered by the
 *   Common Public License 1.0 (http://opensource.org/licenses/cpl.php)
 *   which can be found in the file CPL.TXT at the root of this distribution.
 *   By using this software in any fashion, you are agreeing to be bound by
 * 	 the terms of this license.
 *   You must not remove this notice, or any other, from this software.
 **/

/* rich Mar 25, 2006 3:44:58 PM */

package org.clojured.runtime;

import java.util.IdentityHashMap;

public class AMap{

    IdentityHashMap attrs;
    public static final int INITIAL_SIZE = 7;

    public Object put(Symbol key, Object val)
    {
        if(attrs == null)
            attrs = new IdentityHashMap(INITIAL_SIZE);
        attrs.put(key, val);
        return val;
    }

    public Object get(Symbol key)
    {
        if(attrs == null)
            return null;
        return attrs.get(key);
    }
}
