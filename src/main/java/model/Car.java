package model;

public class Car {
    private String carBrand;
    private String carColor;
    private int carPriceUSD;

    public Car(String carBrand, String carColor, int carSpeed) {
        this.carBrand = carBrand;
        this.carColor = carColor;
        this.carPriceUSD = carSpeed;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public int getCarPriceUSD() {
        return carPriceUSD;
    }

    public void setCarPriceUSD(int carPriceUSD) {
        this.carPriceUSD = carPriceUSD;
    }

    @Override
    public String toString() {
        return carBrand + "  " + carColor + "  " + carPriceUSD;
    }
}
