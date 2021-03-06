name := "smile-mkl"

libraryDependencies ++= {
  val version = "2020.1-1.5.3"
  Seq(
    "org.bytedeco" % "mkl-platform"        % version,
    "org.bytedeco" % "mkl-platform-redist" % version,
    "org.bytedeco" % "arpack-ng"           % "3.7.0-1.5.3" % "provided",
    "org.bytedeco" % "arpack-ng-platform"  % "3.7.0-1.5.3" % "provided"
  )
}
