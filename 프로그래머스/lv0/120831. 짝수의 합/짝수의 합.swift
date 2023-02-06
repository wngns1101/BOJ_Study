import Foundation

func solution(_ n:Int) -> Int {
    var total = 0
    for i in 0...n{
        if i % 2 == 0{
            total += i
        }
    }
    return total
}