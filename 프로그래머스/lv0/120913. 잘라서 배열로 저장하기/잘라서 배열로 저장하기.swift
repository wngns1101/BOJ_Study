import Foundation

func solution(_ my_str:String, _ n:Int) -> [String] {
    var answer: [String] = []
    var temp = ""
    var index = 1
    for i in my_str{
        if n == index{
            temp.append(i)
            answer.append(temp)
            temp = ""
            index = 1
        }else{
            temp.append(i)
            index = index + 1
        }
    }
    if temp != ""{
        answer.append(temp)
    }
    return answer
}