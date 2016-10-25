package org.leronx.ui.mainview.popupwindow;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;

import org.leronx.R;
import org.leronx.base.BaseAction;
import org.leronx.base.Constants;
import org.leronx.ui.base.BasePopupWindow;

public class ScalePopup extends BasePopupWindow implements View.OnClickListener{

    private View popupView;
    private Context context;

    public ScalePopup(Activity context) {
        super(context);
        this.context = context;
        bindEvent();
    }

    @Override
    protected Animation getShowAnimation() {
        return getDefaultScaleAnimation();
    }


    @Override
    protected View getClickToDismissView() {
        return popupView.findViewById(R.id.click_to_dismiss);
    }

    @Override
    public View getPopupView() {
        popupView= LayoutInflater.from(mContext).inflate(R.layout.popup_normal,null);
        return popupView;
    }

    @Override
    public View getAnimaView() {
        return popupView.findViewById(R.id.popup_anima);
    }

    private void bindEvent() {
        if (popupView!=null){
            popupView.findViewById(R.id.tx_1).setOnClickListener(this);
            popupView.findViewById(R.id.tx_2).setOnClickListener(this);
            popupView.findViewById(R.id.tx_3).setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tx_1:
                BaseAction.toBaseTest(context, Constants.BASE_HIRAGANA_TEST);
                break;
            case R.id.tx_2:
                BaseAction.toBaseTest(context, Constants.BASE_KATAKANA_TEST);
                break;
            case R.id.tx_3:
                BaseAction.toBaseTest(context, Constants.BASE_ALL_TEST);
                break;
            default:
                break;
        }

    }
}
