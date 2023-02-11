import Foundation

func factorial(_ ball:Int) -> Decimal{
    var num : Decimal = Decimal(1)
    for i in 1...ball{
        num = num * Decimal(i)
    }
    return num
}

func solution(_ balls:Int, _ share:Int) -> Int {
    if balls == share{
        return 1
    }else{
        var mol = factorial(balls)
        var den = factorial(balls - share) * factorial(share)
        return Int(NSDecimalNumber(decimal: mol/den))
    }
}

