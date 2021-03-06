package com.example.projectdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.projectdemo.db.repo.TestRepo;
import com.example.projectdemo.viewmodel.TestAndroidViewModel;
import com.example.projectdemo.viewmodel.TestViewModel;

import java.util.List;

import zendesk.core.AnonymousIdentity;
import zendesk.core.Zendesk;
import zendesk.support.request.RequestActivity;

public class MainActivity extends AppCompatActivity {
    private static final String SUBDOMAIN_URL = "https://kjobhelp.zendesk.com";
    private static final String APPLICATION_ID = "fcd5e14f822b70f4a400089ca278a5ebe84ea86015ec30d0";
    private static final String OAUTH_CLIENT_ID = "mobile_sdk_client_5846b02f96f0fe98836d";
    TestViewModel viewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_picker).setOnClickListener(v -> startActivity(new Intent(MainActivity.this, PickerActivity.class)));
        findViewById(R.id.btn_recycler_view).setOnClickListener(v -> startActivity(new Intent(MainActivity.this, RecyclerViewActivity.class)));
        findViewById(R.id.btn_text).setOnClickListener(v -> startActivity(new Intent(MainActivity.this, TextActivity.class)));
        findViewById(R.id.btn_edit).setOnClickListener(v -> startActivity(new Intent(MainActivity.this, EditTextActivity.class)));
        findViewById(R.id.btn_text_input).setOnClickListener(v -> startActivity(new Intent(MainActivity.this, TextInputLayoutActivity.class)));
        findViewById(R.id.btn_floating_action_button).setOnClickListener(v -> startActivity(new Intent(MainActivity.this, FloatingActionButtonActivity.class)));
        findViewById(R.id.btn_linear_layout).setOnClickListener(v -> startActivity(new Intent(MainActivity.this, LinearLayoutActivity.class)));
        findViewById(R.id.btn_relative_layout).setOnClickListener(v -> startActivity(new Intent(MainActivity.this, RelativeLayoutActivity.class)));
        findViewById(R.id.btn_relative_layout2).setOnClickListener(v -> startActivity(new Intent(MainActivity.this, RelativeLayoutActivity2.class)));
        findViewById(R.id.btn_relative_layout2).setOnClickListener(v -> startActivity(new Intent(MainActivity.this, SpacActivity.class)));
        findViewById(R.id.btn_switch).setOnClickListener(v -> startActivity(new Intent(MainActivity.this, SwitchActivity.class)));
//        viewModel = new ViewModelProvider(this).get(TestViewModel.class);
//        TestRepo.getInstance().getDataLive("")
//                .observe(this, new Observer<List<Object>>() {
//                    @Override
//                    public void onChanged(List<Object> objects) {
//                        //???????????????????????????????????????
//                    }
//                });
//        TestAndroidViewModel.Factory factory = new TestAndroidViewModel.Factory(getApplication());
//        TestAndroidViewModel androidViewModel = factory.create(TestAndroidViewModel.class);
//        Zendesk.INSTANCE.init(this, SUBDOMAIN_URL, APPLICATION_ID, OAUTH_CLIENT_ID);
//        Zendesk.INSTANCE.setIdentity(
//                new AnonymousIdentity.Builder()
//                        .withNameIdentifier("Your Name")
//                        .withEmailIdentifier("Your Email")
//                        .build()
//        );
//        RequestActivity.builder().withRequestSubject("????????????").withTags("??????Tag").show(this);
//        viewModel.initDataLive().observe(this, new Observer<List<Object>>() {
//            @Override
//            public void onChanged(List<Object> objects) {
//                //??????UI???????????????????????????
//            }
//        });
    }
//    Observer observer = new Observer<String>() {
//        @Override
//        public void onChanged(String currentName) {
//            //??????UI???????????????????????????
//        }
//    };

}