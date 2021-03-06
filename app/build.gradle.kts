plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-android-extensions")
    id("kotlin-kapt")
}

android {
    compileSdkVersion(27)
    buildToolsVersion("27.0.3")

    defaultConfig {
        applicationId = "com.manichord.mgit"
        minSdkVersion(16)
        targetSdkVersion(27)

        vectorDrawables.useSupportLibrary = true

        versionCode = 210
        versionName = "1.5.4.5"
    }

    dataBinding {
        isEnabled = true
    }

    lintOptions {
        isAbortOnError = false
    }
}

dependencies {
    val supportLib_version = "27.1.1"
    val lifecycle_version = "1.1.1"
    val kotlin_version: String by rootProject.extra

    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7:${kotlin_version}")
    implementation("com.android.support:support-fragment:${supportLib_version}")
    implementation("com.android.support:support-annotations:${supportLib_version}")
    implementation("com.android.support:appcompat-v7:${supportLib_version}")
    implementation("com.android.support:design:${supportLib_version}")
    implementation("com.android.support:recyclerview-v7:${supportLib_version}")
    implementation("com.android.support:support-vector-drawable:${supportLib_version}")
    implementation("com.android.support.constraint:constraint-layout:1.1.0")

    // ViewModel and LiveData
    implementation("android.arch.lifecycle:extensions:${lifecycle_version}")
    kapt("android.arch.lifecycle:compiler:${lifecycle_version}")

    implementation("com.jakewharton.timber:timber:4.5.1")
    implementation("com.jcraft:jsch:0.1.54")
    implementation("commons-io:commons-io:2.5")
    implementation("org.eclipse.jgit:org.eclipse.jgit:3.7.1.201504261725-r")
    implementation("com.nostra13.universalimageloader:universal-image-loader:1.9.5")
    implementation("com.scottyab:secure-preferences-lib:0.1.4")
    implementation("ch.acra:acra:4.9.2")
    implementation("org.conscrypt:conscrypt-android:1.1.0")
    debugImplementation("com.facebook.stetho:stetho:1.5.0")
    debugImplementation("com.facebook.stetho:stetho-timber:1.5.0")
    testImplementation("junit:junit:4.12")
    testImplementation("org.robolectric:robolectric:3.5")
    testImplementation("org.robolectric:shadows-support-v4:3.4-rc2")
}
