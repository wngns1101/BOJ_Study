import Foundation

func solution(_ price:Int) -> Int {
    var discount = 0.0
    if price >= 500000{
        discount = Double(price) * 0.8
    }else if price >= 300000{
        discount = Double(price) * 0.9
    }else if price >= 100000{
        discount = Double(price) * 0.95
    }else{
        discount = Double(price)
    }
    return Int(discount)
}