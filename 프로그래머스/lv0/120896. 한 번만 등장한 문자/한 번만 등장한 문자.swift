import Foundation

func solution(_ s:String) -> String {
    var answer :[String] = []
    var index :[String] = []
    for i in s{
        if answer.contains(String(i)){
            index.append(String(i))
        }else{
            answer.append(String(i))
        }
    }
    
    for i in index{
        answer = answer.filter(){$0 != String(i)}
    }
    answer = answer.sorted()
    return answer.joined(separator: "")
}