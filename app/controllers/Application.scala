package controllers

import play.api._
import play.api.mvc._

object Application extends Controller with AngularGenerators {
  
  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }
  def view1 = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def javascriptRoutes = Action { implicit request =>
    Ok(
      Routes.javascriptRouter("jsRoutes")(
        routes.javascript.Application.index
      )
    ).as("text/javascript") 
  }

  def angularControllers = Action { implicit request =>
    Ok(
      generateControllers("My1","My2")
    ).as("text/javascript")
  }

  
}