import kotlin.math.PI  

abstract class Shape {
    abstract val area: Double
    abstract val perimeter: Double
}

class Circle(val radius: Double) : Shape() {
    override val area: Double
        get() = PI * radius * radius

    override val perimeter: Double
        get() = 2 * PI * radius
}

open class Rectangle(val width: Double, val height: Double) : Shape() {
    override val area: Double
        get() = width * height

    override val perimeter: Double
        get() = 2 * (width + height)
}

class Square(val sideLength: Double) : Rectangle(sideLength,sideLength) {
    override val area: Double
        get() = sideLength * sideLength

    override val perimeter: Double
        get() = 4 * (sideLength)
}



fun main() {
    // Circle area and perimeter
    val circle = Circle(5.0)
    println("Circle area: ${circle.area}")
    println("Circle perimeter: ${circle.perimeter}")

    // Rectangle area and perimeter
    val Rectangle = Rectangle(3.4,5.4)
    println("Reactangle area: ${Rectangle.area}")
    println("Reactangle perimeter: ${Rectangle.perimeter}")

    // Rectangle area and perimeter
    val Square = Square(3.4)
    println("Square area: ${Square.area}")
    println("Square perimeter: ${Square.perimeter}")
}


