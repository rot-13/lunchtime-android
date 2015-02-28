package com.iic.lunchtime.dal;

import com.j256.ormlite.dao.BaseDaoImpl;
import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.stmt.QueryBuilder;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.DatabaseTableConfig;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by ifeins on 2/28/15.
 */
public class BaseCustomDAO<T, ID> extends BaseDaoImpl<T, ID> {
  protected BaseCustomDAO(Class<T> dataClass) throws SQLException {
    super(dataClass);
  }

  protected BaseCustomDAO(ConnectionSource connectionSource, Class<T> dataClass) throws SQLException {
    super(connectionSource, dataClass);
  }

  protected BaseCustomDAO(ConnectionSource connectionSource, DatabaseTableConfig<T> tableConfig) throws SQLException {
    super(connectionSource, tableConfig);
  }

  @Override
  public QueryBuilder<T, ID> queryBuilder() {
    return super.queryBuilder();
  }

  @Override
  public List<T> queryForEq(String fieldName, Object value) {
    try {
      return super.queryForEq(fieldName, value);
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public int create(T data) {
    try {
      return super.create(data);
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public <FT> ForeignCollection<FT> getEmptyForeignCollection(String fieldName) {
    try {
      return super.getEmptyForeignCollection(fieldName);
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public T queryForId(ID id) {
    try {
      return super.queryForId(id);
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }
}
