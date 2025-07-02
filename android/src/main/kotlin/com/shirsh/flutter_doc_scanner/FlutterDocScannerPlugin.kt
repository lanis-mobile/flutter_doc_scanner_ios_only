package com.shirsh.flutter_doc_scanner

import io.flutter.embedding.engine.plugins.FlutterPlugin
import io.flutter.embedding.engine.plugins.activity.ActivityAware
import io.flutter.plugin.common.MethodCall
import io.flutter.plugin.common.MethodChannel.MethodCallHandler
import io.flutter.plugin.common.MethodChannel.Result
import io.flutter.plugin.common.PluginRegistry.ActivityResultListener

class FlutterDocScannerPlugin : MethodCallHandler, ActivityResultListener,
    FlutterPlugin, ActivityAware {


    override fun onMethodCall(call: MethodCall, result: Result) {
        result.notImplemented()
    }
}