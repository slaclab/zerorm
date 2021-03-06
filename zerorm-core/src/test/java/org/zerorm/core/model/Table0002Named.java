
package org.zerorm.core.model;

import java.sql.Timestamp;
import org.zerorm.core.Column;
import org.zerorm.core.Table;
import org.zerorm.core.interfaces.Schema;

/**
 *
 * @author bvan
 */
@Schema(name="Table0002")
public class Table0002Named extends Table {
    @Schema(name="table0001_pk") public Column<Long> table0001_pkNamed;
    @Schema(name="createdate") public Column<Timestamp> createdateNamed;

    public Table0002Named(){
        super();
    }
}
