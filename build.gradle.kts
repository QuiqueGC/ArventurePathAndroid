// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.3.1" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false

    id ("com.android.library") version "7.1.2" apply false
    //ksp
    id("com.google.devtools.ksp") version "1.9.0-1.0.13" apply false
    //para pasar parámetros a través del navController
    id("androidx.navigation.safeargs.kotlin") version "2.7.1" apply false
}