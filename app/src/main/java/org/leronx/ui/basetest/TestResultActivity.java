package org.leronx.ui.basetest;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import org.leronx.R;
import org.leronx.model.BaseTestResult;
import org.leronx.ui.base.BaseActivity;

import java.math.BigDecimal;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class TestResultActivity extends BaseActivity {


    @Bind(R.id.result_list)
    ListView listView;
    @Bind(R.id.result_tv)
    TextView resultTv;
    @Bind(R.id.result_complete_bt)
    Button completeBt;

    public static BaseTestResult result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.base_test_result);
        ButterKnife.bind(this);
        if (result == null) {
            finish();
        }
        listView.setAdapter(new ArrayAdapter<>(this, R.layout.base_test_result_error_list, R.id.list_text, result.errorList));
        float perRight = 0;
        if (result.rightCount + result.errorCount > 0) {
            perRight =(float) result.rightCount / (result.rightCount + result.errorCount) * 100f;
            int scale = 2;
            int roundingMode = 4;
            BigDecimal bd = new BigDecimal((double) perRight);
            bd = bd.setScale(scale, roundingMode);
            perRight = bd.floatValue();
        }
        String str = "对: " + result.rightCount + "  错: " + result.errorCount + "  正确率: " + perRight + "%";
        resultTv.setText(str);
    }

    @OnClick(R.id.result_complete_bt)
    public void onClick() {
        finish();
    }
}
