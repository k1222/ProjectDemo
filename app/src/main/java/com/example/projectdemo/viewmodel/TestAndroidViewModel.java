package com.example.projectdemo.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

/**
 * @author admin
 * @Package: com.example.projectdemo.viewmodel
 * @ClassName:
 * @description:
 * @date :2021/8/15 11:18 下午
 */
public class TestAndroidViewModel extends AndroidViewModel {
    public TestAndroidViewModel(Application application) {
        super(application);
    }

    public static class Factory extends ViewModelProvider.NewInstanceFactory {

        private Application mApp;

        public Factory(Application mApp) {
            this.mApp = mApp;
        }

        @NonNull
        @Override
        public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
            return (T) new TestAndroidViewModel(mApp);
        }
    }
}
