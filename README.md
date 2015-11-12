Xtend 2.9 - Multi-DSL-Example
==============

** IntelliJ Idea 15 RC **

*find me with 'xtend 2.9 gradle intellij idea'*

Example
--------------

*MyDsl*
- Standalone
- MyGreeting

*YourDsl*
- Standalone
- YourGreeting

*OurDsl*
- Standalone
- OurGreeting
- dependencies to MyDsl and YourDsl



**Gradle**

- Xtend 2.9.0.beta5
- Gradle 2.+ now on 2.8
- Fixes to build OurDsl on Gradle
- Maven Support for Local Repository
- Java 8

Gradle - basic commands
--------------
gradle wrapper

gradlew tasks

gradlew build 

gradlew install

gradlew runIdea

gradlew clean build -i

gradlew clean test -i

gradlew dependencies

Please install your favorite IDE (Eclipse, IntelliJ, Netbeans) 
and import this project as Gradle Project.
**You have to use the build.gradle to import in IDE.**
You will find a Gradle View in your IDE to see all tasks.

*Powershell: .\gradlew tasks*

** TBD / TODO **

*Facets in Idea Projects not visible for MyDsl and YourDsl when start OurDsl (runIdea)*
*not visible Plug-In on Eclipse Projects*

IDE
--------------

*It's all tested on Windows 7 and Mac OS X*

* IntelliJ 15 RC
* Eclipse EE 4.5

Links - Documentation - Why?
--------------
https://www.eclipse.org/forums/index.php/t/1071307/

Help?
--------------
Yes, please.
Make your branch or fork me and send your pull requests!
