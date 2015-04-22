name := "Supler selectManyField"

organization := "com.example"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.11.1"

resolvers += "OSS JFrog Artifactory" at "http://oss.jfrog.org/artifactory/oss-snapshot-local"

crossScalaVersions := Seq("2.10.4", "2.11.2")

libraryDependencies ++= Seq(
  "com.softwaremill.supler" %% "supler" % "0.4.0-SNAPSHOT",
  "org.json4s" %% "json4s-jackson" % "3.2.11",
  "org.json4s" %% "json4s-mongo" % "3.2.11",
  "org.scalatest" %% "scalatest" % "2.2.1" % "test",
  "org.scalacheck" %% "scalacheck" % "1.11.5" % "test"
)

initialCommands := "import com.example.suplerselectmanyfield._"

