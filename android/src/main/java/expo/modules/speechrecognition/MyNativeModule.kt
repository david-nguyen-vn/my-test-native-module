package expo.modules.speechrecognition

import android.Manifest.permission.RECORD_AUDIO
import android.annotation.SuppressLint
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.provider.Settings
import android.speech.ModelDownloadListener
import android.speech.RecognitionService
import android.speech.RecognitionSupport
import android.speech.RecognitionSupportCallback
import android.speech.RecognizerIntent
import android.speech.SpeechRecognizer
import android.util.Log
import androidx.annotation.RequiresApi
import expo.modules.interfaces.permissions.PermissionsResponse
import expo.modules.interfaces.permissions.Permissions.askForPermissionsWithPermissionsManager
import expo.modules.interfaces.permissions.Permissions.getPermissionsWithPermissionsManager
import expo.modules.kotlin.Promise
import expo.modules.kotlin.modules.Module
import expo.modules.kotlin.modules.ModuleDefinition

class MyNativeModule : Module() {
    override fun definition() =
    ModuleDefinition {
        Name("MyNativeModule")
    }
}
