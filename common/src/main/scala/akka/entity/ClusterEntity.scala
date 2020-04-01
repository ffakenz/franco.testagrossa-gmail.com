package akka.entity

import akka.actor.{ActorRef, ActorSystem, Props}

trait ClusterEntity[Requirements] {

  val typeName: String = utils.Inference.getSimpleName(this.getClass.getName)

  def props(requirements: Requirements): Props

  def start(requirements: Requirements)(implicit system: ActorSystem): ActorRef
}
