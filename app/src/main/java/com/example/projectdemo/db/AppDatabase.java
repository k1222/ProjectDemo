package com.example.projectdemo.db;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.projectdemo.db.dao.TestDao;
import com.example.projectdemo.db.entity.TestEntity;

/**
 * @author admin
 * @Package: com.example.projectdemo.db
 * @ClassName:
 * @description:
 * @date :2021/8/11 9:54 下午
 */
@Database(entities = {TestEntity.class},version = 1)
public abstract class AppDatabase extends RoomDatabase {
    private static final String DATABASE_NAME = "Test";
    private static AppDatabase sInstance;

    public abstract TestDao testDao();

    public static AppDatabase getInstance() {
        return sInstance;
    }

    public static void init(final Context context) {
        if (sInstance == null) {
            synchronized (AppDatabase.class) {
                if (sInstance == null) {
                    sInstance = buildDB(context);
                }
            }
        }
    }

    private static AppDatabase buildDB(Context context) {
        return Room.databaseBuilder(context, AppDatabase.class, DATABASE_NAME)
                .allowMainThreadQueries()
                .build();
    }
}
