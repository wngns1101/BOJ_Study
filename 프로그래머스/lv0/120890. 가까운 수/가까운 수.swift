import Foundation

func solution(_ array:[Int], _ n:Int) -> Int {
        var min = 100
    var count = 0
    var answer: [Int] = []
    var arr = array.sorted()
    for i in arr{
        if i-n < 0{
            answer.append(-(i-n))
        }else{
            answer.append(i-n)
        }
    }
    
    for i in 0..<answer.count{
        if answer[i] < min{
            min = answer[i]
            count = i
        }
    }
    return arr[count]
}