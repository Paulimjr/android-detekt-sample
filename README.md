# Android Detekt sample

- This is a sample example using some rules/validation from DETEKT. Before we start, if you don't know what's Detekt.. detekt is a static code analysis tool for the Kotlin programming language.


Add dependency in your project
-----

### Step 1

Add it in your root build.gradle at the end of repositories

```groovy
    dependencies {
    	classpath "io.gitlab.arturbosch.detekt:detekt-gradle-plugin:1.17.1"

```

### Step 2

Add the dependency

```groovy
    apply plugin: "io.gitlab.arturbosch.detekt" // Top level
    
    apply plugin: "io.gitlab.arturbosch.detekt" // Below your dependencies
```

### In this sample project you'll find some rules to validate your code, styles and other stuffs.

But you can find more roles or how to create your own role here: https://www.raywenderlich.com/24470020-integrating-detekt-in-the-workflow
or https://detekt.github.io/detekt/configurations.html


### After you finish the configuration in your project you just need to run the command in terminal to check your code with DETEKT
```groovy
    ./gradlew detekt
```



