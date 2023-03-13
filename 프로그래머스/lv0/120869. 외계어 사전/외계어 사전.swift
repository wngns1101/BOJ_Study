import Foundation

func solution(_ spell:[String], _ dic:[String]) -> Int {
        for i in dic{
        var result = false
        for j in spell{
            if i.contains(j){
                result = true
            }else{
                result = false
                break
            }
        }
        if result && i.count == spell.count{
            return 1
        }
    }
    return 2
}