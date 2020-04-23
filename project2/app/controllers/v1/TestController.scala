package controllers.v1

import javax.inject.Inject
import play.api.mvc._

class TestController @Inject() extends InjectedController {
  println(s"======== Working directory of project 1 is: ${new java.io.File(".").getCanonicalPath}")
  println(s"======== custom.property: ${System.getProperty("custom.property")}")

  def test: Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
    Ok
  }
}
