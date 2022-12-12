
# FireNext 

FireNext is a offline database library.



## License
[![MIT License](https://img.shields.io/badge/License-MIT-green.svg)](https://github.com/almoaz/FireNext/blob/master/LICENSE)




## Import (gradle project)

```bash
Step 1. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:

  allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

Step 2. Add the dependency

  dependencies {
	     implementation 'com.github.almoaz:FireNext:1.1.1'
	}

```

## Import (maven project)

```bash
Step 1. Add the JitPack repository to your build file

  <repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>

Step 2. Add the dependency

  <dependency>
	    <groupId>com.github.almoaz</groupId>
	    <artifactId>FireNext</artifactId>
	    <version>1.1.1</version>
	</dependency>

```

## Import (sbt project)

```bash
Step 1. Add the JitPack repository to your build file

Add it in your build.sbt at the end of resolvers:

  resolvers += "jitpack" at "https://jitpack.io"

Step 2. Add the dependency

  libraryDependencies += "com.github.almoaz" % "FireNext" % "1.1.1"	

```
## Import (sbt project)

```bash
Step 1. Add the JitPack repository to your build file

Add it in your project.clj at the end of repositories:

  :repositories [["jitpack" "https://jitpack.io"]]

Step 2. Add the dependency

  :dependencies [[com.github.almoaz/FireNext "1.1.1"]]	

```
    