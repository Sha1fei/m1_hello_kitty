plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "ru.valentinzadorozhniy.m1_hello_kitty"
    compileSdk = 37

    defaultConfig {
        applicationId = "ru.valentinzadorozhniy.m1_hello_kitty"
        minSdk = 24
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            optimization {
                enable = false
            }
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}
afterEvaluate {
    tasks.named("packageDebug").configure {
        val apkDir = layout.buildDirectory.dir("outputs/apk/debug").get().asFile
        doLast {
            apkDir.listFiles()?.filter { it.name.endsWith(".apk") }?.forEach { apk ->
                apk.renameTo(File(apk.parentFile, "hello_kitty.apk"))
            }
        }
    }
}

dependencies {
    implementation(libs.androidx.activity.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.core.ktx)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(libs.androidx.junit)
}