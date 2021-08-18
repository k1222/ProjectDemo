package com.example.projectdemo.db.repo;

import androidx.lifecycle.LiveData;

import com.example.projectdemo.db.AppDatabase;
import com.example.projectdemo.db.entity.TestEntity;

import java.util.List;

/**
 * @author admin
 * @Package: com.example.projectdemo.db.repo
 * @ClassName:
 * @description:
 * @date :2021/8/12 5:27 下午
 */
public class TestRepo {
    private static TestRepo sInstance;

    private final AppDatabase mDatabase;

    private TestRepo(final AppDatabase database) {
        mDatabase = database;
    }

    public static TestRepo getInstance() {
        if (sInstance == null) {
            synchronized (TestRepo.class) {
                if (sInstance == null) {
                    AppDatabase database = AppDatabase.getInstance();
                    sInstance = new TestRepo(database);
                }
            }
        }
        return sInstance;
    }
    public void addResults(TestEntity entity) {
        mDatabase.testDao().add(entity);
    }

    public void addResults(List<TestEntity> entities) {
        int size = entities.size();
        TestEntity[] amHeartRateEntities = new TestEntity[size];
        for (int i = 0; i < size; i++) {
            amHeartRateEntities[i] = entities.get(i);
        }
        mDatabase.testDao().add(amHeartRateEntities);
    }
    public List<Object>  getData(String account) {
        return mDatabase.testDao().getData(account);
    }

    public LiveData<List<Object>> getDataLive(String account) {
        return mDatabase.testDao().getDataLive(account);
    }

}
