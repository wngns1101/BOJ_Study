import Foundation

func solution(_ emergency:[Int]) -> [Int] {
    var order = emergency.sorted()
    var result : [Int] = []
    for i in emergency{
        for j in 0...order.count-1{
            if i == order[j]{
                result.append(order.count - j)
            }
        }
    }
    return result
}