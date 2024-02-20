fun main() {

    val amount = readln()
    val minCommission = 35
    var commission = amount.toInt() * 0.0075
    if (commission < minCommission) {
        commission = minCommission.toDouble()
    }

    println(commission)

}