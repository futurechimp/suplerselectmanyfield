package com.example.suplerselectmanyfield
import org.supler.Supler._
import org.json4s._
import org.json4s.jackson.JsonMethods._

object App {
  def main(args: Array[String]) {
    val input = """{
                    "questionId": "55375f46d4c637a207558830",
                    "responses": [
                      "yes"
                    ]
                  }"""

    val parsedBody = parse(input)
    val form = ResponseForm.responseForm.withNewEmpty.applyJSONValues(parsedBody)
    println(form.obj)
  }
}

class ResponseForm {
  def apply(data: Response) = {
    responseForm(data)
  }

  def responseForm = {
    form[Response](f => List(
      f.field(_.questionId),
      f.selectManyField(_.responses)(identity)
        .possibleValues(_ => List("yes", "no"))
    ))
  }
}

object ResponseForm extends ResponseForm

case class Response(id: String, questionId: String, responses: Set[String])