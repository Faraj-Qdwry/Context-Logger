package com.dahmakan.context_logger

import android.util.Log

class ContextLogger {

    companion object {

        @JvmStatic
        fun v(clazz: Any, msg: String) {
            Log.v(clazz.javaClass.name, msg)
        }

        @JvmStatic
        fun d(clazz: Any, msg: String) {
            Log.d(clazz.javaClass.name, msg)
        }

        @JvmStatic
        fun i(clazz: Any, msg: String) {
            Log.i(clazz.javaClass.name, msg)
        }

        @JvmStatic
        fun w(clazz: Any, msg: String) {
            Log.w(clazz.javaClass.name, msg)
        }

        @JvmStatic
        fun e(clazz: Any, msg: String) {
            Log.e(clazz.javaClass.name, msg)
        }

        @JvmStatic
        fun wtf(clazz: Any, msg: String) {
            Log.wtf(clazz.javaClass.name, msg)
        }
    }
}