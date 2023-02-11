import Foundation

func solution(_ hp:Int) -> Int {
        var health = hp
    var count = 0
    
    if health != 0 {
        if health >= 5{
            count += health / 5
            health = health % 5
        }
        if health >= 3{
            count += health / 3
            health = health % 3
        }
        if health >= 1{
            count += health / 1
            health = health % 1
        }
        return count
    }else{
        return count
    }
}