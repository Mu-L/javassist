/*
 * Javassist, a Java-bytecode translator toolkit.
 * Copyright (C) 1999-2003 Shigeru Chiba. All Rights Reserved.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 */
package javassist.compiler;

final class KeywordTable extends java.util.HashMap {
    public KeywordTable() { super(); }

    public int lookup(String name) {
        Object found = get(name);
        if (found == null)
            return -1;
        else
            return ((Integer)found).intValue();
    }

    public void append(String name, int t) {
        put(name, new Integer(t));
    }
}