name := "play_sbt_bug"

version := "0.1"

scalaVersion := "2.11.12"

lazy val root = (project in file(".")).settings(publish := {}).aggregate(project1, project2)

lazy val project1 = (project in file("project1")).settings(
  fork := true,
  javaOptions in run += "-Dcustom.property=test123",
  name := "project1",
)

lazy val project2 = (project in file("project2")).settings(
  fork := true,
  javaOptions in run += "-Dcustom.property=test123",
  name := "project2",
  libraryDependencies ++= Seq(
    guice
  )
).enablePlugins(PlayScala)
