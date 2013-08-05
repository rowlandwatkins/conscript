addSbtPlugin("net.databinder" % "conscript-plugin" % "0.3.5")

addSbtPlugin("com.eed3si9n" % "sbt-buildinfo" % "0.2.0")

addSbtPlugin("me.lessis" % "ls-sbt" % "0.1.2")

addSbtPlugin("org.scala-sbt" % "xsbt-proguard-plugin" % "0.1.3")

addSbtPlugin("org.xerial.sbt" % "sbt-pack" % "0.2")

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.9.1")

resolvers += Resolver.url("sbt-plugin-releases",
  url("http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases/"))(Resolver.ivyStylePatterns)

resolvers ++= Seq(
  "less is" at "http://repo.lessis.me",
  "coda" at "http://repo.codahale.com")
