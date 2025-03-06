package com.mylibrary

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.bridge.Promise

class MyLibraryModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(reactContext) {
    override fun getName(): String {
        return "MyLibrary"
    }

    @ReactMethod
    fun exampleMethod(param: String, promise: Promise) {
        try {
            // Your native code logic here
            val result = "Hello, $param"
            promise.resolve(result)
        } catch (e: Exception) {
            promise.reject("ERROR", e)
        }
    }
}