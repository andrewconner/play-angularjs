package controllers

import play.api._
import play.api.mvc._

trait AngularGenerators {
  def generateControllers(controllers: String*) = {
    """|'use strict';
       |
       |%s
    """.stripMargin.format(
      controllers.map { con =>
        "function " + con + "Ctrl() {}; " + con + "Ctrl.$inject = [];"
      }.mkString("\n")
    )
  }


}