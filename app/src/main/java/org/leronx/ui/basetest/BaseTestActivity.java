package org.leronx.ui.basetest;

import android.os.Bundle;
import android.text.InputType;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.leronx.R;
import org.leronx.base.BaseAction;
import org.leronx.base.Constants;
import org.leronx.model.BaseTestResult;
import org.leronx.ui.base.BaseActivity;

import java.util.Random;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class BaseTestActivity extends BaseActivity {

    @Bind(R.id.voiced_tv)
    TextView voicedTv;
    @Bind(R.id.voiced_et)
    EditText voicedEt;
    @Bind(R.id.next_bt)
    Button nextBt;
    @Bind(R.id.finish_bt)
    Button finishBt;
    @Bind(R.id.error_tv)
    TextView errorTv;
    @Bind(R.id.error_ll)
    LinearLayout errorLl;

    private ArrayMap<String, String> testMap;
    private BaseTestResult result;
    private String tempError;
    private String tempAnswer;
    private String tempQuestion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.base_test_main);
        ButterKnife.bind(this);
        testMap = new ArrayMap<>();
        int type = getIntent().getIntExtra("type", 0);
        switch (type) {
            case Constants.BASE_HIRAGANA_TEST:
                testMap = Constants.getBaseHiraganaMap();
                break;
            case Constants.BASE_KATAKANA_TEST:
                testMap = Constants.getBaseKatakanaMap();
                break;
            case Constants.BASE_ALL_TEST:
                testMap = Constants.getBaseAllMap();
                break;
        }
        result = new BaseTestResult();
        voicedEt.setInputType(InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS);
        voicedEt .setImeOptions(EditorInfo.IME_ACTION_DONE);
        voicedEt.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE) {
                    commitAnswer();
                }
                return true;
            }
        });
        setTestQuestion();
    }

    private void setTestQuestion() {
        voicedEt.setText("");
        if (testMap != null && testMap.size() > 0) {
            int random = new Random().nextInt(testMap.size());
            tempQuestion = testMap.keyAt(random);
            tempAnswer = testMap.valueAt(random);
            testMap.remove(tempQuestion);
            voicedTv.setText(tempQuestion);
            if (!TextUtils.isEmpty(tempError)) {
                errorTv.setText(tempError);
                errorLl.setVisibility(View.VISIBLE);
            } else {
                errorLl.setVisibility(View.GONE);
            }
        }
    }

    private void commitAnswer(){
        String str = voicedEt.getText().toString().trim();
        if (str == null) {
            str = "";
        }

        if (tempAnswer.equals(str)) {
            result.rightCount++;
            tempError =null;
        } else {
            result.errorCount++;
            tempError = tempQuestion + "   -->  " + str + "(" + tempAnswer + ")";
            result.errorList.add(tempError);
        }
        if (testMap != null && testMap.size() > 0) {
            setTestQuestion();
        }else {
            BaseAction.toTestResult(this,result);
        }
    }

    @OnClick({R.id.voiced_et, R.id.next_bt, R.id.finish_bt})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.voiced_et:
                break;
            case R.id.next_bt:
                commitAnswer();
                break;
            case R.id.finish_bt:
                commitAnswer();
                BaseAction.toTestResult(this,result);
                break;
        }
    }
}
