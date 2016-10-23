package org.coursera.autoschema

import play.api.libs.json.{ Json, JsObject }

trait DefaultTypeMappings extends TypeMappings {
  override def schemaTypeForScala(typeName: String) = schemaTypes.get(typeName)

  private val schemaTypes = Map(
    "org.joda.time.DateTime" -> Json.obj("type" -> "string", "format" -> "date"),
    "java.time.ZonedDateTime" -> Json.obj("type" -> "string", "format" -> "date"),
    "java.util.Date" -> Json.obj("type" -> "string", "format" -> "date"),
    "java.lang.String" -> Json.obj("type" -> "string"),
    "scala.Boolean" -> Json.obj("type" -> "boolean"),
    "scala.Int" -> Json.obj("type" -> "number", "format" -> "number"),
    "scala.Long" -> Json.obj("type" -> "number", "format" -> "number"),
    "scala.Double" -> Json.obj("type" -> "number", "format" -> "number"),
    "scala.math.BigInt" -> Json.obj("type" -> "number", "format" -> "number"),
    "scala.math.BigDecimal" -> Json.obj("type" -> "number", "format" -> "number"),
    "java.util.UUID" -> Json.obj("type" -> "string", "pattern" -> "^[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}$")
  )
}
