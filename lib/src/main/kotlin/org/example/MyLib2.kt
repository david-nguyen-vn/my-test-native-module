package org.example

import expo.modules.kotlin.modules.Module
import expo.modules.kotlin.modules.ModuleDefinition

class MyLib2 : Module() {
    override fun definition() =
    ModuleDefinition {
        // Sets the name of the module that JavaScript code will use to refer to the module. Takes a
        // string as an argument.
        // Can be inferred from module's class name, but it's recommended to set it explicitly for
        // clarity.
        // The module will be accessible from `requireNativeModule('ExpoSpeechRecognition')` in
        // JavaScript.
        Name("MyLib2")
    }
}