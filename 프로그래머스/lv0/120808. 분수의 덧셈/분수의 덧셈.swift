import Foundation

func gcd (_ number1: Int, _ number2: Int) -> Int {
    if number1 % number2 == 0{
        return number2
    }else{
        return gcd(number2, number1 % number2)
    }
}

func solution(_ numer1:Int, _ denom1:Int, _ numer2:Int, _ denom2:Int) -> [Int] {
    var sumNumer = numer1 * denom2 + numer2 * denom1
    var mulDenom = denom1 * denom2
    var gcdValue = gcd(sumNumer, mulDenom)
    return [sumNumer / gcdValue, mulDenom / gcdValue]
}