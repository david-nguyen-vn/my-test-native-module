package com.mylibrary

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.bridge.Promise

class MyLibraryModule(private val reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(reactContext) {

    override fun getName(): String {
        return "MyLibrary"
    }

    @ReactMethod
    fun initializeLibrary(promise: Promise) {
        // Initialization logic here
        promise.resolve("Library initialized")
    }

    @ReactMethod
    fun someNativeFunction(param: String, promise: Promise) {
        // Native functionality logic here
        promise.resolve("Received param: $param")
    }
}