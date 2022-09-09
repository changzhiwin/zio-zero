package xyz.sourcecodestudy.zio

import zio._
import zhttp.service.Server

import xyz.sourcecodestudy.zio.greet.GreetingApp
import xyz.sourcecodestudy.zio.counter.CounterApp
import xyz.sourcecodestudy.zio.users.{UserApp, InmemoryUserRepo}

object MainApp extends ZIOAppDefault {

  def run: ZIO[Environment, Any, Any] = {
    
    Server.start(
      port = 8080,
      http = GreetingApp() ++ CounterApp() ++ UserApp()
    ).provide(
      
      ZLayer.fromZIO(Ref.make(100)),

      InmemoryUserRepo.layer
    )
  }
}
