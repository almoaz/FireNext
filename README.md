# FireNext (Android)

FireNext is an offline database library.


## Authors

- [Mahfuz Salehin Moaz](https://www.github.com/almoaz)


## License
[![MIT License](https://img.shields.io/badge/License-MIT-green.svg)](https://github.com/almoaz/FireNext/blob/master/LICENSE)


## Badges

[![](https://jitpack.io/v/almoaz/FireNext.svg)](https://jitpack.io/#almoaz/FireNext)


## Installation (gradle project)

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
	  implementation 'com.github.almoaz:FireNext:1.1.2'
  }

```

## Installation (maven project)

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
       <version>1.1.2</version>
  </dependency>

```

## Installation (sbt project)

```bash
Step 1. Add the JitPack repository to your build file

Add it in your build.sbt at the end of resolvers:

  resolvers += "jitpack" at "https://jitpack.io"

Step 2. Add the dependency

  libraryDependencies += "com.github.almoaz" % "FireNext" % "1.1.2"	

```
## Installation (leiningen project)

```bash
Step 1. Add the JitPack repository to your build file

Add it in your project.clj at the end of repositories:

  :repositories [["jitpack" "https://jitpack.io"]]

Step 2. Add the dependency

  :dependencies [[com.github.almoaz/FireNext "1.1.2"]]	

```
    
    
## About FireNext

FireNext works with two types of offline databases. Table type and Document type. Table type database name "NextTable" and document type database name "NextDatabase".

## NextTable

```bash
id                  name                   phone 
------------------------------------------------------------
18301               Mithila Mithi          019XXXXXXXX
------------------------------------------------------------
18302               Mahfuz Salehin         017XXXXXXXX
------------------------------------------------------------
18303               Al Moaz                016XXXXXXXX

```

## NextDatabase

```bash
USER
   |---18301
   |       |---name:Mithila Nisa
   |       |---id:18301
   |       |---phone:019XXXXXXXX
   |---18302
   |       |---name:Mahfuz Salehin
   |       |---id:18302
   |       |---phone:017XXXXXXXX
   |---18303
   |       |---name:Al Moaz
   |       |---id:18303
   |       |---phone:016XXXXXXXX

```


## Documentation

- [NextTable (Java)](https://github.com/almoaz/FireNext/blob/master/NextTable.md)
- [NextDatabase (Java)](https://github.com/almoaz/FireNext/blob/master/NextDatabase.md)


- [NextTable (Kotlin)](https://github.com/almoaz/FireNext/blob/master/NextTable(kt).md)
- [NextDatabase (Kotlin)](https://github.com/almoaz/FireNext/blob/master/NextDatabase(kt).md)


## Restiction

Please do not use these characters in your documents.

- " Á " this character means database start tag
- " À " this character means database end tag
- " É " this character means database start tag
- " È " this character means database end tag
- " Ê " this character means database end tag
- " | " this character means add new data
- " : " this character means valueChild

"|" and ":" These character has its uses. You will find it in the documentation.


## Having problems?

Please inform me via email at 'almuaz1998@gmail.com'


## Thanks

- Many many thanks Android and Kotling developers
- Special Thanks to Future Next Developers


