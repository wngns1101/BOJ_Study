import Foundation

func solution(_ sides:[Int]) -> Int {
    var result = 0
    var nums = sides.sorted()
    var temp = nums[1]
    var sum = nums[0] + nums[1] - 1
    while true{
        if sum == nums[1]{
            break
        }
        sum -= 1
        result += 1
    }
    
    while true{
        if nums[1] == nums[0] + temp{
            break
        }
        temp -= 1
        result += 1
    }
    return result
}