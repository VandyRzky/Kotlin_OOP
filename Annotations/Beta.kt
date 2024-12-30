package Annotations


@Target(
    AnnotationTarget.VALUE_PARAMETER,
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.FIELD
)
@Retention(AnnotationRetention.RUNTIME)
annotation class Beta

class exampleTarget(
    @field:Beta val firstname: String,
    @get:Beta val middlename: String,
    @param:Beta val lastname: String)