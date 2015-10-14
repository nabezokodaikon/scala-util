name := "scala-util"

organization := "com.github.nabezokodaikon"

version := "0.0.1"

scalaVersion := "2.11.7"

scalacOptions ++= Seq(
  "-deprecation",
  "-feature",
  "-unchecked",
  "-Xlint"
)

libraryDependencies ++= Seq(
  "org.scalatest" % "scalatest_2.11" % "2.2.4" % "test",
  "org.scalacheck" %% "scalacheck" % "1.12.5" % "test"
)

initialCommands := "import com.github.nabezokodaikon.util._"

