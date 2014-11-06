package cc.mewa.api

import akka.actor.{ActorRef}

/**
 * aplication with this protocol will process events send to the channel
 */
object ChannelApp {
  
  /** Register aplication for receiving events */
  case class RegisterApp(name: String)
  
  trait AppEvent
  /** Channel received new event */
  case class EventReceived(timestamp: String, channel: String, device: String, id: String, params: String) extends AppEvent
}
