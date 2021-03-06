
package org.zerorm.core.interfaces;

import org.zerorm.core.format.AbstractSQLFormatter;

/**
 * Formattable for compiling sql
 * @author bvan
 */
public interface Formattable {
    public String formatted();
    public String formatted(AbstractSQLFormatter formatter);
}
