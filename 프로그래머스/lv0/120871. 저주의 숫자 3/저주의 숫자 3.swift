import Foundation

func solution(_ n:Int) -> Int {
    var result = 0
    
    for i in 1...n{
        result += 1
        while result % 3 == 0 || String(result).contains("3"){
            result += 1
        }
    }
    return result
}