name := "scsample"
organization := "org.mmartina"
version := "0.1-SNAPSHOT"

scalaVersion := "2.13.1"
crossScalaVersions := Seq("2.12.10", "2.13.1")

ThisBuild / githubOwner := "mmartina"
ThisBuild / githubRepository := "scsample"
ThisBuild / githubTokenSource := Some(TokenSource.Environment("GITHUB_TOKEN"))
