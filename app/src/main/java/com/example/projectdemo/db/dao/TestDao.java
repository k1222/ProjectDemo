package com.example.projectdemo.db.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.example.projectdemo.db.entity.TestEntity;

import java.util.List;

/**
 * @author admin
 * @Package: com.example.projectdemo.db.dao
 * @ClassName:
 * @description:
 * @date :2021/8/12 4:35 下午
 */
@Dao
public interface TestDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void add(TestEntity... entities);

    @Delete
    void delete(TestEntity... entities);

    @Update
    void update(TestEntity... entities);

    @Query("SELECT * FROM Test  WHERE account =:account ")
    List<TestEntity> getData(String account);

    @Query("DELETE FROM Test  WHERE account =:account ")
    void deleteData(String account);

    @Query("SELECT * FROM Test  WHERE account =:account ")
    LiveData<List<TestEntity>> getDataLive(String account);

}
