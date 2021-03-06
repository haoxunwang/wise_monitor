package com.dave.android.wiz_moniter.plugins;

import android.util.Log;
import com.dave.android.wiz_core.Kit;
import com.dave.android.wiz_core.services.concurrency.DependsOn;

/**
 * @author rendawei
 * @date 2018/6/5
 */
@DependsOn(value = {InitPlugin2.class})
public class InitPlugin1 extends Kit {

    private static final String TAG = InitPlugin1.class.getSimpleName();

    @Override
    public String getIdentifier() {
        return TAG;
    }

    @Override
    protected Object doInBackground() {
        Log.e(TAG, "InitPlugin1 doInBackground");
        return null;
    }

    @Override
    public String getVersion() {
        return "0.0.1";
    }
}
