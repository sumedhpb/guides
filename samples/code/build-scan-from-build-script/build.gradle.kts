// tag::build-scan-plugin-plugins-apply[]
plugins {
    id("com.gradle.build-scan") version "1.13.3" // <1>
}
// end::build-scan-plugin-plugins-apply[]

// tag::build-scan-dsl[]
buildScan {
    setTermsOfServiceUrl("https://gradle.com/terms-of-service")
    setTermsOfServiceAgree("yes")
}
// end::build-scan-dsl[]

apply(plugin = "base")
