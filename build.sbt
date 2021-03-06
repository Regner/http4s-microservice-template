name := """games-service"""

version := "1.0"

scalaVersion := "2.11.0"

val http4sVersion = "0.14.6"
val circeVersion = "0.5.1"

libraryDependencies ++= Seq(
  "org.slf4j"         %  "slf4j-simple"        % "1.7.21",
  "com.h2database"    %  "h2"                  % "1.4.191",
  "org.http4s"        %% "http4s-blaze-server" % http4sVersion,
  "org.http4s"        %% "http4s-dsl"          % http4sVersion,
  "org.http4s"        %% "http4s-argonaut"     % http4sVersion,
  "org.http4s"        %% "http4s-circe"        % http4sVersion,
  "io.circe"          %% "circe-core"          % circeVersion,
  "io.circe"          %% "circe-generic"       % circeVersion,
  "com.ibm"           %% "couchdb-scala"       % "0.7.2"
)