package org.leronx.ui.base;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

public class BaseActivity extends AppCompatActivity implements View.OnClickListener{
    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState){
        super.onSaveInstanceState(savedInstanceState);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    protected void showKeyboard(final EditText edit) {
        new Handler().post(new Runnable() {
            @Override
            public void run() {
                if (edit != null) {
                    InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
                    edit.requestFocus();
                    inputMethodManager.showSoftInput(edit,
                            InputMethodManager.SHOW_IMPLICIT);
                }
            }

        });
    }

    protected void hideKeyboard(final EditText edit) {
        new Handler().post(new Runnable() {
            @Override
            public void run() {
                if (edit != null) {
                    InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
                    // 得到InputMethodManager的实例
                    if (inputMethodManager.isActive()) {
                        inputMethodManager.hideSoftInputFromWindow(
                                edit.getWindowToken(),0);
                    }
                }
            }
        });
    }
    protected void hideNumberKeyboard(final EditText edit) {
        new Handler().post(new Runnable() {
            @Override
            public void run() {
                if (edit != null) {
                    InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
                    // 得到InputMethodManager的实例
                    if (inputMethodManager.isActive()) {
                        inputMethodManager.hideSoftInputFromWindow(
                                edit.getWindowToken(),edit.getPaintFlags());
                    }
                }
            }
        });
    }

    protected void hideAllKeyboard(){
        View view = getWindow().peekDecorView();
        if (view != null) {
            InputMethodManager inputmanger = (InputMethodManager) getSystemService(this.INPUT_METHOD_SERVICE);
            inputmanger.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    @Override
    public void onClick(View v) {

    }

}
