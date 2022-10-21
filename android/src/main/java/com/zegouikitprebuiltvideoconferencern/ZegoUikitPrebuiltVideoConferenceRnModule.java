package com.zegouikitprebuiltvideoconferencern;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = ZegoUikitPrebuiltVideoConferenceRnModule.NAME)
public class ZegoUikitPrebuiltVideoConferenceRnModule extends ReactContextBaseJavaModule {
    public static final String NAME = "ZegoUikitPrebuiltVideoConferenceRn";

    public ZegoUikitPrebuiltVideoConferenceRnModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    @NonNull
    public String getName() {
        return NAME;
    }


    // Example method
    // See https://reactnative.dev/docs/native-modules-android
    @ReactMethod
    public void multiply(double a, double b, Promise promise) {
        promise.resolve(a * b);
    }

}
