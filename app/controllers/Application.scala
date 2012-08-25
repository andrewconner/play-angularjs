package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {
  
  // For server-side defined routes that hand off rending to
  // angular.js
  def angularApp = Action {
    Ok(views.html.angular())
  }
  def index = angularApp
  def view1 = angularApp
  def view2 = angularApp

}