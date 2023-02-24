import Foundation

func solution(_ quiz:[String]) -> [String] {
    var answer = [String]()
    
    for i in quiz{
        var sliceQuiz = i.split(separator: " ")
        if sliceQuiz[1] == "+"{
            if Int(sliceQuiz[0])! + Int(sliceQuiz[2])! == Int(sliceQuiz[4])!{
                answer.append("O")
            }else{
                answer.append("X")
            }
        }else{
            if Int(sliceQuiz[0])! - Int(sliceQuiz[2])! == Int(sliceQuiz[4])!{
                answer.append("O")
            }else{
                answer.append("X")
            }
        }
    }
    return answer
}