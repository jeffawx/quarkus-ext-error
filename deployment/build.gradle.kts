plugins {
    kotlin("jvm")
    kotlin("kapt")
}

dependencies {
    implementation(project(":my-ext"))
    implementation("io.quarkus:quarkus-arc-deployment")
    implementation("io.quarkus:quarkus-undertow-deployment")
    implementation(platform("io.quarkus:quarkus-bom:3.12.3"))
    testImplementation("io.quarkus:quarkus-junit5-internal")
    testImplementation("io.rest-assured:rest-assured")

    kapt("io.quarkus:quarkus-extension-processor:3.12.3")
    kaptTest("io.quarkus:quarkus-extension-processor:3.12.3")
}