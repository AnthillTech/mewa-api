name := "mewa-api"

organization := "cc.mewa"

version := "0.4"

scalaVersion := "2.11.1"

resolvers += "Sonatype Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"

libraryDependencies ++= {
    val akkaVersion = "2.3.4"
    Seq(
      "com.typesafe.akka" %% "akka-actor" % akkaVersion, 
      "com.typesafe.akka" %% "akka-remote" % akkaVersion
    )
}

scalacOptions ++= Seq("-feature")