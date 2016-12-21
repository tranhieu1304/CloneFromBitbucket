name := """feedpicks-identity"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs,
  filters,
  "mysql" % "mysql-connector-java" % "5.1.36" withSources(),
  "com.google.code.gson" % "gson" % "2.2.4"
)
// bootstrap
libraryDependencies ++= Seq(
  "com.adrianhurt" %% "play-bootstrap" % "1.1-P24-B3" withSources(), 
   "org.jsoup" % "jsoup" % "1.7.2" withSources(),
   "org.json" % "json" % "20160212"
)



EclipseKeys.projectFlavor := EclipseProjectFlavor.Java           // Java project. Don't expect Scala IDE
EclipseKeys.createSrc := EclipseCreateSrc.ValueSet(EclipseCreateSrc.ManagedClasses, EclipseCreateSrc.ManagedResources)  // Use .class files instead of generated .scala files for views and routes 
EclipseKeys.preTasks := Seq(compile in Compile)                  // Compile the project before generating Eclipse files, so that .class files for views and routes are present                

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator

fork in run := false