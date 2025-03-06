// filepath: android/src/main/java/com/example/testmodule/MyNativeModule.kt
package com.example.testmodule

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.bridge.Promise

class MyNativeModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(reactContext) {
    override fun getName(): String {
        return "MyNativeModule"
    }

    @ReactMethod
    fun sampleMethod(message: String, promise: Promise) {
        promise.resolve("Received message: $message")
    }
}