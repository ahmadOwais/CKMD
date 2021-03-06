/**
 * Copyright 2018 Ahmad. Licensed under the Apache License, Version 2.0
 * See accompanying LICENSE file.
 */

package models.navigation

import play.api.mvc.Call

/**
 * @author mohaahma
 */
case class Menu(title: String, items:Seq[(String,Call)], route : Option[Call]) {
  require(items.nonEmpty && route.isEmpty || items.isEmpty && route.isDefined, "Cannot have both menu items and a root link")
}
