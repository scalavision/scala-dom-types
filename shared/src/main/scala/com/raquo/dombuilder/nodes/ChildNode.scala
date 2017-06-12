package com.raquo.dombuilder.nodes

import com.raquo.dombuilder.modifiers.Modifier

// @TODO[API] Not sure how useful it is to have ChildNode separate from Node. Pretty much every DOM node is a ChildNode...

trait ChildNode[N, +Ref <: DomNode, DomNode]
  extends Node[N, Ref, DomNode]
  with Modifier[ParentNode[N, DomNode, DomNode]]
{ this: N =>

  private[this] var _maybeParent: Option[ParentNode[N, DomNode, DomNode]] = None

  override def applyTo(node: ParentNode[N, DomNode, DomNode]): Unit = {
    node.appendChild(this)
  }

  def maybeParent: Option[ParentNode[N, DomNode, DomNode]] = _maybeParent

  def setParent(newParent: ParentNode[N, DomNode, DomNode]): Unit = {
    _maybeParent = Some(newParent)
  }

  def clearParent(): Unit = {
    _maybeParent = None
  }
}