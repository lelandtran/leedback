package controllers

import javax.inject.Inject

import play.api.mvc.{AbstractController, ControllerComponents}

class FeedbackController @Inject() (cc: ControllerComponents) extends AbstractController(cc) {

  def happyFace = Action {
    Ok("Glad to make a positive impact!")
  }

  def madFace = Action {
    Ok("Thank you for the feedback!")
  }
}
