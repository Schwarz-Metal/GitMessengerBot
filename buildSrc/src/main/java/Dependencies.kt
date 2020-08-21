import org.gradle.api.JavaVersion

object Application {
    const val minSdk = 23
    const val targetSdk = 30
    const val compileSdk = 30
    const val jvmTarget = "1.8"
    const val versionCode = 1
    const val versionName = "1.0.0"

    val targetCompat = JavaVersion.VERSION_1_8
    val sourceCompat = JavaVersion.VERSION_1_8
}

object Versions {
    object Network {
        const val Jsoup = "1.13.1"
        const val Retrofit = "2.9.0"
        const val OkHttp = "4.8.1"
    }

    object Rx {
        const val Kotlin = "3.0.0"
        const val Android = "3.0.0"
        const val Retrofit = "2.9.0"
    }

    object Essential {
        const val AppCompat = "1.2.0"
        const val Anko = "0.10.8"
        const val Kotlin = "1.4.0"
        const val Gradle = "4.0.1"
    }

    object Ktx {
        const val Core = "1.3.1"
        const val Fragment = "2.3.0"
    }

    object Di {
        const val Hilt = "2.28-alpha"
    }

    object Ui {
        const val YoYo = "2.3@aar"
        const val Lottie = "3.4.1"
        const val MaterialPopupMenu = "4.0.1"
        const val SimpleCodeEditor = "1.0.2"
        const val JsonViewer = "v1.1"
        const val Licenser = "2.0.0"
        const val Material = "1.2.0"
        const val Glide = "4.11.0"
        const val CardView = "1.0.0"
        const val ConstraintLayout = "1.1.3"
    }

    object Utils {
        const val YoYoHelper = "2.1@aar"
        const val HangulParser = "1.0.0"
        const val AndroidUtils = "3.2.0"
        const val CarshReporter = "1.1.0"
    }
}

object Dependencies {
    object Network {
        const val Jsoup = "org.jsoup:jsoup:${Versions.Network.Jsoup}"
        const val Retrofit = "com.squareup.okhttp3:okhttp:${Versions.Network.OkHttp}"
        const val OkHttp = "com.squareup.retrofit2:retrofit:${Versions.Network.Retrofit}"
    }

    object Rx {
        const val Kotlin = "io.reactivex.rxjava3:rxkotlin:${Versions.Rx.Kotlin}"
        const val Android = "io.reactivex.rxjava3:rxandroid:${Versions.Rx.Android}"
        const val Retrofit = "com.squareup.retrofit2:adapter-rxjava3:${Versions.Rx.Retrofit}"
    }

    object Essential {
        const val AppCompat = "androidx.appcompat:appcompat:${Versions.Essential.AppCompat}"
        const val Anko = "org.jetbrains.anko:anko:${Versions.Essential.Anko}"
        const val Kotlin = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.Essential.Kotlin}"
    }

    object Ktx {
        const val Core = "androidx.core:core-ktx:${Versions.Ktx.Core}"
        const val Fragment = "androidx.navigation:navigation-fragment-ktx:${Versions.Ktx.Fragment}"
    }

    object Di {
        const val Hilt = "com.google.dagger:hilt-android:${Versions.Di.Hilt}"
        const val HiltCompiler = "com.google.dagger:hilt-android-compiler:${Versions.Di.Hilt}"
    }

    object Ui {
        const val YoYo = "com.daimajia.androidanimations:library:${Versions.Ui.YoYo}"
        const val Lottie = "com.airbnb.android:lottie:${Versions.Ui.Lottie}"
        const val MaterialPopupMenu =
            "com.github.zawadz88.materialpopupmenu:material-popup-menu:${Versions.Ui.MaterialPopupMenu}"
        const val SimpleCodeEditor =
            "com.github.sungbin5304:SimpleCodeEditor:${Versions.Ui.SimpleCodeEditor}"
        const val JsonViewer = "com.github.pvarry:android-json-viewer:${Versions.Ui.JsonViewer}"
        const val Licenser = "com.github.marcoscgdev:Licenser:${Versions.Ui.Licenser}"
        const val Material = "com.google.android.material:material:${Versions.Ui.Material}"
        const val Glide = "com.github.bumptech.glide:glide:${Versions.Ui.Glide}"
        const val CardView = "androidx.cardview:cardview:${Versions.Ui.CardView}"
        const val ConstraintLayout =
            "androidx.constraintlayout:constraintlayout:${Versions.Ui.ConstraintLayout}"
    }

    object Utils {
        const val GlideCompiler = "com.github.bumptech.glide:compiler:${Versions.Ui.Glide}"
        const val YoyoHelper = "com.daimajia.easing:library:${Versions.Utils.YoYoHelper}"
        const val HangulParser = "com.github.kimkevin:hangulparser:${Versions.Utils.HangulParser}"
        const val AndroidUtils = "com.github.sungbin5304:AndroidUtils:${Versions.Utils.AndroidUtils}"
        const val CrashReporter = "com.balsikandar.android:crashreporter:${Versions.Utils.CarshReporter}"
    }
}