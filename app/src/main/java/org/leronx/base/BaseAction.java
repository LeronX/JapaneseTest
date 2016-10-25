package org.leronx.base;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import org.leronx.model.BaseTestResult;
import org.leronx.ui.basetest.BaseTestActivity;
import org.leronx.ui.basetest.TestResultActivity;

/**
 * Created by que on 16/10/19.
 */

public class BaseAction {

    public static void toBaseTest(Context context, int type) {
        Intent intent = new Intent(context, BaseTestActivity.class);
        intent.putExtra("type", type);
        context.startActivity(intent);
    }

    public static void toTestResult(Context context, BaseTestResult result) {

        TestResultActivity.result = result;
        Intent intent = new Intent(context, TestResultActivity.class);
        context.startActivity(intent);
        ((Activity)context).finish();
    }

}
