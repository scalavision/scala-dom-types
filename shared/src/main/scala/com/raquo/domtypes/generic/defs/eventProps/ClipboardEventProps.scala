package com.raquo.domtypes.generic.defs.eventProps

import com.raquo.domtypes.generic.builders.BoundedBuilder

/**
  * Clipboard Events
  */
trait ClipboardEventProps[EP[_ <: DomEvent], DomEvent] { this: BoundedBuilder[EP, DomEvent] =>

  /**
    * Fires when the user copies the content of an element
    */
  lazy val onCopy: EP[DomEvent] = build("copy")

  /**
    * Fires when the user cuts the content of an element
    */
  lazy val onCut: EP[DomEvent] = build("cut")

  /**
    * Fires when the user pastes some content in an element
    */
  lazy val onPaste: EP[DomEvent] = build("paste")
}