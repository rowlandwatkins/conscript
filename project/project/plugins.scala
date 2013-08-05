import sbt._
object ConscriptPlugins extends Build
{
  lazy val root =
    Project("conscript", file(".")) dependsOn(proguard)
  lazy val proguard =
    uri("https://github.com/senia-psm/xsbt-proguard-plugin#4727f95d01")
}
