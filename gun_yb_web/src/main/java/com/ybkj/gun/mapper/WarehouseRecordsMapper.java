package com.ybkj.gun.mapper;

import com.ybkj.gun.model.WarehouseRecords;
import com.ybkj.gun.model.WarehouseRecordsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WarehouseRecordsMapper {
    long countByExample(WarehouseRecordsExample example);

    int deleteByExample(WarehouseRecordsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WarehouseRecords record);

    int insertSelective(WarehouseRecords record);

    List<WarehouseRecords> selectByExample(WarehouseRecordsExample example);

    WarehouseRecords selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WarehouseRecords record, @Param("example") WarehouseRecordsExample example);

    int updateByExample(@Param("record") WarehouseRecords record, @Param("example") WarehouseRecordsExample example);

    int updateByPrimaryKeySelective(WarehouseRecords record);

    int updateByPrimaryKey(WarehouseRecords record);
}