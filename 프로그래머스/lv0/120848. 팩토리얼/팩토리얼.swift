import Foundation

func solution(_ n:Int) -> Int {
    var mul = 1
    var factorial = 0
    for i in 1...10{
        mul *= i
        factorial += 1
        if mul > n{
            factorial -= 1
        }else if mul == n{
            continue
        }
    }
    return factorial
}