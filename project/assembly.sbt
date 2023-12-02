addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "2.1.5")
val sparkVersion = "3.5.0"
libraryDependencies += "org.apache.spark" %% "spark-core" % sparkVersion
libraryDependencies += "org.apache.spark" %% "spark-sql" % sparkVersion