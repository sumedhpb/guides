dependencies {
    testCompile("org.spockframework:spock-core:1.0-groovy-2.4") {
        exclude(module = "groovy-all")
    }
}
