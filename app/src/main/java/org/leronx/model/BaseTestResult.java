package org.leronx.model;

import java.util.ArrayList;

/**
 * Created by que on 16/10/19.
 */

public class BaseTestResult {
    public int errorCount;
    public int rightCount;
    public int totalTime;
    public ArrayList<String> errorList = new ArrayList<>();
}
