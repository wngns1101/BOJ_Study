import Foundation

func solution(_ box:[Int], _ n:Int) -> Int {
    var result = 1
    for i in box{
        result *= i / n
    }
    return result
}