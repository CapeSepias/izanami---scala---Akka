name := """simulation"""
organization := "fr.maif"

scalaVersion := "2.12.9"

lazy val simulation = (project in file("."))
  .enablePlugins(GatlingPlugin)

scalacOptions := Seq(
  "-encoding",
  "UTF-8",
  "-target:jvm-1.8",
  "-deprecation",
  "-feature",
  "-unchecked",
  "-language:implicitConversions",
  "-language:postfixOps"
)

libraryDependencies ++= Seq(
  "com.typesafe.akka"     %% "akka-actor"               % Dependencies.akkaVersion     % "test,it",
  "com.typesafe.akka"     %% "akka-stream"              % Dependencies.akkaVersion     % "test,it",
  "com.typesafe.akka"     %% "akka-http"                % Dependencies.akkaHttpVersion % "test,it",
  "com.typesafe.akka"     %% "akka-slf4j"               % Dependencies.akkaVersion     % "test,it",
  "io.gatling.highcharts" % "gatling-charts-highcharts" % "3.1.3"                      % "test,it",
  "io.gatling"            % "gatling-test-framework"    % "3.1.3"                      % "test,it"
)