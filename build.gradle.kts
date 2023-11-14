plugins {
    //trick: for the same plugin versions in all sub-modules
    id("com.android.library").version("8.0.0").apply(false)
    kotlin("multiplatform").version("1.8.10").apply(false)
    id("maven-publish")
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
