package com.sungbin.gitkakaobot.util.manager

import android.app.Notification
import org.mozilla.javascript.ScriptableObject

/**
 * Created by SungBin on 2020-08-22.
 */

object StackManager {

    val sessions = HashMap<String, Notification.Action>()
    val scopes = HashMap<String, ScriptableObject>()

}