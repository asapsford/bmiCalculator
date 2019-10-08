import Foundation

public class BMICalculator {
    
    static func calculate(weight: Float, height: Float) {
        print("Weight (KG): \(weight)")
        print("Height (M): \(height)")
        
        let bmi = weight / pow(height, 2)
        
        if bmi < 18.5 {
            print("You're underweight")
        } else if bmi >= 18.5 && bmi < 25 {
            print("You're healthy")
        } else if bmi >= 25 && bmi < 30 {
            print("You're overweight")
        }
    }
}

BMICalculator.calculate(weight: 100, height: 2)
