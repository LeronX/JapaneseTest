package org.leronx.base;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Build;
import android.util.ArrayMap;

import java.util.HashMap;
import java.util.Map;

public class Constants {


    public final static int BASE_HIRAGANA_TEST = 0;
    public final static int BASE_KATAKANA_TEST = 1;
    public final static int BASE_ALL_TEST = 2;

    //Hiragana and katakana 平假名和片假名

    //基本平假名五十音
    public static ArrayMap<String,String> baseHiraganaMap = new ArrayMap() ;

    //基本片假名五十音
    public final static ArrayMap<String,String> baseKatakanaMap = new ArrayMap() ;

    //基本平/片假名五十音
    public final static ArrayMap<String,String> baseAllMap = new ArrayMap() ;

    public static ArrayMap<String, String> getBaseHiraganaMap() {
        baseHiraganaMap.put("あ", "a");
        baseHiraganaMap.put("い", "i");
        baseHiraganaMap.put("う", "u");
        baseHiraganaMap.put("え", "e");
        baseHiraganaMap.put("お", "o");

        baseHiraganaMap.put("か", "ka");
        baseHiraganaMap.put("き", "ki");
        baseHiraganaMap.put("く", "ku");
        baseHiraganaMap.put("け", "ke");
        baseHiraganaMap.put("こ", "ko");

        baseHiraganaMap.put("さ", "sa");
        baseHiraganaMap.put("し", "shi");
        baseHiraganaMap.put("す", "su");
        baseHiraganaMap.put("せ", "se");
        baseHiraganaMap.put("そ", "so");

        baseHiraganaMap.put("た", "ta");
        baseHiraganaMap.put("ち", "chi");
        baseHiraganaMap.put("つ", "tsu");
        baseHiraganaMap.put("て", "te");
        baseHiraganaMap.put("と", "to");

        baseHiraganaMap.put("な", "na");
        baseHiraganaMap.put("に", "ni");
        baseHiraganaMap.put("ぬ", "nu");
        baseHiraganaMap.put("ね", "ne");
        baseHiraganaMap.put("の", "no");

        baseHiraganaMap.put("は", "ha");
        baseHiraganaMap.put("ひ", "hi");
        baseHiraganaMap.put("ふ", "fu");
        baseHiraganaMap.put("へ", "he");
        baseHiraganaMap.put("ほ", "ho");

        baseHiraganaMap.put("ま", "ma");
        baseHiraganaMap.put("み", "mi");
        baseHiraganaMap.put("む", "mu");
        baseHiraganaMap.put("め", "me");
        baseHiraganaMap.put("も", "mo");

        baseHiraganaMap.put("や", "ya");
        baseHiraganaMap.put("い", "i");
        baseHiraganaMap.put("ゆ", "yu");
        baseHiraganaMap.put("え", "e");
        baseHiraganaMap.put("よ", "yo");

        baseHiraganaMap.put("ら", "ra");
        baseHiraganaMap.put("り", "ri");
        baseHiraganaMap.put("る", "ru");
        baseHiraganaMap.put("れ", "re");
        baseHiraganaMap.put("ろ", "ro");

        baseHiraganaMap.put("わ", "wa");
        baseHiraganaMap.put("い", "i");
        baseHiraganaMap.put("う", "u");
        baseHiraganaMap.put("え", "e");
        baseHiraganaMap.put("を", "o");

        baseHiraganaMap.put("ん", "n");
        return baseHiraganaMap;
    }


    public static ArrayMap<String, String> getBaseKatakanaMap() {

        baseKatakanaMap.put("ア", "a");
        baseKatakanaMap.put("イ", "i");
        baseKatakanaMap.put("ウ", "u");
        baseKatakanaMap.put("エ", "e");
        baseKatakanaMap.put("オ", "o");

        baseKatakanaMap.put("カ", "ka");
        baseKatakanaMap.put("キ", "ki");
        baseKatakanaMap.put("ク", "ku");
        baseKatakanaMap.put("ケ", "ke");
        baseKatakanaMap.put("コ", "ko");

        baseKatakanaMap.put("サ", "sa");
        baseKatakanaMap.put("シ", "shi");
        baseKatakanaMap.put("ス", "su");
        baseKatakanaMap.put("セ", "se");
        baseKatakanaMap.put("ソ", "so");

        baseKatakanaMap.put("タ", "ta");
        baseKatakanaMap.put("チ", "chi");
        baseKatakanaMap.put("ツ", "tsu");
        baseKatakanaMap.put("テ", "te");
        baseKatakanaMap.put("ト", "to");

        baseKatakanaMap.put("ナ", "na");
        baseKatakanaMap.put("ニ", "ni");
        baseKatakanaMap.put("ヌ", "nu");
        baseKatakanaMap.put("ネ", "ne");
        baseKatakanaMap.put("ノ", "no");

        baseKatakanaMap.put("ハ", "ha");
        baseKatakanaMap.put("ヒ", "hi");
        baseKatakanaMap.put("フ", "fu");
        baseKatakanaMap.put("ヘ", "he");
        baseKatakanaMap.put("ホ", "ho");

        baseKatakanaMap.put("マ", "ma");
        baseKatakanaMap.put("ミ", "mi");
        baseKatakanaMap.put("ム", "mu");
        baseKatakanaMap.put("メ", "me");
        baseKatakanaMap.put("モ", "mo");

        baseKatakanaMap.put("ヤ", "ya");
        baseKatakanaMap.put("イ", "i");
        baseKatakanaMap.put("ユ", "yu");
        baseKatakanaMap.put("エ", "e");
        baseKatakanaMap.put("ヨ", "yo");

        baseKatakanaMap.put("ラ", "ra");
        baseKatakanaMap.put("リ", "ri");
        baseKatakanaMap.put("ル", "ru");
        baseKatakanaMap.put("レ", "re");
        baseKatakanaMap.put("ロ", "ro");

        baseKatakanaMap.put("ワ", "wa");
        baseKatakanaMap.put("イ", "i");
        baseKatakanaMap.put("ウ", "u");
        baseKatakanaMap.put("エ", "e");
        baseKatakanaMap.put("ヲ", "o");

        baseKatakanaMap.put("ン", "n");
        return baseKatakanaMap;
    }

    public static ArrayMap<String, String> getBaseAllMap() {
        baseAllMap.putAll(baseHiraganaMap);
        baseAllMap.putAll(baseKatakanaMap);
        return baseAllMap;
    }

}

