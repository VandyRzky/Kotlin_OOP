package Class

import Annotations.Fancy

@Fancy("budi")
class Program (val name: String, val version: String) {
    fun info(): String = "Program $name version: $version "
}