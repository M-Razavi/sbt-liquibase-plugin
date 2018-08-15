
sbtPlugin := true

organization := "com.rayan.tools"

name := "sbt-liquibase"

version := "0.2.0"

//scalaVersion := "2.11.1"

licenses := Seq("Apache License, Version 2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0.txt"))

homepage := Some(url("https://github.com/M-Razavi/sbt-liquibase-plugin"))

crossScalaVersions := Seq("2.10.4","2.11.1","2.12.0")

libraryDependencies += "org.liquibase" % "liquibase-core" % "3.6.2"

publishMavenStyle := true

scriptedSettings

//scriptedLaunchOpts <+= version apply { v => "-Dproject.version="+v }

scriptedLaunchOpts := { scriptedLaunchOpts.value ++
  Seq("-Xmx1024M", "-XX:MaxPermSize=256M", "-Dplugin.version=" + version.value)
}

scriptedBufferLog := false

// TODO publish to Sonatype OSS
