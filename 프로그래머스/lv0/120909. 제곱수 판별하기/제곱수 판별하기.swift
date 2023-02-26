import Foundation

func solution(_ n:Int) -> Int {
    if n % Int(sqrt(Double(n))) == 0{
        return 1
    }else{
        return 2
    }
}