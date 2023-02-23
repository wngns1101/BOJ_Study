import Foundation

func solution(_ num:Int, _ k:Int) -> Int {
    var nums = String(num).unicodeScalars.map(String.init)
    var index = 1
    if nums.contains(String(k)){
        for i in nums{
            if i == String(k){
                break
            }
            index = index+1
        }
    }else{
        return -1
    }
    return index
}