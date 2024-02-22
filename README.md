# Kotlin Shape Project

This Kotlin project defines a simple hierarchy of geometric shapes, including Circle, Rectangle, and Square. Each shape calculates its area and perimeter based on its specific properties.

## Shapes Hierarchy

### Shape (Abstract Class)

The base abstract class `Shape` defines two abstract properties:

- `area`: Represents the area of the shape.
- `perimeter`: Represents the perimeter (or circumference) of the shape.

### Circle

The `Circle` class, a subclass of `Shape`, represents a circle with a given radius. It implements the abstract properties `area` and `perimeter` using the formulae involving the mathematical constant `PI`.

### Rectangle

The `Rectangle` class, an open class, represents a rectangle with given width and height. It extends `Shape` and implements the abstract properties `area` and `perimeter` based on the rectangle's dimensions.

### Square

The `Square` class, a subclass of `Rectangle`, represents a square with a given side length. It inherits the properties and methods from `Rectangle` and provides its own implementation for `area` and `perimeter`.

## Usage

The `main` function demonstrates the usage of these classes by creating instances of `Circle`, `Rectangle`, and `Square` and printing their respective areas and perimeters.

```kotlin
fun main() {
    // Circle area and perimeter
    val circle = Circle(5.0)
    println("Circle area: ${circle.area}")
    println("Circle perimeter: ${circle.perimeter}")

    // Rectangle area and perimeter
    val rectangle = Rectangle(3.4, 5.4)
    println("Rectangle area: ${rectangle.area}")
    println("Rectangle perimeter: ${rectangle.perimeter}")

    // Square area and perimeter
    val square = Square(3.4)
    println("Square area: ${square.area}")
    println("Square perimeter: ${square.perimeter}")
}
