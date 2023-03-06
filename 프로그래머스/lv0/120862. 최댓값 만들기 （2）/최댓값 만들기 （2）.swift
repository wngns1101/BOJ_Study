import Foundation

func solution(_ numbers:[Int]) -> Int {
    var number = numbers.sorted()
    var case1 = number[0] * number[1]
    var case2 = number[number.count-1] * number[number.count-2]
    
    return max(case1, case2)
}