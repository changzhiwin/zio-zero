package xyz.sourcecodestudy.zio.users

import java.util.UUID
import zio.json._

case class User(name: String, age: Int)

object User {
  // implicit def listShow[T]: Show[List[T]] = new Show[List[T]] { ... }
  
  implicit val encodeUser: JsonEncoder[User] = DeriveJsonEncoder.gen[User]

  implicit val decodeUser: JsonDecoder[User] = DeriveJsonDecoder.gen[User]
}