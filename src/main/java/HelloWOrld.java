public class HelloWOrld {
    public void main(String[] args) {

        int num1 = 2;
        int num2 = 3;

        int s = someDoisNumeros(num1, num2);
        System.out.println("A soma é: "+ s);
    }

    public void some(){
        var s = someDoisNumeros(1, 2);
        System.out.println(s);
    }

    public static int someDoisNumeros(int num1, int num2){
        return num1 + num2;
    }
}
