import Foundation

func solution(_ numbers:[Int]) -> Double {
    var sumNumbers = 0
    for n in numbers{
        sumNumbers += n
    }
    return Double(sumNumbers) / Double(numbers.count)
}