import kotlin.math.PI

class Circle(val radius: Double) {

    fun area(): Double {

        return PI * radius * radius
    }

    fun perimeter(): Double {
        return 2 * PI * radius
    }
}

class rectangle(
    val width: Double,
    val height: Double
){

    fun area(): Double{
        return width*height
    }

    fun perimeter(): Double{
        return 2*(width*height)
    }
}

class square(
    val side: Double
){

    fun area(): Double{
        return side*side
    }

    fun perimeter(): Double{
        return 2*(side*side)
    }
}



fun main(){

    var circle = Circle(4.5)
    var rectangle = rectangle(3.4, 8.0)
    var square = square(5.5)

    // Circle area and perimeter
    println(circle.area())
    println(circle.perimeter())

    // Rectangle area and perimeter
    println(rectangle.area())
    println(rectangle.perimeter())

    // Square area and perimeter
    println(square.area())
    println(square.perimeter())

}