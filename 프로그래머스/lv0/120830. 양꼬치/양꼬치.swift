import Foundation

func solution(_ n:Int, _ k:Int) -> Int {
    var meat = n * 12000
    var juice = k * 2000
    var service = 0
    if n >= 10{
        service = (n / 10) * 2000
    }
    return meat + juice - service
}