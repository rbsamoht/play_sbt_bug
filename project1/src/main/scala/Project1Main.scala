class Project1Main {
  println(s"======== Working directory of project 1 is: ${new java.io.File(".").getCanonicalPath}")
  println(s"======== custom.property: ${System.getProperty("custom.property")}")

}

object Project1Main {
  def main(args: Array[String]): Unit = {
    new Project1Main()
  }
}