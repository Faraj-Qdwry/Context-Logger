# Context-Logger
Is an Android Library that logs class name as TAG

Examples:

`ContextLogger.d(this,"log message")` 

`ContextLogger.e(this,"log message")` 

`ContextLogger.i(this,"log message")` 

`ContextLogger.v(this,"log message")` 

`ContextLogger.w(this,"log message")` 

`ContextLogger.wtf(this,"log message")` 

To get a Git library into your build:

Step 1. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
Step 2. Add the dependency in app build.gradle

	dependencies {
	        implementation 'com.github.FarajAg:Context-Logger:0.0.1'
	}
