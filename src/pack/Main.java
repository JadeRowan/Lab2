package pack;

//Номер зачетки: 9330
//C5=0("C=a*В, a = const"); C7=6("float"); C11=5("Обчислити суму найбільших елементів в рядках матриці з непарними
// номерами та найменших елементів в рядках матриці з парними номерами")
//Примітка, Оскільки в завданні описано операції над метрицями, а не масивами, то перший рядок має індекс 1
//Проте в масиві має індекс 0
public class Main {
    public static void main(String[] args) {
        float[][] result = {{1,2,3, 0},{0,2,3,1},{3,0, 1,2}};
        float a = 2;
        System.out.println("Матрица\n"+result);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] *= a;
            }
        }
        float sumMax2n_1 = 0;
        float tempMax;
        for (int i = 0; i < result.length; i += 2){
            tempMax = result[i][0];
            for (int j = 1; j < result[i].length; j++){
                if (result[i][j] > tempMax){ tempMax = result[i][j];}
            }
            sumMax2n_1 += tempMax;
        }
        float sumMin2n = 0;
        float tempMin;
        for (int i = 1; i < result.length; i += 2){
            tempMin = result[i][0];
            for (int j = 1; j < result[i].length; j++){
                if (result[i][j] < tempMin){ tempMin = result[i][j];}
            }
            sumMin2n += tempMin;
        }
        System.out.println("Sum 2n Min: "+sumMin2n);
        System.out.println("Sum 2n-1 Max: "+sumMax2n_1);

    }
}
