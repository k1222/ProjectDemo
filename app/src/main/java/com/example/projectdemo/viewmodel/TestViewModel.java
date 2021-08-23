package com.example.projectdemo.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.projectdemo.db.entity.TestEntity;
import com.example.projectdemo.db.repo.TestRepo;

import java.util.List;

/**
 * @author admin
 * @Package: com.example.projectdemo.viewmodel
 * @ClassName:
 * @description:
 * @date :2021/8/15 10:39 下午
 */
public class TestViewModel extends ViewModel {
    private final MutableLiveData<List<TestEntity>> data;
    public TestViewModel(){
        data = new MutableLiveData<>();
    }

    public LiveData<List<TestEntity>> initDataLive(){
        return data;
    }
    public void getData(String account){
        ((Runnable) () -> data.postValue(TestRepo.getInstance().getData(account))).run();
    }
}

