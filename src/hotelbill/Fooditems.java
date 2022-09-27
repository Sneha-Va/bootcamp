package hotelbill;

public class Fooditems {
    int tea;
    int snacks;
    int juice;
    int biriyani;
   int icecream;

    public int getTea() {
        return tea;
    }

    public void setTea(int tea) {
        this.tea = tea;
    }

    public int getSnacks() {
        return snacks;
    }

    public void setSnacks(int snacks) {
        this.snacks = snacks;
    }

    public int getJuice() {
        return juice;
    }

    public void setJuice(int juice) {
        this.juice = juice;
    }

    public int getBiriyani() {
        return biriyani;
    }

    public void setBiriyani(int biriyani) {
        this.biriyani = biriyani;
    }

    public int getIcecream() {
        return icecream;
    }

    public void setIcecream(int icecream) {
        this.icecream = icecream;
    }

    public Fooditems(int tea, int snacks, int juice, int biriyani, int icecream) {
        this.tea = tea;
        this.snacks = snacks;
        this.juice = juice;
        this.biriyani = biriyani;
        this.icecream = icecream;

    }
}
