name := "Lift ReactJs"

version := "0.4.0"

organization := "net.liftweb"

scalaVersion := "2.12.3"

resolvers ++= Seq("snapshots"     at "https://oss.sonatype.org/content/repositories/snapshots",
                "releases"        at "https://oss.sonatype.org/content/repositories/releases"
                )

seq(webSettings :_*)

unmanagedResourceDirectories in Test <+= (baseDirectory) { _ / "src/main/webapp" }

scalacOptions ++= Seq("-deprecation", "-unchecked")

addCommandAlias("cs", "~container:start")

libraryDependencies ++= {
  val liftVersion = "3.1.0"
  Seq(
    "net.liftweb"       %% "lift-webkit"        % liftVersion        % "compile",
    "net.liftmodules"   %% "lift-jquery-module_3.0" % "2.10",
    "org.eclipse.jetty" % "jetty-webapp"        % "8.1.17.v20150415"  % "container,test",
    "org.eclipse.jetty" % "jetty-plus"          % "8.1.17.v20150415"  % "container,test", // For Jetty Config
    "org.eclipse.jetty.orbit" % "javax.servlet" % "3.0.0.v201112011016" % "container,test" artifacts Artifact("javax.servlet", "jar", "jar"),
    "ch.qos.logback"    % "logback-classic"     % "1.1.3",
    "org.specs2"        %% "specs2-core"        % "4.0.0"           % "test"
  )
}

scalacOptions in Test ++= Seq("-Yrangepos")
