import Foundation

func solution(_ numbers:[Int], _ direction:String) -> [Int] {
        var answer : [Int] = []
    if direction == "right"{
        answer.append(numbers[numbers.count-1])
        for i in 1...numbers.count-1{
            answer.append(numbers[i-1])
        }
    }else{
        for i in 1...numbers.count-1{
            answer.append(numbers[i])
        }
        answer.append(numbers[0])
    }
    return answer
}