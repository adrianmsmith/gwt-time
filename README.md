gwt-time
========

GWT support for java.time

**Usage:**

 1. Check out this project
 1. Execute "mvn install" within the directory (this saves the source files to your local Maven repository on your computer)
 1. In your project, in Maven, add:
    ```
    <dependency>
      <groupId>com.google.gwt</groupId>
      <artifactId>gwt-time</artifactId>
      <version>....</version>   <!-- see pom.xml in this project for version -->
    </dependency>
    ```
 
**Status:**

* This project is a fork (with permission) of another java.time implementation, see [here](https://github.com/adrianmsmith/gwt-time/pull/6#issuecomment-513223063)
* There is a lot missing:
  * I'm not convinced all classes are implemented? The ones I was looking for are implemented, but there might be others that are not.
  * It was never designed for GWT so it uses concurrent maps in some place (easy enough to replace with normal maps), java.util.Locale in some places.
  * It doesn't have converters to allow serialization of the types from client to the server (apart from LocalDate)
 * There are no tests
* The code is not currently on Maven Central. The procedure is checking out from Git, doing "mvn install", then using it. I would be happy to publish it to Maven Central if there was interest.
* The current version numbering mirrors GWT, so it's currently "2.8.2-SNAPSHOT". I'm not sure this is really helpful.
* Pull requests welcome :-)
 
