package com.example.flutter_android_duplicate_plugin_registration

import io.flutter.app.FlutterApplication
import io.flutter.Log

class Application : FlutterApplication() {
    override fun onCreate() {
        // This adds more logs from the Flutter Source Code you can see what's going on
        Log.setLogLevel(android.util.Log.VERBOSE)

        super.onCreate()

        // Something that needs to be done here
    }
}
