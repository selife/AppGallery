package com.unsplash.pickerandroid.example

import android.app.Application
import com.unsplash.pickerandroid.photopicker.UnsplashPhotoPicker

class ExampleApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        // initializing the picker library
        UnsplashPhotoPicker.init(
            this,
            "rUvu4QNu8rP_wvTNjQB-ikSPLURJi1ReZ6de-VBdhck",
            "b72pqrVelVwq6ohpvU4OrX5bTCu0igRndrtiadCR0tQ",2
        )
            /* .setLoggingEnabled(true) // if you want to see the http requests */
    }
}
