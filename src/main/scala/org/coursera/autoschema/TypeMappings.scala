package org.coursera.autoschema

import play.api.libs.json.JsObject

trait TypeMappings {
  def schemaTypeForScala(typeName: String): Option[JsObject]
}
