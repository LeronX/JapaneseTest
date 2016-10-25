package org.leronx.ui.mainview.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import org.leronx.R;
import org.leronx.ui.base.BaseActivity;
import org.leronx.ui.mainview.popupwindow.ScalePopup;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {

    @Bind(R.id.base_test_bt)
    Button baseTestBt;
    @Bind(R.id.voiced_test_bt)
    Button voicedTestBt;
    @Bind(R.id.bend_test_bt)
    Button bendTestBt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.base_test_bt, R.id.voiced_test_bt, R.id.bend_test_bt})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.base_test_bt:
                new ScalePopup(this).showPopupWindow();
                break;
            case R.id.voiced_test_bt:
                break;
            case R.id.bend_test_bt:
                break;
        }
    }
}
