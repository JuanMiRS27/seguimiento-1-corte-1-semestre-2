package MayorOMenor;

public class Mayor {
    public int num1;
    public int num2;
    public int num3;

    public int calcularMayor() {
        if (this.num1 >= this.num2) {
            if (this.num1 >= this.num3) {
                return this.num1;
            } else {
                return  this.num3;
            }
        } else {
            if (this.num2 >= this.num3) {
                return this.num2;
            } else {
                return this.num3;
            }
        }
    }
}
