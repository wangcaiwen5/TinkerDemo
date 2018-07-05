package com.example.wcw.tinkerdemo;

import android.app.Application;

import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.shareutil.ShareConstants;

/**
 * Author:wangcaiwen
 * Time:2018/7/5
 * Description:.C:\Users\sandy\Desktop\Desktop\TinkerDemo\app\src\main\java\com\example\wcw\tinkerdemo\SampleApplicationLike.java
 */

public class MyApplication  extends TinkerApplication{
    public MyApplication() {
        super(ShareConstants.TINKER_ENABLE_ALL, "com.example.wcw.tinkerdemo.SampleApplicationLike",
                "com.tencent.tinker.loader.TinkerLoader", false);
    }
}
