
package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;


import android.provider.Settings;
import android.os.Build;
import android.content.Intent;
import android.net.Uri;

public class RNWriteSettingsModule extends ReactContextBaseJavaModule {

  ReactApplicationContext context;

  private final ReactApplicationContext reactContext;

  public RNWriteSettingsModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
    context = (ReactApplicationContext) getReactApplicationContext();
  }

  @ReactMethod
  public void checkPermission() {
    boolean canWriteSettings = false;

    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            canWriteSettings = Settings.System.canWrite(context);
            //Log.d(TAG, "Can write? : " + canWriteFlag);

            if (!canWriteSettings) {
                    Intent intent = new Intent(Settings.ACTION_MANAGE_WRITE_SETTINGS);
                    intent.setData(Uri.parse("package:" + context.getPackageName()));
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

                    context.startActivity(intent);
            }
    }

  }

  @Override
  public String getName() {
    return "RNWriteSettings";
  }
}
