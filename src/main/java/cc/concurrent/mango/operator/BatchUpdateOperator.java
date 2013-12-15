package cc.concurrent.mango.operator;

import cc.concurrent.mango.logging.InternalLogger;
import cc.concurrent.mango.logging.InternalLoggerFactory;
import cc.concurrent.mango.runtime.ParsedSql;
import com.google.common.base.Objects;
import com.google.common.collect.Lists;

import javax.sql.DataSource;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

import static com.google.common.base.Preconditions.checkArgument;

/**
 * @author ash
 */
public class BatchUpdateOperator extends AbstractOperator {

    private final static InternalLogger logger = InternalLoggerFactory.getInstance(BatchUpdateOperator.class);

    protected BatchUpdateOperator(Type returnType) {
        super(returnType);
    }

    @Override
    public Object execute(DataSource ds, ParsedSql... parsedSqls) {
        checkArgument(parsedSqls.length > 0);
        String sql = null;
        List<Object[]> batchArgs = Lists.newArrayList();
        for (ParsedSql parsedSql : parsedSqls) {
            if (sql == null) {
                sql = parsedSql.getSql();
            }
            batchArgs.add(parsedSql.getArgs());
        }
        if (logger.isDebugEnabled()) {
            List<String> str = Lists.newArrayList();
            for (Object[] args : batchArgs) {
                str.add(Arrays.toString(args));
            }
            logger.debug(Objects.toStringHelper("BatchUpdateOperator").add("sql", sql).add("batchArgs", str).toString());
        }
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

}
